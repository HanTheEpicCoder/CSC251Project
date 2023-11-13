package CSC251Project;

public class Policy {
    private int policyNumber;
    private String providerName;
    private String policyHolderFirstName;
    private String policyHolderLastName;
    private int policyHolderAge;
    private String policyHolderSmokingStatus;
    private double policyHolderHeight;
    private double policyHolderWeight;

    private static final double baseFee = 600.0;
    private static final double AgeLimitForFee = 50.0;
    private static final double AgeFee = 75.0;
    private static final double smokerFee = 100.0;
    private static final double bmiLimitForFee = 35.0;
    private static final double bmiFeePerUnit = 20.0;

    /**
     * Default constructor.
     */
    public Policy() {
        this.policyNumber = 0;
        this.providerName = "";
        this.policyHolderFirstName = "";
        this.policyHolderLastName = "";
        this.policyHolderAge = 0;
        this.policyHolderSmokingStatus = "";
        this.policyHolderHeight = 0.0;
        this.policyHolderWeight = 0.0;
    }

    /**
     * Constructor with parameters.
     * 
     * @param policyNumber
     * @param providerName
     * @param policyHolderFirstName
     * @param policyHolderLastName
     * @param policyHolderAge
     * @param policyHolderSmokingStatus
     * @param policyHolderHeight
     * @param policyHolderWeight
     */
    public Policy(int policyNumber, String providerName, String policyHolderFirstName, String policyHolderLastName, int policyHolderAge, String policyHolderSmokingStatus, double policyHolderHeight, double policyHolderWeight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolderFirstName = policyHolderFirstName;
        this.policyHolderLastName = policyHolderLastName;
        this.policyHolderAge = policyHolderAge;
        this.policyHolderSmokingStatus = policyHolderSmokingStatus;
        this.policyHolderHeight = policyHolderHeight;
        this.policyHolderWeight = policyHolderWeight;
    }

    /**
     * Returns the policy number.
     * 
     * @return the policy number.
     */
    public int getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Sets the policy number.
     * 
     * @param policyNumber
     */
    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    /**
     * Returns the name of the insurance provider.
     * 
     * @return the name of the insurance provider.
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Sets the name of the insurance provider.
     * 
     * @param providerName
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * Returns the first name of the policy holder.
     * 
     * @return the first name of the policy holder.
     */
    public String getFirstName() {
        return policyHolderFirstName;
    }

    /**
     * Sets the first name of the policy holder.
     * 
     * @param policyHolderFirstName
     */
    public void setFirstName(String policyHolderFirstName) {
        this.policyHolderFirstName = policyHolderFirstName;
    }

    /**
     * Returns the last name of the policy holder.
     * 
     * @return the last name of the policy holder.
     */
    public String getLastName() {
        return policyHolderLastName;
    }

    /**
     * Sets the last name of the policy holder.
     * 
     * @param policyHolderLastName
     */
    public void setLastName(String policyHolderLastName) {
        this.policyHolderLastName = policyHolderLastName;
    }

    /**
     * Returns the age of the policy holder.
     * 
     * @return the age of the policy holder.
     */
    public int getAge() {
        return policyHolderAge;
    }

    /**
     * Sets the age of the policy holder.
     * 
     * @param policyHolderAge
     */
    public void setAge(int policyHolderAge) {
        this.policyHolderAge = policyHolderAge;
    }

    /**
     * Returns the smoking status of the policy holder.
     * 
     * @return the smoking status of the policy holder.
     */
    public String getSmokingStatus() {
        return policyHolderSmokingStatus;
    }

    /**
     * Sets the smoking status of the policy holder.
     * 
     * @param policyHolderSmokingStatus
     */
    public void setSmokingStatus(String policyHolderSmokingStatus) {
        this.policyHolderSmokingStatus = policyHolderSmokingStatus;
    }

    /**
     * Returns the height of the policy holder.
     * 
     * @return the height of the policy holder.
     */
    public double getHeight() {
        return policyHolderHeight;
    }

    /**
     * Sets the height of the policy holder.
     * 
     * @param policyHolderHeight
     */
    public void setHeight(double policyHolderHeight) {
        this.policyHolderHeight = policyHolderHeight;
    }

    /**
     * Returns the weight of the policy holder.
     * 
     * @return the weight of the policy holder.
     */
    public double getWeight() {
        return policyHolderWeight;
    }

    /**
     * 
     * @param policyHolderWeight
     */
    public void setWeight(double policyHolderWeight) {
        this.policyHolderWeight = policyHolderWeight;
    }
    
    /**
     * Returns a string representation of the policy.
     * 
     * @return a string representation of the policy.
     */
    public double calculateBMI() {
        return (policyHolderWeight * 703) / (policyHolderHeight * policyHolderHeight);
    }

    /**
     * Calculates the price of the policy based on the policy holder's age, smoking status, and BMI.
     *
     * @return the calculated policy price.
     */
    public double calculatePolicyPrice() {
        double policyPrice = baseFee;

        if (policyHolderAge > AgeLimitForFee) {
            policyPrice += AgeFee;
        }

        if (policyHolderSmokingStatus.equals("smoker")) {
            policyPrice += smokerFee;
        }

        double bmi = calculateBMI();

        if (bmi > bmiLimitForFee) {
            policyPrice += (bmi - bmiLimitForFee) * bmiFeePerUnit;
        }

        return policyPrice;
    }
}


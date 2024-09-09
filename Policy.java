public class Policy {
    private int policyNumber;
    private String providerName;
    private String policyHolderFirstName;
    private String policyHolderLastName;
    private int policyHolderAge;
    private String policyHolderSmokingStatus;
    private double policyHolderHeight;
    private double policyHolderWeight;

    /**
     * Default constructor for Policy class
     */
    public Policy() {
        this.policyNumber = 0;
        this.providerName = "N/A";
        this.policyHolderFirstName = "N/A";
        this.policyHolderLastName = "N/A";
        this.policyHolderAge = 0;
        this.policyHolderSmokingStatus = "N/A";
        this.policyHolderHeight = 0.0;
        this.policyHolderWeight = 0.0;
    }

    /**
     * Constructor with parameters for Policy class
     * @param policyNumber
     * @param providerName
     * @param policyholderFirstName
     * @param policyholderLastName
     * @param policyholderAge
     * @param policyholderSmokingStatus
     * @param policyholderHeight
     * @param policyholderWeight
     */
    public Policy(int policyNumber, String providerName, String policyholderFirstName,
                  String policyholderLastName, int policyholderAge, String policyholderSmokingStatus,
                  double policyholderHeight, double policyholderWeight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolderFirstName = policyholderFirstName;
        this.policyHolderLastName = policyholderLastName;
        this.policyHolderAge = policyholderAge;
        this.policyHolderSmokingStatus = policyholderSmokingStatus;
        this.policyHolderHeight = policyholderHeight;
        this.policyHolderWeight = policyholderWeight;
    }

    /**
     * Returns the policy number
     * @return The policy number
     */
    public int getPolicyNumber() {
        return policyNumber;
    }

    /*
     * Sets the policy number
     * @param policyNumber
     */
    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    /**
     * Returns the provider name
     * @return The name of the provider
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Sets the provider name
     * @param providerName
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * Returns the policyholder's first name
     * @return The first name of the policyholder
     */
    public String getFirstName() {
        return policyHolderFirstName;
    }

    /**
     * Sets the policyholder's first name
     * @param policyHolderFirstName
     */
    public void setFirstName(String policyHolderFirstName) {
        this.policyHolderFirstName = policyHolderFirstName;
    }

    /**
     * Returns the policyholder's last name
     * @return The last name of the policyholder
     */
    public String getLastName() {
        return policyHolderLastName;
    }

    /**
     * Sets the policyholder's last name
     * @param policyHolderLastName
     */
    public void setLastName(String policyHolderLastName) {
        this.policyHolderLastName = policyHolderLastName;
    }

    /**
     * Returns the policyholder's age
     * @return The age of the policyholder
     */
    public int getAge() {
        return policyHolderAge;
    }

    /**
     * Sets the policyholder's age
     * @param policyHolderAge
     */
    public void setAge(int policyHolderAge) {
        this.policyHolderAge = policyHolderAge;
    }

    /**
     * Returns the policyholder's smoking status
     * @return The smoking status of the policyholder
     */
    public String getSmokingStatus() {
        return policyHolderSmokingStatus;
    }

    /**
     * Sets the policyholder's smoking status
     * @param policyHolderSmokingStatus
     */
    public void setSmokingStatus(String policyHolderSmokingStatus) {
        this.policyHolderSmokingStatus = policyHolderSmokingStatus;
    }

    /**
     * Returns the policyholder's height
     * @return The height of the policyholder
     */
    public double getHeight() {
        return policyHolderHeight;
    }

    /**
     * Sets the policyholder's height
     * @param policyHolderHeight
     */
    public void setHeight(double policyHolderHeight) {
        this.policyHolderHeight = policyHolderHeight;
    }

    /**
     * Returns the policyholder's weight
     * @return The weight of the policyholder
     */
    public double getWeight() {
        return policyHolderWeight;
    }

    /**
     * Sets the policyholder's weight
     * @param policyHolderWeight
     */
    public void setWeight(double policyHolderWeight) {
        this.policyHolderWeight = policyHolderWeight;
    }

    /**
     * Calculates and returns the BMI of the policyholder
     * @return The BMI of the policyholder
     */
    public double calculateBMI() {
        return (policyHolderWeight * 703) / (policyHolderHeight * policyHolderHeight);
    }

    /**
     * Calculates the price of the policy based on the policyholder's age, smoking status, and BMI and returns it
     * @return The price of the policy
     */
    public double calculatePolicyPrice() {
        double policyPrice = 600.0;
        double AgeForFee = 50.0;
        double AgeFee = 75.0;
        double smokerFee = 100.0;
        double bmiLimitForFee = 35.0;
        double bmiFeePerUnit = 20.0;

        if (policyHolderAge > AgeForFee) {
            policyPrice += AgeFee;
        }

        if (policyHolderSmokingStatus.equalsIgnoreCase("smoker")) {
            policyPrice += smokerFee;
        }

        double bmi = calculateBMI();

        if (bmi > bmiLimitForFee) {
            policyPrice += (bmi - bmiLimitForFee) * bmiFeePerUnit;
        }

        return policyPrice;
    }
}
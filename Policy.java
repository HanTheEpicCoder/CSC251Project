public class Policy {
    private int policyNumber;
    private String providerName;
    private PolicyHolder policyHolder;

    private static int policyCount = 0;

    /**
     * Default constructor for Policy class
     */
    public Policy() {
        this.policyNumber = 0;
        this.providerName = "N/A";
        this.policyHolder = new PolicyHolder();
        policyCount++;
    }

    /**
     * Constructor with parameters for Policy class
     * @param policyNumber
     * @param providerName
     * @param policyHolder
     */
    public Policy(int policyNumber, String providerName, PolicyHolder policyHolder) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolder = policyHolder;
        policyCount++;
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
     * Returns the PolicyHolder object
     * @return The PolicyHolder object
     */
    public PolicyHolder getPolicyHolder() {
        return policyHolder;
    }

    /**
     * Sets the PolicyHolder object
     * @param policyHolder
     */
    public void setPolicyHolder(PolicyHolder policyHolder) {
        this.policyHolder = policyHolder;
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

        if (policyHolder.getAge() > AgeForFee) {
            policyPrice += AgeFee;
        }

        if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker")) {
            policyPrice += smokerFee;
        }

        double bmi = policyHolder.calculateBMI();

        if (bmi > bmiLimitForFee) {
            policyPrice += (bmi - bmiLimitForFee) * bmiFeePerUnit;
        }

        return policyPrice;
    }

    /**
     * Returns the total number of Policy objects created
     * @return The count of Policy objects
     */
    public static int getPolicyCount() {
        return policyCount;
    }

    /**
     * Returns a string of the policy information
     * @return The policy information
     */
    @Override
    public String toString() {
        return "Policy Number: " + policyNumber + 
               "\nProvider Name: " + providerName + "\n" + 
               policyHolder.toString() +
                "\nPolicy Price: $" + String.format("%.2f", calculatePolicyPrice())
                + "\n";
    }
}
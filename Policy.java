public class Policy {
    private int policyNumber;
    private String providerName;
    private String policyHolderFirstName;
    private String policyHolderLastName;
    private int policyHolderAge;
    private String policyHolderSmokingStatus;
    private double policyHolderHeight;
    private double policyHolderWeight;

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

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getFirstName() {
        return policyHolderFirstName;
    }

    public void setFirstName(String policyHolderFirstName) {
        this.policyHolderFirstName = policyHolderFirstName;
    }

    public String getLastName() {
        return policyHolderLastName;
    }

    public void setLastName(String policyHolderLastName) {
        this.policyHolderLastName = policyHolderLastName;
    }

    public int getAge() {
        return policyHolderAge;
    }

    public void setAge(int policyHolderAge) {
        this.policyHolderAge = policyHolderAge;
    }

    public String getSmokingStatus() {
        return policyHolderSmokingStatus;
    }

    public void setSmokingStatus(String policyHolderSmokingStatus) {
        this.policyHolderSmokingStatus = policyHolderSmokingStatus;
    }

    public double getHeight() {
        return policyHolderHeight;
    }

    public void setHeight(double policyHolderHeight) {
        this.policyHolderHeight = policyHolderHeight;
    }

    public double getWeight() {
        return policyHolderWeight;
    }

    public void setWeight(double policyHolderWeight) {
        this.policyHolderWeight = policyHolderWeight;
    }

    public double calculateBMI() {
        return (policyHolderWeight * 703) / (policyHolderHeight * policyHolderHeight);
    }

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
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


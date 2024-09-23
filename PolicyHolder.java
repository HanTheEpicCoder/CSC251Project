public class PolicyHolder {
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    /**
     * Default constructor for PolicyHolder class
     */
    public PolicyHolder() {
        this.firstName = "N/A";
        this.lastName = "N/A";
        this.age = 0;
        this.smokingStatus = "N/A";
        this.height = 0.0;
        this.weight = 0.0;
    }

    /**
     * Constructor with parameters for PolicyHolder class
     * @param firstName
     * @param lastName
     * @param age
     * @param smokingStatus
     * @param height
     * @param weight
     */
    public PolicyHolder(String firstName, String lastName, int age, String smokingStatus,
                        double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    /**
     * Returns the policyholder's first name
     * @return The first name of the policyholder
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the policyholder's first name
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the policyholder's last name
     * @return The last name of the policyholder
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the policyholder's last name
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the policyholder's age
     * @return The age of the policyholder
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the policyholder's age
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Returns the policyholder's smoking status
     * @return The smoking status of the policyholder
     */
    public String getSmokingStatus() {
        return smokingStatus;
    }

    /**
     * Sets the policyholder's smoking status
     * @param smokingStatus
     */
    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }

    /**
     * Returns the policyholder's height
     * @return The height of the policyholder
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the policyholder's height
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Returns the policyholder's weight
     * @return The weight of the policyholder
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the policyholder's weight
     * @param weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Calculates and returns the BMI of the policyholder
     * @return The BMI of the policyholder
     */
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }

    /**
     * Returns a string of the policyholder's information
     * @return The policyholder's information
     */
    @Override
    public String toString() {
        return "Policyholder's First Name: " + firstName + 
               "\nPolicyholder's Last Name: " + lastName + 
               "\nPolicyholder's Age: " + age + 
               "\nPolicyholder's Smoking Status (Y/N): " + smokingStatus + 
               "\nPolicyholder's Height: " + height + " inches" + 
               "\nPolicyholder's Weight: " + weight + " pounds" +
               "\nPolicyholder's BMI: " + String.format("%.2f", calculateBMI());
    }
}
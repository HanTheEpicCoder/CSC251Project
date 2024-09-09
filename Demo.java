import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Policy> policies = new ArrayList<>();
        int smokers = 0;
        int nonSmokers = 0;

        try {
            File file = new File("PolicyInformation.txt");
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNext()) {
                int policyNumber = fileScanner.nextInt();
                fileScanner.nextLine();

                String providerName = fileScanner.nextLine();
                String firstName = fileScanner.nextLine();
                String lastName = fileScanner.nextLine();

                int age = fileScanner.nextInt();
                fileScanner.nextLine();
                
                String smokingStatus = fileScanner.nextLine();
                double height = fileScanner.nextDouble();
                double weight = fileScanner.nextDouble();

                Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
                policies.add(policy);
            }

            fileScanner.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        for (int i = 0; i < policies.size(); i++) {
            Policy policy = policies.get(i);
            String smokingStatus = policy.getSmokingStatus();

            System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
            System.out.println("Provider Name: " + policy.getProviderName());
            System.out.println("Policyholder's First Name: " + policy.getFirstName());
            System.out.println("Policyholder's Last Name: " + policy.getLastName());
            System.out.println("Policyholder's Age: " + policy.getAge());
            System.out.println("Policyholder's Smoking Status: " + smokingStatus);
            System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
            System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
            System.out.println("Policyholder's BMI: " + String.format("%.2f", policy.calculateBMI()));
            System.out.println("Policy Price: $" + String.format("%.2f", policy.calculatePolicyPrice()));

            if (smokingStatus.equalsIgnoreCase("smoker")) {
                smokers++;
            } else {
                nonSmokers++;
            }
        }

        
        System.out.println("\nNumber of Policyholders who are smokers: " + smokers);
        System.out.println("Number of Policyholders who are non-smokers: " + nonSmokers);
    }
}
package CSC251Project;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        File file = new File("PolicyInformation.txt");
        ArrayList<Policy> policies = new ArrayList<>();

        try {
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

        int smokersCount = 0;
        int nonSmokersCount = 0;

        for (Policy policy : policies) {
            System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
            System.out.println("Provider Name: " + policy.getProviderName());
            System.out.println("Policyholder's First Name: " + policy.getFirstName());
            System.out.println("Policyholder's Last Name: " + policy.getLastName());
            System.out.println("Policyholder's Age: " + policy.getAge());
            System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
            System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
            System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
            System.out.println("Policyholder's BMI: " + String.format("%.2f", policy.calculateBMI()));
            System.out.println("Policy Price: $" + String.format("%.2f", policy.calculatePolicyPrice()));

            if (policy.getSmokingStatus().equalsIgnoreCase("smoker")) {
                smokersCount++;
            } else if (policy.getSmokingStatus().equalsIgnoreCase("non-smoker")) {
                nonSmokersCount++;
            }
        }

        System.out.println("\nNumber of Policyholders who are smokers: " + smokersCount);
        System.out.println("Number of Policyholders who are non-smokers: " + nonSmokersCount);
    }
}

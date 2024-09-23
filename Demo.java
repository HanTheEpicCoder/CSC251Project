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

                PolicyHolder policyholder = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
                Policy policy = new Policy(policyNumber, providerName, policyholder);
                policies.add(policy);
            }

            fileScanner.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        for (int i = 0; i < policies.size(); i++) {
            Policy policy = policies.get(i);
            String smokingStatus = policy.getPolicyHolder().getSmokingStatus();

            System.out.println(policy);

            if (smokingStatus.equalsIgnoreCase("smoker")) {
                smokers++;
            } else {
                nonSmokers++;
            }
        }

        System.out.println("There were " + Policy.getPolicyCount() + " Policy objects created.");
        System.out.println("The number of policies with a smoker is: " + smokers);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokers);
    }
}
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
    }
}

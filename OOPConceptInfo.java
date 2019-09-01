package quizees;

public class OOPConceptInfo {
    public static void main(String[] args) {

        OOPConcept info = new OOPConcept();
        info.printInfo();

        info.accountHolderName = "Vaneet Sharma";
        info.accountNumber = "34123";
        info.amount = 40.0;
        info.printInfo();

        OOPConcept Nitish = new OOPConcept();

        Nitish.accountHolderName = "Nitish Sharma";
        Nitish.accountNumber = " CBI";
        Nitish.amount = 50.0;
        Nitish.printInfo();

    }
}
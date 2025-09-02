package spring.entities;

public class TrainingTest {
    public static void main(String[] args) {
        System.out.println("TrainingTest");
        // create instances
        Cohert sdet = new CohertSDET();
        // show
        Training training = new Training(sdet);
        training.getType();
    }
}
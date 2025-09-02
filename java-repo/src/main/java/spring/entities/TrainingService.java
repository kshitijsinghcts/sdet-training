package spring.entities;

public class TrainingService {
    private Cohert cohert;

    public void setCohert(Cohert cohert) {
        this.cohert = cohert;
    }

    public Cohert getCohert() {
        return cohert;
    }

    public void showDetails() {
        this.cohert.displayType();
    }
}

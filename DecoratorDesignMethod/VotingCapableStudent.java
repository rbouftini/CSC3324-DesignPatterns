public class VotingCapableStudent extends StudentDecorator {
    public VotingCapableStudent(Student student) {
        super(student);
    }

    @Override
    public void showCapabilities() {
        super.showCapabilities();
        System.out.println("Added capability: Vote for higher positions.");
    }
}
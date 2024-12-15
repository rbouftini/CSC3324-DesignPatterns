public class InterviewCapableStudent extends StudentDecorator {
    public InterviewCapableStudent(Student student) {
        super(student);
    }

    @Override
    public void showCapabilities() {
        super.showCapabilities();
        System.out.println("Added capability: Attend faculty interviews.");
    }
}
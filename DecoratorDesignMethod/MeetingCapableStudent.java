public class MeetingCapableStudent extends StudentDecorator {
    public MeetingCapableStudent(Student student) {
        super(student);
    }

    @Override
    public void showCapabilities() {
        super.showCapabilities();
        System.out.println("Added capability: Participate in departmental meetings.");
    }
}
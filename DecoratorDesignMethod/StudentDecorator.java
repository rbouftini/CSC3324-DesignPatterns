public abstract class StudentDecorator implements Student {
    protected Student decoratedStudent;

    public StudentDecorator(Student student) {
        this.decoratedStudent = student;
    }

    @Override
    public void showCapabilities() {
        decoratedStudent.showCapabilities();
    }
}
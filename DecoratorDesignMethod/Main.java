public class Main {
    public static void main(String[] args) {
        Student student = new BasicStudent();
        System.out.println("Basic Student:");
        student.showCapabilities();

        System.out.println("\nStudent close to graduation:");
        Student graduatingStudent = new VotingCapableStudent(
            new MeetingCapableStudent(
                new InterviewCapableStudent(student)
            )
        );
        graduatingStudent.showCapabilities();
    }
}
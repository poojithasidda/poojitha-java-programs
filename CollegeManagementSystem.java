class College {
    void studentDetails() {
        System.out.println("College Student Details: Name, Roll Number, Course");
    }
    void examTimings() {
        System.out.println("College Exam Timings: 9:00 AM to 12:00 PM");
    }
}
class School extends College {
    @Override
    void studentDetails() {
        System.out.println("School Student Details: Name, Grade, Section");
    }
    @Override
    void examTimings() {
        System.out.println("School Exam Timings: 9:30 AM to 12:30 AM");
    }
}
public class CollegeManagementSystem {
    public static void main(String[] args) {
        College college = new College();
        college.studentDetails();
        college.examTimings();
        System.out.println();
        School school = new School();
        school.studentDetails();
        school.examTimings();
    }
}









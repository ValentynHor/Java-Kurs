package section9_interview.tasks;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public class T2_ExamInterview {

    public static void main(String[] args) {

        Map <Exam, String> exams = new HashMap<>();

        var exam1 = new Exam(1, "04.06.2024", 10);
        var exam2 = new Exam(1, "04.06.2024", 10);
        var exam3 = new Exam(3, "16.06.2024", 9);

        exams.put(null,"Zero");
        exams.put(exam1,"One");
        exams.put(exam2,"Two");
        exams.put(exam3,"Three");

        exams.forEach((k,v) -> {
            System.out.print("Key: " + k + " ");
            System.out.print("Value: " + v + "\n");
        });

        System.out.println(exams.get(exam1));
        System.out.println(exams.get(exam2));


    }




        public record Exam(int id, String date, int mark) {
            @Override
            public String toString() {
                return "Exam{" +
                        "id=" + id +
                        ", date='" + date + '\'' +
                        ", mark=" + mark +
                        '}';
            }

    //        @Override
    //        public boolean equals(Object o) {
    //            if (this == o) return true;
    //            if (!(o instanceof Exam)) return false;
    //            Exam exam = (Exam) o;
    //            return id == exam.id && mark == exam.mark && Objects.equals(date, exam.date);
    //        }
    //
    //        @Override
    //        public int hashCode() {
    //            return Objects.hash(id, date, mark);
    //        }
        }
}
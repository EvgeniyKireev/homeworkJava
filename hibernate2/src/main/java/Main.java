import models.*;
import services.*;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserService();
        TestService testService = new TestService();
        Test_listService testListService = new Test_listService();
        Student_answer studentAnswer = new Student_answer();
        RoleService roleService = new RoleService();
        GroupService groupService = new GroupService();
        QuestionService questionService = new QuestionService();
        AnswerService answerService = new AnswerService();


        Test_list test1 = new Test_list("Русский");
        Test_list test2 = new Test_list("Английский");

        testListService.saveTest_list(test1);
        testListService.saveTest_list(test2);


        Question question1 = new Question("Вопрос 1", 2, true);
        Question question2 = new Question("Вопрос 2", 2, true);
        Question question3 = new Question("Вопрос 3", 2, true);

        questionService.saveQuestion(question1);
        questionService.saveQuestion(question2);
        questionService.saveQuestion(question3);


        Answer answer1 = new Answer("Ответ 1", true);
        Answer answer2 = new Answer("Ответ 2", false);
        Answer answer3 = new Answer("Ответ 3", true);
        Answer answer4 = new Answer("Ответ 4", true);
        Answer answer5 = new Answer("Ответ 5", false);

        answerService.saveAnswer(answer1);
        answerService.saveAnswer(answer2);
        answerService.saveAnswer(answer3);
        answerService.saveAnswer(answer4);
        answerService.saveAnswer(answer5);




        Role student = new Role("Student");
        Role teacher = new Role("Teacher");

        User user1 = new User("Киреев", "Евгений", "Владимирович", "eeeboooooy", "123");
        user1.setRole(student);

        User user2 = new User("Иванов", "Иван", "Иванович", "ivan", "123");
        user2.setRole(student);


        User teacher1 = new User("Милованов", "Даниил", "Михайлович", "miovanov", "123");
        teacher1.setRole(teacher);




        userService.saveUser(user1);
        userService.saveUser(user2);
        userService.saveUser(teacher1);

        System.out.println(userService.getTeachers());
        System.out.println(userService.getStudents());
    }
}
import java.util.Scanner;

public class QuestionService {
    
    Question questions[] = new Question[5];
    private String answer[] = new String[5];
    public QuestionService(){
        questions[0] = new Question(1,"What is my nic name","Absdsd","Abhilash","Nani","Reddy","Nani");
        questions[1] = new Question(1,"What is my nic name","Abhi","Abhilash","Nani","Reddy","Nani");
        questions[2] = new Question(1,"What is my nic name","Abhi","Abhilash","Nani","Reddy","Nani");
        questions[3] = new Question(1,"What is my nic name","Abhi","Abhilash","Nani","Reddy","Nani");
        questions[4] = new Question(1,"What is my nic name","Abhi","Abhilash","Nani","Reddy","Nani");
    }

    public void playQuiz(){
        int i=0;
        for(Question q : questions){
            System.out.println(q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            Scanner sc = new Scanner(System.in);
            System.out.println("enter the answer:");
            answer[i] = sc.nextLine();
            i++;
            
        }
    }

    public void score(){
        int score =0;
        for (int i=0;i<5;i++){
            String actualanswer = questions[i].getAnswer();
            if(actualanswer.equalsIgnoreCase(answer[i])){
                score++;
            }
        }
        System.out.println("your score is "+score);
    }
}

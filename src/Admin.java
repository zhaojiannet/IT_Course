import java.util.*;

public class Admin implements User{

    String username;
    String password;


    Map<String,String> securityQuestions = new HashMap<>();
    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
        securityQuestions.put("你的姓名是？", "admin");
        securityQuestions.put("你的年龄是？", "18");
        securityQuestions.put("你的性别是？", "男");

    }

    @Override
    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String enteredUsername = scanner.nextLine();
        System.out.println("请输入密码：");
        String enteredPassword = scanner.nextLine();

        if (enteredUsername.equals(username) && enteredPassword.equals(password)){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }


    }

    public void searchBooks(String criteria, List<Book> books) {
        System.out.println("查询结果：");

        for (Book book : books ) {
            if (book.getTitle().toLowerCase().contains(criteria.toLowerCase()) || book.getAuthor().toLowerCase().contains(criteria.toLowerCase()) || book.getCategory().toLowerCase().contains(criteria.toLowerCase())){

                System.out.println("书名：" + book.getTitle());
                System.out.println("作者：" + book.getAuthor());
                System.out.println("价格：" + book.getPrice());
                System.out.println("分类：" + book.getCategory());
                System.out.println("状态：" + book.getStatus());

            }

        }



    }


    @Override
    public void displayBookList(List<Book> books) {
        System.out.println("图书列表：");
        for (Book book : books){
            System.out.println("书名：" + book.getTitle());
            System.out.println("作者：" + book.getAuthor());
            System.out.println("价格：" + book.getPrice());
            System.out.println("分类：" + book.getCategory());
            System.out.println("状态：" + book.getStatus());
        }
    }



    public  void addBook(List<Book> books,Book book) {
        books.add(book);
        System.out.println("添加成功");
    }

    public void deleteBook(List<Book> books,String title){
        for (Book book : books ) {
            if (book.getTitle().equals(title)){
                books.remove(book);
                System.out.println("删除成功！");

            }

        }
        System.out.println("图书不存在！")
    }

    boolean securityQuestion(){
        String[] securityQuestions = {"你的姓名是什么？","你的年龄是多大？","你的性别是什么？"};
        Random random = new Random();
        int index = random.nextInt(securityQuestions.size());
        List<String> questions = new ArrayList<String>(securityQuestions.keySet());

        String randomQuestion = questions.get(index);

        Scanner scanner = new Scanner(System.in);
        System.out.println(randomQuestion);
        String answer = scanner.nextLine();

        String correctAnswer = securityQuestions.get(randomQuestion);
        return  answer.equals(correctAnswer);


    }

}

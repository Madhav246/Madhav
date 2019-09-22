import java.util.Scanner;
public class Books {
    String Book_name;
    String Author_name;
    int ISBN;

    void display() {
        System.out.println("--------------------");
        System.out.println("Book_name:" + Book_name);
        System.out.println("Author_name:" + Author_name);
        System.out.println("ISBN:" + ISBN);
        System.out.println("--------------------");
    }

    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String a;
        String c;
        int d;
        for (int i = 1; i <= n; i++) {
            Scanner sp = new Scanner(System.in);
            a = sp.nextLine();
            c = sp.nextLine();
            d = sp.nextInt();
                Books B1 = new Books();
                B1.Book_name = a;
                B1.Author_name = c;
                B1.ISBN = d;
                B1.display();
        }
    }
    }




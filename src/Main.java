import java.io.File;

public class Main {
    public static void main(String[] args) {
      File file=new File("test");
      String [] arr= file.list();
      for(String e:arr){
          System.out.println(e);
      }
    }
}

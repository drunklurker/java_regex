public class Main {

  public static void main(String[] args) {
    String s = "some.mail.here@gmail.com";
    boolean f = RegexDetector.eMail(s);
    System.out.println(f);
  }
}

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Gary Shemyakin on 04.11.2015.
 */
public class RegexDetector {
  public static boolean IPAddress(String s) {
    Pattern p = Pattern.compile("(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[1-9])(\\.25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9]){3}");
    Matcher m = p.matcher(s);
    if (m.matches()) {
      return true;
    }
    else {
      return false;
    }
  }
  public static boolean URL(String s)
  {
    Pattern p = Pattern.compile("(https?+:\\/\\/)?(www\\.)?+([\\w_]{2,}\\.(([\\w]{2,})\\.?)+)(\\/[\\w]+(\\?[\\w]+=[\\w]+(#[\\w]+))?)?");
    Matcher m = p.matcher(s);
    if (m.matches()) {
      return true;
    }
    else {
      return false;
    }
  }
  public static boolean eMail(String s)
  {
    Pattern p = Pattern.compile("((?:[\\w]\\.?[\\w])+)(@)([\\w]{2,})(\\.[\\w]{2,})+");
    Matcher m = p.matcher(s);
    if (m.matches()) {
      return true;
    }
    else {
      return false;
    }
  }
}

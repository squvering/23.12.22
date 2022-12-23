import java.util.*;

public class SmileFaces {
  
  public static int countSmileys(List<String> arr) {
    int cnt = 0;
      for(int i = 0; i < arr.size(); i++) {
        if(arr.get(i).length() == 2)
          if((arr.get(i).charAt(0) == ':' || arr.get(i).charAt(0) == ';') && 
             (arr.get(i).charAt(1) == ')' || arr.get(i).charAt(1) == 'D'))
            cnt++;
        if(arr.get(i).length() == 3)
          if((arr.get(i).charAt(0) == ':' || arr.get(i).charAt(0) == ';') && 
             (arr.get(i).charAt(1) == '-' || arr.get(i).charAt(1) == '~') &&
             (arr.get(i).charAt(2) == ')' || arr.get(i).charAt(2) == 'D'))
            cnt++;
      }
      return cnt;
  }
}
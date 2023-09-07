import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students implements Comparable<Students>{
  int age;
  String name;

  public Students(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public String toString() {
    return "Students [age=" + age + ", name=" + name + "]";
  }

  @Override
  public int compareTo(Students that) {
 
        if(this.age > that.age)
        return 1;
        else
        return -1;
    
  }

}

public class Demo {
  public static void main(String a[]) {
   
    Comparator<Students> com = new Comparator<Students>() {
      public int compare(Students i , Students j){
        if(i.age > j.age)
        return 1;
        else
        return -1;
      }
    };

    List<Students> stdnts = new ArrayList<>();
    stdnts.add(new Students(12, "EMI"));
         stdnts.add(new Students(20, "Labee"));
    stdnts.add(new Students(13, "Ramees"));


     Collections.sort(stdnts);

     for( Students s : stdnts){
         System.out.println("Name: "+s.name+" Age:"+s.age);
     }

}
}            
                 
         
          
          
           

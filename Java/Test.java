public class Test
{
  public static void main(String[] args)
{
try
{
 Student student = new Student(171222,5);
student.sem();
}catch(SemesterException se){
System.out.println(se.getMessage());
System.out.println("Exception handled:"+se);
}
}
}
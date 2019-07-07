public class Student
{
 int roll;
int sem;
public  Student(int roll, int sem) throws SemesterException
{
 if(sem<1 || sem>8)
{
throw new SemesterException ("Invalid semester");
}else{
this.roll=roll;
this.sem=sem;
}
}

public void sem()
{
 System.out.println("Roll:" +roll);
 System.out.println("Semester:"+sem);
}
}
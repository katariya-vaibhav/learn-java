package packages.SecondPackage;
import packages.FirstPackage.inheritPro1;

public class inheritPro2 extends inheritPro1 {
    public void putData(){
        inheritPro1 obj = new inheritPro1();
        obj.getData();
    }
}

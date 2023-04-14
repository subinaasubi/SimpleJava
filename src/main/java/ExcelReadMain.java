import java.io.IOException;
public class ExcelReadMain {
  
	public static void main(String[] args) throws IOException{
		
		ExcelReadEg ob= new ExcelReadEg();
		String a=ob.readData(0,0);
        System.out.println("Value of a is "+a);
        
        String b=ob.readData(0,1);
        System.out.println("Value of b is "+b); 
}
}

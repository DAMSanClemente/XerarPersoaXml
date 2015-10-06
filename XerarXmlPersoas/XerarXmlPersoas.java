import java.io.*;
import java.util.*;
import com.thoughtworks.xstream.XStream;

public class XerarXmlPersoas{
	public static void main(String[] args){
		ArrayList<Persona>listaPersoas=leDatPersoas();
		//Volcamos o contido do ficheiro e o cargamos nun arraylist
		try{
			XStream xstream=new XStream();
			xstream.alias("persoas",List.class);
			xstream.alias("persoa",Persona.class);
			xstream.toXML(listaPersoas,new FileOutputStream("persoas.xml"));
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	public static ArrayList<Persona> leDatPersoas(){
		ArrayList<Persona> persoas=new ArrayList<Persona>();
		try{
			FileInputStream ficheiroEntrada=new FileInputStream("personas.dat");
			ObjectInputStream entrada=new ObjectInputStream(ficheiroEntrada);
			while(ficheiroEntrada.available()>0){
				persoas.add((Persona)entrada.readObject());
			}
			entrada.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return persoas;
	}
}
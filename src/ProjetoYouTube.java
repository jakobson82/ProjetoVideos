
public class ProjetoYouTube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Video v[] = new Video[3];
		v[0] = new Video("Aula Java 01");
		v[1] = new Video("Big Data");
		v[2] = new Video("Android");
		
		usuario p[]  = new usuario[2];
		p[0] = new usuario("Carlos",23,"M", "carlos" );
		
		System.out.println(v[0].toString());
		System.out.println(p[0].toString());
	}

}

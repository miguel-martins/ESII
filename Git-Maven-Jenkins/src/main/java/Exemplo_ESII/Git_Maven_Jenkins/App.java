package Exemplo_ESII.Git_Maven_Jenkins;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Código para testes ES II" );
    }
    
    
    public int square(int x) {
		return x * x;
	}
	
    
	public int compString(String s1,String s2) {
		return (s1.compareTo(s2));
	}

	
	public int countA(String palavra) {
		int count = 0;
		for (int i = 0; i < palavra.length(); i++) {
			if (palavra.charAt(i) == 'a' || palavra.charAt(i) == 'A') {
				count++;
			}
			
			if (count > 20)
				count = 100;
			else
				count = count;
		}
		return count;
	}
}

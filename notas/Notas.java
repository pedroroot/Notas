package notas;

public class Notas 
{
	private int[] notas;
	
	public Notas( int[] notas)
	{
		this.notas = notas;
	}


	public void processarNotas()
	{
		saidaNotas();
		
		System.out.printf("a media da classe e %.2f%n%n", getMedia());
		System.out.printf("a menor nota e : %d%na maior nota e: %d%n%n", getMenorNota(),getMaiorNota());
		
		graficoDeBarra();
		
	}
	
	public int getMenorNota()
	{
		int menorNota = notas[0];
		
		for(int nota : notas)
		{
			if(nota < menorNota)
			{
				menorNota = nota;
			}
		}
		
		return menorNota;		
	}
	
	public int getMaiorNota()
	{
		int maiorNota = notas[0];
		
		for(int nota : notas)
		{
			if(nota > maiorNota)
			{
				maiorNota = nota;
			}
		}
		
		return maiorNota;
		
	}

	public double getMedia() 
	{	
		int total = 0;
		
		for(int nota : notas)
		{
			total += nota;			
		}			
		
		return (double) total / notas.length;
		
	}

	public void graficoDeBarra()
	{
		System.out.println("destribuicao de notas:");
		
		int[] frequencia = new int[11];
		
		for(int nota : notas)
		{
			++frequencia[nota / 10];
			
		}
		
		for(int contador = 0; contador < frequencia.length; contador++)
		{
			if(contador == 10)
			{
				System.out.printf("%5d:  ", 100);
			}
			else 
			{
				System.out.printf("%02d-%02d: ", contador * 10, contador * 10 + 9);
			}
			
			for(int stars = 0; stars < frequencia[contador]; stars++) 
			{
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
	}	

	public void saidaNotas()
	{
		System.out.printf("as notas sao:%n%n");
		
		for(int aluno = 0; aluno < notas.length; aluno++) 
		{
			System.out.printf("aluno %2d: %3d%n", aluno +1, notas[aluno]);
		}
		
		System.out.println();
	}





}

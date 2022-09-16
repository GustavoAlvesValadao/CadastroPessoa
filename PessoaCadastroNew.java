package Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PessoaCadastroNew {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		ArrayList<Pessoa>lista = new ArrayList<Pessoa>();
		
		char controle = 's';
		do {
			System.out.println("Digite o nome: ");
			String nome = leia.next();
			System.out.println("Digite a idade: ");
			int idade= leia.nextInt();
			Pessoa p = new Pessoa (nome,idade);
			lista.add(new Pessoa(nome, idade));
			System.out.println("Deseja cadastrar novamente? s ou S para sim. Digite qualquer outra letra para terminar a execução.");
			controle = leia.next().charAt(0);
						
		}while(controle == 's' || controle == 'S');
		
				
		//lista comparando apenas pela idade
		/*Collections.sort(lista, new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa p1, Pessoa p2) {
                return p1.getIdade() - p2.getIdade();
            }
        });
 
        System.out.println(lista);
    }*/
		Collections.sort(lista, new Comparator<Pessoa>() {
		    @Override
		    public int compare(Pessoa p1, Pessoa p2)
		    {
		        if (p1.getIdade() != p2.getIdade()) {
		            return p1.getIdade() - p2.getIdade();
		        }
		        return p1.getNome().compareTo(p2.getNome());
		    }
		});
			
		System.out.println(lista);
		}
	}



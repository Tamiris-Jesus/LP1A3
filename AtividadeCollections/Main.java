
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        List<String> arrayList1 = new ArrayList<>();
        List<String> arrayList2 = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        
        Scanner entrada = new Scanner(System.in);
        
        try {
            for (int i = 0; i < 2; i++) {
                System.out.print("Digite uma String para adicionar na lista 1 (ArrayList): ");
                String string = entrada.nextLine();
                if (string.matches(".*\\d.*")) {
                    throw new StringException("Erro: A String não pode conter números");
                }
                arrayList1.add(string);
            }

            for (int i = 0; i < 2; i++) {
                System.out.print("Digite uma String para adicionar na lista 2 (ArrayList): ");
                String input = entrada.nextLine();
                if (input.matches(".*\\d.*")) {
                    throw new StringException("Erro: A String não pode conter números");
                }
                arrayList2.add(input);
            }

            for (int i = 0; i < 2; i++) {
                System.out.print("Digite uma String para adicionar na lista 3 (LinkedList): ");
                String input = entrada.nextLine();
                if (input.matches(".*\\d.*")) {
                    throw new StringException("Erro: A String não pode conter números");
                }
                linkedList.add(input);
            }
        } catch (StringException e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.println("ArrayList 1: " + arrayList1);
        System.out.println("ArrayList 2: " + arrayList2);
        System.out.println("LinkedList: " + linkedList);
        
        
     // Adiciona todos os elementos da lista 2 e 3 para a lista 1
        arrayList1.addAll(arrayList2);
        arrayList1.addAll(linkedList);

        // Verifica se um elemento da lista 2 contém na lista 1
        String elemento = arrayList2.get(1);
        boolean contemElemento = arrayList1.contains(elemento);
        System.out.println("A lista 1 contém o elemento " + elemento + "? " + contemElemento);

        // Verifica se todos os elementos da lista 3 estão na lista 1
        boolean contemTodosElementos = arrayList1.containsAll(linkedList);
        System.out.println("A lista 1 contém todos os elementos da lista 3? " + contemTodosElementos);

        // Verifica se a lista 1 é igual a lista 2
        boolean igual = arrayList1.equals(arrayList2);
        System.out.println("A lista 1 é igual a lista 2? " + igual);

        // Mostra o elemento 2 de cada lista
        System.out.println("Elemento 2 da lista 1: " + arrayList1.get(1));
        System.out.println("Elemento 2 da lista 2: " + arrayList2.get(1));
        System.out.println("Elemento 2 da lista 3: " + linkedList.get(1));
        
        // Remove um elemento da lista 3
        linkedList.remove(0);
        
        // Remove os elementos da lista 3 da lista 1
        arrayList1.removeAll(linkedList);

        // Verifica o tamanho da lista 1
        int tamanhoLista1 = arrayList1.size();
        System.out.println("Tamanho da lista 1: " + tamanhoLista1);

        // Limpa a lista 3
        linkedList.clear();

        // Verifica se a lista 3 está vazia
        boolean lista3Vazia = linkedList.isEmpty();
        System.out.println("A lista 3 está vazia? " + lista3Vazia);

        // Mostra cada elemento da lista 1
        System.out.println("Elementos da lista 1:");
        for (String value : arrayList1) {
            System.out.println(value);
        }
    }

        
    }

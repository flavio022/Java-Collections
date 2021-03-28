package QueueFilas;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueFilas {



    public static void main(String args[]){

        // Queue é uma Fila ordenada
        Queue<String> listaNomes = new LinkedList<>();

        listaNomes.add("Flavio");
        listaNomes.add("Aline");
        listaNomes.add("Pietra");
        listaNomes.add("André");
        listaNomes.add("Isadora");

        String primeiroNome = listaNomes.element();

        System.out.println("Primeiro nome: "+ primeiroNome);
        String atendido = listaNomes.poll();
        listaNomes.peek();
        System.out.println("Primeiro atendido: " + atendido);


        String proximoAtendimento = listaNomes.element();

        System.out.println("Proximo nome: "+ proximoAtendimento);
        listaNomes.add("Juliano");

        System.out.println(listaNomes);

        System.out.println("Tamanho da lista é:" + listaNomes.size());

        System.out.println("Lista esta vázia? " + listaNomes.isEmpty());

        System.out.println("O nome Daminhão esta na lista? " + listaNomes.contains("Daminhão"));

        System.out.println("O nome Aline esta na lista? " + listaNomes.contains("Aline"));

        for(String nome : listaNomes){
            System.out.println(nome);
        }

        Iterator<String> iteratorListNomes = listaNomes.iterator();

        while (iteratorListNomes.hasNext()){
            System.out.println("-->"+ iteratorListNomes.next());
        }
        Queue<String> listaNomes2 = new LinkedList<>();
       System.out.println(listaNomes2.poll());

    }



}

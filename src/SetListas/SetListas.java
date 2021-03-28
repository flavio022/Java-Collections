package SetListas;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetListas {
    public static void main(String args[]){

        //Não garante ordem,não permite repetição
        //Não é possivel buscar por indice
        //HashSet,TreeSet,LinkedHashSet

        Set<Integer> lista = new HashSet<>();
        lista.add(4);

        lista.add(2);

        lista.add(1);
        lista.add(3);
        lista.add(5);
        lista.add(6);

        Iterator<Integer> iterator = lista.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //LinkedHashSet
        //Essa lista mantem a ordem de inserção dos elementos.
        //Um pouco mais lenta por conta de manter a ordem dos elementos.

        LinkedHashSet<Integer> linkded = new LinkedHashSet<>();

        linkded.add(2);
        linkded.add(3);
        linkded.add(20);
        linkded.add(1);
        System.out.println("Lista com LinkedList");

        System.out.println(linkded);

        Set<Integer> ah = new HashSet<>();
        ah.add(1);
        ah.add(0);
        ah.add(3);
        ah.add(2);

        ah.add(null);
        System.out.println(ah);
    }
}

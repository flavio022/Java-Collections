package TreeSet;

public class TreeSet {
    public static void main(String args []){

        java.util.TreeSet<String> arvore = new java.util.TreeSet<>();

        arvore.add("São Paulo");
        arvore.add("Rio de Janeiro");
        arvore.add("Curitiba");
        arvore.add("Belo Horizonte");
        arvore.add("Florianopolis");

        System.out.println(arvore);

        //Retorna o primeiro elemento da arvore
        System.out.println(arvore.first());

        //Retorna o utimo  elemento no final da arvore
        System.out.println(arvore.last());

        //Retorna o primeiro elemento Abaixo na arvore do elemento passado.
        System.out.println(arvore.lower("Curitiba"));


        //Retorna o primeiro elemento Acima na arvore do elemento passado.
        System.out.println(arvore.higher("Curitiba"));
    }
}

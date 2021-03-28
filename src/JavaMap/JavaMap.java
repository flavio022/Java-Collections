package JavaMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class JavaMap {
    public static void main(String args[]) {
        Map<String, Integer> campeosMundiais = new HashMap<>();

        campeosMundiais.put("Brasil",5);
        campeosMundiais.put("Alemanha",4);
        campeosMundiais.put("Itália",4);
        campeosMundiais.put("Uruguai",2);
        campeosMundiais.put("Argentina",2);
        campeosMundiais.put("França",2);
        campeosMundiais.put("Inglaterra",2);
        campeosMundiais.put("Espanha",2);

        System.out.println(campeosMundiais);

        //Retorna o valor da chave
        System.out.println(campeosMundiais.get("Brasil"));
        //Verifica se existe a chave
        System.out.println(campeosMundiais.containsKey("Brasil"));
        //Atualiza o valor
        System.out.println(campeosMundiais.put("Brasil",6));
        //Remove a chave
        System.out.println(campeosMundiais.remove("Brasil"));
        //Verifica se existe
        System.out.println(campeosMundiais.containsKey("Brasil"));
        //Retorna o tamanho do mapa
        System.out.println(campeosMundiais.size());


        //Percorre o mapa

        for(String key :campeosMundiais.keySet()){
            System.out.println(key + "--" + campeosMundiais.get(key));
        }

        for(Map.Entry<String,Integer> entry: campeosMundiais.entrySet()) {
            System.out.println(entry.getKey() +"--"+ entry.getValue());
        }
        System.out.println(campeosMundiais);

        TreeMap<String,String> treeCapital = new TreeMap<>();

        treeCapital.put("São Paulo","São Paulo");
        treeCapital.put("Parana","Curitiba");
        System.out.println(treeCapital);

        System.out.println(treeCapital.get("São Paulo"));

        System.out.println(treeCapital.get("Parana"));

        for(String cada:treeCapital.keySet()){
            System.out.println(cada);

        }
    }



}

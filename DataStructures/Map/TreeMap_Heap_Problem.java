import java.util.*;

public class TreeMap_Heap_Problem {

    public static void main(String[] args){

        Memory memory1 = new Memory("A1");
        memory1.insert("Disk",90);
        memory1.insert("System",95);
        memory1.insert("Cache",85);

        Memory memory2 = new Memory("A2");
        memory2.insert("Disk",91);
        memory2.insert("System",96);
        memory2.insert("Cache",86);

        Memory memory3 = new Memory("A3");
        memory3.insert("Disk",92);
        memory3.insert("System",97);
        memory3.insert("Cache",87);

        Memory memory4 = new Memory("A4");
        memory4.insert("Disk",93);
        memory4.insert("System",98);
        memory4.insert("Cache",88);

        Memory memory5 = new Memory("A5");
        memory5.insert("Disk",94);
        memory5.insert("System",90);
        memory5.insert("Cache",80);

        Memory memory6 = new Memory("A6");
        memory6.insert("Disk",89);
        memory6.insert("System",99);
        memory6.insert("Cache",82);

        Memory memory7 = new Memory("A7");
        memory7.insert("Disk",80);
        memory7.insert("System",85);
        memory7.insert("Cache",81);

        Memory memory8 = new Memory("A8");
        memory8.insert("Disk",99);
        memory8.insert("System",95);
        memory8.insert("Cache",85);

        Memory memory9 = new Memory("A9");
        memory9.insert("Disk",80);
        memory9.insert("System",85);
        memory9.insert("Cache",75);

        Memory memory10 = new Memory("A10");
        memory10.insert("Disk",96);
        memory10.insert("System",100);
        memory10.insert("Cache",82);

        SortedSet<Memory> memorySortedSet = new TreeSet<>(new Comparator<Memory>() {
            @Override
            public int compare(Memory o1, Memory o2) {
                int res = o2.getBiggestElement().compareTo(o1.getBiggestElement());
                return res != 0 ? res : 1;
            }
        });

        memorySortedSet.add(memory1);
        memorySortedSet.add(memory2);
        memorySortedSet.add(memory3);
        memorySortedSet.add(memory4);
        memorySortedSet.add(memory5);
        memorySortedSet.add(memory6);
        memorySortedSet.add(memory7);
        memorySortedSet.add(memory8);
        memorySortedSet.add(memory9);
        memorySortedSet.add(memory10);

        memorySortedSet.forEach((Memory memory)->{
            System.out.println(memory.name);
        });
    }


}

class Memory{

    String name;

    TreeSet<Map.Entry<String,Integer>> treeMemorySet = new TreeSet<>(new Comparator<Map.Entry<String,Integer>>() {
        @Override
        public int compare(Map.Entry<String,Integer> e1, Map.Entry<String,Integer> e2) {
            int res = e2.getValue().compareTo(e1.getValue());
            return res != 0 ? res : 1;
        }
    });

    Memory(String name){
        this.name = name;
    }

    public void insert(String type,Integer value)
    {
        treeMemorySet.add(Map.entry(type,value));
    }

    public Integer getBiggestElement(){
        //String type = treeMemoryMap.lastKey().getKey();
        Integer value = treeMemorySet.first().getValue();
        return value;
    }

}
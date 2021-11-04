package tb.soft;

import java.util.*;

public class Colections {
    Person person;

    {
        try {
            person = new Person("Kamil","Kochan");
        } catch (PersonException e) {
            e.printStackTrace();
        }
    }
    public Set <Person>hashset = new HashSet();
    public Set<Person> treeset=new TreeSet();
    public ArrayList<Person> arraylist = new ArrayList();
    public LinkedList<Person> linkedlist = new LinkedList<>();
    public HashMap<Person,Integer> hashmap = new HashMap<Person,Integer>();
    public Map<Integer, Person> treemap = new TreeMap<>();


    public void savetocollection(Person currentPerson, int selected_collection1, int selected_collection2) {
        switch (selected_collection1) {

            case 1: { //HashSet
                addhashset(currentPerson);
                }
                break;
            case 2:{
                addtreeset(currentPerson);
            }
            break;
            case 3:{addarraylist(currentPerson);}
            break;
            case 4:{addlinkedlist(currentPerson);}
            break;
            case 5:{addhashmap(currentPerson);}
            break;
            case 6:{addtreemap(currentPerson);}
            break;

            }
        }
    public void displayhashset(){
        for(Person person : hashset)
        {
            System.out.println("");
            System.out.println("Imię: " + person.getFirstName());
            System.out.println("Nazwisko: " + person.getLastName());
            System.out.println("Rok ur.: " + person.getBirthYear());
            System.out.println("Stanowisko: " + person.getJob());
        }
        }
    public void displaytreeset() {
        for(Person person : treeset)
        {
            System.out.println("");
            System.out.println("Imię: " + person.getFirstName());
            System.out.println("Nazwisko: " + person.getLastName());
            System.out.println("Rok ur.: " + person.getBirthYear());
            System.out.println("Stanowisko: " + person.getJob());
        }
    }
    public void disarraylist() {
        for(Person person : arraylist)
        {
            System.out.println("");
            System.out.println("Imię: " + person.getFirstName());
            System.out.println("Nazwisko: " + person.getLastName());
            System.out.println("Rok ur.: " + person.getBirthYear());
            System.out.println("Stanowisko: " + person.getJob());
        }
    }
    public void dislinkedlist() {
        for(Person person : linkedlist)
        {
            System.out.println("");
            System.out.println("Imię: " + person.getFirstName());
            System.out.println("Nazwisko: " + person.getLastName());
            System.out.println("Rok ur.: " + person.getBirthYear());
            System.out.println("Stanowisko: " + person.getJob());
        }
    }
    public void dishashmap() {

        for(Person person : hashmap.keySet())
        {
            System.out.println("");
            System.out.println("Imię: " + person.getFirstName());
            System.out.println("Nazwisko: " + person.getLastName());
            System.out.println("Rok ur.: " + person.getBirthYear());
            System.out.println("Stanowisko: " + person.getJob());
        }
    }
    public void distreemap() {
       // for(Person person : treemap.keySet())
        {
            System.out.println("");
            System.out.println("Imię: " + person.getFirstName());
            System.out.println("Nazwisko: " + person.getLastName());
            System.out.println("Rok ur.: " + person.getBirthYear());
            System.out.println("Stanowisko: " + person.getJob());
        }
    }
    public void addhashset(Person currentPerson){
        hashset.add(currentPerson);
    }
    public void addtreeset(Person currentPerson){
        treeset.add(currentPerson);
    }
    public void addarraylist(Person currentPerson){
        arraylist.add(currentPerson);
    }
    public void addlinkedlist(Person currentPerson){
        linkedlist.add(currentPerson);
    }
public void addhashmap(Person currentPerson){
        hashmap.put(currentPerson,hashmap.size()+1);
}
public void addtreemap(Person currentPerson){
        treemap.put(treemap.size()+1,currentPerson);
}
    }



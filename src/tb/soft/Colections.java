package tb.soft;

import java.util.*;

import static tb.soft.PersonConsoleApp.createNewPerson;

public class Colections {
    private int a;
    private static final String CHOOSE_COLLECTION =
                    "1 - HashSet           \n" +
                    "2 - TreeSet       \n" +
                    "3 - ArrayList  \n" +
                    "4 - LinkedList     \n" +
                    "5 - HashMap\n" +
                    "6 - TreeMap\n";

    private static final ConsoleUserDialog UI = new ConsoleUserDialog();
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
    public Map<Person,Integer> treemap = new TreeMap<>();


    public void deletefromcollection(){
        UI.printMessage("Wybierz z której kolekcji chcesz usunąć rekord: ");
        a = UI.enterInt(CHOOSE_COLLECTION);
        switch(a){
            case 1:
        }
    }
    public void savetocollection(Person currentPerson, int selected_collection1, int selected_collection2) {
        switch (selected_collection1) {

            case 1: {addhashset(currentPerson);}
            break;
            case 2:{addtreeset(currentPerson);}
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
        switch (selected_collection2) {

            case 1: {addhashset(currentPerson);}
            break;
            case 2:{addtreeset(currentPerson);}
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
        System.out.println("Wyświetlam HashSet");
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
        System.out.println("Wyświetlam TreeSet");
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
        System.out.println("Wyświetlam ArrayList");
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
        System.out.println("Wyświetlam LinkedList: ");
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
        System.out.println("Wyświetlam HashMap");
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
        System.out.println("Wyświetlam TreeMap");
        for(Person person : treemap.keySet())
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
        treemap.put(currentPerson,treemap.size()+1);
}
public void deletehashset(){
Person person1 = createNewPerson();
    hashset.remove(person1);
}
    public void deletetreeset(){
        Person person1 = createNewPerson();
        treeset.remove(person1);
    }
    public void deletearraylist(){
        arraylist.remove(UI.enterInt("Podaj nr. indeksu do usnięcia: "));
    }
    public void deletelinkedlist(){
        linkedlist.remove(UI.enterInt("Podaj nr. indeksu do usnięcia: "));
    }
    public void deletehashmap(){
        hashmap.remove(UI.enterInt("Podaj nr. indeksu do usnięcia: "));
    }
    public void deletetreemap(){
        treemap.remove(UI.enterInt("Podaj nr. indeksu do usnięcia: "));
    }
    public void removefromcolections(int selected_collection1,int selected_collection2){
        switch(selected_collection1){
            case 1: deletehashset();
            break;
            case 2: deletetreeset();
            break;
            case 3: deletearraylist();
            break;
            case 4: deletearraylist();;
            break;
            case 5: deletehashmap();
            break;
            case 6: deletetreemap();
            break;
        }
        switch(selected_collection2){
            case 1: deletehashset();
                break;
            case 2: deletetreeset();
                break;
            case 3: deletearraylist();
                break;
            case 4: deletearraylist();;
                break;
            case 5: deletehashmap();
                break;
            case 6: deletetreemap();
                break;
        }
    }
    }



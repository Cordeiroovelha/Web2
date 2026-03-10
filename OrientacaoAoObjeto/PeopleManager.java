package OrientacaoAoObjeto;

import java.util.ArrayList;
import java.util.List;

import OrientacaoAoObjeto.PeopleControl.Person;

public class PeopleManager {
    private List<Person> peopleList;

    public PeopleManager() {
        peopleList = new ArrayList<>();
    }

    public List<Person> getPeopleList(){
        return peopleList;
    }

    public boolean save(Person person){
        if(person != null){
            peopleList.add(person);
            return true;
        }
        return false;
    }

}

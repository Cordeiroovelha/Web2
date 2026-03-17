package OrientacaoAoObjeto.Project;

public class Project {
    String name;
    String id;

    //construtor
    public Project(String name, String id) {
        this.name = name;
        this.id = id;
    }

    //setters getters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "Dados do projeto: Id [" + id + "] Nome [" + name + "] ";
    }
}

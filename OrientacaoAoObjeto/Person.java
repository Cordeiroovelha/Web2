package OrientacaoAoObjeto;

public class PeopleControl {
    
    public class Person{
        private String name;
        private String Id;

        public Person(String name, String Id){
            this.name = name;
            this.Id = Id;
        }

        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }

        public void setId(String Id){
            this.Id = Id;
        }
        public String getId(){
            return Id;
        }

        @Override
        public String toString(){
            return "Dados da pessoa [Nome: " + name + " - CPF: " + Id + "]";
        }

    }
}

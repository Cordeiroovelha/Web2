package OrientacaoAoObjeto.Project;

import java.util.ArrayList;
import java.util.List;


public class ProjectManager {
    private List<Project> projectList;

    public ProjectManager() {
        projectList = new ArrayList<>();
    }

    public List<Project> getProjectList(){
        return projectList;
    }

    public boolean saveProject(Project project){
        if(project != null){
            projectList.add(project);
            return true;
        }
        return false;
    }

    public Project search(String id){
        for(Project project: projectList){
            if(project.getId().equals(id)){
                return project;
            }
        }
        return null;
    }

    public void viewAll(){
        for(Project project: projectList){
            System.out.println(project);
        }
    }

    public boolean remove(String id){
        Project project = search(id);
        if(project != null){
            projectList.remove(project);
            return true;
        }
        return false;
    }

}

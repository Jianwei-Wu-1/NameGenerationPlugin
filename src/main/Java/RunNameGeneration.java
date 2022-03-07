import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManager;
import edu.udel.GenerateDescriptiveNamesKt;

public class RunNameGeneration extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here

        for (Project project : ProjectManager.getInstance().getOpenProjects()) {

            Project[] args = new Project[]{project};
            GenerateDescriptiveNamesKt.main(args);
        }

        System.exit(0);
    }
}

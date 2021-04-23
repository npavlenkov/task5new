import io.pavlenkov.Basesteps;
import org.junit.jupiter.api.Test;

public class metodsteps {
    public Basesteps steps = new Basesteps();
    String
            repos = "npavlenkov/tasks",
            issuesnomer = "#1";

    @Test

    public void testIssuseSearch() {
        steps.openMainPage();
        steps.searchForRepository(repos);
        steps.goToRepositoryFromSearch(repos);
        steps.openRepositoryIssues();
        steps.shouldSeeIssuesWithNumber(issuesnomer);

    }
}

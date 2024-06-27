import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.Test;
import pageObjects.CreateTaskPage;
import pageObjects.TasksListPage;

import java.net.MalformedURLException;

public class ToDo_Android extends TestBase{

    CreateTaskPage createTaskPage;
    TasksListPage tasksListPage;

    @Test
    public void test_add_task() throws MalformedURLException {
        setUp();
        tasksListPage = new TasksListPage(driver);
        createTaskPage = new CreateTaskPage(driver);
        // Example of handling alerts (if it's an alert dialog)
        try {
            Alert alert = driver.switchTo().alert();
            alert.dismiss(); // Dismiss the alert
        } catch (NoAlertPresentException e) {
            // Handle the exception if no alert is present
        }
        tasksListPage.clickAddTaskBtn();
        createTaskPage.enterTaskName("finish selenium first");
        createTaskPage.enterTaskDesc("Automation Framework");
        createTaskPage.clickSaveBtn();
    }

}

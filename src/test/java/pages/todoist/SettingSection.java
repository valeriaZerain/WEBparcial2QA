package pages.todoist;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class SettingSection {
    public TextBox nameTextbox = new TextBox(By.xpath("//input[@name='name']"));
    public Button buttonSubmit = new Button(By.xpath("//button[@type='submit']"));
    public Button buttonClose = new Button(By.xpath("//svg[@xmlns=\"http://www.w3.org/2000/svg\"]"));
}

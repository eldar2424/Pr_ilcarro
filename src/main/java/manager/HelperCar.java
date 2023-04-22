package manager;

import org.openqa.selenium.By;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static jdk.nashorn.internal.objects.NativeJava.type;

public class HelperCar {

    private void typeCity(String city){
//        type(By.id("city"),city);
//        click(By.cssSelector())
    }



    private void SearchCurrentYear(String city, String dateFrom, String dateTo){
        typeCity(city);
        click(By.id("dates"));

        LocalDate now = LocalDate.now();
        System.out.println(now);
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();
        LocalDate from = LocalDate.parse(dateFrom, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
       // LocalDate from1 = LocalDate.parse("2013:23/05", DateTimeFormatter.ofPattern("yyyy:dd/MM"));
        LocalDate to = LocalDate.parse(dateTo, DateTimeFormatter.ofPattern("yyyy:dd/MM"));
//        System.out.println(from);
//        System.out.println(from1);

        int diffMonth =from.getMonthValue()- month;
        if(diffMonth>0){
            clickNextMonthBtn(diffMonth);
        }

        click(By.xpath("//div[text()=' "+from.getDayOfMonth()+" ']"));

        diffMonth= to.getMonthValue()-from.getDayOfMonth();
        if(diffMonth>0){
            clickNextMonthBtn(diffMonth);
        }

        String locator = String.format("//div[text()=' "+from[1]+" ']");
    }
    private void clickNextMonthBtn(int diffMonth){
        for (int i = 0; i < diffMonth; i++) {
            click(By.cssSelector("'button[aria-label=Next month']"));
        }
    }
}

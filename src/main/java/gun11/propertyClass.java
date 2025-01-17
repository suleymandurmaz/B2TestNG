package gun11;

import org.testng.annotations.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class propertyClass {

    // read property file
    @Test
    public void propertyFile() {

        // properties Classina ihtiyac var
        Properties properties = new Properties();   // property nesnesi olusturulur

        properties.put("username", "myUser");          // nesneye ikili veri eklenir
        properties.put("password", "myPass");          // nesneye ikili veri eklenir


        String user = properties.getProperty("username");   // property den veri okuma
        String pass = properties.getProperty("password");   // property den veri okuma

        System.out.println(user + " , " + pass);

    }

    @Test
    public void readPropertyFromFile() throws IOException {

        Properties properties = new Properties();

        FileReader fileReader = new FileReader("src/main/java/gun11/config.properties");
        properties.load(fileReader);

        String url = properties.getProperty("opencart.url");
        String user = properties.getProperty("username");
        String pass = properties.getProperty("password");

        System.out.println(url);
        System.out.println(user);
        System.out.println(pass);

        // tüm verileri loop ile yazdirmak istenirse
        properties.forEach((k, v)->{
            System.out.println(k + " : " + v);
        });

        fileReader.close();
    }

}

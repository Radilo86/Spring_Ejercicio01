import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main (String args[]){

        // Instanciacion sin Spring
        // Saludo hola = new Saludo();
        // System.out.println(hola.saludar());

        /* Vamos a la pagina spring.io para obtener la documentacion, pero para agregar las dependencias en nuestro
        * caso de Maven nos vamos a la siguiente web --> https://mvnrepository.com/ y buscamos  org.springframework
        * que sera el que usemos para realizar este ejercicio, utilizando en el beans el spring-context.
        * Copiamos y pegamos el codigo en el archivo pom.xml, seguramente tengamos que cerrar y abrir el IDE para que
        * recargue nuestro proyecto.
        *
        * El siguiente paso será en la carpeta resources crear un archivo xml llamado beans
        *   <?xml version="1.0" encoding="UTF-8" standalone="no"?>
                <beans xmlns="http://www.springframework.org/schema/beans"
                * xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                * xsi:schemaLocation="http://www.springframework.org/schema/beans
                * https://www.springframework.org/schema/beans/spring-beans.xsd">
                * <bean id="saludo" class="Saludo"></bean>
              * </beans>
        * Esto sirve para acceder a un objeto desde muchas clases sin tener que instanciarlo, este objeto se esta
        * inyectando en todos los sitios con lo cual estamos creando un solo objeto en memoria que podrá ser usado en
        * multiples sitios.
        */
        // Con Spring lo hacemos de la siguiente manera:
        ApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");
        Saludo saludamos = (Saludo)contexto.getBean("saludo");
        System.out.println(saludamos.saludar());

    }

}

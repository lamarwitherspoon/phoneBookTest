import org.junit.Assert;
import org.junit.Test;
import phonebookpack.PhoneBook;

import java.util.List;

public class phonebooktest {
@Test
public  void  add() {
    //Given

    PhoneBook phoneBook = new PhoneBook();

    String expected = "345-657-3456";

    //When

     phoneBook.add("Smith", "345-657-3456");

     String actual = phoneBook.lookup("Smith");

    //Then
    Assert.assertEquals(expected, actual);

}

@Test
public  void remove(){

    //Given
    PhoneBook phoneBook = new PhoneBook();

    String expected = "Smith";

    //When

    phoneBook.add("Smith", "345-657-3456");

    phoneBook.remove("Smith");

    String actual = phoneBook.remove("Smith");

    //Then

    Assert.assertEquals(expected,actual);




}


@Test

    public void  lookup(){

    //Given
    PhoneBook phoneBook = new PhoneBook();

    String expected = "123-456-7890";

    //When
    phoneBook.add("Tara","123-456-7890");

    phoneBook.lookup("Tara");

    String actual = phoneBook.lookup("Tara");



    //Then

    Assert.assertEquals(expected,actual);

}

@Test

    public void reverseLookup(){

    //Given

    PhoneBook phoneBook = new PhoneBook();

   String expected = "Rob";

    //When
    phoneBook.add("Rob","475-576-8395");

    phoneBook.reverselookup("Rob");

   String actual = phoneBook.reverselookup("Rob");



    //Then

    Assert.assertEquals(expected, actual);
}

@Test

    public  void display(){

    //Given

    PhoneBook phoneBook = new PhoneBook();

    phoneBook.add("Bob Dylan","704-7846-2748");

    phoneBook.add("lamar", "123-456-789");

    String ecpected = "Bob Dylan : 704-7846-2748\nlamar : 123-456-789\n";

    //When


    phoneBook.display();

   String actual = phoneBook.display();


   //Then

    Assert.assertEquals(ecpected,actual);



}


}

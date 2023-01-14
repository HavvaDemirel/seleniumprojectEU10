package com.cydeo.tests.day9_javafaker_testbase_driveUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {
    @Test
    public void test1() {
        // creating faker object to reach method
        Faker faker = new Faker();
     //   Faker faker1 = new Faker(new Locale("uk"));
        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());
        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        System.out.println("faker.numerify(\"+44-###-###-###\") = " + faker.numerify("+44-###-###-###"));
        System.out.println(faker.letterify("???? ????????"));
        System.out.println("faker.bothify(\"#?#####?#\") = " + faker.bothify("#?#####?#"));

        System.out.println("faker.finance().creditCard().replace(\"-\",\" \") = " + faker.finance().creditCard().replace("-", " "));
        System.out.println("faker.chuckNorris().fact().replace(\"Chuck Norris\", \"Muhtar\") = " + faker.chuckNorris().fact().replace("Chuck Norris", "muhtar"));
    }


}

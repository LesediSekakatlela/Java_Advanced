package Lesson13.IO_Fundamentals;

import java.util.Properties;

public class TestProperties {

    public static void main(String[] args) {
        Properties props = System.getProperties();
        props.list(System.out);
    }
}
package javaClasses;

public class SingletonTest {
    private static SingletonTest instance = null;
    private SingletonTest() {

    }

    public SingletonTest getInstance() {
        if (instance == null) {
            instance = new SingletonTest();
        }
        return instance;
    }
}

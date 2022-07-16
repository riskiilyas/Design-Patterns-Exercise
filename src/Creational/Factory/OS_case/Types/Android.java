package Creational.Factory.OS_case.Types;

import Creational.Factory.OS_case.OS;

public class Android implements OS {
    @Override
    public void spec() {
        System.out.println("This is Android OS");
    }
}

package Creational.Factory.OS_case;

import Creational.Factory.OS_case.Types.Android;
import Creational.Factory.OS_case.Types.IOS;
import Creational.Factory.OS_case.Types.Symbian;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class OSFactory {
    public static String IOS = "IOS";
    public static String ANDROID = "ANDROID";
    public static String SYMBIAN = "SYMBIAN";

    @Nullable
    public OS getInstance(@NotNull String type) {
        if(type.equals(IOS)) return new IOS();
        else if (type.equals(ANDROID)) return new Android();
        else if (type.equals(SYMBIAN)) return new Symbian();
        return null;
    }
}

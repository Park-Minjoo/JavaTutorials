package accessmodifier.outter;
import accessmodifier.inner.*;
public class ClassAccessModifierOuterPackage {
    PublicClass publicClass = new PublicClass();
//    DefaultClass defaultClass = new DefaultClass();
    /*  ERROR
        Access Modifier of DefaultClass: default
     */
}

package titan.lightbatis.mybatis.script;

public class MustacheHelper {

    public String canonicalName (Object context) {
        if (context instanceof  Class) {
            Class clz = (Class)context;
            return clz.getCanonicalName();
        }
        return null;
    }
}

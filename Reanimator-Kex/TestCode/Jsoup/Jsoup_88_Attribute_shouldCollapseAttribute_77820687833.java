package org.jsoup.nodes;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class Attribute_shouldCollapseAttribute_77820687833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47991;
     Object term48020;
     Object term125783;
     Object term125791;

    public Attribute_shouldCollapseAttribute_77820687833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47991 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term48016 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term48018 = (Object[]) newArray("java.lang.String", 0);
        Object[] term48019 = (Object[]) newArray("java.lang.String", 0);
        setField(term47991, term47991.getClass(), "key", "OclPbYPkcH");
        setField(term47991, term47991.getClass(), "val", "IoAlmYsBwc");
        setIntField(term48016, term48016.getClass(), "size", -1339778481);
        setField(term48016, term48016.getClass(), "keys", term48018);
        setField(term48016, term48016.getClass(), "vals", term48019);
        setField(term47991, term47991.getClass(), "parent", term48016);
        Class<? extends Object> term126259 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term126258 = ((Class) term126259).getDeclaredField((String) "base");
        ((Field) term126258).setAccessible(true);
        Object enum18 = ((Field) term126258).get((Object) null);
        Class<? extends Object> term126479 = Class.forName((String) "org.jsoup.nodes.Entities$CoreCharset");
        Field term126478 = ((Class) term126479).getDeclaredField((String) "utf");
        ((Field) term126478).setAccessible(true);
        Object enum19 = ((Field) term126478).get((Object) null);
        Class<? extends Object> term126675 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term126674 = ((Class) term126675).getDeclaredField((String) "html");
        ((Field) term126674).setAccessible(true);
        Object enum20 = ((Field) term126674).get((Object) null);
        term48020 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term49693 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term49701 = (Object[]) newArray("java.lang.String", 2);
        Object term49727 = newInstance(Class.forName("java.lang.ThreadLocal"));
        setField(term48020, term48020.getClass(), "escapeMode", enum18);
        setField(term49693, term49693.getClass(), "name", "UTF-8");
        setElement(term49701, 0, "UTF8");
        setElement(term49701, 1, "unicode-1-1-utf-8");
        setField(term49693, term49693.getClass(), "aliases", term49701);
        setField(term49693, term49693.getClass(), "aliasSet", null);
        setField(term48020, term48020.getClass(), "charset", term49693);
        setIntField(term49727, term49727.getClass(), "threadLocalHashCode", -99667252);
        setField(term48020, term48020.getClass(), "encoderThreadLocal", term49727);
        setField(term48020, term48020.getClass(), "coreCharset", enum19);
        setBooleanField(term48020, term48020.getClass(), "prettyPrint", true);
        setBooleanField(term48020, term48020.getClass(), "outline", false);
        setIntField(term48020, term48020.getClass(), "indentAmount", 1);
        setField(term48020, term48020.getClass(), "syntax", enum20);
        term125783 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term125788 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term125789 = (Object[]) newArray("java.lang.String", 0);
        Object[] term125790 = (Object[]) newArray("java.lang.String", 0);
        setField(term125783, term125783.getClass(), "key", "OclPbYPkcH");
        setField(term125783, term125783.getClass(), "val", "IoAlmYsBwc");
        setIntField(term125788, term125788.getClass(), "size", -1339778481);
        setField(term125788, term125788.getClass(), "keys", term125789);
        setField(term125788, term125788.getClass(), "vals", term125790);
        setField(term125783, term125783.getClass(), "parent", term125788);
        Class<? extends Object> term126944 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term126943 = ((Class) term126944).getDeclaredField((String) "base");
        ((Field) term126943).setAccessible(true);
        Object enum21 = ((Field) term126943).get((Object) null);
        Class<? extends Object> term127172 = Class.forName((String) "org.jsoup.nodes.Entities$CoreCharset");
        Field term127171 = ((Class) term127172).getDeclaredField((String) "utf");
        ((Field) term127171).setAccessible(true);
        Object enum22 = ((Field) term127171).get((Object) null);
        Class<? extends Object> term127368 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term127367 = ((Class) term127368).getDeclaredField((String) "html");
        ((Field) term127367).setAccessible(true);
        Object enum23 = ((Field) term127367).get((Object) null);
        term125791 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term126223 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term126226 = (Object[]) newArray("java.lang.String", 2);
        Object term126231 = newInstance(Class.forName("java.lang.ThreadLocal"));
        setField(term125791, term125791.getClass(), "escapeMode", enum21);
        setField(term126223, term126223.getClass(), "name", "UTF-8");
        setElement(term126226, 0, "UTF8");
        setElement(term126226, 1, "unicode-1-1-utf-8");
        setField(term126223, term126223.getClass(), "aliases", term126226);
        setField(term126223, term126223.getClass(), "aliasSet", null);
        setField(term125791, term125791.getClass(), "charset", term126223);
        setIntField(term126231, term126231.getClass(), "threadLocalHashCode", -99667252);
        setField(term125791, term125791.getClass(), "encoderThreadLocal", term126231);
        setField(term125791, term125791.getClass(), "coreCharset", enum22);
        setBooleanField(term125791, term125791.getClass(), "prettyPrint", true);
        setBooleanField(term125791, term125791.getClass(), "outline", false);
        setIntField(term125791, term125791.getClass(), "indentAmount", 1);
        setField(term125791, term125791.getClass(), "syntax", enum23);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[1];
        args[0] = term48020;
        callMethod(klass, "shouldCollapseAttribute", argTypes, term47991, args);
        assertTrue(recursiveEquals(term47991, term125783));
        assertTrue(recursiveEquals(term48020, term125791));
    }

};



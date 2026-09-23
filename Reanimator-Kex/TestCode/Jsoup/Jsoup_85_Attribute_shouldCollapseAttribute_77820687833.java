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
     Object term125673;
     Object term125681;

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
        Class<? extends Object> term126149 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term126148 = ((Class) term126149).getDeclaredField((String) "base");
        ((Field) term126148).setAccessible(true);
        Object enum18 = ((Field) term126148).get((Object) null);
        Class<? extends Object> term126369 = Class.forName((String) "org.jsoup.nodes.Entities$CoreCharset");
        Field term126368 = ((Class) term126369).getDeclaredField((String) "utf");
        ((Field) term126368).setAccessible(true);
        Object enum19 = ((Field) term126368).get((Object) null);
        Class<? extends Object> term126565 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term126564 = ((Class) term126565).getDeclaredField((String) "html");
        ((Field) term126564).setAccessible(true);
        Object enum20 = ((Field) term126564).get((Object) null);
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
        setIntField(term49727, term49727.getClass(), "threadLocalHashCode", 1540864275);
        setField(term48020, term48020.getClass(), "encoderThreadLocal", term49727);
        setField(term48020, term48020.getClass(), "coreCharset", enum19);
        setBooleanField(term48020, term48020.getClass(), "prettyPrint", true);
        setBooleanField(term48020, term48020.getClass(), "outline", false);
        setIntField(term48020, term48020.getClass(), "indentAmount", 1);
        setField(term48020, term48020.getClass(), "syntax", enum20);
        term125673 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term125678 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term125679 = (Object[]) newArray("java.lang.String", 0);
        Object[] term125680 = (Object[]) newArray("java.lang.String", 0);
        setField(term125673, term125673.getClass(), "key", "OclPbYPkcH");
        setField(term125673, term125673.getClass(), "val", "IoAlmYsBwc");
        setIntField(term125678, term125678.getClass(), "size", -1339778481);
        setField(term125678, term125678.getClass(), "keys", term125679);
        setField(term125678, term125678.getClass(), "vals", term125680);
        setField(term125673, term125673.getClass(), "parent", term125678);
        Class<? extends Object> term126834 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term126833 = ((Class) term126834).getDeclaredField((String) "base");
        ((Field) term126833).setAccessible(true);
        Object enum21 = ((Field) term126833).get((Object) null);
        Class<? extends Object> term127054 = Class.forName((String) "org.jsoup.nodes.Entities$CoreCharset");
        Field term127053 = ((Class) term127054).getDeclaredField((String) "utf");
        ((Field) term127053).setAccessible(true);
        Object enum22 = ((Field) term127053).get((Object) null);
        Class<? extends Object> term127250 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term127249 = ((Class) term127250).getDeclaredField((String) "html");
        ((Field) term127249).setAccessible(true);
        Object enum23 = ((Field) term127249).get((Object) null);
        term125681 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term126113 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term126116 = (Object[]) newArray("java.lang.String", 2);
        Object term126121 = newInstance(Class.forName("java.lang.ThreadLocal"));
        setField(term125681, term125681.getClass(), "escapeMode", enum21);
        setField(term126113, term126113.getClass(), "name", "UTF-8");
        setElement(term126116, 0, "UTF8");
        setElement(term126116, 1, "unicode-1-1-utf-8");
        setField(term126113, term126113.getClass(), "aliases", term126116);
        setField(term126113, term126113.getClass(), "aliasSet", null);
        setField(term125681, term125681.getClass(), "charset", term126113);
        setIntField(term126121, term126121.getClass(), "threadLocalHashCode", 1540864275);
        setField(term125681, term125681.getClass(), "encoderThreadLocal", term126121);
        setField(term125681, term125681.getClass(), "coreCharset", enum22);
        setBooleanField(term125681, term125681.getClass(), "prettyPrint", true);
        setBooleanField(term125681, term125681.getClass(), "outline", false);
        setIntField(term125681, term125681.getClass(), "indentAmount", 1);
        setField(term125681, term125681.getClass(), "syntax", enum23);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[1];
        args[0] = term48020;
        callMethod(klass, "shouldCollapseAttribute", argTypes, term47991, args);
        assertTrue(recursiveEquals(term47991, term125673));
        assertTrue(recursiveEquals(term48020, term125681));
    }

};



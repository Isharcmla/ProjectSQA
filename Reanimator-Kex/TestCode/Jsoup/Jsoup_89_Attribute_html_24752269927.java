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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Attribute_html_24752269927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406;

    public Attribute_html_24752269927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term78297 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term78296 = ((Class) term78297).getDeclaredField((String) "base");
        ((Field) term78296).setAccessible(true);
        Object enum12 = ((Field) term78296).get((Object) null);
        Class<? extends Object> term78517 = Class.forName((String) "org.jsoup.nodes.Entities$CoreCharset");
        Field term78516 = ((Class) term78517).getDeclaredField((String) "utf");
        ((Field) term78516).setAccessible(true);
        Object enum13 = ((Field) term78516).get((Object) null);
        Class<? extends Object> term78713 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term78712 = ((Class) term78713).getDeclaredField((String) "html");
        ((Field) term78712).setAccessible(true);
        Object enum14 = ((Field) term78712).get((Object) null);
        term406 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term2079 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term2087 = (Object[]) newArray("java.lang.String", 2);
        Object term2113 = newInstance(Class.forName("java.lang.ThreadLocal"));
        setField(term406, term406.getClass(), "escapeMode", enum12);
        setField(term2079, term2079.getClass(), "name", "UTF-8");
        setElement(term2087, 0, "UTF8");
        setElement(term2087, 1, "unicode-1-1-utf-8");
        setField(term2079, term2079.getClass(), "aliases", term2087);
        setField(term2079, term2079.getClass(), "aliasSet", null);
        setField(term406, term406.getClass(), "charset", term2079);
        setIntField(term2113, term2113.getClass(), "threadLocalHashCode", 548542194);
        setField(term406, term406.getClass(), "encoderThreadLocal", term2113);
        setField(term406, term406.getClass(), "coreCharset", enum13);
        setBooleanField(term406, term406.getClass(), "prettyPrint", true);
        setBooleanField(term406, term406.getClass(), "outline", false);
        setIntField(term406, term406.getClass(), "indentAmount", 1);
        setField(term406, term406.getClass(), "syntax", enum14);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Appendable");
        argTypes[3] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[4];
        args[0] = "ZiaGIbnzTs";
        args[1] = "tbcdzjIfER";
        args[2] = null;
        args[3] = term406;
        try {
            callMethod(klass, "html", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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
import java.lang.Integer;
import java.lang.String;

public class Comment_outerHtmlTail_140627621914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45018;
     Object term45021;
     Object term45023;
     Object term53567;
     Object term53569;

    public Comment_outerHtmlTail_140627621914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45018 = newInstance(Class.forName("org.jsoup.nodes.Comment"));
        Object term45019 = newInstance(Class.forName("java.lang.Object"));
        setField(term45018, term45018.getClass(), "value", term45019);
        setField(term45018, term45018.getClass(), "parentNode", null);
        setIntField(term45018, term45018.getClass(), "siblingIndex", -1922583790);
        term45021 = new Integer(-616727354);
        Class<? extends Object> term54017 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term54016 = ((Class) term54017).getDeclaredField((String) "base");
        ((Field) term54016).setAccessible(true);
        Object enum12 = ((Field) term54016).get((Object) null);
        Class<? extends Object> term54237 = Class.forName((String) "org.jsoup.nodes.Entities$CoreCharset");
        Field term54236 = ((Class) term54237).getDeclaredField((String) "fallback");
        ((Field) term54236).setAccessible(true);
        Object enum13 = ((Field) term54236).get((Object) null);
        Class<? extends Object> term54448 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term54447 = ((Class) term54448).getDeclaredField((String) "html");
        ((Field) term54447).setAccessible(true);
        Object enum14 = ((Field) term54447).get((Object) null);
        term45023 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term46696 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term46704 = (Object[]) newArray("java.lang.String", 2);
        Object term46730 = newInstance(Class.forName("java.lang.ThreadLocal"));
        setField(term45023, term45023.getClass(), "escapeMode", enum12);
        setField(term46696, term46696.getClass(), "name", "UTF-8");
        setElement(term46704, 0, "UTF8");
        setElement(term46704, 1, "unicode-1-1-utf-8");
        setField(term46696, term46696.getClass(), "aliases", term46704);
        setField(term46696, term46696.getClass(), "aliasSet", null);
        setField(term45023, term45023.getClass(), "charset", term46696);
        setIntField(term46730, term46730.getClass(), "threadLocalHashCode", -796136075);
        setField(term45023, term45023.getClass(), "encoderThreadLocal", term46730);
        setField(term45023, term45023.getClass(), "coreCharset", enum13);
        setBooleanField(term45023, term45023.getClass(), "prettyPrint", true);
        setBooleanField(term45023, term45023.getClass(), "outline", false);
        setIntField(term45023, term45023.getClass(), "indentAmount", 1);
        setField(term45023, term45023.getClass(), "syntax", enum14);
        term53567 = newInstance(Class.forName("org.jsoup.nodes.Comment"));
        Object term53568 = newInstance(Class.forName("java.lang.Object"));
        setField(term53567, term53567.getClass(), "value", term53568);
        setField(term53567, term53567.getClass(), "parentNode", null);
        setIntField(term53567, term53567.getClass(), "siblingIndex", -1922583790);
        Class<? extends Object> term54697 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term54696 = ((Class) term54697).getDeclaredField((String) "base");
        ((Field) term54696).setAccessible(true);
        Object enum15 = ((Field) term54696).get((Object) null);
        Class<? extends Object> term54917 = Class.forName((String) "org.jsoup.nodes.Entities$CoreCharset");
        Field term54916 = ((Class) term54917).getDeclaredField((String) "fallback");
        ((Field) term54916).setAccessible(true);
        Object enum16 = ((Field) term54916).get((Object) null);
        Class<? extends Object> term55128 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term55127 = ((Class) term55128).getDeclaredField((String) "html");
        ((Field) term55127).setAccessible(true);
        Object enum17 = ((Field) term55127).get((Object) null);
        term53569 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term54001 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term54004 = (Object[]) newArray("java.lang.String", 2);
        Object term54009 = newInstance(Class.forName("java.lang.ThreadLocal"));
        setField(term53569, term53569.getClass(), "escapeMode", enum15);
        setField(term54001, term54001.getClass(), "name", "UTF-8");
        setElement(term54004, 0, "UTF8");
        setElement(term54004, 1, "unicode-1-1-utf-8");
        setField(term54001, term54001.getClass(), "aliases", term54004);
        setField(term54001, term54001.getClass(), "aliasSet", null);
        setField(term53569, term53569.getClass(), "charset", term54001);
        setIntField(term54009, term54009.getClass(), "threadLocalHashCode", -796136075);
        setField(term53569, term53569.getClass(), "encoderThreadLocal", term54009);
        setField(term53569, term53569.getClass(), "coreCharset", enum16);
        setBooleanField(term53569, term53569.getClass(), "prettyPrint", true);
        setBooleanField(term53569, term53569.getClass(), "outline", false);
        setIntField(term53569, term53569.getClass(), "indentAmount", 1);
        setField(term53569, term53569.getClass(), "syntax", enum17);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Comment");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term45021;
        args[2] = term45023;
        callMethod(klass, "outerHtmlTail", argTypes, term45018, args);
        assertTrue(recursiveEquals(term45018, term53567));
        assertTrue(recursiveEquals(term45021, -616727354));
        assertTrue(recursiveEquals(term45023, term53569));
    }

};



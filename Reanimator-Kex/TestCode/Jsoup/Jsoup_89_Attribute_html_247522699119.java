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
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;

public class Attribute_html_247522699119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156043;
     Object term156127;
     Object term156557;
     Object term156561;

    public Attribute_html_247522699119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156043 = new StringBuilder();
        Class<? extends Object> term156564 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term156563 = ((Class) term156564).getDeclaredField((String) "html");
        ((Field) term156563).setAccessible(true);
        Object enum52 = ((Field) term156563).get((Object) null);
        term156127 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term156127, term156127.getClass(), "syntax", enum52);
        Class<? extends Object> term156813 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term156812 = ((Class) term156813).getDeclaredField((String) "html");
        ((Field) term156812).setAccessible(true);
        Object enum53 = ((Field) term156812).get((Object) null);
        term156557 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term156557, term156557.getClass(), "escapeMode", null);
        setField(term156557, term156557.getClass(), "charset", null);
        setField(term156557, term156557.getClass(), "encoderThreadLocal", null);
        setField(term156557, term156557.getClass(), "coreCharset", null);
        setBooleanField(term156557, term156557.getClass(), "prettyPrint", false);
        setBooleanField(term156557, term156557.getClass(), "outline", false);
        setIntField(term156557, term156557.getClass(), "indentAmount", 0);
        setField(term156557, term156557.getClass(), "syntax", enum53);
        term156561 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term156562 = (byte[]) newByteArray(16);
        setByteElement(term156562, 0, (byte) 110);
        setByteElement(term156562, 1, (byte) 117);
        setByteElement(term156562, 2, (byte) 108);
        setByteElement(term156562, 3, (byte) 108);
        setField(term156561, term156561.getClass(), "value", term156562);
        setByteField(term156561, term156561.getClass(), "coder", (byte) 0);
        setIntField(term156561, term156561.getClass(), "count", 4);
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
        args[0] = null;
        args[1] = null;
        args[2] = term156043;
        args[3] = term156127;
        callMethod(klass, "html", argTypes, null, args);
        assertTrue(recursiveEquals(term156043, null));
        assertTrue(recursiveEquals(term156127, term156561));
    }

};



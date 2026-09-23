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
import java.lang.String;
import java.lang.Object;

public class Attribute_shouldCollapseAttribute_148944953479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144903;
     Object term146501;

    public Attribute_shouldCollapseAttribute_148944953479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term146509 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term146508 = ((Class) term146509).getDeclaredField((String) "xml");
        ((Field) term146508).setAccessible(true);
        Object enum46 = ((Field) term146508).get((Object) null);
        term144903 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term144903, term144903.getClass(), "syntax", enum46);
        Class<? extends Object> term146755 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term146754 = ((Class) term146755).getDeclaredField((String) "xml");
        ((Field) term146754).setAccessible(true);
        Object enum47 = ((Field) term146754).get((Object) null);
        term146501 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term146501, term146501.getClass(), "escapeMode", null);
        setField(term146501, term146501.getClass(), "charset", null);
        setField(term146501, term146501.getClass(), "encoderThreadLocal", null);
        setField(term146501, term146501.getClass(), "coreCharset", null);
        setBooleanField(term146501, term146501.getClass(), "prettyPrint", false);
        setBooleanField(term146501, term146501.getClass(), "outline", false);
        setIntField(term146501, term146501.getClass(), "indentAmount", 0);
        setField(term146501, term146501.getClass(), "syntax", enum47);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "                                                                                                                                                                                                                                                                ";
        args[2] = term144903;
        Object retValue = callMethod(klass, "shouldCollapseAttribute", argTypes, null, args);
        assertTrue(recursiveEquals(term144903, "                                                                                                                                                                                                                                                                "));
        assertTrue(recursiveEquals(retValue, false));
    }

};



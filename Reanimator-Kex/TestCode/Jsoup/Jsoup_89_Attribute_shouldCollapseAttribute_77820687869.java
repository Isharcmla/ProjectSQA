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

public class Attribute_shouldCollapseAttribute_77820687869 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142158;
     Object term142280;
     Object term142831;
     Object term142834;

    public Attribute_shouldCollapseAttribute_77820687869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142158 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term142158, term142158.getClass(), "key", "");
        setField(term142158, term142158.getClass(), "val", null);
        Class<? extends Object> term142839 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term142838 = ((Class) term142839).getDeclaredField((String) "xml");
        ((Field) term142838).setAccessible(true);
        Object enum40 = ((Field) term142838).get((Object) null);
        term142280 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term142280, term142280.getClass(), "syntax", enum40);
        term142831 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term142831, term142831.getClass(), "key", "");
        setField(term142831, term142831.getClass(), "val", null);
        setField(term142831, term142831.getClass(), "parent", null);
        Class<? extends Object> term143085 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term143084 = ((Class) term143085).getDeclaredField((String) "html");
        ((Field) term143084).setAccessible(true);
        Object enum41 = ((Field) term143084).get((Object) null);
        term142834 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term142834, term142834.getClass(), "escapeMode", null);
        setField(term142834, term142834.getClass(), "charset", null);
        setField(term142834, term142834.getClass(), "encoderThreadLocal", null);
        setField(term142834, term142834.getClass(), "coreCharset", null);
        setBooleanField(term142834, term142834.getClass(), "prettyPrint", false);
        setBooleanField(term142834, term142834.getClass(), "outline", false);
        setIntField(term142834, term142834.getClass(), "indentAmount", 0);
        setField(term142834, term142834.getClass(), "syntax", enum41);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[1];
        args[0] = term142280;
        callMethod(klass, "shouldCollapseAttribute", argTypes, term142158, args);
        assertTrue(recursiveEquals(term142158, term142831));
        assertTrue(recursiveEquals(term142280, term142834));
    }

};



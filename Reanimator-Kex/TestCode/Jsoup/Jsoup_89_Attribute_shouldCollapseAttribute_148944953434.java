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

public class Attribute_shouldCollapseAttribute_148944953434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50456;
     Object term129493;

    public Attribute_shouldCollapseAttribute_148944953434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term129966 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term129965 = ((Class) term129966).getDeclaredField((String) "base");
        ((Field) term129965).setAccessible(true);
        Object enum24 = ((Field) term129965).get((Object) null);
        Class<? extends Object> term130218 = Class.forName((String) "org.jsoup.nodes.Entities$CoreCharset");
        Field term130217 = ((Class) term130218).getDeclaredField((String) "fallback");
        ((Field) term130217).setAccessible(true);
        Object enum25 = ((Field) term130217).get((Object) null);
        Class<? extends Object> term130429 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term130428 = ((Class) term130429).getDeclaredField((String) "html");
        ((Field) term130428).setAccessible(true);
        Object enum26 = ((Field) term130428).get((Object) null);
        term50456 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term52129 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term52137 = (Object[]) newArray("java.lang.String", 2);
        Object term52163 = newInstance(Class.forName("java.lang.ThreadLocal"));
        setField(term50456, term50456.getClass(), "escapeMode", enum24);
        setField(term52129, term52129.getClass(), "name", "UTF-8");
        setElement(term52137, 0, "UTF8");
        setElement(term52137, 1, "unicode-1-1-utf-8");
        setField(term52129, term52129.getClass(), "aliases", term52137);
        setField(term52129, term52129.getClass(), "aliasSet", null);
        setField(term50456, term50456.getClass(), "charset", term52129);
        setIntField(term52163, term52163.getClass(), "threadLocalHashCode", -1261498123);
        setField(term50456, term50456.getClass(), "encoderThreadLocal", term52163);
        setField(term50456, term50456.getClass(), "coreCharset", enum25);
        setBooleanField(term50456, term50456.getClass(), "prettyPrint", true);
        setBooleanField(term50456, term50456.getClass(), "outline", false);
        setIntField(term50456, term50456.getClass(), "indentAmount", 1);
        setField(term50456, term50456.getClass(), "syntax", enum26);
        Class<? extends Object> term130678 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term130677 = ((Class) term130678).getDeclaredField((String) "base");
        ((Field) term130677).setAccessible(true);
        Object enum27 = ((Field) term130677).get((Object) null);
        Class<? extends Object> term130898 = Class.forName((String) "org.jsoup.nodes.Entities$CoreCharset");
        Field term130897 = ((Class) term130898).getDeclaredField((String) "fallback");
        ((Field) term130897).setAccessible(true);
        Object enum28 = ((Field) term130897).get((Object) null);
        Class<? extends Object> term131109 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term131108 = ((Class) term131109).getDeclaredField((String) "html");
        ((Field) term131108).setAccessible(true);
        Object enum29 = ((Field) term131108).get((Object) null);
        term129493 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term129925 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term129928 = (Object[]) newArray("java.lang.String", 2);
        Object term129933 = newInstance(Class.forName("java.lang.ThreadLocal"));
        setField(term129493, term129493.getClass(), "escapeMode", enum27);
        setField(term129925, term129925.getClass(), "name", "UTF-8");
        setElement(term129928, 0, "UTF8");
        setElement(term129928, 1, "unicode-1-1-utf-8");
        setField(term129925, term129925.getClass(), "aliases", term129928);
        setField(term129925, term129925.getClass(), "aliasSet", null);
        setField(term129493, term129493.getClass(), "charset", term129925);
        setIntField(term129933, term129933.getClass(), "threadLocalHashCode", -1261498123);
        setField(term129493, term129493.getClass(), "encoderThreadLocal", term129933);
        setField(term129493, term129493.getClass(), "coreCharset", enum28);
        setBooleanField(term129493, term129493.getClass(), "prettyPrint", true);
        setBooleanField(term129493, term129493.getClass(), "outline", false);
        setIntField(term129493, term129493.getClass(), "indentAmount", 1);
        setField(term129493, term129493.getClass(), "syntax", enum29);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = "TEParAifyi";
        args[1] = "OWDIEULEFu";
        args[2] = term50456;
        Object retValue = callMethod(klass, "shouldCollapseAttribute", argTypes, null, args);
        assertTrue(recursiveEquals(term50456, "OWDIEULEFu"));
        assertTrue(recursiveEquals(retValue, false));
    }

};



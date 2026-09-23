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
     Object term129377;

    public Attribute_shouldCollapseAttribute_148944953434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term129850 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term129849 = ((Class) term129850).getDeclaredField((String) "base");
        ((Field) term129849).setAccessible(true);
        Object enum24 = ((Field) term129849).get((Object) null);
        Class<? extends Object> term130102 = Class.forName((String) "org.jsoup.nodes.Entities$CoreCharset");
        Field term130101 = ((Class) term130102).getDeclaredField((String) "fallback");
        ((Field) term130101).setAccessible(true);
        Object enum25 = ((Field) term130101).get((Object) null);
        Class<? extends Object> term130313 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term130312 = ((Class) term130313).getDeclaredField((String) "html");
        ((Field) term130312).setAccessible(true);
        Object enum26 = ((Field) term130312).get((Object) null);
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
        Class<? extends Object> term130562 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term130561 = ((Class) term130562).getDeclaredField((String) "base");
        ((Field) term130561).setAccessible(true);
        Object enum27 = ((Field) term130561).get((Object) null);
        Class<? extends Object> term130782 = Class.forName((String) "org.jsoup.nodes.Entities$CoreCharset");
        Field term130781 = ((Class) term130782).getDeclaredField((String) "fallback");
        ((Field) term130781).setAccessible(true);
        Object enum28 = ((Field) term130781).get((Object) null);
        Class<? extends Object> term131001 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term131000 = ((Class) term131001).getDeclaredField((String) "html");
        ((Field) term131000).setAccessible(true);
        Object enum29 = ((Field) term131000).get((Object) null);
        term129377 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term129809 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term129812 = (Object[]) newArray("java.lang.String", 2);
        Object term129817 = newInstance(Class.forName("java.lang.ThreadLocal"));
        setField(term129377, term129377.getClass(), "escapeMode", enum27);
        setField(term129809, term129809.getClass(), "name", "UTF-8");
        setElement(term129812, 0, "UTF8");
        setElement(term129812, 1, "unicode-1-1-utf-8");
        setField(term129809, term129809.getClass(), "aliases", term129812);
        setField(term129809, term129809.getClass(), "aliasSet", null);
        setField(term129377, term129377.getClass(), "charset", term129809);
        setIntField(term129817, term129817.getClass(), "threadLocalHashCode", -1261498123);
        setField(term129377, term129377.getClass(), "encoderThreadLocal", term129817);
        setField(term129377, term129377.getClass(), "coreCharset", enum28);
        setBooleanField(term129377, term129377.getClass(), "prettyPrint", true);
        setBooleanField(term129377, term129377.getClass(), "outline", false);
        setIntField(term129377, term129377.getClass(), "indentAmount", 1);
        setField(term129377, term129377.getClass(), "syntax", enum29);
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



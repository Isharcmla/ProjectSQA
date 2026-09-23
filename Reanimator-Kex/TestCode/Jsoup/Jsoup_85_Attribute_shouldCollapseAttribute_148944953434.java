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
     Object term129267;

    public Attribute_shouldCollapseAttribute_148944953434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term129742 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term129741 = ((Class) term129742).getDeclaredField((String) "base");
        ((Field) term129741).setAccessible(true);
        Object enum24 = ((Field) term129741).get((Object) null);
        Class<? extends Object> term129992 = Class.forName((String) "org.jsoup.nodes.Entities$CoreCharset");
        Field term129991 = ((Class) term129992).getDeclaredField((String) "fallback");
        ((Field) term129991).setAccessible(true);
        Object enum25 = ((Field) term129991).get((Object) null);
        Class<? extends Object> term130203 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term130202 = ((Class) term130203).getDeclaredField((String) "html");
        ((Field) term130202).setAccessible(true);
        Object enum26 = ((Field) term130202).get((Object) null);
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
        setIntField(term52163, term52163.getClass(), "threadLocalHashCode", 379033404);
        setField(term50456, term50456.getClass(), "encoderThreadLocal", term52163);
        setField(term50456, term50456.getClass(), "coreCharset", enum25);
        setBooleanField(term50456, term50456.getClass(), "prettyPrint", true);
        setBooleanField(term50456, term50456.getClass(), "outline", false);
        setIntField(term50456, term50456.getClass(), "indentAmount", 1);
        setField(term50456, term50456.getClass(), "syntax", enum26);
        Class<? extends Object> term130452 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term130451 = ((Class) term130452).getDeclaredField((String) "base");
        ((Field) term130451).setAccessible(true);
        Object enum27 = ((Field) term130451).get((Object) null);
        Class<? extends Object> term130701 = Class.forName((String) "org.jsoup.nodes.Entities$CoreCharset");
        Field term130700 = ((Class) term130701).getDeclaredField((String) "fallback");
        ((Field) term130700).setAccessible(true);
        Object enum28 = ((Field) term130700).get((Object) null);
        Class<? extends Object> term130912 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term130911 = ((Class) term130912).getDeclaredField((String) "html");
        ((Field) term130911).setAccessible(true);
        Object enum29 = ((Field) term130911).get((Object) null);
        term129267 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term129699 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term129702 = (Object[]) newArray("java.lang.String", 2);
        Object term129707 = newInstance(Class.forName("java.lang.ThreadLocal"));
        setField(term129267, term129267.getClass(), "escapeMode", enum27);
        setField(term129699, term129699.getClass(), "name", "UTF-8");
        setElement(term129702, 0, "UTF8");
        setElement(term129702, 1, "unicode-1-1-utf-8");
        setField(term129699, term129699.getClass(), "aliases", term129702);
        setField(term129699, term129699.getClass(), "aliasSet", null);
        setField(term129267, term129267.getClass(), "charset", term129699);
        setIntField(term129707, term129707.getClass(), "threadLocalHashCode", 379033404);
        setField(term129267, term129267.getClass(), "encoderThreadLocal", term129707);
        setField(term129267, term129267.getClass(), "coreCharset", enum28);
        setBooleanField(term129267, term129267.getClass(), "prettyPrint", true);
        setBooleanField(term129267, term129267.getClass(), "outline", false);
        setIntField(term129267, term129267.getClass(), "indentAmount", 1);
        setField(term129267, term129267.getClass(), "syntax", enum29);
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



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

public class Attribute_shouldCollapseAttribute_77820687876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146916;
     Object term147076;
     Object term147638;
     Object term147643;

    public Attribute_shouldCollapseAttribute_77820687876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146916 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term146916, term146916.getClass(), "key", "");
        setField(term146916, term146916.getClass(), "val", "");
        Class<? extends Object> term147648 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term147647 = ((Class) term147648).getDeclaredField((String) "html");
        ((Field) term147647).setAccessible(true);
        Object enum43 = ((Field) term147647).get((Object) null);
        term147076 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term147076, term147076.getClass(), "syntax", enum43);
        term147638 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term147638, term147638.getClass(), "key", "");
        setField(term147638, term147638.getClass(), "val", "");
        setField(term147638, term147638.getClass(), "parent", null);
        Class<? extends Object> term147897 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term147896 = ((Class) term147897).getDeclaredField((String) "html");
        ((Field) term147896).setAccessible(true);
        Object enum44 = ((Field) term147896).get((Object) null);
        term147643 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term147643, term147643.getClass(), "escapeMode", null);
        setField(term147643, term147643.getClass(), "charset", null);
        setField(term147643, term147643.getClass(), "encoderThreadLocal", null);
        setField(term147643, term147643.getClass(), "coreCharset", null);
        setBooleanField(term147643, term147643.getClass(), "prettyPrint", false);
        setBooleanField(term147643, term147643.getClass(), "outline", false);
        setIntField(term147643, term147643.getClass(), "indentAmount", 0);
        setField(term147643, term147643.getClass(), "syntax", enum44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[1];
        args[0] = term147076;
        callMethod(klass, "shouldCollapseAttribute", argTypes, term146916, args);
        assertTrue(recursiveEquals(term146916, term147638));
        assertTrue(recursiveEquals(term147076, term147643));
    }

};



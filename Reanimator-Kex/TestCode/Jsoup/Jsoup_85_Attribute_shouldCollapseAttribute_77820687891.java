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

public class Attribute_shouldCollapseAttribute_77820687891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148533;
     Object term148693;
     Object term149242;
     Object term149247;

    public Attribute_shouldCollapseAttribute_77820687891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148533 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term148533, term148533.getClass(), "key", "");
        setField(term148533, term148533.getClass(), "val", "");
        Class<? extends Object> term149252 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term149251 = ((Class) term149252).getDeclaredField((String) "xml");
        ((Field) term149251).setAccessible(true);
        Object enum49 = ((Field) term149251).get((Object) null);
        term148693 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term148693, term148693.getClass(), "syntax", enum49);
        term149242 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term149242, term149242.getClass(), "key", "");
        setField(term149242, term149242.getClass(), "val", "");
        setField(term149242, term149242.getClass(), "parent", null);
        Class<? extends Object> term149498 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term149497 = ((Class) term149498).getDeclaredField((String) "xml");
        ((Field) term149497).setAccessible(true);
        Object enum50 = ((Field) term149497).get((Object) null);
        term149247 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term149247, term149247.getClass(), "escapeMode", null);
        setField(term149247, term149247.getClass(), "charset", null);
        setField(term149247, term149247.getClass(), "encoderThreadLocal", null);
        setField(term149247, term149247.getClass(), "coreCharset", null);
        setBooleanField(term149247, term149247.getClass(), "prettyPrint", false);
        setBooleanField(term149247, term149247.getClass(), "outline", false);
        setIntField(term149247, term149247.getClass(), "indentAmount", 0);
        setField(term149247, term149247.getClass(), "syntax", enum50);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[1];
        args[0] = term148693;
        callMethod(klass, "shouldCollapseAttribute", argTypes, term148533, args);
        assertTrue(recursiveEquals(term148533, term149242));
        assertTrue(recursiveEquals(term148693, term149247));
    }

};



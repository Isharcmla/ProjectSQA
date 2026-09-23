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

public class Attribute_shouldCollapseAttribute_77820687878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143821;
     Object term143943;
     Object term145704;
     Object term145707;

    public Attribute_shouldCollapseAttribute_77820687878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143821 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term143821, term143821.getClass(), "key", "");
        setField(term143821, term143821.getClass(), "val", null);
        Class<? extends Object> term145712 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term145711 = ((Class) term145712).getDeclaredField((String) "xml");
        ((Field) term145711).setAccessible(true);
        Object enum44 = ((Field) term145711).get((Object) null);
        term143943 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term143943, term143943.getClass(), "syntax", enum44);
        term145704 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term145704, term145704.getClass(), "key", "");
        setField(term145704, term145704.getClass(), "val", null);
        setField(term145704, term145704.getClass(), "parent", null);
        Class<? extends Object> term145958 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term145957 = ((Class) term145958).getDeclaredField((String) "xml");
        ((Field) term145957).setAccessible(true);
        Object enum45 = ((Field) term145957).get((Object) null);
        term145707 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term145707, term145707.getClass(), "escapeMode", null);
        setField(term145707, term145707.getClass(), "charset", null);
        setField(term145707, term145707.getClass(), "encoderThreadLocal", null);
        setField(term145707, term145707.getClass(), "coreCharset", null);
        setBooleanField(term145707, term145707.getClass(), "prettyPrint", false);
        setBooleanField(term145707, term145707.getClass(), "outline", false);
        setIntField(term145707, term145707.getClass(), "indentAmount", 0);
        setField(term145707, term145707.getClass(), "syntax", enum45);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[1];
        args[0] = term143943;
        callMethod(klass, "shouldCollapseAttribute", argTypes, term143821, args);
        assertTrue(recursiveEquals(term143821, term145704));
        assertTrue(recursiveEquals(term143943, term145707));
    }

};



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

public class Attribute_shouldCollapseAttribute_778206878175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term300423;
     Object term300545;
     Object term300944;
     Object term300947;

    public Attribute_shouldCollapseAttribute_778206878175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term300423 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term300423, term300423.getClass(), "key", "xml");
        setField(term300423, term300423.getClass(), "val", null);
        Class<? extends Object> term300955 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term300954 = ((Class) term300955).getDeclaredField((String) "xml");
        ((Field) term300954).setAccessible(true);
        Object enum55 = ((Field) term300954).get((Object) null);
        term300545 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term300545, term300545.getClass(), "syntax", enum55);
        term300944 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term300944, term300944.getClass(), "key", "xml");
        setField(term300944, term300944.getClass(), "val", null);
        setField(term300944, term300944.getClass(), "parent", null);
        Class<? extends Object> term301204 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term301203 = ((Class) term301204).getDeclaredField((String) "xml");
        ((Field) term301203).setAccessible(true);
        Object enum56 = ((Field) term301203).get((Object) null);
        term300947 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term300947, term300947.getClass(), "escapeMode", null);
        setField(term300947, term300947.getClass(), "charset", null);
        setField(term300947, term300947.getClass(), "encoderThreadLocal", null);
        setField(term300947, term300947.getClass(), "coreCharset", null);
        setBooleanField(term300947, term300947.getClass(), "prettyPrint", false);
        setBooleanField(term300947, term300947.getClass(), "outline", false);
        setIntField(term300947, term300947.getClass(), "indentAmount", 0);
        setField(term300947, term300947.getClass(), "syntax", enum56);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[1];
        args[0] = term300545;
        callMethod(klass, "shouldCollapseAttribute", argTypes, term300423, args);
        assertTrue(recursiveEquals(term300423, term300944));
        assertTrue(recursiveEquals(term300545, term300947));
    }

};



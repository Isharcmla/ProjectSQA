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

public class Attribute_shouldCollapseAttribute_778206878121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157881;
     Object term158003;
     Object term158402;
     Object term158405;

    public Attribute_shouldCollapseAttribute_778206878121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157881 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term157881, term157881.getClass(), "key", "xml");
        setField(term157881, term157881.getClass(), "val", null);
        Class<? extends Object> term158413 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term158412 = ((Class) term158413).getDeclaredField((String) "xml");
        ((Field) term158412).setAccessible(true);
        Object enum55 = ((Field) term158412).get((Object) null);
        term158003 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term158003, term158003.getClass(), "syntax", enum55);
        term158402 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term158402, term158402.getClass(), "key", "xml");
        setField(term158402, term158402.getClass(), "val", null);
        setField(term158402, term158402.getClass(), "parent", null);
        Class<? extends Object> term158662 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term158661 = ((Class) term158662).getDeclaredField((String) "xml");
        ((Field) term158661).setAccessible(true);
        Object enum56 = ((Field) term158661).get((Object) null);
        term158405 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term158405, term158405.getClass(), "escapeMode", null);
        setField(term158405, term158405.getClass(), "charset", null);
        setField(term158405, term158405.getClass(), "encoderThreadLocal", null);
        setField(term158405, term158405.getClass(), "coreCharset", null);
        setBooleanField(term158405, term158405.getClass(), "prettyPrint", false);
        setBooleanField(term158405, term158405.getClass(), "outline", false);
        setIntField(term158405, term158405.getClass(), "indentAmount", 0);
        setField(term158405, term158405.getClass(), "syntax", enum56);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[1];
        args[0] = term158003;
        callMethod(klass, "shouldCollapseAttribute", argTypes, term157881, args);
        assertTrue(recursiveEquals(term157881, term158402));
        assertTrue(recursiveEquals(term158003, term158405));
    }

};



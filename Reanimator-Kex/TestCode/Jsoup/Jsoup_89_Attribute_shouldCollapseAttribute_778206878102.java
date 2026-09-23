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

public class Attribute_shouldCollapseAttribute_778206878102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150678;
     Object term150838;
     Object term151698;
     Object term151703;

    public Attribute_shouldCollapseAttribute_778206878102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150678 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term150678, term150678.getClass(), "key", "");
        setField(term150678, term150678.getClass(), "val", "");
        Class<? extends Object> term151708 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term151707 = ((Class) term151708).getDeclaredField((String) "html");
        ((Field) term151707).setAccessible(true);
        Object enum49 = ((Field) term151707).get((Object) null);
        term150838 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term150838, term150838.getClass(), "syntax", enum49);
        term151698 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term151698, term151698.getClass(), "key", "");
        setField(term151698, term151698.getClass(), "val", "");
        setField(term151698, term151698.getClass(), "parent", null);
        Class<? extends Object> term151957 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term151956 = ((Class) term151957).getDeclaredField((String) "html");
        ((Field) term151956).setAccessible(true);
        Object enum50 = ((Field) term151956).get((Object) null);
        term151703 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term151703, term151703.getClass(), "escapeMode", null);
        setField(term151703, term151703.getClass(), "charset", null);
        setField(term151703, term151703.getClass(), "encoderThreadLocal", null);
        setField(term151703, term151703.getClass(), "coreCharset", null);
        setBooleanField(term151703, term151703.getClass(), "prettyPrint", false);
        setBooleanField(term151703, term151703.getClass(), "outline", false);
        setIntField(term151703, term151703.getClass(), "indentAmount", 0);
        setField(term151703, term151703.getClass(), "syntax", enum50);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[1];
        args[0] = term150838;
        callMethod(klass, "shouldCollapseAttribute", argTypes, term150678, args);
        assertTrue(recursiveEquals(term150678, term151698));
        assertTrue(recursiveEquals(term150838, term151703));
    }

};



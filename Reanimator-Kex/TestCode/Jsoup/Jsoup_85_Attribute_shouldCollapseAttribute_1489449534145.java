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

public class Attribute_shouldCollapseAttribute_1489449534145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237624;
     Object term238027;

    public Attribute_shouldCollapseAttribute_1489449534145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term238033 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term238032 = ((Class) term238033).getDeclaredField((String) "xml");
        ((Field) term238032).setAccessible(true);
        Object enum52 = ((Field) term238032).get((Object) null);
        term237624 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term237624, term237624.getClass(), "syntax", enum52);
        Class<? extends Object> term238279 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term238278 = ((Class) term238279).getDeclaredField((String) "xml");
        ((Field) term238278).setAccessible(true);
        Object enum53 = ((Field) term238278).get((Object) null);
        term238027 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term238027, term238027.getClass(), "escapeMode", null);
        setField(term238027, term238027.getClass(), "charset", null);
        setField(term238027, term238027.getClass(), "encoderThreadLocal", null);
        setField(term238027, term238027.getClass(), "coreCharset", null);
        setBooleanField(term238027, term238027.getClass(), "prettyPrint", false);
        setBooleanField(term238027, term238027.getClass(), "outline", false);
        setIntField(term238027, term238027.getClass(), "indentAmount", 0);
        setField(term238027, term238027.getClass(), "syntax", enum53);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term237624;
        Object retValue = callMethod(klass, "shouldCollapseAttribute", argTypes, null, args);
        assertTrue(recursiveEquals(term237624, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};



package org.jfree.data.time;

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
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.data.time.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class TimePeriodValues_equals_1325343804147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30890;
     Object term30992;
     Object term32234;
     Object term32238;

    public TimePeriodValues_equals_1325343804147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32241 = Class.forName((String) "java.util.regex.Pattern$Qtype");
        Field term32240 = ((Class) term32241).getDeclaredField((String) "GREEDY");
        ((Field) term32240).setAccessible(true);
        Object enum5 = ((Field) term32240).get((Object) null);
        term30890 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        setField(term30890, term30890.getClass(), "key", enum5);
        term30992 = newInstance(Class.forName("java.lang.Object"));
        Class<? extends Object> term32411 = Class.forName((String) "java.util.regex.Pattern$Qtype");
        Field term32410 = ((Class) term32411).getDeclaredField((String) "GREEDY");
        ((Field) term32410).setAccessible(true);
        Object enum6 = ((Field) term32410).get((Object) null);
        term32234 = newInstance(Class.forName("org.jfree.data.time.TimePeriodValues"));
        setField(term32234, term32234.getClass(), "domain", null);
        setField(term32234, term32234.getClass(), "range", null);
        setField(term32234, term32234.getClass(), "data", null);
        setIntField(term32234, term32234.getClass(), "minStartIndex", 0);
        setIntField(term32234, term32234.getClass(), "maxStartIndex", 0);
        setIntField(term32234, term32234.getClass(), "minMiddleIndex", 0);
        setIntField(term32234, term32234.getClass(), "maxMiddleIndex", 0);
        setIntField(term32234, term32234.getClass(), "minEndIndex", 0);
        setIntField(term32234, term32234.getClass(), "maxEndIndex", 0);
        setField(term32234, term32234.getClass(), "key", enum6);
        setField(term32234, term32234.getClass(), "description", null);
        setField(term32234, term32234.getClass(), "listeners", null);
        setField(term32234, term32234.getClass(), "propertyChangeSupport", null);
        setBooleanField(term32234, term32234.getClass(), "notify", false);
        term32238 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimePeriodValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term30992;
        Object retValue = callMethod(klass, "equals", argTypes, term30890, args);
        assertTrue(recursiveEquals(term30890, term32234));
        assertTrue(recursiveEquals(term30992, term32238));
        assertTrue(recursiveEquals(retValue, false));
    }

};



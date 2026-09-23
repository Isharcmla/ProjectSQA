package org.apache.commons.csv;

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
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.csv.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class CSVFormat_equals_34081098225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114033;
     Object term114168;
     Object term114468;
     Object term114472;

    public CSVFormat_equals_34081098225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term114480 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term114479 = ((Class) term114480).getDeclaredField((String) "ALL");
        ((Field) term114479).setAccessible(true);
        Object enum194 = ((Field) term114479).get((Object) null);
        term114033 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term114033, term114033.getClass(), "delimiter", (char) 0);
        setField(term114033, term114033.getClass(), "quotePolicy", enum194);
        setField(term114033, term114033.getClass(), "quoteChar", null);
        setField(term114033, term114033.getClass(), "commentStart", null);
        setField(term114033, term114033.getClass(), "escape", null);
        setField(term114033, term114033.getClass(), "nullString", null);
        term114168 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term114168, term114168.getClass(), "delimiter", (char) 0);
        setField(term114168, term114168.getClass(), "quotePolicy", enum194);
        setField(term114168, term114168.getClass(), "quoteChar", null);
        setField(term114168, term114168.getClass(), "commentStart", null);
        setField(term114168, term114168.getClass(), "escape", null);
        setField(term114168, term114168.getClass(), "nullString", "NON_NUMERIC");
        Class<? extends Object> term114647 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term114646 = ((Class) term114647).getDeclaredField((String) "ALL");
        ((Field) term114646).setAccessible(true);
        Object enum195 = ((Field) term114646).get((Object) null);
        term114468 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term114468, term114468.getClass(), "delimiter", (char) 0);
        setField(term114468, term114468.getClass(), "quoteChar", null);
        setField(term114468, term114468.getClass(), "quotePolicy", enum195);
        setField(term114468, term114468.getClass(), "commentStart", null);
        setField(term114468, term114468.getClass(), "escape", null);
        setBooleanField(term114468, term114468.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term114468, term114468.getClass(), "ignoreEmptyLines", false);
        setField(term114468, term114468.getClass(), "recordSeparator", null);
        setField(term114468, term114468.getClass(), "nullString", null);
        setField(term114468, term114468.getClass(), "header", null);
        setBooleanField(term114468, term114468.getClass(), "skipHeaderRecord", false);
        Class<? extends Object> term114803 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term114802 = ((Class) term114803).getDeclaredField((String) "ALL");
        ((Field) term114802).setAccessible(true);
        Object enum196 = ((Field) term114802).get((Object) null);
        term114472 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term114472, term114472.getClass(), "delimiter", (char) 0);
        setField(term114472, term114472.getClass(), "quoteChar", null);
        setField(term114472, term114472.getClass(), "quotePolicy", enum196);
        setField(term114472, term114472.getClass(), "commentStart", null);
        setField(term114472, term114472.getClass(), "escape", null);
        setBooleanField(term114472, term114472.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term114472, term114472.getClass(), "ignoreEmptyLines", false);
        setField(term114472, term114472.getClass(), "recordSeparator", null);
        setField(term114472, term114472.getClass(), "nullString", "NON_NUMERIC");
        setField(term114472, term114472.getClass(), "header", null);
        setBooleanField(term114472, term114472.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term114168;
        Object retValue = callMethod(klass, "equals", argTypes, term114033, args);
        assertTrue(recursiveEquals(term114033, term114468));
        assertTrue(recursiveEquals(term114168, term114472));
        assertTrue(recursiveEquals(retValue, false));
    }

};



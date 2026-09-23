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

public class CSVFormat_equals_34081098265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142265;
     Object term142400;
     Object term142847;
     Object term142851;

    public CSVFormat_equals_34081098265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term142857 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term142856 = ((Class) term142857).getDeclaredField((String) "ALL");
        ((Field) term142856).setAccessible(true);
        Object enum249 = ((Field) term142856).get((Object) null);
        term142265 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term142265, term142265.getClass(), "delimiter", (char) 0);
        setField(term142265, term142265.getClass(), "quotePolicy", enum249);
        Class<? extends Object> term143013 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term143012 = ((Class) term143013).getDeclaredField((String) "NONE");
        ((Field) term143012).setAccessible(true);
        Object enum250 = ((Field) term143012).get((Object) null);
        term142400 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term142400, term142400.getClass(), "delimiter", (char) 0);
        setField(term142400, term142400.getClass(), "quotePolicy", enum250);
        Class<? extends Object> term143172 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term143171 = ((Class) term143172).getDeclaredField((String) "ALL");
        ((Field) term143171).setAccessible(true);
        Object enum251 = ((Field) term143171).get((Object) null);
        term142847 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term142847, term142847.getClass(), "delimiter", (char) 0);
        setField(term142847, term142847.getClass(), "quoteChar", null);
        setField(term142847, term142847.getClass(), "quotePolicy", enum251);
        setField(term142847, term142847.getClass(), "commentStart", null);
        setField(term142847, term142847.getClass(), "escape", null);
        setBooleanField(term142847, term142847.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term142847, term142847.getClass(), "ignoreEmptyLines", false);
        setField(term142847, term142847.getClass(), "recordSeparator", null);
        setField(term142847, term142847.getClass(), "nullString", null);
        setField(term142847, term142847.getClass(), "header", null);
        setBooleanField(term142847, term142847.getClass(), "skipHeaderRecord", false);
        Class<? extends Object> term143328 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term143327 = ((Class) term143328).getDeclaredField((String) "NONE");
        ((Field) term143327).setAccessible(true);
        Object enum252 = ((Field) term143327).get((Object) null);
        term142851 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term142851, term142851.getClass(), "delimiter", (char) 0);
        setField(term142851, term142851.getClass(), "quoteChar", null);
        setField(term142851, term142851.getClass(), "quotePolicy", enum252);
        setField(term142851, term142851.getClass(), "commentStart", null);
        setField(term142851, term142851.getClass(), "escape", null);
        setBooleanField(term142851, term142851.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term142851, term142851.getClass(), "ignoreEmptyLines", false);
        setField(term142851, term142851.getClass(), "recordSeparator", null);
        setField(term142851, term142851.getClass(), "nullString", null);
        setField(term142851, term142851.getClass(), "header", null);
        setBooleanField(term142851, term142851.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term142400;
        Object retValue = callMethod(klass, "equals", argTypes, term142265, args);
        assertTrue(recursiveEquals(term142265, term142847));
        assertTrue(recursiveEquals(term142400, term142851));
        assertTrue(recursiveEquals(retValue, false));
    }

};



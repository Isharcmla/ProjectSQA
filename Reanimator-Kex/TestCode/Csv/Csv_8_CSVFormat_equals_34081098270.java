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

public class CSVFormat_equals_34081098270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144809;
     Object term144944;
     Object term146400;
     Object term146405;

    public CSVFormat_equals_34081098270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term146411 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term146410 = ((Class) term146411).getDeclaredField((String) "ALL");
        ((Field) term146410).setAccessible(true);
        Object enum259 = ((Field) term146410).get((Object) null);
        term144809 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term144677 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term144809, term144809.getClass(), "delimiter", (char) 0);
        setField(term144809, term144809.getClass(), "quotePolicy", enum259);
        setField(term144809, term144809.getClass(), "quoteChar", null);
        setField(term144809, term144809.getClass(), "commentStart", null);
        setField(term144809, term144809.getClass(), "escape", null);
        setField(term144809, term144809.getClass(), "nullString", null);
        setField(term144809, term144809.getClass(), "header", term144677);
        term144944 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term144944, term144944.getClass(), "delimiter", (char) 0);
        setField(term144944, term144944.getClass(), "quotePolicy", enum259);
        setField(term144944, term144944.getClass(), "quoteChar", null);
        setField(term144944, term144944.getClass(), "commentStart", null);
        setField(term144944, term144944.getClass(), "escape", null);
        setField(term144944, term144944.getClass(), "nullString", null);
        setField(term144944, term144944.getClass(), "header", null);
        Class<? extends Object> term146567 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term146566 = ((Class) term146567).getDeclaredField((String) "ALL");
        ((Field) term146566).setAccessible(true);
        Object enum260 = ((Field) term146566).get((Object) null);
        term146400 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term146404 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term146400, term146400.getClass(), "delimiter", (char) 0);
        setField(term146400, term146400.getClass(), "quoteChar", null);
        setField(term146400, term146400.getClass(), "quotePolicy", enum260);
        setField(term146400, term146400.getClass(), "commentStart", null);
        setField(term146400, term146400.getClass(), "escape", null);
        setBooleanField(term146400, term146400.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term146400, term146400.getClass(), "ignoreEmptyLines", false);
        setField(term146400, term146400.getClass(), "recordSeparator", null);
        setField(term146400, term146400.getClass(), "nullString", null);
        setField(term146400, term146400.getClass(), "header", term146404);
        setBooleanField(term146400, term146400.getClass(), "skipHeaderRecord", false);
        Class<? extends Object> term146723 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term146722 = ((Class) term146723).getDeclaredField((String) "ALL");
        ((Field) term146722).setAccessible(true);
        Object enum261 = ((Field) term146722).get((Object) null);
        term146405 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term146405, term146405.getClass(), "delimiter", (char) 0);
        setField(term146405, term146405.getClass(), "quoteChar", null);
        setField(term146405, term146405.getClass(), "quotePolicy", enum261);
        setField(term146405, term146405.getClass(), "commentStart", null);
        setField(term146405, term146405.getClass(), "escape", null);
        setBooleanField(term146405, term146405.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term146405, term146405.getClass(), "ignoreEmptyLines", false);
        setField(term146405, term146405.getClass(), "recordSeparator", null);
        setField(term146405, term146405.getClass(), "nullString", null);
        setField(term146405, term146405.getClass(), "header", null);
        setBooleanField(term146405, term146405.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term144944;
        Object retValue = callMethod(klass, "equals", argTypes, term144809, args);
        assertTrue(recursiveEquals(term144809, term146400));
        assertTrue(recursiveEquals(term144944, term146405));
        assertTrue(recursiveEquals(retValue, false));
    }

};



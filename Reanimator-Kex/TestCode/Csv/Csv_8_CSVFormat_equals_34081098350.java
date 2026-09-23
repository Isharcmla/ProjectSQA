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

public class CSVFormat_equals_34081098350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237498;
     Object term237671;
     Object term237971;
     Object term237977;

    public CSVFormat_equals_34081098350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term237985 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term237984 = ((Class) term237985).getDeclaredField((String) "MINIMAL");
        ((Field) term237984).setAccessible(true);
        Object enum387 = ((Field) term237984).get((Object) null);
        term237498 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term237498, term237498.getClass(), "delimiter", (char) 0);
        setField(term237498, term237498.getClass(), "quotePolicy", enum387);
        setField(term237498, term237498.getClass(), "quoteChar", null);
        setField(term237498, term237498.getClass(), "commentStart", null);
        setField(term237498, term237498.getClass(), "escape", null);
        setField(term237498, term237498.getClass(), "nullString", "");
        setField(term237498, term237498.getClass(), "header", null);
        setBooleanField(term237498, term237498.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term237498, term237498.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term237498, term237498.getClass(), "skipHeaderRecord", false);
        term237671 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term237671, term237671.getClass(), "delimiter", (char) 0);
        setField(term237671, term237671.getClass(), "quotePolicy", enum387);
        setField(term237671, term237671.getClass(), "quoteChar", null);
        setField(term237671, term237671.getClass(), "commentStart", null);
        setField(term237671, term237671.getClass(), "escape", null);
        setField(term237671, term237671.getClass(), "nullString", "");
        setField(term237671, term237671.getClass(), "header", null);
        setBooleanField(term237671, term237671.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term237671, term237671.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term237671, term237671.getClass(), "skipHeaderRecord", true);
        Class<? extends Object> term238153 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term238152 = ((Class) term238153).getDeclaredField((String) "MINIMAL");
        ((Field) term238152).setAccessible(true);
        Object enum388 = ((Field) term238152).get((Object) null);
        term237971 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term237971, term237971.getClass(), "delimiter", (char) 0);
        setField(term237971, term237971.getClass(), "quoteChar", null);
        setField(term237971, term237971.getClass(), "quotePolicy", enum388);
        setField(term237971, term237971.getClass(), "commentStart", null);
        setField(term237971, term237971.getClass(), "escape", null);
        setBooleanField(term237971, term237971.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term237971, term237971.getClass(), "ignoreEmptyLines", true);
        setField(term237971, term237971.getClass(), "recordSeparator", null);
        setField(term237971, term237971.getClass(), "nullString", "");
        setField(term237971, term237971.getClass(), "header", null);
        setBooleanField(term237971, term237971.getClass(), "skipHeaderRecord", false);
        Class<? extends Object> term238321 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term238320 = ((Class) term238321).getDeclaredField((String) "MINIMAL");
        ((Field) term238320).setAccessible(true);
        Object enum389 = ((Field) term238320).get((Object) null);
        term237977 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term237977, term237977.getClass(), "delimiter", (char) 0);
        setField(term237977, term237977.getClass(), "quoteChar", null);
        setField(term237977, term237977.getClass(), "quotePolicy", enum389);
        setField(term237977, term237977.getClass(), "commentStart", null);
        setField(term237977, term237977.getClass(), "escape", null);
        setBooleanField(term237977, term237977.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term237977, term237977.getClass(), "ignoreEmptyLines", true);
        setField(term237977, term237977.getClass(), "recordSeparator", null);
        setField(term237977, term237977.getClass(), "nullString", "");
        setField(term237977, term237977.getClass(), "header", null);
        setBooleanField(term237977, term237977.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term237671;
        Object retValue = callMethod(klass, "equals", argTypes, term237498, args);
        assertTrue(recursiveEquals(term237498, term237971));
        assertTrue(recursiveEquals(term237671, term237977));
        assertTrue(recursiveEquals(retValue, false));
    }

};



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
import java.lang.Character;

public class CSVFormat_equals_34081098342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225863;
     Object term226088;
     Object term227049;
     Object term227056;

    public CSVFormat_equals_34081098342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term227063 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term227062 = ((Class) term227063).getDeclaredField((String) "NONE");
        ((Field) term227062).setAccessible(true);
        Object enum376 = ((Field) term227062).get((Object) null);
        Character term226015 = new Character((char) 0);
        term225863 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term225863, term225863.getClass(), "delimiter", (char) 0);
        setField(term225863, term225863.getClass(), "quotePolicy", enum376);
        setField(term225863, term225863.getClass(), "quoteChar", null);
        setField(term225863, term225863.getClass(), "commentStart", null);
        setField(term225863, term225863.getClass(), "escape", term226015);
        setField(term225863, term225863.getClass(), "nullString", "");
        Character term226190 = new Character((char) 0);
        term226088 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term226088, term226088.getClass(), "delimiter", (char) 0);
        setField(term226088, term226088.getClass(), "quotePolicy", enum376);
        setField(term226088, term226088.getClass(), "quoteChar", null);
        setField(term226088, term226088.getClass(), "commentStart", null);
        setField(term226088, term226088.getClass(), "escape", term226190);
        Class<? extends Object> term227222 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term227221 = ((Class) term227222).getDeclaredField((String) "NONE");
        ((Field) term227221).setAccessible(true);
        Object enum377 = ((Field) term227221).get((Object) null);
        Character term227053 = new Character((char) 0);
        term227049 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term227049, term227049.getClass(), "delimiter", (char) 0);
        setField(term227049, term227049.getClass(), "quoteChar", null);
        setField(term227049, term227049.getClass(), "quotePolicy", enum377);
        setField(term227049, term227049.getClass(), "commentStart", null);
        setField(term227049, term227049.getClass(), "escape", term227053);
        setBooleanField(term227049, term227049.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term227049, term227049.getClass(), "ignoreEmptyLines", false);
        setField(term227049, term227049.getClass(), "recordSeparator", null);
        setField(term227049, term227049.getClass(), "nullString", "");
        setField(term227049, term227049.getClass(), "header", null);
        setBooleanField(term227049, term227049.getClass(), "skipHeaderRecord", false);
        Class<? extends Object> term227381 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term227380 = ((Class) term227381).getDeclaredField((String) "NONE");
        ((Field) term227380).setAccessible(true);
        Object enum378 = ((Field) term227380).get((Object) null);
        Character term227060 = new Character((char) 0);
        term227056 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term227056, term227056.getClass(), "delimiter", (char) 0);
        setField(term227056, term227056.getClass(), "quoteChar", null);
        setField(term227056, term227056.getClass(), "quotePolicy", enum378);
        setField(term227056, term227056.getClass(), "commentStart", null);
        setField(term227056, term227056.getClass(), "escape", term227060);
        setBooleanField(term227056, term227056.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term227056, term227056.getClass(), "ignoreEmptyLines", false);
        setField(term227056, term227056.getClass(), "recordSeparator", null);
        setField(term227056, term227056.getClass(), "nullString", null);
        setField(term227056, term227056.getClass(), "header", null);
        setBooleanField(term227056, term227056.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term226088;
        Object retValue = callMethod(klass, "equals", argTypes, term225863, args);
        assertTrue(recursiveEquals(term225863, term227049));
        assertTrue(recursiveEquals(term226088, term227056));
        assertTrue(recursiveEquals(retValue, false));
    }

};



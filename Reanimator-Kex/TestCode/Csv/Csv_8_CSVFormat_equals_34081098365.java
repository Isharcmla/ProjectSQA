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

public class CSVFormat_equals_34081098365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262573;
     Object term262798;
     Object term263076;
     Object term263083;

    public CSVFormat_equals_34081098365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term263090 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term263089 = ((Class) term263090).getDeclaredField((String) "ALL");
        ((Field) term263089).setAccessible(true);
        Object enum413 = ((Field) term263089).get((Object) null);
        Character term262874 = new Character((char) 0);
        term262573 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term262573, term262573.getClass(), "delimiter", (char) 0);
        setField(term262573, term262573.getClass(), "quotePolicy", enum413);
        setField(term262573, term262573.getClass(), "quoteChar", term262874);
        setField(term262573, term262573.getClass(), "commentStart", null);
        setField(term262573, term262573.getClass(), "escape", null);
        setField(term262573, term262573.getClass(), "nullString", "NONE");
        term262798 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term262798, term262798.getClass(), "delimiter", (char) 0);
        setField(term262798, term262798.getClass(), "quotePolicy", enum413);
        setField(term262798, term262798.getClass(), "quoteChar", term262874);
        setField(term262798, term262798.getClass(), "commentStart", null);
        setField(term262798, term262798.getClass(), "escape", null);
        Character term263077 = new Character((char) 0);
        Class<? extends Object> term263250 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term263249 = ((Class) term263250).getDeclaredField((String) "ALL");
        ((Field) term263249).setAccessible(true);
        Object enum414 = ((Field) term263249).get((Object) null);
        term263076 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term263076, term263076.getClass(), "delimiter", (char) 0);
        setField(term263076, term263076.getClass(), "quoteChar", term263077);
        setField(term263076, term263076.getClass(), "quotePolicy", enum414);
        setField(term263076, term263076.getClass(), "commentStart", null);
        setField(term263076, term263076.getClass(), "escape", null);
        setBooleanField(term263076, term263076.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term263076, term263076.getClass(), "ignoreEmptyLines", false);
        setField(term263076, term263076.getClass(), "recordSeparator", null);
        setField(term263076, term263076.getClass(), "nullString", "NONE");
        setField(term263076, term263076.getClass(), "header", null);
        setBooleanField(term263076, term263076.getClass(), "skipHeaderRecord", false);
        Character term263084 = new Character((char) 0);
        Class<? extends Object> term263410 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term263409 = ((Class) term263410).getDeclaredField((String) "ALL");
        ((Field) term263409).setAccessible(true);
        Object enum415 = ((Field) term263409).get((Object) null);
        term263083 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term263083, term263083.getClass(), "delimiter", (char) 0);
        setField(term263083, term263083.getClass(), "quoteChar", term263084);
        setField(term263083, term263083.getClass(), "quotePolicy", enum415);
        setField(term263083, term263083.getClass(), "commentStart", null);
        setField(term263083, term263083.getClass(), "escape", null);
        setBooleanField(term263083, term263083.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term263083, term263083.getClass(), "ignoreEmptyLines", false);
        setField(term263083, term263083.getClass(), "recordSeparator", null);
        setField(term263083, term263083.getClass(), "nullString", null);
        setField(term263083, term263083.getClass(), "header", null);
        setBooleanField(term263083, term263083.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term262798;
        Object retValue = callMethod(klass, "equals", argTypes, term262573, args);
        assertTrue(recursiveEquals(term262573, term263076));
        assertTrue(recursiveEquals(term262798, term263083));
        assertTrue(recursiveEquals(retValue, false));
    }

};



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

public class CSVFormat_equals_34081098293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158869;
     Object term159056;
     Object term159356;
     Object term159361;

    public CSVFormat_equals_34081098293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term159368 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term159367 = ((Class) term159368).getDeclaredField((String) "ALL");
        ((Field) term159367).setAccessible(true);
        Object enum296 = ((Field) term159367).get((Object) null);
        Character term159021 = new Character((char) 0);
        term158869 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term158869, term158869.getClass(), "delimiter", (char) 0);
        setField(term158869, term158869.getClass(), "quotePolicy", enum296);
        setField(term158869, term158869.getClass(), "quoteChar", null);
        setField(term158869, term158869.getClass(), "commentStart", null);
        setField(term158869, term158869.getClass(), "escape", term159021);
        Character term159158 = new Character((char) 0);
        term159056 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term159056, term159056.getClass(), "delimiter", (char) 0);
        setField(term159056, term159056.getClass(), "quotePolicy", enum296);
        setField(term159056, term159056.getClass(), "quoteChar", null);
        setField(term159056, term159056.getClass(), "commentStart", null);
        setField(term159056, term159056.getClass(), "escape", term159158);
        Class<? extends Object> term159524 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term159523 = ((Class) term159524).getDeclaredField((String) "ALL");
        ((Field) term159523).setAccessible(true);
        Object enum297 = ((Field) term159523).get((Object) null);
        Character term159360 = new Character((char) 0);
        term159356 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term159356, term159356.getClass(), "delimiter", (char) 0);
        setField(term159356, term159356.getClass(), "quoteChar", null);
        setField(term159356, term159356.getClass(), "quotePolicy", enum297);
        setField(term159356, term159356.getClass(), "commentStart", null);
        setField(term159356, term159356.getClass(), "escape", term159360);
        setBooleanField(term159356, term159356.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term159356, term159356.getClass(), "ignoreEmptyLines", false);
        setField(term159356, term159356.getClass(), "recordSeparator", null);
        setField(term159356, term159356.getClass(), "nullString", null);
        setField(term159356, term159356.getClass(), "header", null);
        setBooleanField(term159356, term159356.getClass(), "skipHeaderRecord", false);
        Class<? extends Object> term159680 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term159679 = ((Class) term159680).getDeclaredField((String) "ALL");
        ((Field) term159679).setAccessible(true);
        Object enum298 = ((Field) term159679).get((Object) null);
        Character term159365 = new Character((char) 0);
        term159361 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term159361, term159361.getClass(), "delimiter", (char) 0);
        setField(term159361, term159361.getClass(), "quoteChar", null);
        setField(term159361, term159361.getClass(), "quotePolicy", enum298);
        setField(term159361, term159361.getClass(), "commentStart", null);
        setField(term159361, term159361.getClass(), "escape", term159365);
        setBooleanField(term159361, term159361.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term159361, term159361.getClass(), "ignoreEmptyLines", false);
        setField(term159361, term159361.getClass(), "recordSeparator", null);
        setField(term159361, term159361.getClass(), "nullString", null);
        setField(term159361, term159361.getClass(), "header", null);
        setBooleanField(term159361, term159361.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term159056;
        Object retValue = callMethod(klass, "equals", argTypes, term158869, args);
        assertTrue(recursiveEquals(term158869, term159356));
        assertTrue(recursiveEquals(term159056, term159361));
        assertTrue(recursiveEquals(retValue, true));
    }

};



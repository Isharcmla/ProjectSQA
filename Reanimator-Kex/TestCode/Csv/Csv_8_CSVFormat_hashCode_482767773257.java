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

public class CSVFormat_hashCode_482767773257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136748;
     Object term137153;

    public CSVFormat_hashCode_482767773257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term137161 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term137160 = ((Class) term137161).getDeclaredField((String) "MINIMAL");
        ((Field) term137160).setAccessible(true);
        Object enum235 = ((Field) term137160).get((Object) null);
        Character term136900 = new Character((char) 0);
        Character term136952 = new Character((char) 0);
        term136748 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term136748, term136748.getClass(), "delimiter", (char) 0);
        setField(term136748, term136748.getClass(), "quotePolicy", enum235);
        setField(term136748, term136748.getClass(), "quoteChar", term136900);
        setField(term136748, term136748.getClass(), "commentStart", term136952);
        setField(term136748, term136748.getClass(), "escape", term136952);
        setField(term136748, term136748.getClass(), "nullString", null);
        setBooleanField(term136748, term136748.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term136748, term136748.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term136748, term136748.getClass(), "skipHeaderRecord", true);
        Character term137154 = new Character((char) 0);
        Class<? extends Object> term137329 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term137328 = ((Class) term137329).getDeclaredField((String) "MINIMAL");
        ((Field) term137328).setAccessible(true);
        Object enum236 = ((Field) term137328).get((Object) null);
        Character term137158 = new Character((char) 0);
        Character term137159 = new Character((char) 0);
        term137153 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term137153, term137153.getClass(), "delimiter", (char) 0);
        setField(term137153, term137153.getClass(), "quoteChar", term137154);
        setField(term137153, term137153.getClass(), "quotePolicy", enum236);
        setField(term137153, term137153.getClass(), "commentStart", term137158);
        setField(term137153, term137153.getClass(), "escape", term137159);
        setBooleanField(term137153, term137153.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term137153, term137153.getClass(), "ignoreEmptyLines", false);
        setField(term137153, term137153.getClass(), "recordSeparator", null);
        setField(term137153, term137153.getClass(), "nullString", null);
        setField(term137153, term137153.getClass(), "header", null);
        setBooleanField(term137153, term137153.getClass(), "skipHeaderRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term136748, args);
        assertTrue(recursiveEquals(term136748, term137153));
        assertTrue(recursiveEquals(retValue, 1074198961));
    }

};



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

public class CSVFormat_equals_34081098335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218568;
     Object term218755;
     Object term220071;
     Object term220076;

    public CSVFormat_equals_34081098335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term220083 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term220082 = ((Class) term220083).getDeclaredField((String) "ALL");
        ((Field) term220082).setAccessible(true);
        Object enum362 = ((Field) term220082).get((Object) null);
        Character term218720 = new Character((char) 0);
        term218568 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term218568, term218568.getClass(), "delimiter", (char) 0);
        setField(term218568, term218568.getClass(), "quotePolicy", enum362);
        setField(term218568, term218568.getClass(), "quoteChar", null);
        setField(term218568, term218568.getClass(), "commentStart", term218720);
        setField(term218568, term218568.getClass(), "escape", null);
        setField(term218568, term218568.getClass(), "nullString", null);
        setField(term218568, term218568.getClass(), "header", null);
        setBooleanField(term218568, term218568.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term218568, term218568.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term218568, term218568.getClass(), "skipHeaderRecord", true);
        Character term218857 = new Character((char) 0);
        term218755 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term218755, term218755.getClass(), "delimiter", (char) 0);
        setField(term218755, term218755.getClass(), "quotePolicy", enum362);
        setField(term218755, term218755.getClass(), "quoteChar", null);
        setField(term218755, term218755.getClass(), "commentStart", term218857);
        setField(term218755, term218755.getClass(), "escape", null);
        setField(term218755, term218755.getClass(), "nullString", null);
        setField(term218755, term218755.getClass(), "header", null);
        setBooleanField(term218755, term218755.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term218755, term218755.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term218755, term218755.getClass(), "skipHeaderRecord", false);
        Class<? extends Object> term220239 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term220238 = ((Class) term220239).getDeclaredField((String) "ALL");
        ((Field) term220238).setAccessible(true);
        Object enum363 = ((Field) term220238).get((Object) null);
        Character term220075 = new Character((char) 0);
        term220071 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term220071, term220071.getClass(), "delimiter", (char) 0);
        setField(term220071, term220071.getClass(), "quoteChar", null);
        setField(term220071, term220071.getClass(), "quotePolicy", enum363);
        setField(term220071, term220071.getClass(), "commentStart", term220075);
        setField(term220071, term220071.getClass(), "escape", null);
        setBooleanField(term220071, term220071.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term220071, term220071.getClass(), "ignoreEmptyLines", true);
        setField(term220071, term220071.getClass(), "recordSeparator", null);
        setField(term220071, term220071.getClass(), "nullString", null);
        setField(term220071, term220071.getClass(), "header", null);
        setBooleanField(term220071, term220071.getClass(), "skipHeaderRecord", true);
        Class<? extends Object> term220395 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term220394 = ((Class) term220395).getDeclaredField((String) "ALL");
        ((Field) term220394).setAccessible(true);
        Object enum364 = ((Field) term220394).get((Object) null);
        Character term220080 = new Character((char) 0);
        term220076 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term220076, term220076.getClass(), "delimiter", (char) 0);
        setField(term220076, term220076.getClass(), "quoteChar", null);
        setField(term220076, term220076.getClass(), "quotePolicy", enum364);
        setField(term220076, term220076.getClass(), "commentStart", term220080);
        setField(term220076, term220076.getClass(), "escape", null);
        setBooleanField(term220076, term220076.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term220076, term220076.getClass(), "ignoreEmptyLines", true);
        setField(term220076, term220076.getClass(), "recordSeparator", null);
        setField(term220076, term220076.getClass(), "nullString", null);
        setField(term220076, term220076.getClass(), "header", null);
        setBooleanField(term220076, term220076.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term218755;
        Object retValue = callMethod(klass, "equals", argTypes, term218568, args);
        assertTrue(recursiveEquals(term218568, term220071));
        assertTrue(recursiveEquals(term218755, term220076));
        assertTrue(recursiveEquals(retValue, false));
    }

};



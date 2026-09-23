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

public class CSVFormat_equals_34081098352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239008;
     Object term239247;
     Object term239516;
     Object term239522;

    public CSVFormat_equals_34081098352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term239529 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term239528 = ((Class) term239529).getDeclaredField((String) "ALL");
        ((Field) term239528).setAccessible(true);
        Object enum391 = ((Field) term239528).get((Object) null);
        Character term239323 = new Character((char) 0);
        Character term239212 = new Character((char) 0);
        term239008 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term239008, term239008.getClass(), "delimiter", (char) 0);
        setField(term239008, term239008.getClass(), "quotePolicy", enum391);
        setField(term239008, term239008.getClass(), "quoteChar", term239323);
        setField(term239008, term239008.getClass(), "commentStart", null);
        setField(term239008, term239008.getClass(), "escape", term239212);
        term239247 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term239247, term239247.getClass(), "delimiter", (char) 0);
        setField(term239247, term239247.getClass(), "quotePolicy", enum391);
        setField(term239247, term239247.getClass(), "quoteChar", term239323);
        setField(term239247, term239247.getClass(), "commentStart", null);
        Character term239517 = new Character((char) 0);
        Class<? extends Object> term239686 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term239685 = ((Class) term239686).getDeclaredField((String) "ALL");
        ((Field) term239685).setAccessible(true);
        Object enum392 = ((Field) term239685).get((Object) null);
        Character term239521 = new Character((char) 0);
        term239516 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term239516, term239516.getClass(), "delimiter", (char) 0);
        setField(term239516, term239516.getClass(), "quoteChar", term239517);
        setField(term239516, term239516.getClass(), "quotePolicy", enum392);
        setField(term239516, term239516.getClass(), "commentStart", null);
        setField(term239516, term239516.getClass(), "escape", term239521);
        setBooleanField(term239516, term239516.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term239516, term239516.getClass(), "ignoreEmptyLines", false);
        setField(term239516, term239516.getClass(), "recordSeparator", null);
        setField(term239516, term239516.getClass(), "nullString", null);
        setField(term239516, term239516.getClass(), "header", null);
        setBooleanField(term239516, term239516.getClass(), "skipHeaderRecord", false);
        Character term239523 = new Character((char) 0);
        Class<? extends Object> term239842 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term239841 = ((Class) term239842).getDeclaredField((String) "ALL");
        ((Field) term239841).setAccessible(true);
        Object enum393 = ((Field) term239841).get((Object) null);
        term239522 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term239522, term239522.getClass(), "delimiter", (char) 0);
        setField(term239522, term239522.getClass(), "quoteChar", term239523);
        setField(term239522, term239522.getClass(), "quotePolicy", enum393);
        setField(term239522, term239522.getClass(), "commentStart", null);
        setField(term239522, term239522.getClass(), "escape", null);
        setBooleanField(term239522, term239522.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term239522, term239522.getClass(), "ignoreEmptyLines", false);
        setField(term239522, term239522.getClass(), "recordSeparator", null);
        setField(term239522, term239522.getClass(), "nullString", null);
        setField(term239522, term239522.getClass(), "header", null);
        setBooleanField(term239522, term239522.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term239247;
        Object retValue = callMethod(klass, "equals", argTypes, term239008, args);
        assertTrue(recursiveEquals(term239008, term239516));
        assertTrue(recursiveEquals(term239247, term239522));
        assertTrue(recursiveEquals(retValue, false));
    }

};



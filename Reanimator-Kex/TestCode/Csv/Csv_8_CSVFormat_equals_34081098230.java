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

public class CSVFormat_equals_34081098230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116678;
     Object term116865;
     Object term117785;
     Object term117790;

    public CSVFormat_equals_34081098230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term117796 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term117795 = ((Class) term117796).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term117795).setAccessible(true);
        Object enum202 = ((Field) term117795).get((Object) null);
        Character term116830 = new Character((char) 0);
        term116678 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term116678, term116678.getClass(), "delimiter", (char) 0);
        setField(term116678, term116678.getClass(), "quotePolicy", enum202);
        setField(term116678, term116678.getClass(), "quoteChar", null);
        setField(term116678, term116678.getClass(), "commentStart", term116830);
        term116865 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term116865, term116865.getClass(), "delimiter", (char) 0);
        setField(term116865, term116865.getClass(), "quotePolicy", enum202);
        setField(term116865, term116865.getClass(), "quoteChar", null);
        Class<? extends Object> term117977 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term117976 = ((Class) term117977).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term117976).setAccessible(true);
        Object enum203 = ((Field) term117976).get((Object) null);
        Character term117789 = new Character((char) 0);
        term117785 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term117785, term117785.getClass(), "delimiter", (char) 0);
        setField(term117785, term117785.getClass(), "quoteChar", null);
        setField(term117785, term117785.getClass(), "quotePolicy", enum203);
        setField(term117785, term117785.getClass(), "commentStart", term117789);
        setField(term117785, term117785.getClass(), "escape", null);
        setBooleanField(term117785, term117785.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term117785, term117785.getClass(), "ignoreEmptyLines", false);
        setField(term117785, term117785.getClass(), "recordSeparator", null);
        setField(term117785, term117785.getClass(), "nullString", null);
        setField(term117785, term117785.getClass(), "header", null);
        setBooleanField(term117785, term117785.getClass(), "skipHeaderRecord", false);
        Class<? extends Object> term118157 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term118156 = ((Class) term118157).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term118156).setAccessible(true);
        Object enum204 = ((Field) term118156).get((Object) null);
        term117790 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term117790, term117790.getClass(), "delimiter", (char) 0);
        setField(term117790, term117790.getClass(), "quoteChar", null);
        setField(term117790, term117790.getClass(), "quotePolicy", enum204);
        setField(term117790, term117790.getClass(), "commentStart", null);
        setField(term117790, term117790.getClass(), "escape", null);
        setBooleanField(term117790, term117790.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term117790, term117790.getClass(), "ignoreEmptyLines", false);
        setField(term117790, term117790.getClass(), "recordSeparator", null);
        setField(term117790, term117790.getClass(), "nullString", null);
        setField(term117790, term117790.getClass(), "header", null);
        setBooleanField(term117790, term117790.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term116865;
        Object retValue = callMethod(klass, "equals", argTypes, term116678, args);
        assertTrue(recursiveEquals(term116678, term117785));
        assertTrue(recursiveEquals(term116865, term117790));
        assertTrue(recursiveEquals(retValue, false));
    }

};



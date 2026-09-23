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
import java.lang.Character;
import java.lang.Object;
import java.lang.String;

public class CSVFormat_format_2070435827379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287027;
     Object term286171;
     Object term287839;
     Object term287847;

    public CSVFormat_format_2070435827379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term287079 = new Character((char) 0);
        Character term287131 = new Character((char) 0);
        Character term287183 = new Character((char) 32768);
        Class<? extends Object> term287850 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term287849 = ((Class) term287850).getDeclaredField((String) "NONE");
        ((Field) term287849).setAccessible(true);
        Object enum431 = ((Field) term287849).get((Object) null);
        term287027 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term286366 = (Object[]) newArray("java.lang.String", 0);
        setField(term287027, term287027.getClass(), "quoteChar", term287079);
        setCharField(term287027, term287027.getClass(), "delimiter", (char) 32735);
        setField(term287027, term287027.getClass(), "escape", term287131);
        setField(term287027, term287027.getClass(), "commentStart", term287183);
        setField(term287027, term287027.getClass(), "header", term286366);
        setField(term287027, term287027.getClass(), "quotePolicy", enum431);
        term286171 = (Object[]) newArray("java.lang.Object", 1);
        int[] term286172 = (int[]) newIntArray(0);
        setElement(term286171, 0, term286172);
        Character term287840 = new Character((char) 0);
        Class<? extends Object> term288009 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term288008 = ((Class) term288009).getDeclaredField((String) "NONE");
        ((Field) term288008).setAccessible(true);
        Object enum432 = ((Field) term288008).get((Object) null);
        Character term287844 = new Character((char) 32768);
        Character term287845 = new Character((char) 0);
        term287839 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term287846 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term287839, term287839.getClass(), "delimiter", (char) 32735);
        setField(term287839, term287839.getClass(), "quoteChar", term287840);
        setField(term287839, term287839.getClass(), "quotePolicy", enum432);
        setField(term287839, term287839.getClass(), "commentStart", term287844);
        setField(term287839, term287839.getClass(), "escape", term287845);
        setBooleanField(term287839, term287839.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term287839, term287839.getClass(), "ignoreEmptyLines", false);
        setField(term287839, term287839.getClass(), "recordSeparator", null);
        setField(term287839, term287839.getClass(), "nullString", null);
        setField(term287839, term287839.getClass(), "header", term287846);
        setBooleanField(term287839, term287839.getClass(), "skipHeaderRecord", false);
        term287847 = (Object[]) newArray("java.lang.Object", 1);
        int[] term287848 = (int[]) newIntArray(0);
        setElement(term287847, 0, term287848);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term286171;
        Object retValue = callMethod(klass, "format", argTypes, term287027, args);
        assertTrue(recursiveEquals(term287027, term287839));
        assertTrue(recursiveEquals(term286171, term287847));
        assertTrue(recursiveEquals(retValue, "[I@78cec148"));
    }

};



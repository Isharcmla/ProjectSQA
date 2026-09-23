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

public class CSVFormat_format_2070435827338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223099;
     Object term221344;
     Object term224088;
     Object term224096;

    public CSVFormat_format_2070435827338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term223151 = new Character((char) 8);
        Character term223203 = new Character((char) 256);
        Character term223255 = new Character((char) 0);
        Class<? extends Object> term224101 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term224100 = ((Class) term224101).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term224100).setAccessible(true);
        Object enum369 = ((Field) term224100).get((Object) null);
        term223099 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term221922 = (Object[]) newArray("java.lang.String", 0);
        setField(term223099, term223099.getClass(), "quoteChar", term223151);
        setCharField(term223099, term223099.getClass(), "delimiter", (char) 64);
        setField(term223099, term223099.getClass(), "escape", term223203);
        setField(term223099, term223099.getClass(), "commentStart", term223255);
        setField(term223099, term223099.getClass(), "header", term221922);
        setField(term223099, term223099.getClass(), "quotePolicy", enum369);
        term221344 = (Object[]) newArray("java.lang.Object", 2);
        int[] term221345 = (int[]) newIntArray(0);
        setElement(term221344, 0, term221345);
        setElement(term221344, 1, "");
        Character term224089 = new Character((char) 8);
        Class<? extends Object> term224281 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term224280 = ((Class) term224281).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term224280).setAccessible(true);
        Object enum370 = ((Field) term224280).get((Object) null);
        Character term224093 = new Character((char) 0);
        Character term224094 = new Character((char) 256);
        term224088 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term224095 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term224088, term224088.getClass(), "delimiter", (char) 64);
        setField(term224088, term224088.getClass(), "quoteChar", term224089);
        setField(term224088, term224088.getClass(), "quotePolicy", enum370);
        setField(term224088, term224088.getClass(), "commentStart", term224093);
        setField(term224088, term224088.getClass(), "escape", term224094);
        setBooleanField(term224088, term224088.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term224088, term224088.getClass(), "ignoreEmptyLines", false);
        setField(term224088, term224088.getClass(), "recordSeparator", null);
        setField(term224088, term224088.getClass(), "nullString", null);
        setField(term224088, term224088.getClass(), "header", term224095);
        setBooleanField(term224088, term224088.getClass(), "skipHeaderRecord", false);
        term224096 = (Object[]) newArray("java.lang.Object", 2);
        int[] term224097 = (int[]) newIntArray(0);
        setElement(term224096, 0, term224097);
        setElement(term224096, 1, "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term221344;
        Object retValue = callMethod(klass, "format", argTypes, term223099, args);
        assertTrue(recursiveEquals(term223099, term224088));
        assertTrue(recursiveEquals(term221344, term224096));
        assertTrue(recursiveEquals(retValue, "[I@3a3447ff\b@"));
    }

};



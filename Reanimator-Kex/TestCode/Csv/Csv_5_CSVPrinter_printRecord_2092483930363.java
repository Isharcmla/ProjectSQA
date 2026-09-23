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
import java.lang.Object;
import java.lang.Character;
import java.lang.String;
import java.lang.StringBuffer;

public class CSVPrinter_printRecord_2092483930363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1020630;
     Object term1020306;
     Object term1021493;
     Object term1021501;

    public CSVPrinter_printRecord_2092483930363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1020752 = new Character((char) 0);
        Class<? extends Object> term1021505 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term1021504 = ((Class) term1021505).getDeclaredField((String) "ALL");
        ((Field) term1021504).setAccessible(true);
        Object enum355 = ((Field) term1021504).get((Object) null);
        StringBuffer term1020910 = new StringBuffer();
        term1020630 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term1020700 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term1020630, term1020630.getClass(), "newRecord", true);
        setField(term1020700, term1020700.getClass(), "quoteChar", term1020752);
        setCharField(term1020700, term1020700.getClass(), "delimiter", (char) 0);
        setField(term1020700, term1020700.getClass(), "quotePolicy", enum355);
        setField(term1020630, term1020630.getClass(), "format", term1020700);
        setField(term1020630, term1020630.getClass(), "out", term1020910);
        term1020306 = (Object[]) newArray("java.lang.Object", 2);
        byte[] term1020307 = (byte[]) newByteArray(0);
        Object term1020948 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1020306, 0, term1020307);
        setElement(term1020306, 1, term1020948);
        Character term1021497 = new Character((char) 0);
        Class<? extends Object> term1021743 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term1021742 = ((Class) term1021743).getDeclaredField((String) "ALL");
        ((Field) term1021742).setAccessible(true);
        Object enum356 = ((Field) term1021742).get((Object) null);
        term1021493 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term1021494 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term1021495 = (byte[]) newByteArray(82);
        Object term1021496 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term1021494, term1021494.getClass(), "toStringCache", null);
        setByteElement(term1021495, 1, (byte) 91);
        setByteElement(term1021495, 2, (byte) 66);
        setByteElement(term1021495, 3, (byte) 64);
        setByteElement(term1021495, 4, (byte) 54);
        setByteElement(term1021495, 5, (byte) 100);
        setByteElement(term1021495, 6, (byte) 102);
        setByteElement(term1021495, 7, (byte) 98);
        setByteElement(term1021495, 8, (byte) 97);
        setByteElement(term1021495, 9, (byte) 48);
        setByteElement(term1021495, 10, (byte) 55);
        setByteElement(term1021495, 11, (byte) 98);
        setByteElement(term1021495, 15, (byte) 106);
        setByteElement(term1021495, 16, (byte) 97);
        setByteElement(term1021495, 17, (byte) 118);
        setByteElement(term1021495, 18, (byte) 97);
        setByteElement(term1021495, 19, (byte) 46);
        setByteElement(term1021495, 20, (byte) 108);
        setByteElement(term1021495, 21, (byte) 97);
        setByteElement(term1021495, 22, (byte) 110);
        setByteElement(term1021495, 23, (byte) 103);
        setByteElement(term1021495, 24, (byte) 46);
        setByteElement(term1021495, 25, (byte) 79);
        setByteElement(term1021495, 26, (byte) 98);
        setByteElement(term1021495, 27, (byte) 106);
        setByteElement(term1021495, 28, (byte) 101);
        setByteElement(term1021495, 29, (byte) 99);
        setByteElement(term1021495, 30, (byte) 116);
        setByteElement(term1021495, 31, (byte) 64);
        setByteElement(term1021495, 32, (byte) 51);
        setByteElement(term1021495, 33, (byte) 51);
        setByteElement(term1021495, 34, (byte) 56);
        setByteElement(term1021495, 35, (byte) 48);
        setByteElement(term1021495, 36, (byte) 97);
        setByteElement(term1021495, 37, (byte) 50);
        setByteElement(term1021495, 38, (byte) 100);
        setByteElement(term1021495, 39, (byte) 99);
        setByteElement(term1021495, 41, (byte) 110);
        setByteElement(term1021495, 42, (byte) 117);
        setByteElement(term1021495, 43, (byte) 108);
        setByteElement(term1021495, 44, (byte) 108);
        setField(term1021494, term1021494.getClass(), "value", term1021495);
        setByteField(term1021494, term1021494.getClass(), "coder", (byte) 0);
        setIntField(term1021494, term1021494.getClass(), "count", 45);
        setField(term1021493, term1021493.getClass(), "out", term1021494);
        setCharField(term1021496, term1021496.getClass(), "delimiter", (char) 0);
        setField(term1021496, term1021496.getClass(), "quoteChar", term1021497);
        setField(term1021496, term1021496.getClass(), "quotePolicy", enum356);
        setField(term1021496, term1021496.getClass(), "commentStart", null);
        setField(term1021496, term1021496.getClass(), "escape", null);
        setBooleanField(term1021496, term1021496.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term1021496, term1021496.getClass(), "ignoreEmptyLines", false);
        setField(term1021496, term1021496.getClass(), "recordSeparator", null);
        setField(term1021496, term1021496.getClass(), "nullString", null);
        setField(term1021496, term1021496.getClass(), "header", null);
        setBooleanField(term1021496, term1021496.getClass(), "skipHeaderRecord", false);
        setField(term1021493, term1021493.getClass(), "format", term1021496);
        setBooleanField(term1021493, term1021493.getClass(), "newRecord", true);
        term1021501 = (Object[]) newArray("java.lang.Object", 2);
        byte[] term1021502 = (byte[]) newByteArray(0);
        Object term1021503 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1021501, 0, term1021502);
        setElement(term1021501, 1, term1021503);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1020306;
        callMethod(klass, "printRecord", argTypes, term1020630, args);
        assertTrue(recursiveEquals(term1020630, term1021493));
        assertTrue(recursiveEquals(term1020306, term1021501));
    }

};



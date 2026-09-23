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

public class CSVPrinter_printRecord_2092483930175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133897;
     Object term133659;
     Object term134795;
     Object term134803;

    public CSVPrinter_printRecord_2092483930175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term134019 = new Character((char) 0);
        Class<? extends Object> term134805 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term134804 = ((Class) term134805).getDeclaredField((String) "ALL");
        ((Field) term134804).setAccessible(true);
        Object enum136 = ((Field) term134804).get((Object) null);
        StringBuffer term134177 = new StringBuffer();
        term133897 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term133967 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term133897, term133897.getClass(), "newRecord", true);
        setField(term133967, term133967.getClass(), "quoteChar", term134019);
        setCharField(term133967, term133967.getClass(), "delimiter", (char) 0);
        setField(term133967, term133967.getClass(), "quotePolicy", enum136);
        setField(term133897, term133897.getClass(), "format", term133967);
        setField(term133897, term133897.getClass(), "out", term134177);
        term133659 = (Object[]) newArray("java.lang.Object", 1);
        Object term134253 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term133659, 0, term134253);
        Character term134799 = new Character((char) 0);
        Class<? extends Object> term135051 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term135050 = ((Class) term135051).getDeclaredField((String) "ALL");
        ((Field) term135050).setAccessible(true);
        Object enum137 = ((Field) term135050).get((Object) null);
        term134795 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term134796 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term134797 = (byte[]) newByteArray(90);
        Object term134798 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term134796, term134796.getClass(), "toStringCache", null);
        setByteElement(term134797, 1, (byte) 111);
        setByteElement(term134797, 2, (byte) 114);
        setByteElement(term134797, 3, (byte) 103);
        setByteElement(term134797, 4, (byte) 46);
        setByteElement(term134797, 5, (byte) 97);
        setByteElement(term134797, 6, (byte) 112);
        setByteElement(term134797, 7, (byte) 97);
        setByteElement(term134797, 8, (byte) 99);
        setByteElement(term134797, 9, (byte) 104);
        setByteElement(term134797, 10, (byte) 101);
        setByteElement(term134797, 11, (byte) 46);
        setByteElement(term134797, 12, (byte) 99);
        setByteElement(term134797, 13, (byte) 111);
        setByteElement(term134797, 14, (byte) 109);
        setByteElement(term134797, 15, (byte) 109);
        setByteElement(term134797, 16, (byte) 111);
        setByteElement(term134797, 17, (byte) 110);
        setByteElement(term134797, 18, (byte) 115);
        setByteElement(term134797, 19, (byte) 46);
        setByteElement(term134797, 20, (byte) 99);
        setByteElement(term134797, 21, (byte) 115);
        setByteElement(term134797, 22, (byte) 118);
        setByteElement(term134797, 23, (byte) 46);
        setByteElement(term134797, 24, (byte) 67);
        setByteElement(term134797, 25, (byte) 83);
        setByteElement(term134797, 26, (byte) 86);
        setByteElement(term134797, 27, (byte) 80);
        setByteElement(term134797, 28, (byte) 114);
        setByteElement(term134797, 29, (byte) 105);
        setByteElement(term134797, 30, (byte) 110);
        setByteElement(term134797, 31, (byte) 116);
        setByteElement(term134797, 32, (byte) 101);
        setByteElement(term134797, 33, (byte) 114);
        setByteElement(term134797, 34, (byte) 36);
        setByteElement(term134797, 35, (byte) 49);
        setByteElement(term134797, 36, (byte) 64);
        setByteElement(term134797, 37, (byte) 49);
        setByteElement(term134797, 38, (byte) 53);
        setByteElement(term134797, 39, (byte) 48);
        setByteElement(term134797, 40, (byte) 57);
        setByteElement(term134797, 41, (byte) 55);
        setByteElement(term134797, 42, (byte) 100);
        setByteElement(term134797, 43, (byte) 51);
        setField(term134796, term134796.getClass(), "value", term134797);
        setByteField(term134796, term134796.getClass(), "coder", (byte) 0);
        setIntField(term134796, term134796.getClass(), "count", 45);
        setField(term134795, term134795.getClass(), "out", term134796);
        setCharField(term134798, term134798.getClass(), "delimiter", (char) 0);
        setField(term134798, term134798.getClass(), "quoteChar", term134799);
        setField(term134798, term134798.getClass(), "quotePolicy", enum137);
        setField(term134798, term134798.getClass(), "commentStart", null);
        setField(term134798, term134798.getClass(), "escape", null);
        setBooleanField(term134798, term134798.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term134798, term134798.getClass(), "ignoreEmptyLines", false);
        setField(term134798, term134798.getClass(), "recordSeparator", null);
        setField(term134798, term134798.getClass(), "nullString", null);
        setField(term134798, term134798.getClass(), "header", null);
        setBooleanField(term134798, term134798.getClass(), "skipHeaderRecord", false);
        setField(term134795, term134795.getClass(), "format", term134798);
        setBooleanField(term134795, term134795.getClass(), "newRecord", true);
        term134803 = (Object[]) newArray("java.lang.Object", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term133659;
        callMethod(klass, "printRecord", argTypes, term133897, args);
        assertTrue(recursiveEquals(term133897, term134795));
        assertTrue(recursiveEquals(term133659, term134803));
    }

};



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
import java.lang.StringBuilder;

public class CSVPrinter_printRecord_2092483930167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127788;
     Object term124926;
     Object term128853;
     Object term128861;

    public CSVPrinter_printRecord_2092483930167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term128131 = new Character((char) 0);
        Class<? extends Object> term128868 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term128867 = ((Class) term128868).getDeclaredField((String) "ALL");
        ((Field) term128867).setAccessible(true);
        Object enum126 = ((Field) term128867).get((Object) null);
        StringBuilder term128070 = new StringBuilder();
        term127788 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term128105 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term127788, term127788.getClass(), "newRecord", true);
        setCharField(term128105, term128105.getClass(), "delimiter", (char) 0);
        setField(term128105, term128105.getClass(), "escape", null);
        setField(term128105, term128105.getClass(), "quoteChar", term128131);
        setField(term128105, term128105.getClass(), "commentStart", null);
        setField(term128105, term128105.getClass(), "nullString", null);
        setField(term128105, term128105.getClass(), "recordSeparator", null);
        setBooleanField(term128105, term128105.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term128105, term128105.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term128105, term128105.getClass(), "skipHeaderRecord", false);
        setField(term128105, term128105.getClass(), "header", null);
        setField(term128105, term128105.getClass(), "quotePolicy", enum126);
        setField(term127788, term127788.getClass(), "format", term128105);
        setField(term127788, term127788.getClass(), "out", term128070);
        term124926 = (Object[]) newArray("java.lang.Object", 2);
        setElement(term124926, 0, term128105);
        setElement(term124926, 1, enum126);
        Character term128857 = new Character((char) 0);
        Class<? extends Object> term129094 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term129093 = ((Class) term129094).getDeclaredField((String) "ALL");
        ((Field) term129093).setAccessible(true);
        Object enum127 = ((Field) term129093).get((Object) null);
        term128853 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term128854 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term128855 = (byte[]) newByteArray(70);
        Object term128856 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setByteElement(term128855, 1, (byte) 68);
        setByteElement(term128855, 2, (byte) 101);
        setByteElement(term128855, 3, (byte) 108);
        setByteElement(term128855, 4, (byte) 105);
        setByteElement(term128855, 5, (byte) 109);
        setByteElement(term128855, 6, (byte) 105);
        setByteElement(term128855, 7, (byte) 116);
        setByteElement(term128855, 8, (byte) 101);
        setByteElement(term128855, 9, (byte) 114);
        setByteElement(term128855, 10, (byte) 61);
        setByteElement(term128855, 11, (byte) 60);
        setByteElement(term128855, 14, (byte) 62);
        setByteElement(term128855, 15, (byte) 32);
        setByteElement(term128855, 16, (byte) 81);
        setByteElement(term128855, 17, (byte) 117);
        setByteElement(term128855, 18, (byte) 111);
        setByteElement(term128855, 19, (byte) 116);
        setByteElement(term128855, 20, (byte) 101);
        setByteElement(term128855, 21, (byte) 67);
        setByteElement(term128855, 22, (byte) 104);
        setByteElement(term128855, 23, (byte) 97);
        setByteElement(term128855, 24, (byte) 114);
        setByteElement(term128855, 25, (byte) 61);
        setByteElement(term128855, 26, (byte) 60);
        setByteElement(term128855, 29, (byte) 62);
        setByteElement(term128855, 30, (byte) 32);
        setByteElement(term128855, 31, (byte) 83);
        setByteElement(term128855, 32, (byte) 107);
        setByteElement(term128855, 33, (byte) 105);
        setByteElement(term128855, 34, (byte) 112);
        setByteElement(term128855, 35, (byte) 72);
        setByteElement(term128855, 36, (byte) 101);
        setByteElement(term128855, 37, (byte) 97);
        setByteElement(term128855, 38, (byte) 100);
        setByteElement(term128855, 39, (byte) 101);
        setByteElement(term128855, 40, (byte) 114);
        setByteElement(term128855, 41, (byte) 82);
        setByteElement(term128855, 42, (byte) 101);
        setByteElement(term128855, 43, (byte) 99);
        setByteElement(term128855, 44, (byte) 111);
        setByteElement(term128855, 45, (byte) 114);
        setByteElement(term128855, 46, (byte) 100);
        setByteElement(term128855, 47, (byte) 58);
        setByteElement(term128855, 48, (byte) 102);
        setByteElement(term128855, 49, (byte) 97);
        setByteElement(term128855, 50, (byte) 108);
        setByteElement(term128855, 51, (byte) 115);
        setByteElement(term128855, 52, (byte) 101);
        setByteElement(term128855, 56, (byte) 65);
        setByteElement(term128855, 57, (byte) 76);
        setByteElement(term128855, 58, (byte) 76);
        setField(term128854, term128854.getClass(), "value", term128855);
        setByteField(term128854, term128854.getClass(), "coder", (byte) 0);
        setIntField(term128854, term128854.getClass(), "count", 60);
        setField(term128853, term128853.getClass(), "out", term128854);
        setCharField(term128856, term128856.getClass(), "delimiter", (char) 0);
        setField(term128856, term128856.getClass(), "quoteChar", term128857);
        setField(term128856, term128856.getClass(), "quotePolicy", enum127);
        setField(term128856, term128856.getClass(), "commentStart", null);
        setField(term128856, term128856.getClass(), "escape", null);
        setBooleanField(term128856, term128856.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term128856, term128856.getClass(), "ignoreEmptyLines", false);
        setField(term128856, term128856.getClass(), "recordSeparator", null);
        setField(term128856, term128856.getClass(), "nullString", null);
        setField(term128856, term128856.getClass(), "header", null);
        setBooleanField(term128856, term128856.getClass(), "skipHeaderRecord", false);
        setField(term128853, term128853.getClass(), "format", term128856);
        setBooleanField(term128853, term128853.getClass(), "newRecord", true);
        Character term128863 = new Character((char) 0);
        Class<? extends Object> term129250 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term129249 = ((Class) term129250).getDeclaredField((String) "ALL");
        ((Field) term129249).setAccessible(true);
        Object enum128 = ((Field) term129249).get((Object) null);
        term128861 = (Object[]) newArray("java.lang.Object", 2);
        Object term128862 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term128862, term128862.getClass(), "delimiter", (char) 0);
        setField(term128862, term128862.getClass(), "quoteChar", term128863);
        setField(term128862, term128862.getClass(), "quotePolicy", enum128);
        setField(term128862, term128862.getClass(), "commentStart", null);
        setField(term128862, term128862.getClass(), "escape", null);
        setBooleanField(term128862, term128862.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term128862, term128862.getClass(), "ignoreEmptyLines", false);
        setField(term128862, term128862.getClass(), "recordSeparator", null);
        setField(term128862, term128862.getClass(), "nullString", null);
        setField(term128862, term128862.getClass(), "header", null);
        setBooleanField(term128862, term128862.getClass(), "skipHeaderRecord", false);
        setElement(term128861, 0, term128862);
        setElement(term128861, 1, enum128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term124926;
        callMethod(klass, "printRecord", argTypes, term127788, args);
        assertTrue(recursiveEquals(term127788, term128853));
        assertTrue(recursiveEquals(term124926, term128861));
    }

};



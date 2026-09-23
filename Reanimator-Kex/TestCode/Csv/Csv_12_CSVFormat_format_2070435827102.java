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
import java.lang.Object;
import java.lang.Character;
import java.lang.String;
import java.lang.StringBuffer;

public class CSVFormat_format_2070435827102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68008;
     Object term59978;

    public CSVFormat_format_2070435827102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term68060 = new Character((char) 0);
        Class<? extends Object> term68266 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term68265 = ((Class) term68266).getDeclaredField((String) "ALL");
        ((Field) term68265).setAccessible(true);
        Object enum140 = ((Field) term68265).get((Object) null);
        term68008 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term60676 = (Object[]) newArray("java.lang.String", 0);
        setField(term68008, term68008.getClass(), "header", term60676);
        setField(term68008, term68008.getClass(), "quoteCharacter", term68060);
        setCharField(term68008, term68008.getClass(), "delimiter", 'l');
        setField(term68008, term68008.getClass(), "quoteMode", enum140);
        setField(term68008, term68008.getClass(), "recordSeparator", "");
        StringBuffer term68264 = new StringBuffer();
        term59978 = (Object[]) newArray("java.lang.String", 2);
        byte[] term59979 = (byte[]) newByteArray(136);
        setByteElement(term59979, 0, (byte) 108);
        setByteElement(term59979, 2, (byte) 119);
        setByteElement(term59979, 9, (byte) -128);
        setByteElement(term59979, 10, (byte) -128);
        setByteElement(term59979, 11, (byte) 4);
        setByteElement(term59979, 12, (byte) -128);
        setByteElement(term59979, 13, (byte) -128);
        setByteElement(term59979, 14, (byte) 4);
        setByteElement(term59979, 16, (byte) 2);
        setByteElement(term59979, 17, (byte) 2);
        setByteElement(term59979, 18, (byte) 2);
        setByteElement(term59979, 19, (byte) 2);
        setByteElement(term59979, 20, (byte) 2);
        setByteElement(term59979, 21, (byte) 2);
        setByteElement(term59979, 22, (byte) 2);
        setByteElement(term59979, 23, (byte) 2);
        setByteElement(term59979, 24, (byte) 2);
        setByteElement(term59979, 25, (byte) 2);
        setByteElement(term59979, 26, (byte) 2);
        setByteElement(term59979, 27, (byte) 2);
        setByteElement(term59979, 28, (byte) 2);
        setByteElement(term59979, 29, (byte) 2);
        setByteElement(term59979, 30, (byte) 2);
        setByteElement(term59979, 31, (byte) 2);
        setByteElement(term59979, 32, (byte) 2);
        setByteElement(term59979, 33, (byte) 2);
        setByteElement(term59979, 34, (byte) 2);
        setByteElement(term59979, 35, (byte) 2);
        setByteElement(term59979, 36, (byte) 2);
        setByteElement(term59979, 37, (byte) 2);
        setByteElement(term59979, 38, (byte) 2);
        setByteElement(term59979, 39, (byte) 2);
        setByteElement(term59979, 40, (byte) 2);
        setByteElement(term59979, 41, (byte) 2);
        setByteElement(term59979, 42, (byte) 2);
        setByteElement(term59979, 43, (byte) 2);
        setByteElement(term59979, 44, (byte) 2);
        setByteElement(term59979, 45, (byte) 2);
        setByteElement(term59979, 46, (byte) 2);
        setByteElement(term59979, 47, (byte) 2);
        setByteElement(term59979, 48, (byte) 2);
        setByteElement(term59979, 49, (byte) 2);
        setByteElement(term59979, 50, (byte) 2);
        setByteElement(term59979, 51, (byte) 2);
        setByteElement(term59979, 52, (byte) 2);
        setByteElement(term59979, 53, (byte) 2);
        setByteElement(term59979, 54, (byte) 2);
        setByteElement(term59979, 55, (byte) 2);
        setByteElement(term59979, 56, (byte) 2);
        setByteElement(term59979, 57, (byte) 2);
        setByteElement(term59979, 58, (byte) 2);
        setByteElement(term59979, 59, (byte) 2);
        setByteElement(term59979, 60, (byte) 2);
        setByteElement(term59979, 61, (byte) 2);
        setByteElement(term59979, 62, (byte) 2);
        setByteElement(term59979, 63, (byte) 2);
        setByteElement(term59979, 64, (byte) 2);
        setByteElement(term59979, 65, (byte) 2);
        setByteElement(term59979, 66, (byte) 2);
        setByteElement(term59979, 67, (byte) 2);
        setByteElement(term59979, 68, (byte) 2);
        setByteElement(term59979, 69, (byte) 2);
        setByteElement(term59979, 70, (byte) 2);
        setByteElement(term59979, 71, (byte) 2);
        setByteElement(term59979, 72, (byte) 2);
        setByteElement(term59979, 73, (byte) 2);
        setByteElement(term59979, 74, (byte) 2);
        setByteElement(term59979, 75, (byte) 2);
        setByteElement(term59979, 76, (byte) 2);
        setByteElement(term59979, 77, (byte) 2);
        setByteElement(term59979, 78, (byte) 2);
        setByteElement(term59979, 79, (byte) 2);
        setByteElement(term59979, 80, (byte) 2);
        setByteElement(term59979, 81, (byte) 2);
        setByteElement(term59979, 82, (byte) 2);
        setByteElement(term59979, 83, (byte) 2);
        setByteElement(term59979, 84, (byte) 2);
        setByteElement(term59979, 85, (byte) 2);
        setByteElement(term59979, 86, (byte) 2);
        setByteElement(term59979, 87, (byte) 2);
        setByteElement(term59979, 88, (byte) 2);
        setByteElement(term59979, 89, (byte) 2);
        setByteElement(term59979, 90, (byte) 2);
        setByteElement(term59979, 91, (byte) 2);
        setByteElement(term59979, 92, (byte) 2);
        setByteElement(term59979, 93, (byte) 2);
        setByteElement(term59979, 94, (byte) 2);
        setByteElement(term59979, 95, (byte) 2);
        setByteElement(term59979, 96, (byte) 2);
        setByteElement(term59979, 97, (byte) 2);
        setByteElement(term59979, 98, (byte) 2);
        setByteElement(term59979, 99, (byte) 2);
        setByteElement(term59979, 100, (byte) 2);
        setByteElement(term59979, 101, (byte) 2);
        setByteElement(term59979, 102, (byte) 2);
        setByteElement(term59979, 103, (byte) 2);
        setByteElement(term59979, 104, (byte) 2);
        setByteElement(term59979, 105, (byte) 2);
        setByteElement(term59979, 106, (byte) 2);
        setByteElement(term59979, 107, (byte) 2);
        setByteElement(term59979, 108, (byte) 2);
        setByteElement(term59979, 109, (byte) 2);
        setByteElement(term59979, 110, (byte) 2);
        setByteElement(term59979, 111, (byte) 2);
        setByteElement(term59979, 112, (byte) 2);
        setByteElement(term59979, 113, (byte) 2);
        setByteElement(term59979, 114, (byte) 2);
        setByteElement(term59979, 115, (byte) 2);
        setByteElement(term59979, 116, (byte) 2);
        setByteElement(term59979, 117, (byte) 2);
        setByteElement(term59979, 118, (byte) 2);
        setByteElement(term59979, 119, (byte) 2);
        setByteElement(term59979, 120, (byte) 2);
        setByteElement(term59979, 121, (byte) 2);
        setByteElement(term59979, 122, (byte) 2);
        setByteElement(term59979, 123, (byte) 2);
        setByteElement(term59979, 124, (byte) 2);
        setByteElement(term59979, 125, (byte) 2);
        setByteElement(term59979, 126, (byte) 2);
        setByteElement(term59979, 127, (byte) 2);
        setByteElement(term59979, 128, (byte) 2);
        setByteElement(term59979, 129, (byte) 2);
        setByteElement(term59979, 130, (byte) 2);
        setByteElement(term59979, 131, (byte) 2);
        setByteElement(term59979, 132, (byte) 2);
        setByteElement(term59979, 133, (byte) 2);
        setByteElement(term59979, 134, (byte) 2);
        setByteElement(term59979, 135, (byte) 2);
        setElement(term59978, 0, term59979);
        setElement(term59978, 1, term68264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term59978;
        callMethod(klass, "format", argTypes, term68008, args);
    }

};



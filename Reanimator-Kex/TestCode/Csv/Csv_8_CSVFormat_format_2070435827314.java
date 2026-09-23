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
import java.lang.Character;
import java.lang.Object;
import java.lang.String;

public class CSVFormat_format_2070435827314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193748;
     Object term192770;

    public CSVFormat_format_2070435827314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term193800 = new Character((char) 2);
        Character term193852 = new Character((char) 256);
        Character term193904 = new Character((char) 0);
        Class<? extends Object> term194060 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term194059 = ((Class) term194060).getDeclaredField((String) "ALL");
        ((Field) term194059).setAccessible(true);
        Object enum333 = ((Field) term194059).get((Object) null);
        term193748 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term193012 = (Object[]) newArray("java.lang.String", 0);
        setField(term193748, term193748.getClass(), "quoteChar", term193800);
        setCharField(term193748, term193748.getClass(), "delimiter", (char) 65532);
        setField(term193748, term193748.getClass(), "escape", term193852);
        setField(term193748, term193748.getClass(), "commentStart", term193904);
        setField(term193748, term193748.getClass(), "header", term193012);
        setField(term193748, term193748.getClass(), "quotePolicy", enum333);
        term192770 = (Object[]) newArray("java.lang.String", 256);
        int[] term192771 = (int[]) newIntArray(128);
        Object term194058 = newInstance(Class.forName("java.io.DeleteOnExitHook"));
        setIntElement(term192771, 0, 4);
        setIntElement(term192771, 1, 4194304);
        setIntElement(term192771, 2, 4194304);
        setIntElement(term192771, 3, 4194304);
        setIntElement(term192771, 4, 4194304);
        setIntElement(term192771, 5, 4194304);
        setIntElement(term192771, 6, 4194304);
        setIntElement(term192771, 7, 4194304);
        setIntElement(term192771, 8, 4194304);
        setIntElement(term192771, 9, 4194304);
        setIntElement(term192771, 10, 4194304);
        setIntElement(term192771, 11, 4194304);
        setIntElement(term192771, 12, 4194304);
        setIntElement(term192771, 13, 4194304);
        setIntElement(term192771, 14, 4194304);
        setIntElement(term192771, 15, 4194304);
        setIntElement(term192771, 16, 4194304);
        setIntElement(term192771, 17, 4194304);
        setIntElement(term192771, 18, 4194304);
        setIntElement(term192771, 19, 4194304);
        setIntElement(term192771, 20, 4194304);
        setIntElement(term192771, 21, 4194304);
        setIntElement(term192771, 22, 4194304);
        setIntElement(term192771, 23, 4194304);
        setIntElement(term192771, 24, 4194304);
        setIntElement(term192771, 25, 4194304);
        setIntElement(term192771, 26, 4194304);
        setIntElement(term192771, 27, 4194304);
        setIntElement(term192771, 28, 4194304);
        setIntElement(term192771, 29, 4194304);
        setIntElement(term192771, 30, 4194304);
        setIntElement(term192771, 31, 4194304);
        setIntElement(term192771, 32, 4194304);
        setIntElement(term192771, 33, 4194304);
        setIntElement(term192771, 34, 4194304);
        setIntElement(term192771, 35, 4194304);
        setIntElement(term192771, 36, 4194304);
        setIntElement(term192771, 37, 4194304);
        setIntElement(term192771, 38, 4194304);
        setIntElement(term192771, 39, 4194304);
        setIntElement(term192771, 40, 4194304);
        setIntElement(term192771, 41, 4194304);
        setIntElement(term192771, 42, 4194304);
        setIntElement(term192771, 43, 4194304);
        setIntElement(term192771, 44, 4194304);
        setIntElement(term192771, 45, 4194304);
        setIntElement(term192771, 46, 4194304);
        setIntElement(term192771, 47, 4194304);
        setIntElement(term192771, 48, 4194304);
        setIntElement(term192771, 49, 4194304);
        setIntElement(term192771, 50, 4194304);
        setIntElement(term192771, 51, 4194304);
        setIntElement(term192771, 52, 4194304);
        setIntElement(term192771, 53, 4194304);
        setIntElement(term192771, 54, 4194304);
        setIntElement(term192771, 55, 4194304);
        setIntElement(term192771, 56, 4194304);
        setIntElement(term192771, 57, 4194304);
        setIntElement(term192771, 58, 4194304);
        setIntElement(term192771, 59, 4194304);
        setIntElement(term192771, 60, 4194304);
        setIntElement(term192771, 61, 4194304);
        setIntElement(term192771, 62, 4194304);
        setIntElement(term192771, 63, 4194304);
        setIntElement(term192771, 64, 4194304);
        setIntElement(term192771, 65, 4194304);
        setIntElement(term192771, 66, 4194304);
        setIntElement(term192771, 67, 4194304);
        setIntElement(term192771, 68, 4194304);
        setIntElement(term192771, 69, 4194304);
        setIntElement(term192771, 70, 4194304);
        setIntElement(term192771, 71, 4194304);
        setIntElement(term192771, 72, 4194304);
        setIntElement(term192771, 73, 4194304);
        setIntElement(term192771, 74, 4194304);
        setIntElement(term192771, 75, 4194304);
        setIntElement(term192771, 76, 4194304);
        setIntElement(term192771, 77, 4194304);
        setIntElement(term192771, 78, 4194304);
        setIntElement(term192771, 79, 4194304);
        setIntElement(term192771, 80, 4194304);
        setIntElement(term192771, 81, 4194304);
        setIntElement(term192771, 82, 4194304);
        setIntElement(term192771, 83, 4194304);
        setIntElement(term192771, 84, 4194304);
        setIntElement(term192771, 85, 4194304);
        setIntElement(term192771, 86, 4194304);
        setIntElement(term192771, 87, 4194304);
        setIntElement(term192771, 88, 4194304);
        setIntElement(term192771, 89, 4194304);
        setIntElement(term192771, 90, 4194304);
        setIntElement(term192771, 91, 4194304);
        setIntElement(term192771, 92, 4194304);
        setIntElement(term192771, 93, 4194304);
        setIntElement(term192771, 94, 4194304);
        setIntElement(term192771, 95, 4194304);
        setIntElement(term192771, 96, 4194304);
        setIntElement(term192771, 97, 4194304);
        setIntElement(term192771, 98, 4194304);
        setIntElement(term192771, 99, 4194304);
        setIntElement(term192771, 100, 4194304);
        setIntElement(term192771, 101, 4194304);
        setIntElement(term192771, 102, 4194304);
        setIntElement(term192771, 103, 4194304);
        setIntElement(term192771, 104, 4194304);
        setIntElement(term192771, 105, 4194304);
        setIntElement(term192771, 106, 4194304);
        setIntElement(term192771, 107, 4194304);
        setIntElement(term192771, 108, 4194304);
        setIntElement(term192771, 109, 4194304);
        setIntElement(term192771, 110, 4194304);
        setIntElement(term192771, 111, 4194304);
        setIntElement(term192771, 112, 4194304);
        setIntElement(term192771, 113, 4194304);
        setIntElement(term192771, 114, 4194304);
        setIntElement(term192771, 115, 4194304);
        setIntElement(term192771, 116, 4194304);
        setIntElement(term192771, 117, 4194304);
        setIntElement(term192771, 118, 4194304);
        setIntElement(term192771, 119, 4194304);
        setIntElement(term192771, 120, 4194304);
        setIntElement(term192771, 121, 4194304);
        setIntElement(term192771, 122, 4194304);
        setIntElement(term192771, 123, 4194304);
        setIntElement(term192771, 124, 4194304);
        setIntElement(term192771, 125, 4194304);
        setIntElement(term192771, 126, 4194304);
        setIntElement(term192771, 127, 4194304);
        setElement(term192770, 0, term192771);
        setElement(term192770, 1, term194058);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term192770;
        callMethod(klass, "format", argTypes, term193748, args);
    }

};



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

public class CSVFormat_format_2070435827328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208448;
     Object term206833;
     Object term209484;
     Object term209492;

    public CSVFormat_format_2070435827328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term208500 = new Character((char) 128);
        Character term208552 = new Character((char) 4096);
        Character term208604 = new Character((char) 0);
        Class<? extends Object> term209499 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term209498 = ((Class) term209499).getDeclaredField((String) "ALL");
        ((Field) term209498).setAccessible(true);
        Object enum348 = ((Field) term209498).get((Object) null);
        term208448 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term206924 = (Object[]) newArray("java.lang.String", 0);
        setField(term208448, term208448.getClass(), "quoteChar", term208500);
        setCharField(term208448, term208448.getClass(), "delimiter", (char) 48);
        setField(term208448, term208448.getClass(), "escape", term208552);
        setField(term208448, term208448.getClass(), "commentStart", term208604);
        setField(term208448, term208448.getClass(), "header", term206924);
        setField(term208448, term208448.getClass(), "quotePolicy", enum348);
        term206833 = (Object[]) newArray("java.lang.Object", 3);
        int[] term206834 = (int[]) newIntArray(0);
        setElement(term206833, 0, term206834);
        setElement(term206833, 1, "");
        setElement(term206833, 2, "");
        Character term209485 = new Character((char) 128);
        Class<? extends Object> term209655 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term209654 = ((Class) term209655).getDeclaredField((String) "ALL");
        ((Field) term209654).setAccessible(true);
        Object enum349 = ((Field) term209654).get((Object) null);
        Character term209489 = new Character((char) 0);
        Character term209490 = new Character((char) 4096);
        term209484 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term209491 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term209484, term209484.getClass(), "delimiter", (char) 48);
        setField(term209484, term209484.getClass(), "quoteChar", term209485);
        setField(term209484, term209484.getClass(), "quotePolicy", enum349);
        setField(term209484, term209484.getClass(), "commentStart", term209489);
        setField(term209484, term209484.getClass(), "escape", term209490);
        setBooleanField(term209484, term209484.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term209484, term209484.getClass(), "ignoreEmptyLines", false);
        setField(term209484, term209484.getClass(), "recordSeparator", null);
        setField(term209484, term209484.getClass(), "nullString", null);
        setField(term209484, term209484.getClass(), "header", term209491);
        setBooleanField(term209484, term209484.getClass(), "skipHeaderRecord", false);
        term209492 = (Object[]) newArray("java.lang.Object", 3);
        int[] term209493 = (int[]) newIntArray(0);
        setElement(term209492, 0, term209493);
        setElement(term209492, 1, "");
        setElement(term209492, 2, "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term206833;
        Object retValue = callMethod(klass, "format", argTypes, term208448, args);
        assertTrue(recursiveEquals(term208448, term209484));
        assertTrue(recursiveEquals(term206833, term209492));
        assertTrue(recursiveEquals(retValue, "\uFF80[I@7d24c776\uFF800\uFF80\uFF800\uFF80\uFF80"));
    }

};



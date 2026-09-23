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
import java.lang.NullPointerException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Character;
import java.lang.String;

public class CSVPrinter_printRecord_2092483930297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term353264;
     Object term350053;

    public CSVPrinter_printRecord_2092483930297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term353386 = new Character((char) 256);
        Class<? extends Object> term354346 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term354345 = ((Class) term354346).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term354345).setAccessible(true);
        Object enum258 = ((Field) term354345).get((Object) null);
        term353264 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term353334 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term353264, term353264.getClass(), "newRecord", true);
        setField(term353334, term353334.getClass(), "quoteChar", term353386);
        setCharField(term353334, term353334.getClass(), "delimiter", (char) 512);
        setField(term353334, term353334.getClass(), "quotePolicy", enum258);
        setField(term353264, term353264.getClass(), "format", term353334);
        Class<? extends Object> term354526 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term354525 = ((Class) term354526).getDeclaredField((String) "ALL");
        ((Field) term354525).setAccessible(true);
        Object enum259 = ((Field) term354525).get((Object) null);
        term350053 = (Object[]) newArray("java.lang.Object", 2);
        Object term353558 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term350053, 0, term353558);
        setElement(term350053, 1, enum259);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term350053;
        try {
            callMethod(klass, "printRecord", argTypes, term353264, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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
import java.nio.BufferOverflowException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Character;
import java.lang.String;

public class CSVPrinter_printRecord_2092483930225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314396;
     Object term314187;

    public CSVPrinter_printRecord_2092483930225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term314518 = new Character((char) 0);
        Class<? extends Object> term315743 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term315742 = ((Class) term315743).getDeclaredField((String) "MINIMAL");
        ((Field) term315742).setAccessible(true);
        Object enum205 = ((Field) term315742).get((Object) null);
        term314396 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term314466 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object term314688 = newInstance(Class.forName("java.nio.ByteBufferAsCharBufferL"));
        setBooleanField(term314396, term314396.getClass(), "newRecord", true);
        setField(term314466, term314466.getClass(), "quoteChar", term314518);
        setCharField(term314466, term314466.getClass(), "delimiter", (char) 0);
        setField(term314466, term314466.getClass(), "quotePolicy", enum205);
        setField(term314396, term314396.getClass(), "format", term314466);
        setField(term314396, term314396.getClass(), "out", term314688);
        Class<? extends Object> term315911 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term315910 = ((Class) term315911).getDeclaredField((String) "ALL");
        ((Field) term315910).setAccessible(true);
        Object enum206 = ((Field) term315910).get((Object) null);
        term314187 = (Object[]) newArray("java.lang.Object", 2);
        Object term314760 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term314187, 0, term314760);
        setElement(term314187, 1, enum206);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term314187;
        try {
            callMethod(klass, "printRecord", argTypes, term314396, args);
            assertTrue(false);
        }
        catch (BufferOverflowException e) {
        }

    }

};



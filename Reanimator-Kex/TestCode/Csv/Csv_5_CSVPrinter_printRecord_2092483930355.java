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

public class CSVPrinter_printRecord_2092483930355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1007161;
     Object term1006939;

    public CSVPrinter_printRecord_2092483930355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1007283 = new Character((char) 0);
        Class<? extends Object> term1007895 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term1007894 = ((Class) term1007895).getDeclaredField((String) "NONE");
        ((Field) term1007894).setAccessible(true);
        Object enum347 = ((Field) term1007894).get((Object) null);
        term1007161 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term1007231 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term1007161, term1007161.getClass(), "newRecord", true);
        setField(term1007231, term1007231.getClass(), "quoteChar", term1007283);
        setCharField(term1007231, term1007231.getClass(), "delimiter", (char) 0);
        setField(term1007231, term1007231.getClass(), "quotePolicy", enum347);
        setField(term1007161, term1007161.getClass(), "format", term1007231);
        term1006939 = (Object[]) newArray("java.lang.Object", 1);
        byte[] term1006940 = (byte[]) newByteArray(0);
        setElement(term1006939, 0, term1006940);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1006939;
        try {
            callMethod(klass, "printRecord", argTypes, term1007161, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



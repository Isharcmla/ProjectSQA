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

public class CSVPrinter_printRecord_209248393077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32390;
     Object term32192;

    public CSVPrinter_printRecord_209248393077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term32512 = new Character((char) 0);
        Class<? extends Object> term33122 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term33121 = ((Class) term33122).getDeclaredField((String) "NONE");
        ((Field) term33121).setAccessible(true);
        Object enum52 = ((Field) term33121).get((Object) null);
        term32390 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term32460 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term32390, term32390.getClass(), "newRecord", true);
        setField(term32460, term32460.getClass(), "quoteChar", term32512);
        setCharField(term32460, term32460.getClass(), "delimiter", (char) 0);
        setField(term32460, term32460.getClass(), "quotePolicy", enum52);
        setField(term32390, term32390.getClass(), "format", term32460);
        term32192 = (Object[]) newArray("java.lang.Object", 1);
        byte[] term32193 = (byte[]) newByteArray(0);
        setElement(term32192, 0, term32193);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term32192;
        try {
            callMethod(klass, "printRecord", argTypes, term32390, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class CSVPrinter_printRecords_1035483741137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113056;
     Object term112236;

    public CSVPrinter_printRecords_1035483741137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term113178 = new Character((char) 0);
        Class<? extends Object> term113922 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term113921 = ((Class) term113922).getDeclaredField((String) "ALL");
        ((Field) term113921).setAccessible(true);
        Object enum114 = ((Field) term113921).get((Object) null);
        term113056 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term113126 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object term113338 = newInstance(Class.forName("java.nio.HeapCharBuffer"));
        setBooleanField(term113056, term113056.getClass(), "newRecord", true);
        setField(term113126, term113126.getClass(), "quoteCharacter", term113178);
        setCharField(term113126, term113126.getClass(), "delimiter", (char) 0);
        setField(term113126, term113126.getClass(), "quoteMode", enum114);
        setField(term113056, term113056.getClass(), "format", term113126);
        setField(term113056, term113056.getClass(), "out", term113338);
        term112236 = (Object[]) newArray("java.lang.Object", 1);
        Object term113410 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term112236, 0, term113410);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term112236;
        try {
            callMethod(klass, "printRecords", argTypes, term113056, args);
            assertTrue(false);
        }
        catch (BufferOverflowException e) {
        }

    }

};



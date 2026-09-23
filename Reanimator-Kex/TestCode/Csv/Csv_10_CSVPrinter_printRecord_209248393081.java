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

public class CSVPrinter_printRecord_209248393081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32773;
     Object term32539;

    public CSVPrinter_printRecord_209248393081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term32895 = new Character('d');
        Class<? extends Object> term33470 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term33469 = ((Class) term33470).getDeclaredField((String) "ALL");
        ((Field) term33469).setAccessible(true);
        Object enum52 = ((Field) term33469).get((Object) null);
        term32773 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term32843 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term32773, term32773.getClass(), "newRecord", true);
        setField(term32843, term32843.getClass(), "quoteChar", term32895);
        setCharField(term32843, term32843.getClass(), "delimiter", (char) 0);
        setField(term32843, term32843.getClass(), "quotePolicy", enum52);
        setField(term32773, term32773.getClass(), "format", term32843);
        term32539 = (Object[]) newArray("java.lang.Object", 1);
        int[] term32540 = (int[]) newIntArray(0);
        setElement(term32539, 0, term32540);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term32539;
        try {
            callMethod(klass, "printRecord", argTypes, term32773, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class CSVPrinter_printRecord_209248393054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21500;
     Object term20778;

    public CSVPrinter_printRecord_209248393054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term21622 = new Character((char) 0);
        Class<? extends Object> term22495 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term22494 = ((Class) term22495).getDeclaredField((String) "ALL");
        ((Field) term22494).setAccessible(true);
        Object enum40 = ((Field) term22494).get((Object) null);
        term21500 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term21570 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term21500, term21500.getClass(), "newRecord", true);
        setField(term21570, term21570.getClass(), "quoteChar", term21622);
        setCharField(term21570, term21570.getClass(), "delimiter", (char) 0);
        setField(term21570, term21570.getClass(), "quotePolicy", enum40);
        setField(term21500, term21500.getClass(), "format", term21570);
        term20778 = (Object[]) newArray("java.lang.Object", 1);
        byte[] term20779 = (byte[]) newByteArray(0);
        setElement(term20778, 0, term20779);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term20778;
        try {
            callMethod(klass, "printRecord", argTypes, term21500, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



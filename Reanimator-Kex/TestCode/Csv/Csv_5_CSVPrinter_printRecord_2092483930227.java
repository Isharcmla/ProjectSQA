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

public class CSVPrinter_printRecord_2092483930227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316392;
     Object term316075;

    public CSVPrinter_printRecord_2092483930227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term316514 = new Character((char) 32);
        Class<? extends Object> term317139 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term317138 = ((Class) term317139).getDeclaredField((String) "ALL");
        ((Field) term317138).setAccessible(true);
        Object enum208 = ((Field) term317138).get((Object) null);
        term316392 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term316462 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term316392, term316392.getClass(), "newRecord", true);
        setField(term316462, term316462.getClass(), "quoteChar", term316514);
        setCharField(term316462, term316462.getClass(), "delimiter", (char) 0);
        setField(term316462, term316462.getClass(), "quotePolicy", enum208);
        setField(term316392, term316392.getClass(), "format", term316462);
        term316075 = (Object[]) newArray("java.lang.Object", 1);
        setElement(term316075, 0, enum208);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term316075;
        try {
            callMethod(klass, "printRecord", argTypes, term316392, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



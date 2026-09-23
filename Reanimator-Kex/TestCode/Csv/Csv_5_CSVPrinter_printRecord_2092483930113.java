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

public class CSVPrinter_printRecord_2092483930113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67484;
     Object term67018;

    public CSVPrinter_printRecord_2092483930113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term67606 = new Character((char) 16384);
        Class<? extends Object> term68352 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term68351 = ((Class) term68352).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term68351).setAccessible(true);
        Object enum82 = ((Field) term68351).get((Object) null);
        term67484 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term67554 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term67484, term67484.getClass(), "newRecord", true);
        setField(term67554, term67554.getClass(), "quoteChar", term67606);
        setCharField(term67554, term67554.getClass(), "delimiter", (char) 8192);
        setField(term67554, term67554.getClass(), "quotePolicy", enum82);
        setField(term67484, term67484.getClass(), "format", term67554);
        term67018 = (Object[]) newArray("java.lang.Object", 2);
        Object term67782 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        Object term67820 = newInstance(Class.forName("java.lang.Object"));
        setElement(term67018, 0, term67782);
        setElement(term67018, 1, term67820);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term67018;
        try {
            callMethod(klass, "printRecord", argTypes, term67484, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



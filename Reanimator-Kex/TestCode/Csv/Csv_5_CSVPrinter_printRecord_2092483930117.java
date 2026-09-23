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

public class CSVPrinter_printRecord_2092483930117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73103;
     Object term70737;

    public CSVPrinter_printRecord_2092483930117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term73225 = new Character((char) 32768);
        Class<? extends Object> term74169 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term74168 = ((Class) term74169).getDeclaredField((String) "MINIMAL");
        ((Field) term74168).setAccessible(true);
        Object enum86 = ((Field) term74168).get((Object) null);
        term73103 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term73173 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term73103, term73103.getClass(), "newRecord", true);
        setField(term73173, term73173.getClass(), "quoteChar", term73225);
        setCharField(term73173, term73173.getClass(), "delimiter", (char) 2);
        setField(term73173, term73173.getClass(), "quotePolicy", enum86);
        setField(term73103, term73103.getClass(), "format", term73173);
        term70737 = (Object[]) newArray("java.lang.Object", 2);
        Object term73401 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        Object term73439 = newInstance(Class.forName("java.lang.Object"));
        setElement(term70737, 0, term73401);
        setElement(term70737, 1, term73439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term70737;
        try {
            callMethod(klass, "printRecord", argTypes, term73103, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



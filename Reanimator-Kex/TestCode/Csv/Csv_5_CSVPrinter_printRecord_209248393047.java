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

public class CSVPrinter_printRecord_209248393047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17524;
     Object term17332;

    public CSVPrinter_printRecord_209248393047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term17646 = new Character((char) 0);
        Class<? extends Object> term18960 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term18959 = ((Class) term18960).getDeclaredField((String) "ALL");
        ((Field) term18959).setAccessible(true);
        Object enum36 = ((Field) term18959).get((Object) null);
        term17524 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term17594 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term17524, term17524.getClass(), "newRecord", true);
        setField(term17594, term17594.getClass(), "quoteChar", term17646);
        setCharField(term17594, term17594.getClass(), "delimiter", (char) 0);
        setField(term17594, term17594.getClass(), "quotePolicy", enum36);
        setField(term17524, term17524.getClass(), "format", term17594);
        term17332 = (Object[]) newArray("java.lang.Object", 128);
        Object term17822 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        Object term17910 = newInstance(Class.forName("java.lang.Object"));
        Object term17948 = newInstance(Class.forName("java.lang.Object"));
        setElement(term17332, 0, term17822);
        setElement(term17332, 4, enum36);
        setElement(term17332, 8, term17910);
        setElement(term17332, 32, term17948);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term17332;
        try {
            callMethod(klass, "printRecord", argTypes, term17524, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class CSVPrinter_printRecord_2092483930185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203389;
     Object term201728;

    public CSVPrinter_printRecord_2092483930185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term203511 = new Character((char) 8192);
        Class<? extends Object> term204475 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term204474 = ((Class) term204475).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term204474).setAccessible(true);
        Object enum161 = ((Field) term204474).get((Object) null);
        term203389 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term203459 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term203389, term203389.getClass(), "newRecord", true);
        setField(term203459, term203459.getClass(), "quoteChar", term203511);
        setCharField(term203459, term203459.getClass(), "delimiter", (char) 55295);
        setField(term203459, term203459.getClass(), "quotePolicy", enum161);
        setField(term203389, term203389.getClass(), "format", term203459);
        Class<? extends Object> term204655 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term204654 = ((Class) term204655).getDeclaredField((String) "ALL");
        ((Field) term204654).setAccessible(true);
        Object enum162 = ((Field) term204654).get((Object) null);
        term201728 = (Object[]) newArray("java.lang.Object", 2);
        Object term203687 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term201728, 0, term203687);
        setElement(term201728, 1, enum162);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term201728;
        try {
            callMethod(klass, "printRecord", argTypes, term203389, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



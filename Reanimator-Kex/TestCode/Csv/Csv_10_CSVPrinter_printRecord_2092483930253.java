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

public class CSVPrinter_printRecord_2092483930253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290064;
     Object term287842;

    public CSVPrinter_printRecord_2092483930253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term290125 = new Character((char) 8210);
        Class<? extends Object> term290650 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term290649 = ((Class) term290650).getDeclaredField((String) "ALL");
        ((Field) term290649).setAccessible(true);
        Object enum213 = ((Field) term290649).get((Object) null);
        term290064 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term290099 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term290064, term290064.getClass(), "newRecord", true);
        setField(term290099, term290099.getClass(), "quoteChar", term290125);
        setCharField(term290099, term290099.getClass(), "delimiter", (char) 8192);
        setField(term290099, term290099.getClass(), "quotePolicy", enum213);
        setField(term290064, term290064.getClass(), "format", term290099);
        term287842 = (Object[]) newArray("java.lang.Object", 1);
        setElement(term287842, 0, term290064);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term287842;
        try {
            callMethod(klass, "printRecord", argTypes, term290064, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



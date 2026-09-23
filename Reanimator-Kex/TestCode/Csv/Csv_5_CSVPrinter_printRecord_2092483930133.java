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

public class CSVPrinter_printRecord_2092483930133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118241;
     Object term113807;

    public CSVPrinter_printRecord_2092483930133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term118363 = new Character((char) 16);
        Class<? extends Object> term119489 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term119488 = ((Class) term119489).getDeclaredField((String) "MINIMAL");
        ((Field) term119488).setAccessible(true);
        Object enum105 = ((Field) term119488).get((Object) null);
        term118241 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term118311 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term118241, term118241.getClass(), "newRecord", true);
        setField(term118311, term118311.getClass(), "quoteChar", term118363);
        setCharField(term118311, term118311.getClass(), "delimiter", (char) 64);
        setField(term118311, term118311.getClass(), "quotePolicy", enum105);
        setField(term118241, term118241.getClass(), "format", term118311);
        Class<? extends Object> term119657 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term119656 = ((Class) term119657).getDeclaredField((String) "ALL");
        ((Field) term119656).setAccessible(true);
        Object enum106 = ((Field) term119656).get((Object) null);
        term113807 = (Object[]) newArray("java.lang.Object", 2);
        Object term118539 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term113807, 0, term118539);
        setElement(term113807, 1, enum106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term113807;
        try {
            callMethod(klass, "printRecord", argTypes, term118241, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class CSVPrinter_printRecord_209248393095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44898;
     Object term44192;

    public CSVPrinter_printRecord_209248393095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term45020 = new Character((char) 0);
        Class<? extends Object> term45669 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term45668 = ((Class) term45669).getDeclaredField((String) "ALL");
        ((Field) term45668).setAccessible(true);
        Object enum66 = ((Field) term45668).get((Object) null);
        term44898 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term44968 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term44898, term44898.getClass(), "newRecord", true);
        setField(term44968, term44968.getClass(), "quoteChar", term45020);
        setCharField(term44968, term44968.getClass(), "delimiter", (char) 0);
        setField(term44968, term44968.getClass(), "quotePolicy", enum66);
        setField(term44898, term44898.getClass(), "format", term44968);
        term44192 = (Object[]) newArray("java.lang.Object", 1);
        Object term45196 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term44192, 0, term45196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term44192;
        try {
            callMethod(klass, "printRecord", argTypes, term44898, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



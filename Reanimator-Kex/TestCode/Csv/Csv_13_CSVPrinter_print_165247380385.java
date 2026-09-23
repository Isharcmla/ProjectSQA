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
import java.lang.Long;

public class CSVPrinter_print_165247380385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62492;
     Object term62814;

    public CSVPrinter_print_165247380385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term62614 = new Character((char) 0);
        Class<? extends Object> term63318 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term63317 = ((Class) term63318).getDeclaredField((String) "ALL");
        ((Field) term63317).setAccessible(true);
        Object enum74 = ((Field) term63317).get((Object) null);
        term62492 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term62562 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object term62772 = newInstance(Class.forName("java.io.BufferedWriter"));
        setBooleanField(term62492, term62492.getClass(), "newRecord", true);
        setField(term62562, term62562.getClass(), "quoteCharacter", term62614);
        setCharField(term62562, term62562.getClass(), "delimiter", (char) 0);
        setField(term62562, term62562.getClass(), "quoteMode", enum74);
        setField(term62492, term62492.getClass(), "format", term62562);
        setField(term62492, term62492.getClass(), "out", term62772);
        term62814 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term62814;
        try {
            callMethod(klass, "print", argTypes, term62492, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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
     Object term51405;
     Object term50957;

    public CSVPrinter_printRecord_2092483930113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term51527 = new Character((char) 16);
        Class<? extends Object> term52278 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term52277 = ((Class) term52278).getDeclaredField((String) "NONE");
        ((Field) term52277).setAccessible(true);
        Object enum76 = ((Field) term52277).get((Object) null);
        term51405 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term51475 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term51405, term51405.getClass(), "newRecord", true);
        setField(term51475, term51475.getClass(), "quoteChar", term51527);
        setCharField(term51475, term51475.getClass(), "delimiter", (char) 2);
        setField(term51475, term51475.getClass(), "quotePolicy", enum76);
        setField(term51405, term51405.getClass(), "format", term51475);
        term50957 = (Object[]) newArray("java.lang.Object", 1);
        Object term51699 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term50957, 0, term51699);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term50957;
        try {
            callMethod(klass, "printRecord", argTypes, term51405, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



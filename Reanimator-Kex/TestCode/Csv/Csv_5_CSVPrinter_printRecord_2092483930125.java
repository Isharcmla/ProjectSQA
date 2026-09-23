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

public class CSVPrinter_printRecord_2092483930125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95711;
     Object term92877;

    public CSVPrinter_printRecord_2092483930125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term95833 = new Character((char) 16);
        Class<? extends Object> term96533 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term96532 = ((Class) term96533).getDeclaredField((String) "ALL");
        ((Field) term96532).setAccessible(true);
        Object enum96 = ((Field) term96532).get((Object) null);
        term95711 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term95781 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term95711, term95711.getClass(), "newRecord", true);
        setField(term95781, term95781.getClass(), "quoteChar", term95833);
        setCharField(term95781, term95781.getClass(), "delimiter", (char) 0);
        setField(term95781, term95781.getClass(), "quotePolicy", enum96);
        setField(term95711, term95711.getClass(), "format", term95781);
        term92877 = (Object[]) newArray("java.lang.Object", 1);
        Object term96009 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term92877, 0, term96009);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term92877;
        try {
            callMethod(klass, "printRecord", argTypes, term95711, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



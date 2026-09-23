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

public class CSVPrinter_printRecord_2092483930231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331237;
     Object term330016;

    public CSVPrinter_printRecord_2092483930231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term331359 = new Character((char) 65375);
        Class<? extends Object> term332048 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term332047 = ((Class) term332048).getDeclaredField((String) "ALL");
        ((Field) term332047).setAccessible(true);
        Object enum212 = ((Field) term332047).get((Object) null);
        term331237 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term331307 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term331237, term331237.getClass(), "newRecord", true);
        setField(term331307, term331307.getClass(), "quoteChar", term331359);
        setCharField(term331307, term331307.getClass(), "delimiter", (char) 4096);
        setField(term331307, term331307.getClass(), "quotePolicy", enum212);
        setField(term331237, term331237.getClass(), "format", term331307);
        term330016 = (Object[]) newArray("java.lang.Object", 2);
        Object term331535 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        Object term331573 = newInstance(Class.forName("java.lang.Object"));
        setElement(term330016, 0, term331535);
        setElement(term330016, 1, term331573);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term330016;
        try {
            callMethod(klass, "printRecord", argTypes, term331237, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



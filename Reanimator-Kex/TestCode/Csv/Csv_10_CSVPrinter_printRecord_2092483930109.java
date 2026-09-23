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

public class CSVPrinter_printRecord_2092483930109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48535;
     Object term48306;

    public CSVPrinter_printRecord_2092483930109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term48657 = new Character((char) 0);
        Class<? extends Object> term49574 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term49573 = ((Class) term49574).getDeclaredField((String) "NONE");
        ((Field) term49573).setAccessible(true);
        Object enum71 = ((Field) term49573).get((Object) null);
        term48535 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term48605 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term48535, term48535.getClass(), "newRecord", true);
        setField(term48605, term48605.getClass(), "quoteChar", term48657);
        setCharField(term48605, term48605.getClass(), "delimiter", (char) 0);
        setField(term48605, term48605.getClass(), "quotePolicy", enum71);
        setField(term48535, term48535.getClass(), "format", term48605);
        Class<? extends Object> term49733 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term49732 = ((Class) term49733).getDeclaredField((String) "ALL");
        ((Field) term49732).setAccessible(true);
        Object enum72 = ((Field) term49732).get((Object) null);
        term48306 = (Object[]) newArray("java.lang.Object", 2);
        setElement(term48306, 0, "");
        setElement(term48306, 1, enum72);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term48306;
        try {
            callMethod(klass, "printRecord", argTypes, term48535, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class CSVPrinter_printRecord_2092483930279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term862011;
     Object term861395;

    public CSVPrinter_printRecord_2092483930279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term862133 = new Character((char) 1);
        Class<? extends Object> term862817 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term862816 = ((Class) term862817).getDeclaredField((String) "NONE");
        ((Field) term862816).setAccessible(true);
        Object enum271 = ((Field) term862816).get((Object) null);
        term862011 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term862081 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term862011, term862011.getClass(), "newRecord", true);
        setField(term862081, term862081.getClass(), "quoteChar", term862133);
        setCharField(term862081, term862081.getClass(), "delimiter", (char) 64);
        setField(term862081, term862081.getClass(), "quotePolicy", enum271);
        setField(term862011, term862011.getClass(), "format", term862081);
        term861395 = (Object[]) newArray("java.lang.Object", 1);
        Object term862305 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term861395, 0, term862305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term861395;
        try {
            callMethod(klass, "printRecord", argTypes, term862011, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



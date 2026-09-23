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

public class CSVPrinter_printRecord_2092483930263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term301282;
     Object term298433;

    public CSVPrinter_printRecord_2092483930263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term301404 = new Character((char) 8);
        Class<? extends Object> term302088 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term302087 = ((Class) term302088).getDeclaredField((String) "NONE");
        ((Field) term302087).setAccessible(true);
        Object enum223 = ((Field) term302087).get((Object) null);
        term301282 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term301352 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term301282, term301282.getClass(), "newRecord", true);
        setField(term301352, term301352.getClass(), "quoteChar", term301404);
        setCharField(term301352, term301352.getClass(), "delimiter", (char) 16384);
        setField(term301352, term301352.getClass(), "quotePolicy", enum223);
        setField(term301282, term301282.getClass(), "format", term301352);
        term298433 = (Object[]) newArray("java.lang.Object", 1);
        Object term301576 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term298433, 0, term301576);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term298433;
        try {
            callMethod(klass, "printRecord", argTypes, term301282, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



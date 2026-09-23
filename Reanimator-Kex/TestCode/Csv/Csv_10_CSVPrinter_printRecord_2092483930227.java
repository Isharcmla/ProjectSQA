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

public class CSVPrinter_printRecord_2092483930227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237541;
     Object term237121;

    public CSVPrinter_printRecord_2092483930227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term237663 = new Character((char) 256);
        Class<? extends Object> term238367 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term238366 = ((Class) term238367).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term238366).setAccessible(true);
        Object enum187 = ((Field) term238366).get((Object) null);
        term237541 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term237611 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term237541, term237541.getClass(), "newRecord", true);
        setField(term237611, term237611.getClass(), "quoteChar", term237663);
        setCharField(term237611, term237611.getClass(), "delimiter", (char) 1024);
        setField(term237611, term237611.getClass(), "quotePolicy", enum187);
        setField(term237541, term237541.getClass(), "format", term237611);
        term237121 = (Object[]) newArray("java.lang.Object", 1);
        Object term237835 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term237121, 0, term237835);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term237121;
        try {
            callMethod(klass, "printRecord", argTypes, term237541, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



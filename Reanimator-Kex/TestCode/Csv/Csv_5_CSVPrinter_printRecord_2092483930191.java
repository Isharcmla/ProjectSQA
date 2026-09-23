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

public class CSVPrinter_printRecord_2092483930191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229416;
     Object term228842;

    public CSVPrinter_printRecord_2092483930191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term229538 = new Character((char) 4096);
        Class<? extends Object> term230246 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term230245 = ((Class) term230246).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term230245).setAccessible(true);
        Object enum168 = ((Field) term230245).get((Object) null);
        term229416 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term229486 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term229416, term229416.getClass(), "newRecord", true);
        setField(term229486, term229486.getClass(), "quoteChar", term229538);
        setCharField(term229486, term229486.getClass(), "delimiter", (char) 16);
        setField(term229486, term229486.getClass(), "quotePolicy", enum168);
        setField(term229416, term229416.getClass(), "format", term229486);
        term228842 = (Object[]) newArray("java.lang.Object", 1);
        Object term229714 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term228842, 0, term229714);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term228842;
        try {
            callMethod(klass, "printRecord", argTypes, term229416, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



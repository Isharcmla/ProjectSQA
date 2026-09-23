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

public class CSVPrinter_printRecord_2092483930107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58811;
     Object term58066;

    public CSVPrinter_printRecord_2092483930107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term58933 = new Character((char) 0);
        Class<? extends Object> term59633 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term59632 = ((Class) term59633).getDeclaredField((String) "ALL");
        ((Field) term59632).setAccessible(true);
        Object enum76 = ((Field) term59632).get((Object) null);
        term58811 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term58881 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term58811, term58811.getClass(), "newRecord", true);
        setField(term58881, term58881.getClass(), "quoteChar", term58933);
        setCharField(term58881, term58881.getClass(), "delimiter", (char) 0);
        setField(term58881, term58881.getClass(), "quotePolicy", enum76);
        setField(term58811, term58811.getClass(), "format", term58881);
        term58066 = (Object[]) newArray("java.lang.Object", 2);
        Object term59109 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term58066, 0, term59109);
        setElement(term58066, 1, "NON_NUMERIC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term58066;
        try {
            callMethod(klass, "printRecord", argTypes, term58811, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



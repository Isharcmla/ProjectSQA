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

public class CSVPrinter_printRecord_2092483930353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1005735;
     Object term1001769;

    public CSVPrinter_printRecord_2092483930353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1005857 = new Character((char) 0);
        Class<? extends Object> term1006611 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term1006610 = ((Class) term1006611).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term1006610).setAccessible(true);
        Object enum345 = ((Field) term1006610).get((Object) null);
        term1005735 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term1005805 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term1005735, term1005735.getClass(), "newRecord", true);
        setField(term1005805, term1005805.getClass(), "quoteChar", term1005857);
        setCharField(term1005805, term1005805.getClass(), "delimiter", (char) 0);
        setField(term1005805, term1005805.getClass(), "quotePolicy", enum345);
        setField(term1005805, term1005805.getClass(), "escape", term1005857);
        setField(term1005735, term1005735.getClass(), "format", term1005805);
        term1001769 = (Object[]) newArray("java.lang.Object", 2);
        Object term1006033 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        Object term1006071 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1001769, 0, term1006033);
        setElement(term1001769, 1, term1006071);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1001769;
        try {
            callMethod(klass, "printRecord", argTypes, term1005735, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



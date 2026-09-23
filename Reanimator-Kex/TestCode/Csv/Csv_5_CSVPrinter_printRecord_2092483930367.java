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

public class CSVPrinter_printRecord_2092483930367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1031336;
     Object term1028654;

    public CSVPrinter_printRecord_2092483930367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1031458 = new Character((char) 4096);
        Class<? extends Object> term1032369 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term1032368 = ((Class) term1032369).getDeclaredField((String) "MINIMAL");
        ((Field) term1032368).setAccessible(true);
        Object enum360 = ((Field) term1032368).get((Object) null);
        term1031336 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term1031406 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term1031336, term1031336.getClass(), "newRecord", true);
        setField(term1031406, term1031406.getClass(), "quoteChar", term1031458);
        setCharField(term1031406, term1031406.getClass(), "delimiter", (char) 1);
        setField(term1031406, term1031406.getClass(), "quotePolicy", enum360);
        setField(term1031336, term1031336.getClass(), "format", term1031406);
        term1028654 = (Object[]) newArray("java.lang.Object", 2);
        Object term1031634 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term1028654, 0, term1031634);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1028654;
        try {
            callMethod(klass, "printRecord", argTypes, term1031336, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



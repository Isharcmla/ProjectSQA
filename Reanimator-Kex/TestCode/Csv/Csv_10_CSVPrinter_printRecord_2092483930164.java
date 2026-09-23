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

public class CSVPrinter_printRecord_2092483930164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123450;
     Object term123151;

    public CSVPrinter_printRecord_2092483930164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term123572 = new Character((char) 0);
        Class<? extends Object> term124623 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term124622 = ((Class) term124623).getDeclaredField((String) "MINIMAL");
        ((Field) term124622).setAccessible(true);
        Object enum124 = ((Field) term124622).get((Object) null);
        term123450 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term123520 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term123450, term123450.getClass(), "newRecord", true);
        setField(term123520, term123520.getClass(), "quoteChar", term123572);
        setCharField(term123520, term123520.getClass(), "delimiter", (char) 0);
        setField(term123520, term123520.getClass(), "quotePolicy", enum124);
        setField(term123450, term123450.getClass(), "format", term123520);
        term123151 = (Object[]) newArray("java.lang.Object", 1);
        Object term123744 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term123151, 0, term123744);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term123151;
        try {
            callMethod(klass, "printRecord", argTypes, term123450, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



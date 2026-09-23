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

public class CSVPrinter_printRecord_2092483930315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term394776;
     Object term373368;

    public CSVPrinter_printRecord_2092483930315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term394898 = new Character((char) 16);
        Class<? extends Object> term395582 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term395581 = ((Class) term395582).getDeclaredField((String) "NONE");
        ((Field) term395581).setAccessible(true);
        Object enum279 = ((Field) term395581).get((Object) null);
        term394776 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term394846 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term394776, term394776.getClass(), "newRecord", true);
        setField(term394846, term394846.getClass(), "quoteChar", term394898);
        setCharField(term394846, term394846.getClass(), "delimiter", (char) 1);
        setField(term394846, term394846.getClass(), "quotePolicy", enum279);
        setField(term394776, term394776.getClass(), "format", term394846);
        term373368 = (Object[]) newArray("java.lang.Object", 1);
        Object term395070 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term373368, 0, term395070);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term373368;
        try {
            callMethod(klass, "printRecord", argTypes, term394776, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



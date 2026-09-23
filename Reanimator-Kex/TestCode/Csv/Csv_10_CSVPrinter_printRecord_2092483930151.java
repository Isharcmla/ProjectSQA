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

public class CSVPrinter_printRecord_2092483930151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106494;
     Object term105025;

    public CSVPrinter_printRecord_2092483930151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term106616 = new Character((char) 34390);
        Class<? extends Object> term107263 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term107262 = ((Class) term107263).getDeclaredField((String) "ALL");
        ((Field) term107262).setAccessible(true);
        Object enum114 = ((Field) term107262).get((Object) null);
        term106494 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term106564 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term106494, term106494.getClass(), "newRecord", true);
        setField(term106564, term106564.getClass(), "quoteChar", term106616);
        setCharField(term106564, term106564.getClass(), "delimiter", (char) 53207);
        setField(term106564, term106564.getClass(), "quotePolicy", enum114);
        setField(term106494, term106494.getClass(), "format", term106564);
        term105025 = (Object[]) newArray("java.lang.Object", 1);
        Object term106788 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term105025, 0, term106788);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term105025;
        try {
            callMethod(klass, "printRecord", argTypes, term106494, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



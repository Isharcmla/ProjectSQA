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

public class CSVPrinter_printRecord_2092483930201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195018;
     Object term192254;

    public CSVPrinter_printRecord_2092483930201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term195140 = new Character((char) 16384);
        Class<? extends Object> term195787 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term195786 = ((Class) term195787).getDeclaredField((String) "ALL");
        ((Field) term195786).setAccessible(true);
        Object enum165 = ((Field) term195786).get((Object) null);
        term195018 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term195088 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term195018, term195018.getClass(), "newRecord", true);
        setField(term195088, term195088.getClass(), "quoteChar", term195140);
        setCharField(term195088, term195088.getClass(), "delimiter", (char) 49149);
        setField(term195088, term195088.getClass(), "quotePolicy", enum165);
        setField(term195018, term195018.getClass(), "format", term195088);
        term192254 = (Object[]) newArray("java.lang.Object", 1);
        Object term195312 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term192254, 0, term195312);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term192254;
        try {
            callMethod(klass, "printRecord", argTypes, term195018, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



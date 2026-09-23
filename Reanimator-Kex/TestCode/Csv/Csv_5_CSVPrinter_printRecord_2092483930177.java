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

public class CSVPrinter_printRecord_2092483930177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177404;
     Object term175943;

    public CSVPrinter_printRecord_2092483930177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term177526 = new Character((char) 16384);
        Class<? extends Object> term178177 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term178176 = ((Class) term178177).getDeclaredField((String) "ALL");
        ((Field) term178176).setAccessible(true);
        Object enum152 = ((Field) term178176).get((Object) null);
        term177404 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term177474 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term177404, term177404.getClass(), "newRecord", true);
        setField(term177474, term177474.getClass(), "quoteChar", term177526);
        setCharField(term177474, term177474.getClass(), "delimiter", (char) 128);
        setField(term177474, term177474.getClass(), "quotePolicy", enum152);
        setField(term177404, term177404.getClass(), "format", term177474);
        term175943 = (Object[]) newArray("java.lang.Object", 1);
        Object term177702 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term175943, 0, term177702);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term175943;
        try {
            callMethod(klass, "printRecord", argTypes, term177404, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



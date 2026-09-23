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

public class CSVPrinter_printRecord_2092483930265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term302482;
     Object term302268;

    public CSVPrinter_printRecord_2092483930265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term302604 = new Character((char) 0);
        Class<? extends Object> term303312 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term303311 = ((Class) term303312).getDeclaredField((String) "ALL");
        ((Field) term303311).setAccessible(true);
        Object enum225 = ((Field) term303311).get((Object) null);
        Character term302756 = new Character((char) 0);
        term302482 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term302552 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term302482, term302482.getClass(), "newRecord", true);
        setField(term302552, term302552.getClass(), "quoteChar", term302604);
        setCharField(term302552, term302552.getClass(), "delimiter", (char) 0);
        setField(term302552, term302552.getClass(), "quotePolicy", enum225);
        setField(term302552, term302552.getClass(), "escape", term302756);
        setField(term302482, term302482.getClass(), "format", term302552);
        term302268 = (Object[]) newArray("java.lang.Object", 1);
        Object term302828 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term302268, 0, term302828);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term302268;
        try {
            callMethod(klass, "printRecord", argTypes, term302482, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



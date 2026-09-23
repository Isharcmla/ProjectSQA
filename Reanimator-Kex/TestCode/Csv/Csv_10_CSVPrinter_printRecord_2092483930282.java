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

public class CSVPrinter_printRecord_2092483930282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333304;
     Object term329275;

    public CSVPrinter_printRecord_2092483930282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term333426 = new Character((char) 49479);
        Class<? extends Object> term334500 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term334499 = ((Class) term334500).getDeclaredField((String) "MINIMAL");
        ((Field) term334499).setAccessible(true);
        Object enum245 = ((Field) term334499).get((Object) null);
        term333304 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term333374 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term333304, term333304.getClass(), "newRecord", true);
        setField(term333374, term333374.getClass(), "quoteChar", term333426);
        setCharField(term333374, term333374.getClass(), "delimiter", (char) 16383);
        setField(term333374, term333374.getClass(), "quotePolicy", enum245);
        setField(term333304, term333304.getClass(), "format", term333374);
        term329275 = (Object[]) newArray("java.lang.Object", 2);
        Object term333598 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term329275, 0, term333598);
        setElement(term329275, 1, "NONE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term329275;
        try {
            callMethod(klass, "printRecord", argTypes, term333304, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



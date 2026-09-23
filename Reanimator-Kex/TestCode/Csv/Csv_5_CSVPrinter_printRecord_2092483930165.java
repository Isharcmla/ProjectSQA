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

public class CSVPrinter_printRecord_2092483930165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158936;
     Object term158093;

    public CSVPrinter_printRecord_2092483930165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term159058 = new Character((char) 0);
        Class<? extends Object> term159943 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term159942 = ((Class) term159943).getDeclaredField((String) "MINIMAL");
        ((Field) term159942).setAccessible(true);
        Object enum141 = ((Field) term159942).get((Object) null);
        term158936 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term159006 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term158936, term158936.getClass(), "newRecord", true);
        setField(term159006, term159006.getClass(), "quoteChar", term159058);
        setCharField(term159006, term159006.getClass(), "delimiter", (char) 0);
        setField(term159006, term159006.getClass(), "quotePolicy", enum141);
        setField(term158936, term158936.getClass(), "format", term159006);
        Class<? extends Object> term160111 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term160110 = ((Class) term160111).getDeclaredField((String) "ALL");
        ((Field) term160110).setAccessible(true);
        Object enum142 = ((Field) term160110).get((Object) null);
        term158093 = (Object[]) newArray("java.lang.Object", 2);
        setElement(term158093, 0, enum142);
        setElement(term158093, 1, enum142);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term158093;
        try {
            callMethod(klass, "printRecord", argTypes, term158936, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



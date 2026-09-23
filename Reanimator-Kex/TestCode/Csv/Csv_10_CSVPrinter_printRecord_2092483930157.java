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

public class CSVPrinter_printRecord_2092483930157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119174;
     Object term117900;

    public CSVPrinter_printRecord_2092483930157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term119296 = new Character((char) 256);
        Class<? extends Object> term119985 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term119984 = ((Class) term119985).getDeclaredField((String) "ALL");
        ((Field) term119984).setAccessible(true);
        Object enum120 = ((Field) term119984).get((Object) null);
        term119174 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term119244 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term119174, term119174.getClass(), "newRecord", true);
        setField(term119244, term119244.getClass(), "quoteChar", term119296);
        setCharField(term119244, term119244.getClass(), "delimiter", (char) 8192);
        setField(term119244, term119244.getClass(), "quotePolicy", enum120);
        setField(term119174, term119174.getClass(), "format", term119244);
        term117900 = (Object[]) newArray("java.lang.Object", 256);
        Object term119468 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term117900, 0, term119468);
        setElement(term117900, 8, "NONE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term117900;
        try {
            callMethod(klass, "printRecord", argTypes, term119174, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



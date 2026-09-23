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

public class CSVPrinter_printRecord_2092483930125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71033;
     Object term70444;

    public CSVPrinter_printRecord_2092483930125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term71155 = new Character((char) 58773);
        Class<? extends Object> term71802 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term71801 = ((Class) term71802).getDeclaredField((String) "ALL");
        ((Field) term71801).setAccessible(true);
        Object enum88 = ((Field) term71801).get((Object) null);
        term71033 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term71103 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term71033, term71033.getClass(), "newRecord", true);
        setField(term71103, term71103.getClass(), "quoteChar", term71155);
        setCharField(term71103, term71103.getClass(), "delimiter", (char) 5036);
        setField(term71103, term71103.getClass(), "quotePolicy", enum88);
        setField(term71033, term71033.getClass(), "format", term71103);
        term70444 = (Object[]) newArray("java.lang.Object", 512);
        Object term71327 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term70444, 0, term71327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term70444;
        try {
            callMethod(klass, "printRecord", argTypes, term71033, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



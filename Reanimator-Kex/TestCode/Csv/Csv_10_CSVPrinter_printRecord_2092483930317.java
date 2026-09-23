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

public class CSVPrinter_printRecord_2092483930317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term396936;
     Object term395795;

    public CSVPrinter_printRecord_2092483930317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term397058 = new Character((char) 33044);
        Class<? extends Object> term397747 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term397746 = ((Class) term397747).getDeclaredField((String) "ALL");
        ((Field) term397746).setAccessible(true);
        Object enum281 = ((Field) term397746).get((Object) null);
        term396936 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term397006 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term396936, term396936.getClass(), "newRecord", true);
        setField(term397006, term397006.getClass(), "quoteChar", term397058);
        setCharField(term397006, term397006.getClass(), "delimiter", (char) 716);
        setField(term397006, term397006.getClass(), "quotePolicy", enum281);
        setField(term396936, term396936.getClass(), "format", term397006);
        term395795 = (Object[]) newArray("java.lang.Object", 2);
        Object term397230 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term395795, 0, term397230);
        setElement(term395795, 1, "NONE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term395795;
        try {
            callMethod(klass, "printRecord", argTypes, term396936, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class CSVPrinter_printRecord_2092483930155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150455;
     Object term149298;

    public CSVPrinter_printRecord_2092483930155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term150577 = new Character((char) 32);
        Class<? extends Object> term151266 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term151265 = ((Class) term151266).getDeclaredField((String) "ALL");
        ((Field) term151265).setAccessible(true);
        Object enum130 = ((Field) term151265).get((Object) null);
        term150455 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term150525 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term150455, term150455.getClass(), "newRecord", true);
        setField(term150525, term150525.getClass(), "quoteChar", term150577);
        setCharField(term150525, term150525.getClass(), "delimiter", (char) 34809);
        setField(term150525, term150525.getClass(), "quotePolicy", enum130);
        setField(term150455, term150455.getClass(), "format", term150525);
        term149298 = (Object[]) newArray("java.lang.Object", 2);
        Object term150753 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        Object term150791 = newInstance(Class.forName("java.lang.Object"));
        setElement(term149298, 0, term150753);
        setElement(term149298, 1, term150791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term149298;
        try {
            callMethod(klass, "printRecord", argTypes, term150455, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class CSVPrinter_printRecord_2092483930183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149360;
     Object term148761;

    public CSVPrinter_printRecord_2092483930183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term149482 = new Character((char) 32768);
        Class<? extends Object> term150129 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term150128 = ((Class) term150129).getDeclaredField((String) "ALL");
        ((Field) term150128).setAccessible(true);
        Object enum145 = ((Field) term150128).get((Object) null);
        term149360 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term149430 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term149360, term149360.getClass(), "newRecord", true);
        setField(term149430, term149430.getClass(), "quoteChar", term149482);
        setCharField(term149430, term149430.getClass(), "delimiter", (char) 8);
        setField(term149430, term149430.getClass(), "quotePolicy", enum145);
        setField(term149360, term149360.getClass(), "format", term149430);
        term148761 = (Object[]) newArray("java.lang.Object", 1);
        Object term149654 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term148761, 0, term149654);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term148761;
        try {
            callMethod(klass, "printRecord", argTypes, term149360, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class CSVPrinter_printRecord_2092483930271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315852;
     Object term313964;

    public CSVPrinter_printRecord_2092483930271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term315974 = new Character((char) 32);
        Class<? extends Object> term316658 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term316657 = ((Class) term316658).getDeclaredField((String) "NONE");
        ((Field) term316657).setAccessible(true);
        Object enum233 = ((Field) term316657).get((Object) null);
        term315852 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term315922 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term315852, term315852.getClass(), "newRecord", true);
        setField(term315922, term315922.getClass(), "quoteChar", term315974);
        setCharField(term315922, term315922.getClass(), "delimiter", (char) 53162);
        setField(term315922, term315922.getClass(), "quotePolicy", enum233);
        setField(term315852, term315852.getClass(), "format", term315922);
        term313964 = (Object[]) newArray("java.lang.Object", 1);
        Object term316146 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term313964, 0, term316146);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term313964;
        try {
            callMethod(klass, "printRecord", argTypes, term315852, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



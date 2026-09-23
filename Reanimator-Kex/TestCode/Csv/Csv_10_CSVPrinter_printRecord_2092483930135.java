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

public class CSVPrinter_printRecord_2092483930135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81271;
     Object term80824;

    public CSVPrinter_printRecord_2092483930135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term81393 = new Character((char) 16);
        Class<? extends Object> term82077 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term82076 = ((Class) term82077).getDeclaredField((String) "NONE");
        ((Field) term82076).setAccessible(true);
        Object enum98 = ((Field) term82076).get((Object) null);
        term81271 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term81341 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term81271, term81271.getClass(), "newRecord", true);
        setField(term81341, term81341.getClass(), "quoteChar", term81393);
        setCharField(term81341, term81341.getClass(), "delimiter", (char) 2);
        setField(term81341, term81341.getClass(), "quotePolicy", enum98);
        setField(term81271, term81271.getClass(), "format", term81341);
        term80824 = (Object[]) newArray("java.lang.Object", 1);
        Object term81565 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term80824, 0, term81565);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term80824;
        try {
            callMethod(klass, "printRecord", argTypes, term81271, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



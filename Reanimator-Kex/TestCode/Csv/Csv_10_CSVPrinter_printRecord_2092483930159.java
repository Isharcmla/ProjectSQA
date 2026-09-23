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

public class CSVPrinter_printRecord_2092483930159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121214;
     Object term120154;

    public CSVPrinter_printRecord_2092483930159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term121336 = new Character((char) 64795);
        Class<? extends Object> term121983 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term121982 = ((Class) term121983).getDeclaredField((String) "ALL");
        ((Field) term121982).setAccessible(true);
        Object enum122 = ((Field) term121982).get((Object) null);
        term121214 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term121284 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term121214, term121214.getClass(), "newRecord", true);
        setField(term121284, term121284.getClass(), "quoteChar", term121336);
        setCharField(term121284, term121284.getClass(), "delimiter", (char) 48939);
        setField(term121284, term121284.getClass(), "quotePolicy", enum122);
        setField(term121214, term121214.getClass(), "format", term121284);
        term120154 = (Object[]) newArray("java.lang.Object", 4);
        Object term121508 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term120154, 0, term121508);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term120154;
        try {
            callMethod(klass, "printRecord", argTypes, term121214, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



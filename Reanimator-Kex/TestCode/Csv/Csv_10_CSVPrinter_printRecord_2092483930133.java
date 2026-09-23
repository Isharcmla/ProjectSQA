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

public class CSVPrinter_printRecord_2092483930133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79828;
     Object term78514;

    public CSVPrinter_printRecord_2092483930133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term79950 = new Character((char) 2048);
        Class<? extends Object> term80647 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term80646 = ((Class) term80647).getDeclaredField((String) "ALL");
        ((Field) term80646).setAccessible(true);
        Object enum96 = ((Field) term80646).get((Object) null);
        term79828 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term79898 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term79828, term79828.getClass(), "newRecord", true);
        setField(term79898, term79898.getClass(), "quoteChar", term79950);
        setCharField(term79898, term79898.getClass(), "delimiter", (char) 49007);
        setField(term79898, term79898.getClass(), "quotePolicy", enum96);
        setField(term79828, term79828.getClass(), "format", term79898);
        term78514 = (Object[]) newArray("java.lang.Object", 2);
        Object term80122 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term78514, 0, term80122);
        setElement(term78514, 1, enum96);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term78514;
        try {
            callMethod(klass, "printRecord", argTypes, term79828, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



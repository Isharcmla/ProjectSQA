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

public class CSVPrinter_printRecord_2092483930241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term340944;
     Object term340718;

    public CSVPrinter_printRecord_2092483930241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term341066 = new Character((char) 0);
        Class<? extends Object> term341717 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term341716 = ((Class) term341717).getDeclaredField((String) "ALL");
        ((Field) term341716).setAccessible(true);
        Object enum222 = ((Field) term341716).get((Object) null);
        term340944 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term341014 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term340944, term340944.getClass(), "newRecord", true);
        setField(term341014, term341014.getClass(), "quoteChar", term341066);
        setCharField(term341014, term341014.getClass(), "delimiter", (char) 0);
        setField(term341014, term341014.getClass(), "quotePolicy", enum222);
        setField(term340944, term340944.getClass(), "format", term341014);
        term340718 = (Object[]) newArray("java.lang.Object", 1);
        Object term341242 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term340718, 0, term341242);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term340718;
        try {
            callMethod(klass, "printRecord", argTypes, term340944, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



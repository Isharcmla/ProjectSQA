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

public class CSVPrinter_printRecord_209248393075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31094;
     Object term30886;

    public CSVPrinter_printRecord_209248393075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term31216 = new Character((char) 0);
        Class<? extends Object> term31962 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term31961 = ((Class) term31962).getDeclaredField((String) "NONE");
        ((Field) term31961).setAccessible(true);
        Object enum50 = ((Field) term31961).get((Object) null);
        term31094 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term31164 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object term31376 = newInstance(Class.forName("java.nio.DirectCharBufferRS"));
        setBooleanField(term31094, term31094.getClass(), "newRecord", true);
        setField(term31164, term31164.getClass(), "quoteChar", term31216);
        setCharField(term31164, term31164.getClass(), "delimiter", (char) 0);
        setField(term31164, term31164.getClass(), "quotePolicy", enum50);
        setField(term31094, term31094.getClass(), "format", term31164);
        setField(term31094, term31094.getClass(), "out", term31376);
        term30886 = (Object[]) newArray("java.lang.Object", 1);
        Object term31452 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term30886, 0, term31452);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term30886;
        try {
            callMethod(klass, "printRecord", argTypes, term31094, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



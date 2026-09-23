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

public class CSVPrinter_printRecord_2092483930105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57124;
     Object term54319;

    public CSVPrinter_printRecord_2092483930105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term57246 = new Character((char) 64991);
        Class<? extends Object> term57895 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term57894 = ((Class) term57895).getDeclaredField((String) "ALL");
        ((Field) term57894).setAccessible(true);
        Object enum74 = ((Field) term57894).get((Object) null);
        term57124 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term57194 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term57124, term57124.getClass(), "newRecord", true);
        setField(term57194, term57194.getClass(), "quoteChar", term57246);
        setCharField(term57194, term57194.getClass(), "delimiter", (char) 55295);
        setField(term57194, term57194.getClass(), "quotePolicy", enum74);
        setField(term57124, term57124.getClass(), "format", term57194);
        term54319 = (Object[]) newArray("java.lang.Object", 1);
        Object term57422 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term54319, 0, term57422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term54319;
        try {
            callMethod(klass, "printRecord", argTypes, term57124, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



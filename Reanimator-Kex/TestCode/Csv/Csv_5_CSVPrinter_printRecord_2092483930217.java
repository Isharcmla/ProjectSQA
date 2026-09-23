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

public class CSVPrinter_printRecord_2092483930217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277549;
     Object term276292;

    public CSVPrinter_printRecord_2092483930217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term277671 = new Character((char) 0);
        Class<? extends Object> term278582 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term278581 = ((Class) term278582).getDeclaredField((String) "MINIMAL");
        ((Field) term278581).setAccessible(true);
        Object enum196 = ((Field) term278581).get((Object) null);
        term277549 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term277619 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term277549, term277549.getClass(), "newRecord", true);
        setField(term277619, term277619.getClass(), "quoteChar", term277671);
        setCharField(term277619, term277619.getClass(), "delimiter", (char) 0);
        setField(term277619, term277619.getClass(), "quotePolicy", enum196);
        setField(term277549, term277549.getClass(), "format", term277619);
        term276292 = (Object[]) newArray("java.lang.Object", 1);
        Object term277847 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term276292, 0, term277847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term276292;
        try {
            callMethod(klass, "printRecord", argTypes, term277549, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



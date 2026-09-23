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

public class CSVPrinter_printRecord_2092483930267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term842583;
     Object term842373;

    public CSVPrinter_printRecord_2092483930267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term842705 = new Character((char) 0);
        Class<? extends Object> term843498 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term843497 = ((Class) term843498).getDeclaredField((String) "ALL");
        ((Field) term843497).setAccessible(true);
        Object enum257 = ((Field) term843497).get((Object) null);
        term842583 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term842653 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term842583, term842583.getClass(), "newRecord", true);
        setField(term842653, term842653.getClass(), "quoteChar", term842705);
        setCharField(term842653, term842653.getClass(), "delimiter", (char) 0);
        setField(term842653, term842653.getClass(), "quotePolicy", enum257);
        setField(term842583, term842583.getClass(), "format", term842653);
        Class<? extends Object> term843654 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term843653 = ((Class) term843654).getDeclaredField((String) "ALL");
        ((Field) term843653).setAccessible(true);
        Object enum258 = ((Field) term843653).get((Object) null);
        term842373 = (Object[]) newArray("java.lang.Object", 1);
        setElement(term842373, 0, enum258);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term842373;
        try {
            callMethod(klass, "printRecord", argTypes, term842583, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



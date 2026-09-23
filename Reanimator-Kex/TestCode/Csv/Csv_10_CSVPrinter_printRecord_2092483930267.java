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
     Object term304336;
     Object term303637;

    public CSVPrinter_printRecord_2092483930267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term304458 = new Character((char) 0);
        Class<? extends Object> term305308 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term305307 = ((Class) term305308).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term305307).setAccessible(true);
        Object enum228 = ((Field) term305307).get((Object) null);
        term304336 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term304406 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term304336, term304336.getClass(), "newRecord", true);
        setField(term304406, term304406.getClass(), "quoteChar", term304458);
        setCharField(term304406, term304406.getClass(), "delimiter", (char) 0);
        setField(term304406, term304406.getClass(), "quotePolicy", enum228);
        setField(term304336, term304336.getClass(), "format", term304406);
        Class<? extends Object> term305488 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term305487 = ((Class) term305488).getDeclaredField((String) "ALL");
        ((Field) term305487).setAccessible(true);
        Object enum229 = ((Field) term305487).get((Object) null);
        term303637 = (Object[]) newArray("java.lang.Object", 1);
        setElement(term303637, 0, enum229);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term303637;
        try {
            callMethod(klass, "printRecord", argTypes, term304336, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



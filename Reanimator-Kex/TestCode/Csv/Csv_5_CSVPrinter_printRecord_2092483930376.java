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

public class CSVPrinter_printRecord_2092483930376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1045554;
     Object term1038618;

    public CSVPrinter_printRecord_2092483930376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1045676 = new Character((char) 65535);
        Class<? extends Object> term1050678 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term1050677 = ((Class) term1050678).getDeclaredField((String) "MINIMAL");
        ((Field) term1050677).setAccessible(true);
        Object enum369 = ((Field) term1050677).get((Object) null);
        term1045554 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term1045624 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term1045554, term1045554.getClass(), "newRecord", true);
        setField(term1045624, term1045624.getClass(), "quoteChar", term1045676);
        setCharField(term1045624, term1045624.getClass(), "delimiter", (char) 65535);
        setField(term1045624, term1045624.getClass(), "quotePolicy", enum369);
        setField(term1045554, term1045554.getClass(), "format", term1045624);
        term1038618 = (Object[]) newArray("java.lang.Object", 1);
        Object term1045848 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term1038618, 0, term1045848);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1038618;
        try {
            callMethod(klass, "printRecord", argTypes, term1045554, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



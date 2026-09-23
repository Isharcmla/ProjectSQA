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

public class CSVPrinter_printRecord_2092483930177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135610;
     Object term135216;

    public CSVPrinter_printRecord_2092483930177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term135732 = new Character((char) 8);
        Class<? extends Object> term136478 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term136477 = ((Class) term136478).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term136477).setAccessible(true);
        Object enum139 = ((Field) term136477).get((Object) null);
        term135610 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term135680 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term135610, term135610.getClass(), "newRecord", true);
        setField(term135680, term135680.getClass(), "quoteChar", term135732);
        setCharField(term135680, term135680.getClass(), "delimiter", (char) 32);
        setField(term135680, term135680.getClass(), "quotePolicy", enum139);
        setField(term135610, term135610.getClass(), "format", term135680);
        term135216 = (Object[]) newArray("java.lang.Object", 2);
        Object term135904 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term135216, 0, term135904);
        setElement(term135216, 1, "NONE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term135216;
        try {
            callMethod(klass, "printRecord", argTypes, term135610, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



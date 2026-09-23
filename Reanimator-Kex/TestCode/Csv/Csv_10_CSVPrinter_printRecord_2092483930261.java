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

public class CSVPrinter_printRecord_2092483930261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297374;
     Object term296567;

    public CSVPrinter_printRecord_2092483930261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term297496 = new Character((char) 32732);
        Class<? extends Object> term298200 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term298199 = ((Class) term298200).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term298199).setAccessible(true);
        Object enum221 = ((Field) term298199).get((Object) null);
        term297374 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term297444 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term297374, term297374.getClass(), "newRecord", true);
        setField(term297444, term297444.getClass(), "quoteChar", term297496);
        setCharField(term297444, term297444.getClass(), "delimiter", (char) 32801);
        setField(term297444, term297444.getClass(), "quotePolicy", enum221);
        setField(term297374, term297374.getClass(), "format", term297444);
        term296567 = (Object[]) newArray("java.lang.Object", 1);
        Object term297668 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term296567, 0, term297668);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term296567;
        try {
            callMethod(klass, "printRecord", argTypes, term297374, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



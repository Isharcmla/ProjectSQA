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

public class CSVPrinter_printRecord_2092483930315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term924985;
     Object term924278;

    public CSVPrinter_printRecord_2092483930315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term925107 = new Character((char) 0);
        Class<? extends Object> term925758 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term925757 = ((Class) term925758).getDeclaredField((String) "ALL");
        ((Field) term925757).setAccessible(true);
        Object enum307 = ((Field) term925757).get((Object) null);
        term924985 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term925055 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term924985, term924985.getClass(), "newRecord", true);
        setField(term925055, term925055.getClass(), "quoteChar", term925107);
        setCharField(term925055, term925055.getClass(), "delimiter", (char) 0);
        setField(term925055, term925055.getClass(), "quotePolicy", enum307);
        setField(term924985, term924985.getClass(), "format", term925055);
        term924278 = (Object[]) newArray("java.lang.Object", 1);
        Object term925283 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term924278, 0, term925283);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term924278;
        try {
            callMethod(klass, "printRecord", argTypes, term924985, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class CSVPrinter_printRecord_2092483930293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term888483;
     Object term882748;

    public CSVPrinter_printRecord_2092483930293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term888605 = new Character((char) 8192);
        Class<? extends Object> term889778 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term889777 = ((Class) term889778).getDeclaredField((String) "NONE");
        ((Field) term889777).setAccessible(true);
        Object enum285 = ((Field) term889777).get((Object) null);
        term888483 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term888553 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term888483, term888483.getClass(), "newRecord", true);
        setField(term888553, term888553.getClass(), "quoteChar", term888605);
        setCharField(term888553, term888553.getClass(), "delimiter", (char) 256);
        setField(term888553, term888553.getClass(), "quotePolicy", enum285);
        setField(term888483, term888483.getClass(), "format", term888553);
        term882748 = (Object[]) newArray("java.lang.Object", 1);
        Object term888781 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term882748, 0, term888781);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term882748;
        try {
            callMethod(klass, "printRecord", argTypes, term888483, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



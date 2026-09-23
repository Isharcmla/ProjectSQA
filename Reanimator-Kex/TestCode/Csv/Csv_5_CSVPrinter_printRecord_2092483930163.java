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

public class CSVPrinter_printRecord_2092483930163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157083;
     Object term156608;

    public CSVPrinter_printRecord_2092483930163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term157205 = new Character((char) 0);
        Class<? extends Object> term157856 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term157855 = ((Class) term157856).getDeclaredField((String) "ALL");
        ((Field) term157855).setAccessible(true);
        Object enum138 = ((Field) term157855).get((Object) null);
        term157083 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term157153 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term157083, term157083.getClass(), "newRecord", true);
        setField(term157153, term157153.getClass(), "quoteChar", term157205);
        setCharField(term157153, term157153.getClass(), "delimiter", (char) 0);
        setField(term157153, term157153.getClass(), "quotePolicy", enum138);
        setField(term157083, term157083.getClass(), "format", term157153);
        term156608 = (Object[]) newArray("java.lang.Object", 1);
        Object term157381 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term156608, 0, term157381);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term156608;
        try {
            callMethod(klass, "printRecord", argTypes, term157083, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class CSVPrinter_printRecord_2092483930289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term880973;
     Object term880605;

    public CSVPrinter_printRecord_2092483930289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term881095 = new Character((char) 128);
        Class<? extends Object> term881746 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term881745 = ((Class) term881746).getDeclaredField((String) "ALL");
        ((Field) term881745).setAccessible(true);
        Object enum281 = ((Field) term881745).get((Object) null);
        term880973 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term881043 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term880973, term880973.getClass(), "newRecord", true);
        setField(term881043, term881043.getClass(), "quoteChar", term881095);
        setCharField(term881043, term881043.getClass(), "delimiter", (char) 256);
        setField(term881043, term881043.getClass(), "quotePolicy", enum281);
        setField(term880973, term880973.getClass(), "format", term881043);
        term880605 = (Object[]) newArray("java.lang.Object", 1);
        Object term881271 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term880605, 0, term881271);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term880605;
        try {
            callMethod(klass, "printRecord", argTypes, term880973, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



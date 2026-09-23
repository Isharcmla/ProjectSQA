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

public class CSVPrinter_printRecord_2092483930307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term916902;
     Object term913769;

    public CSVPrinter_printRecord_2092483930307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term917024 = new Character((char) 52820);
        Class<? extends Object> term917712 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term917711 = ((Class) term917712).getDeclaredField((String) "NONE");
        ((Field) term917711).setAccessible(true);
        Object enum299 = ((Field) term917711).get((Object) null);
        term916902 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term916972 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term916902, term916902.getClass(), "newRecord", true);
        setField(term916972, term916972.getClass(), "quoteChar", term917024);
        setCharField(term916972, term916972.getClass(), "delimiter", (char) 47103);
        setField(term916972, term916972.getClass(), "quotePolicy", enum299);
        setField(term916902, term916902.getClass(), "format", term916972);
        term913769 = (Object[]) newArray("java.lang.Object", 1);
        Object term917200 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term913769, 0, term917200);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term913769;
        try {
            callMethod(klass, "printRecord", argTypes, term916902, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



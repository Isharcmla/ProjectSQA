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

public class CSVPrinter_printRecord_2092483930309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term919280;
     Object term917970;

    public CSVPrinter_printRecord_2092483930309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term919402 = new Character((char) 0);
        Class<? extends Object> term920113 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term920112 = ((Class) term920113).getDeclaredField((String) "ALL");
        ((Field) term920112).setAccessible(true);
        Object enum301 = ((Field) term920112).get((Object) null);
        Character term919554 = new Character((char) 1);
        term919280 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term919350 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term919280, term919280.getClass(), "newRecord", true);
        setField(term919350, term919350.getClass(), "quoteChar", term919402);
        setCharField(term919350, term919350.getClass(), "delimiter", (char) 65535);
        setField(term919350, term919350.getClass(), "quotePolicy", enum301);
        setField(term919350, term919350.getClass(), "escape", term919554);
        setField(term919280, term919280.getClass(), "format", term919350);
        term917970 = (Object[]) newArray("java.lang.Object", 1);
        Object term919630 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term917970, 0, term919630);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term917970;
        try {
            callMethod(klass, "printRecord", argTypes, term919280, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



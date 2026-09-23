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

public class CSVPrinter_printRecord_2092483930339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term974761;
     Object term973884;

    public CSVPrinter_printRecord_2092483930339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term974883 = new Character((char) 0);
        Class<? extends Object> term975651 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term975650 = ((Class) term975651).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term975650).setAccessible(true);
        Object enum329 = ((Field) term975650).get((Object) null);
        Character term975035 = new Character((char) 65372);
        term974761 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term974831 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term974761, term974761.getClass(), "newRecord", true);
        setField(term974831, term974831.getClass(), "quoteChar", term974883);
        setCharField(term974831, term974831.getClass(), "delimiter", (char) 65527);
        setField(term974831, term974831.getClass(), "quotePolicy", enum329);
        setField(term974831, term974831.getClass(), "escape", term975035);
        setField(term974761, term974761.getClass(), "format", term974831);
        term973884 = (Object[]) newArray("java.lang.Object", 1);
        Object term975111 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term973884, 0, term975111);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term973884;
        try {
            callMethod(klass, "printRecord", argTypes, term974761, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



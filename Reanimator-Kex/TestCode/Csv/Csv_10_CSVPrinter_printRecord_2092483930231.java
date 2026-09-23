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

public class CSVPrinter_printRecord_2092483930231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251532;
     Object term241162;

    public CSVPrinter_printRecord_2092483930231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term251654 = new Character((char) 8192);
        Class<? extends Object> term252301 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term252300 = ((Class) term252301).getDeclaredField((String) "ALL");
        ((Field) term252300).setAccessible(true);
        Object enum191 = ((Field) term252300).get((Object) null);
        term251532 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term251602 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term251532, term251532.getClass(), "newRecord", true);
        setField(term251602, term251602.getClass(), "quoteChar", term251654);
        setCharField(term251602, term251602.getClass(), "delimiter", (char) 128);
        setField(term251602, term251602.getClass(), "quotePolicy", enum191);
        setField(term251532, term251532.getClass(), "format", term251602);
        term241162 = (Object[]) newArray("java.lang.Object", 8);
        Object term251826 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term241162, 0, term251826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term241162;
        try {
            callMethod(klass, "printRecord", argTypes, term251532, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



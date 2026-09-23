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

public class CSVPrinter_printRecord_2092483930323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403053;
     Object term402729;

    public CSVPrinter_printRecord_2092483930323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term403175 = new Character((char) 0);
        Class<? extends Object> term403860 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term403859 = ((Class) term403860).getDeclaredField((String) "ALL");
        ((Field) term403859).setAccessible(true);
        Object enum285 = ((Field) term403859).get((Object) null);
        Character term403327 = new Character((char) 0);
        term403053 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term403123 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term403053, term403053.getClass(), "newRecord", true);
        setField(term403123, term403123.getClass(), "quoteChar", term403175);
        setCharField(term403123, term403123.getClass(), "delimiter", (char) 0);
        setField(term403123, term403123.getClass(), "quotePolicy", enum285);
        setField(term403123, term403123.getClass(), "escape", term403327);
        setField(term403053, term403053.getClass(), "format", term403123);
        term402729 = (Object[]) newArray("java.lang.Object", 1);
        setElement(term402729, 0, "NON_NUMERIC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term402729;
        try {
            callMethod(klass, "printRecord", argTypes, term403053, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



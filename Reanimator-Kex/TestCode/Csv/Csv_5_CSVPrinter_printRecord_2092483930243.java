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

public class CSVPrinter_printRecord_2092483930243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term342148;
     Object term341934;

    public CSVPrinter_printRecord_2092483930243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term342270 = new Character((char) 0);
        Class<? extends Object> term343112 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term343111 = ((Class) term343112).getDeclaredField((String) "ALL");
        ((Field) term343111).setAccessible(true);
        Object enum225 = ((Field) term343111).get((Object) null);
        term342148 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term342218 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term342148, term342148.getClass(), "newRecord", true);
        setField(term342218, term342218.getClass(), "quoteChar", term342270);
        setCharField(term342218, term342218.getClass(), "delimiter", (char) 0);
        setField(term342218, term342218.getClass(), "quotePolicy", enum225);
        setField(term342148, term342148.getClass(), "format", term342218);
        Class<? extends Object> term343268 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term343267 = ((Class) term343268).getDeclaredField((String) "ALL");
        ((Field) term343267).setAccessible(true);
        Object enum226 = ((Field) term343267).get((Object) null);
        term341934 = (Object[]) newArray("java.lang.Object", 2);
        setElement(term341934, 0, enum226);
        setElement(term341934, 1, "NON_NUMERIC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term341934;
        try {
            callMethod(klass, "printRecord", argTypes, term342148, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



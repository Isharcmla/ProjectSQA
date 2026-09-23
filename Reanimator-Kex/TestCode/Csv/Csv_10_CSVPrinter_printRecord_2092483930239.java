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

public class CSVPrinter_printRecord_2092483930239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260667;
     Object term259374;

    public CSVPrinter_printRecord_2092483930239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term260789 = new Character((char) 8192);
        Class<? extends Object> term261436 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term261435 = ((Class) term261436).getDeclaredField((String) "ALL");
        ((Field) term261435).setAccessible(true);
        Object enum199 = ((Field) term261435).get((Object) null);
        term260667 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term260737 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term260667, term260667.getClass(), "newRecord", true);
        setField(term260737, term260737.getClass(), "quoteChar", term260789);
        setCharField(term260737, term260737.getClass(), "delimiter", (char) 2048);
        setField(term260737, term260737.getClass(), "quotePolicy", enum199);
        setField(term260667, term260667.getClass(), "format", term260737);
        term259374 = (Object[]) newArray("java.lang.Object", 1);
        Object term260961 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term259374, 0, term260961);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term259374;
        try {
            callMethod(klass, "printRecord", argTypes, term260667, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



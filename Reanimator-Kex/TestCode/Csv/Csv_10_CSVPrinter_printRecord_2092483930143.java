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

public class CSVPrinter_printRecord_2092483930143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96767;
     Object term91958;

    public CSVPrinter_printRecord_2092483930143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term96889 = new Character((char) 4096);
        Class<? extends Object> term97585 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term97584 = ((Class) term97585).getDeclaredField((String) "ALL");
        ((Field) term97584).setAccessible(true);
        Object enum106 = ((Field) term97584).get((Object) null);
        term96767 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term96837 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term96767, term96767.getClass(), "newRecord", true);
        setField(term96837, term96837.getClass(), "quoteChar", term96889);
        setCharField(term96837, term96837.getClass(), "delimiter", (char) 61407);
        setField(term96837, term96837.getClass(), "quotePolicy", enum106);
        setField(term96767, term96767.getClass(), "format", term96837);
        term91958 = (Object[]) newArray("java.lang.Object", 2);
        Object term97061 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term91958, 0, term97061);
        setElement(term91958, 1, "NON_NUMERIC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term91958;
        try {
            callMethod(klass, "printRecord", argTypes, term96767, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



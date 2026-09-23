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

public class CSVPrinter_printRecord_2092483930259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term834736;
     Object term833074;

    public CSVPrinter_printRecord_2092483930259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term834858 = new Character((char) 8192);
        Class<? extends Object> term835822 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term835821 = ((Class) term835822).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term835821).setAccessible(true);
        Object enum243 = ((Field) term835821).get((Object) null);
        term834736 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term834806 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term834736, term834736.getClass(), "newRecord", true);
        setField(term834806, term834806.getClass(), "quoteChar", term834858);
        setCharField(term834806, term834806.getClass(), "delimiter", (char) 55295);
        setField(term834806, term834806.getClass(), "quotePolicy", enum243);
        setField(term834736, term834736.getClass(), "format", term834806);
        Class<? extends Object> term836002 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term836001 = ((Class) term836002).getDeclaredField((String) "ALL");
        ((Field) term836001).setAccessible(true);
        Object enum244 = ((Field) term836001).get((Object) null);
        term833074 = (Object[]) newArray("java.lang.Object", 2);
        Object term835034 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term833074, 0, term835034);
        setElement(term833074, 1, enum244);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term833074;
        try {
            callMethod(klass, "printRecord", argTypes, term834736, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class CSVPrinter_printRecord_2092483930377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1049655;
     Object term1046972;

    public CSVPrinter_printRecord_2092483930377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1049777 = new Character((char) 4096);
        Class<? extends Object> term1051456 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term1051455 = ((Class) term1051456).getDeclaredField((String) "MINIMAL");
        ((Field) term1051455).setAccessible(true);
        Object enum370 = ((Field) term1051455).get((Object) null);
        term1049655 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term1049725 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term1049655, term1049655.getClass(), "newRecord", true);
        setField(term1049725, term1049725.getClass(), "quoteChar", term1049777);
        setCharField(term1049725, term1049725.getClass(), "delimiter", (char) 1);
        setField(term1049725, term1049725.getClass(), "quotePolicy", enum370);
        setField(term1049655, term1049655.getClass(), "format", term1049725);
        term1046972 = (Object[]) newArray("java.lang.Object", 2);
        Object term1049953 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term1046972, 0, term1049953);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1046972;
        try {
            callMethod(klass, "printRecord", argTypes, term1049655, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



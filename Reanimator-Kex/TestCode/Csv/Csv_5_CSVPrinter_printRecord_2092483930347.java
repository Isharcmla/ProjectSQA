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

public class CSVPrinter_printRecord_2092483930347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term996529;
     Object term987024;

    public CSVPrinter_printRecord_2092483930347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term996651 = new Character((char) 8);
        Class<? extends Object> term997355 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term997354 = ((Class) term997355).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term997354).setAccessible(true);
        Object enum337 = ((Field) term997354).get((Object) null);
        term996529 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term996599 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term996529, term996529.getClass(), "newRecord", true);
        setField(term996599, term996599.getClass(), "quoteChar", term996651);
        setCharField(term996599, term996599.getClass(), "delimiter", (char) 16384);
        setField(term996599, term996599.getClass(), "quotePolicy", enum337);
        setField(term996529, term996529.getClass(), "format", term996599);
        term987024 = (Object[]) newArray("java.lang.Object", 256);
        Object term996823 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term987024, 0, term996823);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term987024;
        try {
            callMethod(klass, "printRecord", argTypes, term996529, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



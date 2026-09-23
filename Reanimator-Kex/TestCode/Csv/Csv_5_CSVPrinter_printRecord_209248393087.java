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

public class CSVPrinter_printRecord_209248393087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37946;
     Object term37449;

    public CSVPrinter_printRecord_209248393087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term38068 = new Character((char) 16384);
        Class<? extends Object> term38774 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term38773 = ((Class) term38774).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term38773).setAccessible(true);
        Object enum58 = ((Field) term38773).get((Object) null);
        term37946 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term38016 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term37946, term37946.getClass(), "newRecord", true);
        setField(term38016, term38016.getClass(), "quoteChar", term38068);
        setCharField(term38016, term38016.getClass(), "delimiter", (char) 0);
        setField(term38016, term38016.getClass(), "quotePolicy", enum58);
        setField(term37946, term37946.getClass(), "format", term38016);
        term37449 = (Object[]) newArray("java.lang.Object", 1);
        Object term38244 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term37449, 0, term38244);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term37449;
        try {
            callMethod(klass, "printRecord", argTypes, term37946, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



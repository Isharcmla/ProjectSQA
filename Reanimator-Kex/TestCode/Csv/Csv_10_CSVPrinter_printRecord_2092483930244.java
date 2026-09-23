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

public class CSVPrinter_printRecord_2092483930244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270385;
     Object term263449;

    public CSVPrinter_printRecord_2092483930244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term270507 = new Character((char) 65535);
        Class<? extends Object> term272475 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term272474 = ((Class) term272475).getDeclaredField((String) "MINIMAL");
        ((Field) term272474).setAccessible(true);
        Object enum204 = ((Field) term272474).get((Object) null);
        term270385 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term270455 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term270385, term270385.getClass(), "newRecord", true);
        setField(term270455, term270455.getClass(), "quoteChar", term270507);
        setCharField(term270455, term270455.getClass(), "delimiter", (char) 65535);
        setField(term270455, term270455.getClass(), "quotePolicy", enum204);
        setField(term270385, term270385.getClass(), "format", term270455);
        term263449 = (Object[]) newArray("java.lang.Object", 1);
        Object term270679 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term263449, 0, term270679);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term263449;
        try {
            callMethod(klass, "printRecord", argTypes, term270385, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



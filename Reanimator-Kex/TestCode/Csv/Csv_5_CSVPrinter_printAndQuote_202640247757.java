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
import java.lang.Long;

public class CSVPrinter_printAndQuote_202640247757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23595;
     Object term23859;

    public CSVPrinter_printAndQuote_202640247757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term23717 = new Character((char) 0);
        Class<? extends Object> term24349 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term24348 = ((Class) term24349).getDeclaredField((String) "NONE");
        ((Field) term24348).setAccessible(true);
        Object enum42 = ((Field) term24348).get((Object) null);
        term23595 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term23665 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term23665, term23665.getClass(), "delimiter", (char) 0);
        setField(term23665, term23665.getClass(), "quoteChar", term23717);
        setField(term23665, term23665.getClass(), "quotePolicy", enum42);
        setField(term23595, term23595.getClass(), "format", term23665);
        term23859 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.CharSequence");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term23859;
        args[1] = null;
        args[2] = 0;
        args[3] = 0;
        try {
            callMethod(klass, "printAndQuote", argTypes, term23595, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



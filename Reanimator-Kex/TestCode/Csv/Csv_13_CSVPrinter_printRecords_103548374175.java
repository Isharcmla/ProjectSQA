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

public class CSVPrinter_printRecords_103548374175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52553;
     Object term51272;

    public CSVPrinter_printRecords_103548374175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term52675 = new Character((char) 0);
        Class<? extends Object> term53650 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term53649 = ((Class) term53650).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term53649).setAccessible(true);
        Object enum63 = ((Field) term53649).get((Object) null);
        Character term52835 = new Character((char) 64);
        term52553 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term52623 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term52553, term52553.getClass(), "newRecord", true);
        setField(term52623, term52623.getClass(), "quoteCharacter", term52675);
        setCharField(term52623, term52623.getClass(), "delimiter", (char) 64);
        setField(term52623, term52623.getClass(), "quoteMode", enum63);
        setField(term52623, term52623.getClass(), "escapeCharacter", term52835);
        setField(term52553, term52553.getClass(), "format", term52623);
        Class<? extends Object> term53850 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term53849 = ((Class) term53850).getDeclaredField((String) "ALL");
        ((Field) term53849).setAccessible(true);
        Object enum64 = ((Field) term53849).get((Object) null);
        term51272 = (Object[]) newArray("java.lang.Object", 1);
        setElement(term51272, 0, enum64);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term51272;
        try {
            callMethod(klass, "printRecords", argTypes, term52553, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



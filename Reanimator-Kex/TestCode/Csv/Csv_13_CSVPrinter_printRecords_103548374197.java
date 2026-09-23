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

public class CSVPrinter_printRecords_103548374197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69954;
     Object term69467;

    public CSVPrinter_printRecords_103548374197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term70076 = new Character((char) 0);
        Class<? extends Object> term70850 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term70849 = ((Class) term70850).getDeclaredField((String) "MINIMAL");
        ((Field) term70849).setAccessible(true);
        Object enum82 = ((Field) term70849).get((Object) null);
        Character term70236 = new Character((char) 0);
        term69954 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term70024 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term69954, term69954.getClass(), "newRecord", true);
        setField(term70024, term70024.getClass(), "quoteCharacter", term70076);
        setCharField(term70024, term70024.getClass(), "delimiter", (char) 0);
        setField(term70024, term70024.getClass(), "quoteMode", enum82);
        setField(term70024, term70024.getClass(), "escapeCharacter", term70236);
        setField(term69954, term69954.getClass(), "format", term70024);
        term69467 = (Object[]) newArray("java.lang.Object", 128);
        setElement(term69467, 0, "MINIMAL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term69467;
        try {
            callMethod(klass, "printRecords", argTypes, term69954, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



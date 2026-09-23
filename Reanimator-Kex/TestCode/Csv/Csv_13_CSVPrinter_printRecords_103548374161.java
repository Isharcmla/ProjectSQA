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

public class CSVPrinter_printRecords_103548374161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42964;
     Object term42068;

    public CSVPrinter_printRecords_103548374161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term43086 = new Character((char) 0);
        Class<? extends Object> term44285 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term44284 = ((Class) term44285).getDeclaredField((String) "ALL");
        ((Field) term44284).setAccessible(true);
        Object enum52 = ((Field) term44284).get((Object) null);
        Character term43246 = new Character((char) 0);
        term42964 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term43034 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term42964, term42964.getClass(), "newRecord", true);
        setField(term43034, term43034.getClass(), "quoteCharacter", term43086);
        setCharField(term43034, term43034.getClass(), "delimiter", (char) 0);
        setField(term43034, term43034.getClass(), "quoteMode", enum52);
        setField(term43034, term43034.getClass(), "escapeCharacter", term43246);
        setField(term42964, term42964.getClass(), "format", term43034);
        term42068 = (Object[]) newArray("java.lang.Object", 1);
        int[] term42069 = (int[]) newIntArray(0);
        setElement(term42068, 0, term42069);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term42068;
        try {
            callMethod(klass, "printRecords", argTypes, term42964, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



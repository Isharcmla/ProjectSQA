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

public class CSVPrinter_printRecords_103548374173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50040;
     Object term49622;

    public CSVPrinter_printRecords_103548374173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term50383 = new Character((char) 0);
        Class<? extends Object> term51077 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term51076 = ((Class) term51077).getDeclaredField((String) "ALL");
        ((Field) term51076).setAccessible(true);
        Object enum60 = ((Field) term51076).get((Object) null);
        Character term50463 = new Character((char) 0);
        term50040 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term50357 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term50040, term50040.getClass(), "newRecord", true);
        setField(term50357, term50357.getClass(), "quoteCharacter", term50383);
        setCharField(term50357, term50357.getClass(), "delimiter", (char) 0);
        setField(term50357, term50357.getClass(), "quoteMode", enum60);
        setField(term50357, term50357.getClass(), "escapeCharacter", term50463);
        setField(term50040, term50040.getClass(), "format", term50357);
        term49622 = (Object[]) newArray("java.lang.Object", 256);
        setElement(term49622, 0, term50357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term49622;
        try {
            callMethod(klass, "printRecords", argTypes, term50040, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



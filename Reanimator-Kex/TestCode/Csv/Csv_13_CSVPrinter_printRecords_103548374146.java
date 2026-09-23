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

public class CSVPrinter_printRecords_103548374146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27479;
     Object term27036;

    public CSVPrinter_printRecords_103548374146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term27601 = new Character((char) 0);
        Class<? extends Object> term31334 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term31333 = ((Class) term31334).getDeclaredField((String) "NONE");
        ((Field) term31333).setAccessible(true);
        Object enum39 = ((Field) term31333).get((Object) null);
        Character term27761 = new Character((char) 27291);
        term27479 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term27549 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term27479, term27479.getClass(), "newRecord", true);
        setField(term27549, term27549.getClass(), "quoteCharacter", term27601);
        setCharField(term27549, term27549.getClass(), "delimiter", (char) 37988);
        setField(term27549, term27549.getClass(), "quoteMode", enum39);
        setField(term27549, term27549.getClass(), "escapeCharacter", term27761);
        setField(term27479, term27479.getClass(), "format", term27549);
        term27036 = (Object[]) newArray("java.lang.Object", 128);
        setElement(term27036, 0, "MINIMAL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term27036;
        try {
            callMethod(klass, "printRecords", argTypes, term27479, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



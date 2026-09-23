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

public class CSVPrinter_printRecords_103548374148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30417;
     Object term27987;

    public CSVPrinter_printRecords_103548374148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term30539 = new Character((char) 0);
        Class<? extends Object> term32913 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term32912 = ((Class) term32913).getDeclaredField((String) "ALL");
        ((Field) term32912).setAccessible(true);
        Object enum41 = ((Field) term32912).get((Object) null);
        Character term30699 = new Character((char) 64);
        term30417 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term30487 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term30417, term30417.getClass(), "newRecord", true);
        setField(term30487, term30487.getClass(), "quoteCharacter", term30539);
        setCharField(term30487, term30487.getClass(), "delimiter", (char) 512);
        setField(term30487, term30487.getClass(), "quoteMode", enum41);
        setField(term30487, term30487.getClass(), "escapeCharacter", term30699);
        setField(term30417, term30417.getClass(), "format", term30487);
        term27987 = (Object[]) newArray("java.lang.Object", 32);
        setElement(term27987, 0, "NONE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term27987;
        try {
            callMethod(klass, "printRecords", argTypes, term30417, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



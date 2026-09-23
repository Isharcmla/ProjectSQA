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

public class CSVPrinter_printRecords_1035483741135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111218;
     Object term107760;

    public CSVPrinter_printRecords_1035483741135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term111340 = new Character((char) 0);
        Class<? extends Object> term112056 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term112055 = ((Class) term112056).getDeclaredField((String) "ALL");
        ((Field) term112055).setAccessible(true);
        Object enum112 = ((Field) term112055).get((Object) null);
        Character term111500 = new Character((char) 0);
        term111218 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term111288 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term111218, term111218.getClass(), "newRecord", true);
        setField(term111288, term111288.getClass(), "quoteCharacter", term111340);
        setCharField(term111288, term111288.getClass(), "delimiter", (char) 0);
        setField(term111288, term111288.getClass(), "quoteMode", enum112);
        setField(term111288, term111288.getClass(), "escapeCharacter", term111500);
        setField(term111218, term111218.getClass(), "format", term111288);
        term107760 = (Object[]) newArray("java.lang.Object", 2);
        setElement(term107760, 0, "NONE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term107760;
        try {
            callMethod(klass, "printRecords", argTypes, term111218, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



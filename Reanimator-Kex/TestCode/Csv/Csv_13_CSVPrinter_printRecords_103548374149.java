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

public class CSVPrinter_printRecords_103548374149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32117;
     Object term31529;

    public CSVPrinter_printRecords_103548374149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term32239 = new Character((char) 0);
        Class<? extends Object> term33427 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term33426 = ((Class) term33427).getDeclaredField((String) "ALL");
        ((Field) term33426).setAccessible(true);
        Object enum42 = ((Field) term33426).get((Object) null);
        term32117 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term32187 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term32117, term32117.getClass(), "newRecord", true);
        setField(term32187, term32187.getClass(), "quoteCharacter", term32239);
        setCharField(term32187, term32187.getClass(), "delimiter", (char) 0);
        setField(term32187, term32187.getClass(), "quoteMode", enum42);
        setField(term32187, term32187.getClass(), "escapeCharacter", term32239);
        setField(term32117, term32117.getClass(), "format", term32187);
        term31529 = (Object[]) newArray("java.lang.Object", 1);
        setElement(term31529, 0, enum42);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term31529;
        try {
            callMethod(klass, "printRecords", argTypes, term32117, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



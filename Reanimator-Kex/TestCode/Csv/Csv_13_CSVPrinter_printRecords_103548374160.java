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

public class CSVPrinter_printRecords_103548374160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41608;
     Object term40713;

    public CSVPrinter_printRecords_103548374160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term41730 = new Character((char) 0);
        Class<? extends Object> term43758 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term43757 = ((Class) term43758).getDeclaredField((String) "ALL");
        ((Field) term43757).setAccessible(true);
        Object enum51 = ((Field) term43757).get((Object) null);
        Character term41890 = new Character((char) 0);
        term41608 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term41678 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term41608, term41608.getClass(), "newRecord", true);
        setField(term41678, term41678.getClass(), "quoteCharacter", term41730);
        setCharField(term41678, term41678.getClass(), "delimiter", (char) 0);
        setField(term41678, term41678.getClass(), "quoteMode", enum51);
        setField(term41678, term41678.getClass(), "escapeCharacter", term41890);
        setField(term41608, term41608.getClass(), "format", term41678);
        term40713 = (Object[]) newArray("java.lang.Object", 1);
        int[] term40714 = (int[]) newIntArray(0);
        setElement(term40713, 0, term40714);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term40713;
        try {
            callMethod(klass, "printRecords", argTypes, term41608, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



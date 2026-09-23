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

public class CSVPrinter_printRecords_1035483741133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106600;
     Object term105703;

    public CSVPrinter_printRecords_1035483741133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term106722 = new Character((char) 0);
        Class<? extends Object> term107525 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term107524 = ((Class) term107525).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term107524).setAccessible(true);
        Object enum110 = ((Field) term107524).get((Object) null);
        Character term106882 = new Character((char) 0);
        term106600 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term106670 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term106600, term106600.getClass(), "newRecord", true);
        setField(term106670, term106670.getClass(), "quoteCharacter", term106722);
        setCharField(term106670, term106670.getClass(), "delimiter", (char) 65469);
        setField(term106670, term106670.getClass(), "quoteMode", enum110);
        setField(term106670, term106670.getClass(), "escapeCharacter", term106882);
        setField(term106600, term106600.getClass(), "format", term106670);
        term105703 = (Object[]) newArray("java.lang.Object", 128);
        Object term106954 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term105703, 0, term106954);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term105703;
        try {
            callMethod(klass, "printRecords", argTypes, term106600, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class CSVPrinter_printRecords_103548374153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34750;
     Object term34183;

    public CSVPrinter_printRecords_103548374153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term34872 = new Character((char) 0);
        Class<? extends Object> term35583 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term35582 = ((Class) term35583).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term35582).setAccessible(true);
        Object enum44 = ((Field) term35582).get((Object) null);
        term34750 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term34820 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term34750, term34750.getClass(), "newRecord", true);
        setField(term34820, term34820.getClass(), "quoteCharacter", term34872);
        setCharField(term34820, term34820.getClass(), "delimiter", (char) 0);
        setField(term34820, term34820.getClass(), "quoteMode", enum44);
        setField(term34750, term34750.getClass(), "format", term34820);
        term34183 = (Object[]) newArray("java.lang.Object", 8);
        setElement(term34183, 0, "NONE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term34183;
        try {
            callMethod(klass, "printRecords", argTypes, term34750, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



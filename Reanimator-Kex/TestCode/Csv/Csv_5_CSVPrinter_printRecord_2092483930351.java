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

public class CSVPrinter_printRecord_2092483930351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1000568;
     Object term999819;

    public CSVPrinter_printRecord_2092483930351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1000690 = new Character((char) 0);
        Class<? extends Object> term1001601 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term1001600 = ((Class) term1001601).getDeclaredField((String) "MINIMAL");
        ((Field) term1001600).setAccessible(true);
        Object enum343 = ((Field) term1001600).get((Object) null);
        term1000568 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term1000638 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term1000568, term1000568.getClass(), "newRecord", true);
        setField(term1000638, term1000638.getClass(), "quoteChar", term1000690);
        setCharField(term1000638, term1000638.getClass(), "delimiter", (char) 0);
        setField(term1000638, term1000638.getClass(), "quotePolicy", enum343);
        setField(term1000568, term1000568.getClass(), "format", term1000638);
        term999819 = (Object[]) newArray("java.lang.Object", 1);
        Object term1000866 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term999819, 0, term1000866);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term999819;
        try {
            callMethod(klass, "printRecord", argTypes, term1000568, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



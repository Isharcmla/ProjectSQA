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

public class CSVPrinter_printRecord_2092483930292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term882247;
     Object term881949;

    public CSVPrinter_printRecord_2092483930292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term882369 = new Character((char) 0);
        Class<? extends Object> term889259 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term889258 = ((Class) term889259).getDeclaredField((String) "ALL");
        ((Field) term889258).setAccessible(true);
        Object enum284 = ((Field) term889258).get((Object) null);
        term882247 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term882317 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term882247, term882247.getClass(), "newRecord", true);
        setField(term882317, term882317.getClass(), "quoteChar", term882369);
        setCharField(term882317, term882317.getClass(), "delimiter", (char) 0);
        setField(term882317, term882317.getClass(), "quotePolicy", enum284);
        setField(term882247, term882247.getClass(), "format", term882317);
        term881949 = (Object[]) newArray("java.lang.Object", 18);
        Object term882541 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term881949, 0, term882541);
        setElement(term881949, 4, "NON_NUMERIC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term881949;
        try {
            callMethod(klass, "printRecord", argTypes, term882247, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



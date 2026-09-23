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

public class CSVPrinter_printRecord_209248393093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43166;
     Object term42746;

    public CSVPrinter_printRecord_209248393093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term43288 = new Character((char) 8496);
        Class<? extends Object> term43974 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term43973 = ((Class) term43974).getDeclaredField((String) "NONE");
        ((Field) term43973).setAccessible(true);
        Object enum64 = ((Field) term43973).get((Object) null);
        term43166 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term43236 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term43166, term43166.getClass(), "newRecord", true);
        setField(term43236, term43236.getClass(), "quoteChar", term43288);
        setCharField(term43236, term43236.getClass(), "delimiter", (char) 57038);
        setField(term43236, term43236.getClass(), "quotePolicy", enum64);
        setField(term43166, term43166.getClass(), "format", term43236);
        term42746 = (Object[]) newArray("java.lang.Object", 1);
        Object term43464 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term42746, 0, term43464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term42746;
        try {
            callMethod(klass, "printRecord", argTypes, term43166, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



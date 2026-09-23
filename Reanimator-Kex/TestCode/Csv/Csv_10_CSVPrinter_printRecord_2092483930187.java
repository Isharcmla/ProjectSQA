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

public class CSVPrinter_printRecord_2092483930187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167080;
     Object term153364;

    public CSVPrinter_printRecord_2092483930187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term167202 = new Character((char) 16384);
        Class<? extends Object> term167887 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term167886 = ((Class) term167887).getDeclaredField((String) "ALL");
        ((Field) term167886).setAccessible(true);
        Object enum149 = ((Field) term167886).get((Object) null);
        term167080 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term167150 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term167080, term167080.getClass(), "newRecord", true);
        setField(term167150, term167150.getClass(), "quoteChar", term167202);
        setCharField(term167150, term167150.getClass(), "delimiter", (char) 1);
        setField(term167150, term167150.getClass(), "quotePolicy", enum149);
        setField(term167080, term167080.getClass(), "format", term167150);
        term153364 = (Object[]) newArray("java.lang.Object", 2);
        Object term167374 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term167412 = newInstance(Class.forName("java.lang.Object"));
        setElement(term153364, 0, term167374);
        setElement(term153364, 1, term167412);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term153364;
        try {
            callMethod(klass, "printRecord", argTypes, term167080, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



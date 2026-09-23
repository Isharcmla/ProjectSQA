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

public class CSVPrinter_printRecord_2092483930115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69755;
     Object term68543;

    public CSVPrinter_printRecord_2092483930115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term69877 = new Character((char) 32732);
        Class<? extends Object> term70566 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term70565 = ((Class) term70566).getDeclaredField((String) "ALL");
        ((Field) term70565).setAccessible(true);
        Object enum84 = ((Field) term70565).get((Object) null);
        term69755 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term69825 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term69755, term69755.getClass(), "newRecord", true);
        setField(term69825, term69825.getClass(), "quoteChar", term69877);
        setCharField(term69825, term69825.getClass(), "delimiter", (char) 32800);
        setField(term69825, term69825.getClass(), "quotePolicy", enum84);
        setField(term69755, term69755.getClass(), "format", term69825);
        term68543 = (Object[]) newArray("java.lang.Object", 2);
        Object term70053 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        Object term70091 = newInstance(Class.forName("java.lang.Object"));
        setElement(term68543, 0, term70053);
        setElement(term68543, 1, term70091);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term68543;
        try {
            callMethod(klass, "printRecord", argTypes, term69755, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



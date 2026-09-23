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

public class CSVPrinter_printRecord_2092483930275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319675;
     Object term319180;

    public CSVPrinter_printRecord_2092483930275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term319797 = new Character((char) 32475);
        Class<? extends Object> term320737 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term320736 = ((Class) term320737).getDeclaredField((String) "NONE");
        ((Field) term320736).setAccessible(true);
        Object enum238 = ((Field) term320736).get((Object) null);
        term319675 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term319745 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term319675, term319675.getClass(), "newRecord", true);
        setField(term319745, term319745.getClass(), "quoteChar", term319797);
        setCharField(term319745, term319745.getClass(), "delimiter", (char) 33028);
        setField(term319745, term319745.getClass(), "quotePolicy", enum238);
        setField(term319675, term319675.getClass(), "format", term319745);
        Class<? extends Object> term320896 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term320895 = ((Class) term320896).getDeclaredField((String) "ALL");
        ((Field) term320895).setAccessible(true);
        Object enum239 = ((Field) term320895).get((Object) null);
        term319180 = (Object[]) newArray("java.lang.Object", 2);
        Object term319969 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term319180, 0, term319969);
        setElement(term319180, 1, enum239);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term319180;
        try {
            callMethod(klass, "printRecord", argTypes, term319675, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



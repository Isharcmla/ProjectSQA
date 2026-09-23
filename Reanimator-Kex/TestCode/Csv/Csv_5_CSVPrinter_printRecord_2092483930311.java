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

public class CSVPrinter_printRecord_2092483930311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term920580;
     Object term920352;

    public CSVPrinter_printRecord_2092483930311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term920702 = new Character('l');
        Class<? extends Object> term921387 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term921386 = ((Class) term921387).getDeclaredField((String) "ALL");
        ((Field) term921386).setAccessible(true);
        Object enum303 = ((Field) term921386).get((Object) null);
        term920580 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term920650 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term920580, term920580.getClass(), "newRecord", true);
        setField(term920650, term920650.getClass(), "quoteChar", term920702);
        setCharField(term920650, term920650.getClass(), "delimiter", (char) 0);
        setField(term920650, term920650.getClass(), "quotePolicy", enum303);
        setField(term920580, term920580.getClass(), "format", term920650);
        term920352 = (Object[]) newArray("java.lang.Object", 2);
        Object term920874 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term920912 = newInstance(Class.forName("java.lang.Object"));
        setElement(term920352, 0, term920874);
        setElement(term920352, 1, term920912);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term920352;
        try {
            callMethod(klass, "printRecord", argTypes, term920580, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



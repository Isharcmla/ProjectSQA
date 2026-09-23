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

public class CSVPrinter_printRecord_2092483930249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284310;
     Object term279511;

    public CSVPrinter_printRecord_2092483930249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term284432 = new Character((char) 2);
        Class<? extends Object> term285079 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term285078 = ((Class) term285079).getDeclaredField((String) "ALL");
        ((Field) term285078).setAccessible(true);
        Object enum209 = ((Field) term285078).get((Object) null);
        term284310 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term284380 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term284310, term284310.getClass(), "newRecord", true);
        setField(term284380, term284380.getClass(), "quoteChar", term284432);
        setCharField(term284380, term284380.getClass(), "delimiter", (char) 8192);
        setField(term284380, term284380.getClass(), "quotePolicy", enum209);
        setField(term284310, term284310.getClass(), "format", term284380);
        term279511 = (Object[]) newArray("java.lang.Object", 1);
        Object term284604 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term279511, 0, term284604);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term279511;
        try {
            callMethod(klass, "printRecord", argTypes, term284310, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



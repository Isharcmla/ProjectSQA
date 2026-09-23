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

public class CSVPrinter_printRecord_2092483930221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306239;
     Object term303738;

    public CSVPrinter_printRecord_2092483930221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term306361 = new Character((char) 8);
        Class<? extends Object> term307074 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term307073 = ((Class) term307074).getDeclaredField((String) "ALL");
        ((Field) term307073).setAccessible(true);
        Object enum200 = ((Field) term307073).get((Object) null);
        term306239 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term306309 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object term306519 = newInstance(Class.forName("java.io.OutputStreamWriter"));
        setBooleanField(term306239, term306239.getClass(), "newRecord", true);
        setField(term306309, term306309.getClass(), "quoteChar", term306361);
        setCharField(term306309, term306309.getClass(), "delimiter", (char) 35230);
        setField(term306309, term306309.getClass(), "quotePolicy", enum200);
        setField(term306239, term306239.getClass(), "format", term306309);
        setField(term306239, term306239.getClass(), "out", term306519);
        term303738 = (Object[]) newArray("java.lang.Object", 1);
        Object term306595 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term303738, 0, term306595);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term303738;
        try {
            callMethod(klass, "printRecord", argTypes, term306239, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



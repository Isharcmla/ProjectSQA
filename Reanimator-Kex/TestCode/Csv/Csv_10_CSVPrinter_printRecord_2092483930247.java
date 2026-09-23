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

public class CSVPrinter_printRecord_2092483930247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278537;
     Object term273286;

    public CSVPrinter_printRecord_2092483930247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term278659 = new Character((char) 16384);
        Class<? extends Object> term279343 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term279342 = ((Class) term279343).getDeclaredField((String) "NONE");
        ((Field) term279342).setAccessible(true);
        Object enum207 = ((Field) term279342).get((Object) null);
        term278537 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term278607 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term278537, term278537.getClass(), "newRecord", true);
        setField(term278607, term278607.getClass(), "quoteChar", term278659);
        setCharField(term278607, term278607.getClass(), "delimiter", (char) 2);
        setField(term278607, term278607.getClass(), "quotePolicy", enum207);
        setField(term278537, term278537.getClass(), "format", term278607);
        term273286 = (Object[]) newArray("java.lang.Object", 1);
        Object term278831 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term273286, 0, term278831);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term273286;
        try {
            callMethod(klass, "printRecord", argTypes, term278537, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



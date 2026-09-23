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

public class CSVPrinter_printRecord_2092483930261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term837425;
     Object term836179;

    public CSVPrinter_printRecord_2092483930261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term837547 = new Character((char) 8192);
        Class<? extends Object> term838198 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term838197 = ((Class) term838198).getDeclaredField((String) "ALL");
        ((Field) term838197).setAccessible(true);
        Object enum246 = ((Field) term838197).get((Object) null);
        term837425 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term837495 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term837425, term837425.getClass(), "newRecord", true);
        setField(term837495, term837495.getClass(), "quoteChar", term837547);
        setCharField(term837495, term837495.getClass(), "delimiter", (char) 65231);
        setField(term837495, term837495.getClass(), "quotePolicy", enum246);
        setField(term837425, term837425.getClass(), "format", term837495);
        term836179 = (Object[]) newArray("java.lang.Object", 1);
        Object term837723 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term836179, 0, term837723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term836179;
        try {
            callMethod(klass, "printRecord", argTypes, term837425, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



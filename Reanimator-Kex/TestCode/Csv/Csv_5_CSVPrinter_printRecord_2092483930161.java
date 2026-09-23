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

public class CSVPrinter_printRecord_2092483930161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155515;
     Object term154829;

    public CSVPrinter_printRecord_2092483930161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term155637 = new Character((char) 64);
        Class<? extends Object> term156288 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term156287 = ((Class) term156288).getDeclaredField((String) "ALL");
        ((Field) term156287).setAccessible(true);
        Object enum136 = ((Field) term156287).get((Object) null);
        term155515 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term155585 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term155515, term155515.getClass(), "newRecord", true);
        setField(term155585, term155585.getClass(), "quoteChar", term155637);
        setCharField(term155585, term155585.getClass(), "delimiter", (char) 8);
        setField(term155585, term155585.getClass(), "quotePolicy", enum136);
        setField(term155515, term155515.getClass(), "format", term155585);
        term154829 = (Object[]) newArray("java.lang.Object", 1);
        Object term155813 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter$1"));
        setElement(term154829, 0, term155813);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term154829;
        try {
            callMethod(klass, "printRecord", argTypes, term155515, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



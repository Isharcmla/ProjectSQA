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

public class CSVPrinter_printRecord_2092483930217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214084;
     Object term213701;

    public CSVPrinter_printRecord_2092483930217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term214206 = new Character((char) 36700);
        Class<? extends Object> term214853 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term214852 = ((Class) term214853).getDeclaredField((String) "ALL");
        ((Field) term214852).setAccessible(true);
        Object enum177 = ((Field) term214852).get((Object) null);
        term214084 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term214154 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term214084, term214084.getClass(), "newRecord", true);
        setField(term214154, term214154.getClass(), "quoteChar", term214206);
        setCharField(term214154, term214154.getClass(), "delimiter", (char) 28832);
        setField(term214154, term214154.getClass(), "quotePolicy", enum177);
        setField(term214084, term214084.getClass(), "format", term214154);
        term213701 = (Object[]) newArray("java.lang.Object", 1);
        Object term214378 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        setElement(term213701, 0, term214378);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term213701;
        try {
            callMethod(klass, "printRecord", argTypes, term214084, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



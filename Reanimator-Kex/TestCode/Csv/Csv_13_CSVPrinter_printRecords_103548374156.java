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

public class CSVPrinter_printRecords_103548374156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36747;
     Object term35824;

    public CSVPrinter_printRecords_103548374156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term36869 = new Character((char) 4);
        Class<? extends Object> term39944 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term39943 = ((Class) term39944).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term39943).setAccessible(true);
        Object enum47 = ((Field) term39943).get((Object) null);
        term36747 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term36817 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term36747, term36747.getClass(), "newRecord", true);
        setField(term36817, term36817.getClass(), "quoteCharacter", term36869);
        setCharField(term36817, term36817.getClass(), "delimiter", (char) 512);
        setField(term36817, term36817.getClass(), "quoteMode", enum47);
        setField(term36817, term36817.getClass(), "escapeCharacter", term36869);
        setField(term36747, term36747.getClass(), "format", term36817);
        term35824 = (Object[]) newArray("java.lang.Object", 128);
        setElement(term35824, 0, "NONE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term35824;
        try {
            callMethod(klass, "printRecords", argTypes, term36747, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



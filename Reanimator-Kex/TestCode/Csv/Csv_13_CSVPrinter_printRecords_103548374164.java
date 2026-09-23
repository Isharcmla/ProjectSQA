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

public class CSVPrinter_printRecords_103548374164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44812;
     Object term44461;

    public CSVPrinter_printRecords_103548374164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term44934 = new Character((char) 0);
        Class<? extends Object> term46502 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term46501 = ((Class) term46502).getDeclaredField((String) "ALL");
        ((Field) term46501).setAccessible(true);
        Object enum55 = ((Field) term46501).get((Object) null);
        Character term45094 = new Character((char) 8192);
        term44812 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term44882 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term44812, term44812.getClass(), "newRecord", true);
        setField(term44882, term44882.getClass(), "quoteCharacter", term44934);
        setCharField(term44882, term44882.getClass(), "delimiter", (char) 16);
        setField(term44882, term44882.getClass(), "quoteMode", enum55);
        setField(term44882, term44882.getClass(), "escapeCharacter", term45094);
        setField(term44812, term44812.getClass(), "format", term44882);
        term44461 = (Object[]) newArray("java.lang.Object", 1);
        setElement(term44461, 0, " \rUU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term44461;
        try {
            callMethod(klass, "printRecords", argTypes, term44812, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



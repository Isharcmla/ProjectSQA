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

public class CSVPrinter_printRecords_103548374165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45666;
     Object term45314;

    public CSVPrinter_printRecords_103548374165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term45788 = new Character((char) 0);
        Class<? extends Object> term47023 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term47022 = ((Class) term47023).getDeclaredField((String) "ALL");
        ((Field) term47022).setAccessible(true);
        Object enum56 = ((Field) term47022).get((Object) null);
        Character term45948 = new Character((char) 8192);
        term45666 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term45736 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term45666, term45666.getClass(), "newRecord", true);
        setField(term45736, term45736.getClass(), "quoteCharacter", term45788);
        setCharField(term45736, term45736.getClass(), "delimiter", (char) 16);
        setField(term45736, term45736.getClass(), "quoteMode", enum56);
        setField(term45736, term45736.getClass(), "escapeCharacter", term45948);
        setField(term45666, term45666.getClass(), "format", term45736);
        term45314 = (Object[]) newArray("java.lang.Object", 1);
        setElement(term45314, 0, " \nUU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term45314;
        try {
            callMethod(klass, "printRecords", argTypes, term45666, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



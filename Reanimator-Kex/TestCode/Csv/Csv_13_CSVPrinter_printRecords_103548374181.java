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

public class CSVPrinter_printRecords_103548374181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58349;
     Object term57964;

    public CSVPrinter_printRecords_103548374181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term58471 = new Character((char) 0);
        Class<? extends Object> term59183 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term59182 = ((Class) term59183).getDeclaredField((String) "ALL");
        ((Field) term59182).setAccessible(true);
        Object enum70 = ((Field) term59182).get((Object) null);
        Character term58631 = new Character((char) 1);
        term58349 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term58419 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term58349, term58349.getClass(), "newRecord", true);
        setField(term58419, term58419.getClass(), "quoteCharacter", term58471);
        setCharField(term58419, term58419.getClass(), "delimiter", (char) 256);
        setField(term58419, term58419.getClass(), "quoteMode", enum70);
        setField(term58419, term58419.getClass(), "escapeCharacter", term58631);
        setField(term58349, term58349.getClass(), "format", term58419);
        term57964 = (Object[]) newArray("java.lang.Object", 4);
        setElement(term57964, 0, "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term57964;
        try {
            callMethod(klass, "printRecords", argTypes, term58349, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class CSVPrinter_printRecords_1035483741111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86624;
     Object term85206;

    public CSVPrinter_printRecords_1035483741111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term86746 = new Character((char) 0);
        Class<? extends Object> term87458 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term87457 = ((Class) term87458).getDeclaredField((String) "ALL");
        ((Field) term87457).setAccessible(true);
        Object enum94 = ((Field) term87457).get((Object) null);
        Character term86906 = new Character((char) 0);
        term86624 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term86694 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term86624, term86624.getClass(), "newRecord", true);
        setField(term86694, term86694.getClass(), "quoteCharacter", term86746);
        setCharField(term86694, term86694.getClass(), "delimiter", (char) 0);
        setField(term86694, term86694.getClass(), "quoteMode", enum94);
        setField(term86694, term86694.getClass(), "escapeCharacter", term86906);
        setField(term86624, term86624.getClass(), "format", term86694);
        term85206 = (Object[]) newArray("java.lang.Object", 4);
        setElement(term85206, 0, "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term85206;
        try {
            callMethod(klass, "printRecords", argTypes, term86624, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



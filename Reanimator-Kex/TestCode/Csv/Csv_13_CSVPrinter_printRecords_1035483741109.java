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

public class CSVPrinter_printRecords_1035483741109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84195;
     Object term83646;

    public CSVPrinter_printRecords_1035483741109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term84317 = new Character((char) 0);
        Class<? extends Object> term85029 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term85028 = ((Class) term85029).getDeclaredField((String) "ALL");
        ((Field) term85028).setAccessible(true);
        Object enum92 = ((Field) term85028).get((Object) null);
        Character term84477 = new Character((char) 2);
        term84195 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term84265 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term84195, term84195.getClass(), "newRecord", true);
        setField(term84265, term84265.getClass(), "quoteCharacter", term84317);
        setCharField(term84265, term84265.getClass(), "delimiter", (char) 16384);
        setField(term84265, term84265.getClass(), "quoteMode", enum92);
        setField(term84265, term84265.getClass(), "escapeCharacter", term84477);
        setField(term84195, term84195.getClass(), "format", term84265);
        term83646 = (Object[]) newArray("java.lang.Object", 64);
        int[] term83647 = (int[]) newIntArray(0);
        Object term84515 = newInstance(Class.forName("java.lang.Object"));
        setElement(term83646, 0, term83647);
        setElement(term83646, 4, term84515);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term83646;
        try {
            callMethod(klass, "printRecords", argTypes, term84195, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



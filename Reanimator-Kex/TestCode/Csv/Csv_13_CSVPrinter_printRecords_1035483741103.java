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

public class CSVPrinter_printRecords_1035483741103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79231;
     Object term74381;

    public CSVPrinter_printRecords_1035483741103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term79353 = new Character((char) 0);
        Class<? extends Object> term80081 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term80080 = ((Class) term80081).getDeclaredField((String) "ALL");
        ((Field) term80080).setAccessible(true);
        Object enum88 = ((Field) term80080).get((Object) null);
        Character term79513 = new Character((char) 35861);
        term79231 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term79301 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term79231, term79231.getClass(), "newRecord", true);
        setField(term79301, term79301.getClass(), "quoteCharacter", term79353);
        setCharField(term79301, term79301.getClass(), "delimiter", (char) 16384);
        setField(term79301, term79301.getClass(), "quoteMode", enum88);
        setField(term79301, term79301.getClass(), "escapeCharacter", term79513);
        setField(term79231, term79231.getClass(), "format", term79301);
        term74381 = (Object[]) newArray("java.lang.Object", 256);
        setElement(term74381, 0, enum88);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term74381;
        try {
            callMethod(klass, "printRecords", argTypes, term79231, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



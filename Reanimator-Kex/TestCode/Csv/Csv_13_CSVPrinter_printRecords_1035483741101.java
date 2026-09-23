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

public class CSVPrinter_printRecords_1035483741101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73334;
     Object term72698;

    public CSVPrinter_printRecords_1035483741101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term73456 = new Character((char) 0);
        Class<? extends Object> term74168 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term74167 = ((Class) term74168).getDeclaredField((String) "ALL");
        ((Field) term74167).setAccessible(true);
        Object enum86 = ((Field) term74167).get((Object) null);
        Character term73616 = new Character((char) 0);
        term73334 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term73404 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term73334, term73334.getClass(), "newRecord", true);
        setField(term73404, term73404.getClass(), "quoteCharacter", term73456);
        setCharField(term73404, term73404.getClass(), "delimiter", (char) 0);
        setField(term73404, term73404.getClass(), "quoteMode", enum86);
        setField(term73404, term73404.getClass(), "escapeCharacter", term73616);
        setField(term73334, term73334.getClass(), "format", term73404);
        term72698 = (Object[]) newArray("java.lang.Object", 128);
        setElement(term72698, 0, "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term72698;
        try {
            callMethod(klass, "printRecords", argTypes, term73334, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



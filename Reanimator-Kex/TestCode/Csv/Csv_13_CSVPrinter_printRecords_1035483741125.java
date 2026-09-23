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

public class CSVPrinter_printRecords_1035483741125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101252;
     Object term97194;

    public CSVPrinter_printRecords_1035483741125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term101374 = new Character((char) 0);
        Class<? extends Object> term102184 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term102183 = ((Class) term102184).getDeclaredField((String) "ALL");
        ((Field) term102183).setAccessible(true);
        Object enum106 = ((Field) term102183).get((Object) null);
        Character term101534 = new Character((char) 128);
        term101252 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term101322 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term101252, term101252.getClass(), "newRecord", true);
        setField(term101322, term101322.getClass(), "quoteCharacter", term101374);
        setCharField(term101322, term101322.getClass(), "delimiter", (char) 2048);
        setField(term101322, term101322.getClass(), "quoteMode", enum106);
        setField(term101322, term101322.getClass(), "escapeCharacter", term101534);
        setField(term101252, term101252.getClass(), "format", term101322);
        term97194 = (Object[]) newArray("java.lang.Object", 4);
        Object term101604 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setElement(term97194, 0, term101604);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term97194;
        try {
            callMethod(klass, "printRecords", argTypes, term101252, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



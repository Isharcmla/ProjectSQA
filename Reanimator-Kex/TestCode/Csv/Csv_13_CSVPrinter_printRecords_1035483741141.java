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

public class CSVPrinter_printRecords_1035483741141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116164;
     Object term115749;

    public CSVPrinter_printRecords_1035483741141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term116286 = new Character((char) 8);
        Class<? extends Object> term116945 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term116944 = ((Class) term116945).getDeclaredField((String) "ALL");
        ((Field) term116944).setAccessible(true);
        Object enum118 = ((Field) term116944).get((Object) null);
        term116164 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term116234 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term116164, term116164.getClass(), "newRecord", true);
        setField(term116234, term116234.getClass(), "quoteCharacter", term116286);
        setCharField(term116234, term116234.getClass(), "delimiter", (char) 0);
        setField(term116234, term116234.getClass(), "quoteMode", enum118);
        setField(term116164, term116164.getClass(), "format", term116234);
        term115749 = (Object[]) newArray("java.lang.Object", 2);
        setElement(term115749, 0, "MINIMAL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term115749;
        try {
            callMethod(klass, "printRecords", argTypes, term116164, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



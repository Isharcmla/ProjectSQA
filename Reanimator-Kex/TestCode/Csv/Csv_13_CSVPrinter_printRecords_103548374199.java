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

public class CSVPrinter_printRecords_103548374199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71621;
     Object term71054;

    public CSVPrinter_printRecords_103548374199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term71743 = new Character((char) 0);
        Class<? extends Object> term72456 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term72455 = ((Class) term72456).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term72455).setAccessible(true);
        Object enum84 = ((Field) term72455).get((Object) null);
        term71621 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term71691 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term71621, term71621.getClass(), "newRecord", true);
        setField(term71691, term71691.getClass(), "quoteCharacter", term71743);
        setCharField(term71691, term71691.getClass(), "delimiter", (char) 0);
        setField(term71691, term71691.getClass(), "quoteMode", enum84);
        setField(term71621, term71621.getClass(), "format", term71691);
        term71054 = (Object[]) newArray("java.lang.Object", 8);
        setElement(term71054, 0, "NONE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term71054;
        try {
            callMethod(klass, "printRecords", argTypes, term71621, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



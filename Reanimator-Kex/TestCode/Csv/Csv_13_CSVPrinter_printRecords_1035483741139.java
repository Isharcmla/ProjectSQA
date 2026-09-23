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

public class CSVPrinter_printRecords_1035483741139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114712;
     Object term114125;

    public CSVPrinter_printRecords_1035483741139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term114834 = new Character((char) 0);
        Class<? extends Object> term115510 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term115509 = ((Class) term115510).getDeclaredField((String) "ALL");
        ((Field) term115509).setAccessible(true);
        Object enum116 = ((Field) term115509).get((Object) null);
        term114712 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term114782 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term114712, term114712.getClass(), "newRecord", true);
        setField(term114782, term114782.getClass(), "quoteCharacter", term114834);
        setCharField(term114782, term114782.getClass(), "delimiter", (char) 0);
        setField(term114782, term114782.getClass(), "quoteMode", enum116);
        setField(term114782, term114782.getClass(), "escapeCharacter", term114834);
        setField(term114712, term114712.getClass(), "format", term114782);
        term114125 = (Object[]) newArray("java.lang.Object", 1);
        setElement(term114125, 0, enum116);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term114125;
        try {
            callMethod(klass, "printRecords", argTypes, term114712, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



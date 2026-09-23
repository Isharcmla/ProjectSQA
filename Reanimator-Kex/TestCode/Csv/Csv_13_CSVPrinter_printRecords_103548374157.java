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

public class CSVPrinter_printRecords_103548374157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39010;
     Object term37221;

    public CSVPrinter_printRecords_103548374157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term39132 = new Character((char) 0);
        Class<? extends Object> term40511 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term40510 = ((Class) term40511).getDeclaredField((String) "ALL");
        ((Field) term40510).setAccessible(true);
        Object enum48 = ((Field) term40510).get((Object) null);
        Character term39292 = new Character((char) 4096);
        term39010 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term39080 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object term39350 = newInstance(Class.forName("java.io.OutputStreamWriter"));
        setBooleanField(term39010, term39010.getClass(), "newRecord", true);
        setField(term39080, term39080.getClass(), "quoteCharacter", term39132);
        setCharField(term39080, term39080.getClass(), "delimiter", (char) 32);
        setField(term39080, term39080.getClass(), "quoteMode", enum48);
        setField(term39080, term39080.getClass(), "escapeCharacter", term39292);
        setField(term39010, term39010.getClass(), "format", term39080);
        setField(term39010, term39010.getClass(), "out", term39350);
        term37221 = (Object[]) newArray("java.lang.Object", 4);
        setElement(term37221, 0, "NON_NUMERIC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term37221;
        try {
            callMethod(klass, "printRecords", argTypes, term39010, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



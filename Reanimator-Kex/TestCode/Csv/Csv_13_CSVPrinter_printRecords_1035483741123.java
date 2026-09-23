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

public class CSVPrinter_printRecords_1035483741123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96025;
     Object term95185;

    public CSVPrinter_printRecords_1035483741123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term96147 = new Character((char) 0);
        Class<? extends Object> term96908 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term96907 = ((Class) term96908).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term96907).setAccessible(true);
        Object enum104 = ((Field) term96907).get((Object) null);
        Character term96307 = new Character((char) 512);
        term96025 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term96095 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term96025, term96025.getClass(), "newRecord", true);
        setField(term96095, term96095.getClass(), "quoteCharacter", term96147);
        setCharField(term96095, term96095.getClass(), "delimiter", (char) 32);
        setField(term96095, term96095.getClass(), "quoteMode", enum104);
        setField(term96095, term96095.getClass(), "escapeCharacter", term96307);
        setField(term96025, term96025.getClass(), "format", term96095);
        term95185 = (Object[]) newArray("java.lang.Object", 4);
        setElement(term95185, 0, "NON_NUMERIC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term95185;
        try {
            callMethod(klass, "printRecords", argTypes, term96025, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



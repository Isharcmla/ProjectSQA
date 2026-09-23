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

public class CSVPrinter_printRecords_103548374183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60466;
     Object term59368;

    public CSVPrinter_printRecords_103548374183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term60588 = new Character((char) 0);
        Class<? extends Object> term61315 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term61314 = ((Class) term61315).getDeclaredField((String) "ALL");
        ((Field) term61314).setAccessible(true);
        Object enum72 = ((Field) term61314).get((Object) null);
        Character term60748 = new Character((char) 2);
        term60466 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term60536 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term60466, term60466.getClass(), "newRecord", true);
        setField(term60536, term60536.getClass(), "quoteCharacter", term60588);
        setCharField(term60536, term60536.getClass(), "delimiter", (char) 128);
        setField(term60536, term60536.getClass(), "quoteMode", enum72);
        setField(term60536, term60536.getClass(), "escapeCharacter", term60748);
        setField(term60466, term60466.getClass(), "format", term60536);
        Character term60800 = new Character((char) 0);
        term59368 = (Object[]) newArray("java.lang.Object", 32);
        setElement(term59368, 0, term60800);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term59368;
        try {
            callMethod(klass, "printRecords", argTypes, term60466, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



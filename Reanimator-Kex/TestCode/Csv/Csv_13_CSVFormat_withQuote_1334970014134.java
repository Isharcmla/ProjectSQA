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
import java.lang.IllegalArgumentException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Character;

public class CSVFormat_withQuote_1334970014134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113041;
     Object term113315;

    public CSVFormat_withQuote_1334970014134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term114064 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term114063 = ((Class) term114064).getDeclaredField((String) "MINIMAL");
        ((Field) term114063).setAccessible(true);
        Object enum189 = ((Field) term114063).get((Object) null);
        term113041 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term112874 = (Object[]) newArray("java.lang.String", 34);
        setCharField(term113041, term113041.getClass(), "delimiter", (char) 0);
        setField(term113041, term113041.getClass(), "quoteMode", enum189);
        setField(term113041, term113041.getClass(), "commentMarker", null);
        setField(term113041, term113041.getClass(), "escapeCharacter", null);
        setBooleanField(term113041, term113041.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term113041, term113041.getClass(), "ignoreEmptyLines", false);
        setField(term113041, term113041.getClass(), "recordSeparator", null);
        setField(term113041, term113041.getClass(), "nullString", null);
        setElement(term112874, 0, "");
        setElement(term112874, 1, "");
        setElement(term112874, 2, "");
        setElement(term112874, 3, "");
        setElement(term112874, 5, "");
        setElement(term112874, 6, "");
        setElement(term112874, 7, "");
        setElement(term112874, 8, "");
        setElement(term112874, 9, "");
        setElement(term112874, 10, "");
        setElement(term112874, 11, "");
        setElement(term112874, 12, "");
        setElement(term112874, 13, "");
        setElement(term112874, 14, "");
        setElement(term112874, 15, "");
        setElement(term112874, 16, "");
        setElement(term112874, 17, "");
        setElement(term112874, 18, "");
        setElement(term112874, 19, "");
        setElement(term112874, 20, "");
        setElement(term112874, 21, "");
        setElement(term112874, 22, "");
        setElement(term112874, 23, "");
        setElement(term112874, 24, "");
        setElement(term112874, 25, "");
        setElement(term112874, 26, "");
        setElement(term112874, 27, "");
        setElement(term112874, 28, "");
        setElement(term112874, 29, "");
        setElement(term112874, 30, "");
        setElement(term112874, 31, "");
        setElement(term112874, 32, "");
        setElement(term112874, 33, "");
        setField(term113041, term113041.getClass(), "headerComments", term112874);
        setField(term113041, term113041.getClass(), "header", null);
        setBooleanField(term113041, term113041.getClass(), "skipHeaderRecord", false);
        setBooleanField(term113041, term113041.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term113041, term113041.getClass(), "ignoreHeaderCase", false);
        term113315 = new Character((char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Character");
        Object[] args = new Object[1];
        args[0] = term113315;
        try {
            callMethod(klass, "withQuote", argTypes, term113041, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



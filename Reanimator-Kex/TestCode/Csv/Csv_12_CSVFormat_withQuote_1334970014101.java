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

public class CSVFormat_withQuote_1334970014101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58995;
     Object term59193;

    public CSVFormat_withQuote_1334970014101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term59718 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term59717 = ((Class) term59718).getDeclaredField((String) "MINIMAL");
        ((Field) term59717).setAccessible(true);
        Object enum139 = ((Field) term59717).get((Object) null);
        term58995 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term58995, term58995.getClass(), "delimiter", (char) 0);
        setField(term58995, term58995.getClass(), "quoteMode", enum139);
        setField(term58995, term58995.getClass(), "commentMarker", null);
        setField(term58995, term58995.getClass(), "escapeCharacter", null);
        setBooleanField(term58995, term58995.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term58995, term58995.getClass(), "ignoreEmptyLines", false);
        setField(term58995, term58995.getClass(), "recordSeparator", "");
        setField(term58995, term58995.getClass(), "nullString", null);
        setField(term58995, term58995.getClass(), "header", null);
        setBooleanField(term58995, term58995.getClass(), "skipHeaderRecord", false);
        setBooleanField(term58995, term58995.getClass(), "allowMissingColumnNames", false);
        term59193 = new Character((char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Character");
        Object[] args = new Object[1];
        args[0] = term59193;
        try {
            callMethod(klass, "withQuote", argTypes, term58995, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



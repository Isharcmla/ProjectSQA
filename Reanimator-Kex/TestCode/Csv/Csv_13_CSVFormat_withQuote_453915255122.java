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

public class CSVFormat_withQuote_453915255122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104656;

    public CSVFormat_withQuote_453915255122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term105316 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term105315 = ((Class) term105316).getDeclaredField((String) "MINIMAL");
        ((Field) term105315).setAccessible(true);
        Object enum183 = ((Field) term105315).get((Object) null);
        term104656 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term104526 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term104656, term104656.getClass(), "delimiter", (char) 0);
        setField(term104656, term104656.getClass(), "quoteMode", enum183);
        setField(term104656, term104656.getClass(), "commentMarker", null);
        setField(term104656, term104656.getClass(), "escapeCharacter", null);
        setBooleanField(term104656, term104656.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term104656, term104656.getClass(), "ignoreEmptyLines", false);
        setField(term104656, term104656.getClass(), "recordSeparator", null);
        setField(term104656, term104656.getClass(), "nullString", null);
        setField(term104656, term104656.getClass(), "headerComments", term104526);
        setField(term104656, term104656.getClass(), "header", null);
        setBooleanField(term104656, term104656.getClass(), "skipHeaderRecord", false);
        setBooleanField(term104656, term104656.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term104656, term104656.getClass(), "ignoreHeaderCase", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        try {
            callMethod(klass, "withQuote", argTypes, term104656, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



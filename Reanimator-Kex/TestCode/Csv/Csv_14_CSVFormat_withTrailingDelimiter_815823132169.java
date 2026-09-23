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
import java.lang.Character;
import java.lang.String;
import java.lang.Object;

public class CSVFormat_withTrailingDelimiter_815823132169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140541;

    public CSVFormat_withTrailingDelimiter_815823132169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term140593 = new Character((char) 0);
        Class<? extends Object> term141393 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term141392 = ((Class) term141393).getDeclaredField((String) "NONE");
        ((Field) term141392).setAccessible(true);
        Object enum261 = ((Field) term141392).get((Object) null);
        term140541 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term140375 = (Object[]) newArray("java.lang.String", 3);
        setCharField(term140541, term140541.getClass(), "delimiter", (char) 2048);
        setField(term140541, term140541.getClass(), "quoteCharacter", term140593);
        setField(term140541, term140541.getClass(), "quoteMode", enum261);
        setField(term140541, term140541.getClass(), "commentMarker", null);
        setField(term140541, term140541.getClass(), "escapeCharacter", null);
        setBooleanField(term140541, term140541.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term140541, term140541.getClass(), "ignoreEmptyLines", false);
        setField(term140541, term140541.getClass(), "recordSeparator", "");
        setField(term140541, term140541.getClass(), "nullString", "");
        setElement(term140375, 0, "");
        setElement(term140375, 1, "");
        setElement(term140375, 2, "");
        setField(term140541, term140541.getClass(), "headerComments", term140375);
        setField(term140541, term140541.getClass(), "header", term140375);
        setBooleanField(term140541, term140541.getClass(), "skipHeaderRecord", false);
        setBooleanField(term140541, term140541.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term140541, term140541.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term140541, term140541.getClass(), "trim", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "withTrailingDelimiter", argTypes, term140541, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



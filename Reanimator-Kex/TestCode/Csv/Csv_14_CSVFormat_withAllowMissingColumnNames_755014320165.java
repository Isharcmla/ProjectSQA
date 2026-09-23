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
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.csv.EqualityUtils.*;
import java.lang.Character;
import java.lang.String;
import java.lang.Object;

public class CSVFormat_withAllowMissingColumnNames_755014320165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137354;
     Object term138053;
     Object term137932;

    public CSVFormat_withAllowMissingColumnNames_755014320165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term137406 = new Character((char) 0);
        Class<? extends Object> term138073 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term138072 = ((Class) term138073).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term138072).setAccessible(true);
        Object enum255 = ((Field) term138072).get((Object) null);
        term137354 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term137163 = (Object[]) newArray("java.lang.String", 6);
        Object[] term137169 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term137354, term137354.getClass(), "delimiter", (char) 16);
        setField(term137354, term137354.getClass(), "quoteCharacter", term137406);
        setField(term137354, term137354.getClass(), "quoteMode", enum255);
        setField(term137354, term137354.getClass(), "commentMarker", null);
        setField(term137354, term137354.getClass(), "escapeCharacter", null);
        setBooleanField(term137354, term137354.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term137354, term137354.getClass(), "ignoreEmptyLines", false);
        setField(term137354, term137354.getClass(), "recordSeparator", null);
        setField(term137354, term137354.getClass(), "nullString", null);
        setElement(term137163, 0, "");
        setElement(term137163, 1, "");
        setElement(term137163, 2, "");
        setElement(term137163, 3, "");
        setElement(term137163, 4, "");
        setElement(term137163, 5, "");
        setField(term137354, term137354.getClass(), "headerComments", term137163);
        setField(term137354, term137354.getClass(), "header", term137169);
        setBooleanField(term137354, term137354.getClass(), "skipHeaderRecord", false);
        setBooleanField(term137354, term137354.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term137354, term137354.getClass(), "trim", false);
        setBooleanField(term137354, term137354.getClass(), "trailingDelimiter", false);
        Character term138068 = new Character((char) 0);
        Class<? extends Object> term138273 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term138272 = ((Class) term138273).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term138272).setAccessible(true);
        Object enum256 = ((Field) term138272).get((Object) null);
        term138053 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term138054 = (Object[]) newArray("java.lang.String", 0);
        Object[] term138055 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term138053, term138053.getClass(), "allowMissingColumnNames", false);
        setField(term138053, term138053.getClass(), "commentMarker", null);
        setCharField(term138053, term138053.getClass(), "delimiter", (char) 16);
        setField(term138053, term138053.getClass(), "escapeCharacter", null);
        setField(term138053, term138053.getClass(), "header", term138054);
        setElement(term138055, 0, "");
        setElement(term138055, 1, "");
        setElement(term138055, 2, "");
        setElement(term138055, 3, "");
        setElement(term138055, 4, "");
        setElement(term138055, 5, "");
        setField(term138053, term138053.getClass(), "headerComments", term138055);
        setBooleanField(term138053, term138053.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term138053, term138053.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term138053, term138053.getClass(), "ignoreSurroundingSpaces", false);
        setField(term138053, term138053.getClass(), "nullString", null);
        setField(term138053, term138053.getClass(), "quoteCharacter", term138068);
        setField(term138053, term138053.getClass(), "quoteMode", enum256);
        setField(term138053, term138053.getClass(), "recordSeparator", null);
        setBooleanField(term138053, term138053.getClass(), "skipHeaderRecord", false);
        setBooleanField(term138053, term138053.getClass(), "trailingDelimiter", false);
        setBooleanField(term138053, term138053.getClass(), "trim", false);
        Character term137952 = new Character((char) 0);
        Class<? extends Object> term138473 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term138472 = ((Class) term138473).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term138472).setAccessible(true);
        Object enum257 = ((Field) term138472).get((Object) null);
        term137932 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term137935 = (Object[]) newArray("java.lang.String", 0);
        Object[] term137936 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term137932, term137932.getClass(), "allowMissingColumnNames", true);
        setField(term137932, term137932.getClass(), "commentMarker", null);
        setCharField(term137932, term137932.getClass(), "delimiter", (char) 16);
        setField(term137932, term137932.getClass(), "escapeCharacter", null);
        setField(term137932, term137932.getClass(), "header", term137935);
        setElement(term137936, 0, "");
        setElement(term137936, 1, "");
        setElement(term137936, 2, "");
        setElement(term137936, 3, "");
        setElement(term137936, 4, "");
        setElement(term137936, 5, "");
        setField(term137932, term137932.getClass(), "headerComments", term137936);
        setBooleanField(term137932, term137932.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term137932, term137932.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term137932, term137932.getClass(), "ignoreSurroundingSpaces", false);
        setField(term137932, term137932.getClass(), "nullString", null);
        setField(term137932, term137932.getClass(), "quoteCharacter", term137952);
        setField(term137932, term137932.getClass(), "quoteMode", enum257);
        setField(term137932, term137932.getClass(), "recordSeparator", null);
        setBooleanField(term137932, term137932.getClass(), "skipHeaderRecord", false);
        setBooleanField(term137932, term137932.getClass(), "trailingDelimiter", false);
        setBooleanField(term137932, term137932.getClass(), "trim", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = true;
        Object retValue = callMethod(klass, "withAllowMissingColumnNames", argTypes, term137354, args);
        assertTrue(recursiveEquals(term137354, term138053));
        assertTrue(recursiveEquals(retValue, term137932));
    }

};



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

public class CSVFormat_withHeader_1963585283163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135851;

    public CSVFormat_withHeader_1963585283163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term136697 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term136696 = ((Class) term136697).getDeclaredField((String) "NONE");
        ((Field) term136696).setAccessible(true);
        Object enum253 = ((Field) term136696).get((Object) null);
        term135851 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term135693 = (Object[]) newArray("java.lang.String", 10);
        setCharField(term135851, term135851.getClass(), "delimiter", (char) 0);
        setField(term135851, term135851.getClass(), "quoteCharacter", null);
        setField(term135851, term135851.getClass(), "quoteMode", enum253);
        setField(term135851, term135851.getClass(), "commentMarker", null);
        setField(term135851, term135851.getClass(), "escapeCharacter", null);
        setBooleanField(term135851, term135851.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term135851, term135851.getClass(), "ignoreEmptyLines", false);
        setField(term135851, term135851.getClass(), "recordSeparator", "");
        setField(term135851, term135851.getClass(), "nullString", null);
        setElement(term135693, 0, "");
        setElement(term135693, 1, "NONE");
        setElement(term135693, 2, "");
        setElement(term135693, 4, "");
        setElement(term135693, 5, "");
        setElement(term135693, 6, "");
        setElement(term135693, 7, "");
        setElement(term135693, 8, "");
        setElement(term135693, 9, "");
        setField(term135851, term135851.getClass(), "headerComments", term135693);
        setBooleanField(term135851, term135851.getClass(), "skipHeaderRecord", false);
        setBooleanField(term135851, term135851.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term135851, term135851.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term135851, term135851.getClass(), "trim", false);
        setBooleanField(term135851, term135851.getClass(), "trailingDelimiter", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.ResultSet");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "withHeader", argTypes, term135851, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



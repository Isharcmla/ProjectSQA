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
import java.lang.String;
import java.lang.Object;

public class CSVFormat_withIgnoreHeaderCase_1929024790138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117759;
     Object term118306;
     Object term118219;

    public CSVFormat_withIgnoreHeaderCase_1929024790138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term118321 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term118320 = ((Class) term118321).getDeclaredField((String) "MINIMAL");
        ((Field) term118320).setAccessible(true);
        Object enum191 = ((Field) term118320).get((Object) null);
        term117759 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term117617 = (Object[]) newArray("java.lang.String", 2);
        Object[] term117620 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term117759, term117759.getClass(), "delimiter", (char) 0);
        setField(term117759, term117759.getClass(), "quoteCharacter", null);
        setField(term117759, term117759.getClass(), "quoteMode", enum191);
        setField(term117759, term117759.getClass(), "commentMarker", null);
        setField(term117759, term117759.getClass(), "escapeCharacter", null);
        setBooleanField(term117759, term117759.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term117759, term117759.getClass(), "ignoreEmptyLines", false);
        setField(term117759, term117759.getClass(), "recordSeparator", "");
        setField(term117759, term117759.getClass(), "nullString", "");
        setElement(term117617, 0, "");
        setElement(term117617, 1, "");
        setField(term117759, term117759.getClass(), "headerComments", term117617);
        setField(term117759, term117759.getClass(), "header", term117620);
        setBooleanField(term117759, term117759.getClass(), "skipHeaderRecord", false);
        setBooleanField(term117759, term117759.getClass(), "allowMissingColumnNames", false);
        Class<? extends Object> term118509 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term118508 = ((Class) term118509).getDeclaredField((String) "MINIMAL");
        ((Field) term118508).setAccessible(true);
        Object enum192 = ((Field) term118508).get((Object) null);
        term118306 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term118314 = (Object[]) newArray("java.lang.String", 0);
        Object[] term118315 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term118306, term118306.getClass(), "delimiter", (char) 0);
        setField(term118306, term118306.getClass(), "quoteCharacter", null);
        setField(term118306, term118306.getClass(), "quoteMode", enum192);
        setField(term118306, term118306.getClass(), "commentMarker", null);
        setField(term118306, term118306.getClass(), "escapeCharacter", null);
        setBooleanField(term118306, term118306.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term118306, term118306.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term118306, term118306.getClass(), "ignoreEmptyLines", false);
        setField(term118306, term118306.getClass(), "recordSeparator", "");
        setField(term118306, term118306.getClass(), "nullString", "");
        setField(term118306, term118306.getClass(), "header", term118314);
        setElement(term118315, 0, "");
        setElement(term118315, 1, "");
        setField(term118306, term118306.getClass(), "headerComments", term118315);
        setBooleanField(term118306, term118306.getClass(), "skipHeaderRecord", false);
        setBooleanField(term118306, term118306.getClass(), "ignoreHeaderCase", false);
        Class<? extends Object> term118697 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term118696 = ((Class) term118697).getDeclaredField((String) "MINIMAL");
        ((Field) term118696).setAccessible(true);
        Object enum193 = ((Field) term118696).get((Object) null);
        term118219 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term118239 = (Object[]) newArray("java.lang.String", 0);
        Object[] term118240 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term118219, term118219.getClass(), "delimiter", (char) 0);
        setField(term118219, term118219.getClass(), "quoteCharacter", null);
        setField(term118219, term118219.getClass(), "quoteMode", enum193);
        setField(term118219, term118219.getClass(), "commentMarker", null);
        setField(term118219, term118219.getClass(), "escapeCharacter", null);
        setBooleanField(term118219, term118219.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term118219, term118219.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term118219, term118219.getClass(), "ignoreEmptyLines", false);
        setField(term118219, term118219.getClass(), "recordSeparator", "");
        setField(term118219, term118219.getClass(), "nullString", "");
        setField(term118219, term118219.getClass(), "header", term118239);
        setElement(term118240, 0, "");
        setElement(term118240, 1, "");
        setField(term118219, term118219.getClass(), "headerComments", term118240);
        setBooleanField(term118219, term118219.getClass(), "skipHeaderRecord", false);
        setBooleanField(term118219, term118219.getClass(), "ignoreHeaderCase", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        Object retValue = callMethod(klass, "withIgnoreHeaderCase", argTypes, term117759, args);
        assertTrue(recursiveEquals(term117759, term118306));
        assertTrue(recursiveEquals(retValue, term118219));
    }

};



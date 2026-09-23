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
import java.lang.Object;
import java.lang.String;

public class CSVFormat_getAutoFlush_81789415199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8226;
     Object term55019;

    public CSVFormat_getAutoFlush_81789415199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term8228 = new Character('F');
        Character term8231 = new Character('R');
        Character term8406 = new Character('N');
        Class<? extends Object> term55199 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term55198 = ((Class) term55199).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term55198).setAccessible(true);
        Object enum114 = ((Field) term55198).get((Object) null);
        term8226 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term8233 = (Object[]) newArray("java.lang.String", 9);
        Object[] term8342 = (Object[]) newArray("java.lang.String", 4);
        setBooleanField(term8226, term8226.getClass(), "allowMissingColumnNames", true);
        setField(term8226, term8226.getClass(), "commentMarker", term8228);
        setCharField(term8226, term8226.getClass(), "delimiter", 'h');
        setField(term8226, term8226.getClass(), "escapeCharacter", term8231);
        setElement(term8233, 0, "YpJbIgJWWv");
        setElement(term8233, 1, "JppkknKVOw");
        setElement(term8233, 2, "iljANwuEjk");
        setElement(term8233, 3, "kNqaJKIATy");
        setElement(term8233, 4, "vKQukfbJUd");
        setElement(term8233, 5, "lFRJFUMVbx");
        setElement(term8233, 6, "sZdUNdggUW");
        setElement(term8233, 7, "OqbwYQfvAe");
        setElement(term8233, 8, "tRxZafjqIx");
        setField(term8226, term8226.getClass(), "header", term8233);
        setElement(term8342, 0, "DhjNLmRMCu");
        setElement(term8342, 1, "PgPzMSEjjX");
        setElement(term8342, 2, "wzsPSPcRdj");
        setElement(term8342, 3, "kGMQdqJYyB");
        setField(term8226, term8226.getClass(), "headerComments", term8342);
        setBooleanField(term8226, term8226.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term8226, term8226.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term8226, term8226.getClass(), "ignoreSurroundingSpaces", false);
        setField(term8226, term8226.getClass(), "nullString", "XJJNClzHRf");
        setField(term8226, term8226.getClass(), "quoteCharacter", term8406);
        setField(term8226, term8226.getClass(), "quoteMode", enum114);
        setField(term8226, term8226.getClass(), "recordSeparator", "HDaezxQfQR");
        setBooleanField(term8226, term8226.getClass(), "skipHeaderRecord", false);
        setBooleanField(term8226, term8226.getClass(), "trailingDelimiter", true);
        setBooleanField(term8226, term8226.getClass(), "trim", false);
        setBooleanField(term8226, term8226.getClass(), "autoFlush", false);
        Character term55020 = new Character('F');
        Character term55021 = new Character('R');
        Character term55052 = new Character('N');
        Class<? extends Object> term55549 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term55548 = ((Class) term55549).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term55548).setAccessible(true);
        Object enum115 = ((Field) term55548).get((Object) null);
        term55019 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term55022 = (Object[]) newArray("java.lang.String", 9);
        Object[] term55041 = (Object[]) newArray("java.lang.String", 4);
        setBooleanField(term55019, term55019.getClass(), "allowMissingColumnNames", true);
        setField(term55019, term55019.getClass(), "commentMarker", term55020);
        setCharField(term55019, term55019.getClass(), "delimiter", 'h');
        setField(term55019, term55019.getClass(), "escapeCharacter", term55021);
        setElement(term55022, 0, "YpJbIgJWWv");
        setElement(term55022, 1, "JppkknKVOw");
        setElement(term55022, 2, "iljANwuEjk");
        setElement(term55022, 3, "kNqaJKIATy");
        setElement(term55022, 4, "vKQukfbJUd");
        setElement(term55022, 5, "lFRJFUMVbx");
        setElement(term55022, 6, "sZdUNdggUW");
        setElement(term55022, 7, "OqbwYQfvAe");
        setElement(term55022, 8, "tRxZafjqIx");
        setField(term55019, term55019.getClass(), "header", term55022);
        setElement(term55041, 0, "DhjNLmRMCu");
        setElement(term55041, 1, "PgPzMSEjjX");
        setElement(term55041, 2, "wzsPSPcRdj");
        setElement(term55041, 3, "kGMQdqJYyB");
        setField(term55019, term55019.getClass(), "headerComments", term55041);
        setBooleanField(term55019, term55019.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term55019, term55019.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term55019, term55019.getClass(), "ignoreSurroundingSpaces", false);
        setField(term55019, term55019.getClass(), "nullString", "XJJNClzHRf");
        setField(term55019, term55019.getClass(), "quoteCharacter", term55052);
        setField(term55019, term55019.getClass(), "quoteMode", enum115);
        setField(term55019, term55019.getClass(), "recordSeparator", "HDaezxQfQR");
        setBooleanField(term55019, term55019.getClass(), "skipHeaderRecord", false);
        setBooleanField(term55019, term55019.getClass(), "trailingDelimiter", true);
        setBooleanField(term55019, term55019.getClass(), "trim", false);
        setBooleanField(term55019, term55019.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAutoFlush", argTypes, term8226, args);
        assertTrue(recursiveEquals(term8226, term55019));
    }

};



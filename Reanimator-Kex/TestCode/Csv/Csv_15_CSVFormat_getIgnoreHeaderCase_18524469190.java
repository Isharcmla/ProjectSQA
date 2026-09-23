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

public class CSVFormat_getIgnoreHeaderCase_18524469190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4325;
     Object term48020;

    public CSVFormat_getIgnoreHeaderCase_18524469190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term4327 = new Character('Z');
        Character term4330 = new Character('V');
        Character term4469 = new Character('m');
        Class<? extends Object> term48311 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term48310 = ((Class) term48311).getDeclaredField((String) "NONE");
        ((Field) term48310).setAccessible(true);
        Object enum95 = ((Field) term48310).get((Object) null);
        term4325 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term4332 = (Object[]) newArray("java.lang.String", 1);
        Object[] term4345 = (Object[]) newArray("java.lang.String", 9);
        setBooleanField(term4325, term4325.getClass(), "allowMissingColumnNames", false);
        setField(term4325, term4325.getClass(), "commentMarker", term4327);
        setCharField(term4325, term4325.getClass(), "delimiter", 'p');
        setField(term4325, term4325.getClass(), "escapeCharacter", term4330);
        setElement(term4332, 0, "JqXGgAhZPl");
        setField(term4325, term4325.getClass(), "header", term4332);
        setElement(term4345, 0, "jiKYgYHqIS");
        setElement(term4345, 1, "DfISiziTgG");
        setElement(term4345, 2, "XqgfKFvPSD");
        setElement(term4345, 3, "JiVRgTZvKc");
        setElement(term4345, 4, "XPKmummaqg");
        setElement(term4345, 5, "BKLfkLiZTH");
        setElement(term4345, 6, "SPpkrGcPRr");
        setElement(term4345, 7, "sEccwbJKYE");
        setElement(term4345, 8, "AWRooQKkdW");
        setField(term4325, term4325.getClass(), "headerComments", term4345);
        setBooleanField(term4325, term4325.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term4325, term4325.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term4325, term4325.getClass(), "ignoreSurroundingSpaces", false);
        setField(term4325, term4325.getClass(), "nullString", "vjxIhXHxGR");
        setField(term4325, term4325.getClass(), "quoteCharacter", term4469);
        setField(term4325, term4325.getClass(), "quoteMode", enum95);
        setField(term4325, term4325.getClass(), "recordSeparator", "QXzGXbEXMu");
        setBooleanField(term4325, term4325.getClass(), "skipHeaderRecord", true);
        setBooleanField(term4325, term4325.getClass(), "trailingDelimiter", false);
        setBooleanField(term4325, term4325.getClass(), "trim", true);
        setBooleanField(term4325, term4325.getClass(), "autoFlush", false);
        Character term48021 = new Character('Z');
        Character term48022 = new Character('V');
        Character term48047 = new Character('m');
        Class<? extends Object> term48610 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term48609 = ((Class) term48610).getDeclaredField((String) "NONE");
        ((Field) term48609).setAccessible(true);
        Object enum96 = ((Field) term48609).get((Object) null);
        term48020 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term48023 = (Object[]) newArray("java.lang.String", 1);
        Object[] term48026 = (Object[]) newArray("java.lang.String", 9);
        setBooleanField(term48020, term48020.getClass(), "allowMissingColumnNames", false);
        setField(term48020, term48020.getClass(), "commentMarker", term48021);
        setCharField(term48020, term48020.getClass(), "delimiter", 'p');
        setField(term48020, term48020.getClass(), "escapeCharacter", term48022);
        setElement(term48023, 0, "JqXGgAhZPl");
        setField(term48020, term48020.getClass(), "header", term48023);
        setElement(term48026, 0, "jiKYgYHqIS");
        setElement(term48026, 1, "DfISiziTgG");
        setElement(term48026, 2, "XqgfKFvPSD");
        setElement(term48026, 3, "JiVRgTZvKc");
        setElement(term48026, 4, "XPKmummaqg");
        setElement(term48026, 5, "BKLfkLiZTH");
        setElement(term48026, 6, "SPpkrGcPRr");
        setElement(term48026, 7, "sEccwbJKYE");
        setElement(term48026, 8, "AWRooQKkdW");
        setField(term48020, term48020.getClass(), "headerComments", term48026);
        setBooleanField(term48020, term48020.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term48020, term48020.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term48020, term48020.getClass(), "ignoreSurroundingSpaces", false);
        setField(term48020, term48020.getClass(), "nullString", "vjxIhXHxGR");
        setField(term48020, term48020.getClass(), "quoteCharacter", term48047);
        setField(term48020, term48020.getClass(), "quoteMode", enum96);
        setField(term48020, term48020.getClass(), "recordSeparator", "QXzGXbEXMu");
        setBooleanField(term48020, term48020.getClass(), "skipHeaderRecord", true);
        setBooleanField(term48020, term48020.getClass(), "trailingDelimiter", false);
        setBooleanField(term48020, term48020.getClass(), "trim", true);
        setBooleanField(term48020, term48020.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIgnoreHeaderCase", argTypes, term4325, args);
        assertTrue(recursiveEquals(term4325, term48020));
    }

};



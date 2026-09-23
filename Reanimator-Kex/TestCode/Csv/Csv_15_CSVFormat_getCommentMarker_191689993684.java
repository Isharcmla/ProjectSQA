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

public class CSVFormat_getCommentMarker_191689993684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1813;
     Object term43423;
     Object term42628;

    public CSVFormat_getCommentMarker_191689993684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1815 = new Character('b');
        Character term1818 = new Character('u');
        Character term1921 = new Character('L');
        Class<? extends Object> term43531 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term43530 = ((Class) term43531).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term43530).setAccessible(true);
        Object enum83 = ((Field) term43530).get((Object) null);
        term1813 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term1820 = (Object[]) newArray("java.lang.String", 1);
        Object[] term1833 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term1813, term1813.getClass(), "allowMissingColumnNames", true);
        setField(term1813, term1813.getClass(), "commentMarker", term1815);
        setCharField(term1813, term1813.getClass(), "delimiter", 'M');
        setField(term1813, term1813.getClass(), "escapeCharacter", term1818);
        setElement(term1820, 0, "wSQxaModmm");
        setField(term1813, term1813.getClass(), "header", term1820);
        setElement(term1833, 0, "UlajhuVLaP");
        setElement(term1833, 1, "gGSMzuGICf");
        setElement(term1833, 2, "hxCBltsObl");
        setElement(term1833, 3, "BndsHwAFMv");
        setElement(term1833, 4, "GzFkzHGYFt");
        setElement(term1833, 5, "tShwQLRGNe");
        setField(term1813, term1813.getClass(), "headerComments", term1833);
        setBooleanField(term1813, term1813.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term1813, term1813.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term1813, term1813.getClass(), "ignoreSurroundingSpaces", true);
        setField(term1813, term1813.getClass(), "nullString", "LvtrsXUliU");
        setField(term1813, term1813.getClass(), "quoteCharacter", term1921);
        setField(term1813, term1813.getClass(), "quoteMode", enum83);
        setField(term1813, term1813.getClass(), "recordSeparator", "xLbjWUgOIL");
        setBooleanField(term1813, term1813.getClass(), "skipHeaderRecord", true);
        setBooleanField(term1813, term1813.getClass(), "trailingDelimiter", true);
        setBooleanField(term1813, term1813.getClass(), "trim", true);
        setBooleanField(term1813, term1813.getClass(), "autoFlush", false);
        Character term43424 = new Character('b');
        Character term43425 = new Character('u');
        Character term43444 = new Character('L');
        Class<? extends Object> term43821 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term43820 = ((Class) term43821).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term43820).setAccessible(true);
        Object enum84 = ((Field) term43820).get((Object) null);
        term43423 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term43426 = (Object[]) newArray("java.lang.String", 1);
        Object[] term43429 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term43423, term43423.getClass(), "allowMissingColumnNames", true);
        setField(term43423, term43423.getClass(), "commentMarker", term43424);
        setCharField(term43423, term43423.getClass(), "delimiter", 'M');
        setField(term43423, term43423.getClass(), "escapeCharacter", term43425);
        setElement(term43426, 0, "wSQxaModmm");
        setField(term43423, term43423.getClass(), "header", term43426);
        setElement(term43429, 0, "UlajhuVLaP");
        setElement(term43429, 1, "gGSMzuGICf");
        setElement(term43429, 2, "hxCBltsObl");
        setElement(term43429, 3, "BndsHwAFMv");
        setElement(term43429, 4, "GzFkzHGYFt");
        setElement(term43429, 5, "tShwQLRGNe");
        setField(term43423, term43423.getClass(), "headerComments", term43429);
        setBooleanField(term43423, term43423.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term43423, term43423.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term43423, term43423.getClass(), "ignoreSurroundingSpaces", true);
        setField(term43423, term43423.getClass(), "nullString", "LvtrsXUliU");
        setField(term43423, term43423.getClass(), "quoteCharacter", term43444);
        setField(term43423, term43423.getClass(), "quoteMode", enum84);
        setField(term43423, term43423.getClass(), "recordSeparator", "xLbjWUgOIL");
        setBooleanField(term43423, term43423.getClass(), "skipHeaderRecord", true);
        setBooleanField(term43423, term43423.getClass(), "trailingDelimiter", true);
        setBooleanField(term43423, term43423.getClass(), "trim", true);
        setBooleanField(term43423, term43423.getClass(), "autoFlush", false);
        term42628 = new Character('b');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCommentMarker", argTypes, term1813, args);
        assertTrue(recursiveEquals(term1813, term43423));
        assertTrue(recursiveEquals(retValue, term42628));
    }

};



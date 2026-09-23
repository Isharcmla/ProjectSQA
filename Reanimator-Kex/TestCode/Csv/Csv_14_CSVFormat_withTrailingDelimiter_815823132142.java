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

public class CSVFormat_withTrailingDelimiter_815823132142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29720;
     Object term112076;
     Object term111975;

    public CSVFormat_withTrailingDelimiter_815823132142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term29722 = new Character('c');
        Character term29725 = new Character('P');
        Character term29804 = new Character('b');
        Class<? extends Object> term112160 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term112159 = ((Class) term112160).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term112159).setAccessible(true);
        Object enum228 = ((Field) term112159).get((Object) null);
        term29720 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term29727 = (Object[]) newArray("java.lang.String", 2);
        Object[] term29752 = (Object[]) newArray("java.lang.String", 3);
        setBooleanField(term29720, term29720.getClass(), "allowMissingColumnNames", false);
        setField(term29720, term29720.getClass(), "commentMarker", term29722);
        setCharField(term29720, term29720.getClass(), "delimiter", 'l');
        setField(term29720, term29720.getClass(), "escapeCharacter", term29725);
        setElement(term29727, 0, "DNOtiLPAIY");
        setElement(term29727, 1, "FnEkAHBfyV");
        setField(term29720, term29720.getClass(), "header", term29727);
        setElement(term29752, 0, "VfmNFpEuax");
        setElement(term29752, 1, "ANHjlWPmZG");
        setElement(term29752, 2, "SibzENsyyy");
        setField(term29720, term29720.getClass(), "headerComments", term29752);
        setBooleanField(term29720, term29720.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term29720, term29720.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term29720, term29720.getClass(), "ignoreSurroundingSpaces", false);
        setField(term29720, term29720.getClass(), "nullString", "mrqGHotaef");
        setField(term29720, term29720.getClass(), "quoteCharacter", term29804);
        setField(term29720, term29720.getClass(), "quoteMode", enum228);
        setField(term29720, term29720.getClass(), "recordSeparator", "UbZGBpQZQW");
        setBooleanField(term29720, term29720.getClass(), "skipHeaderRecord", true);
        setBooleanField(term29720, term29720.getClass(), "trailingDelimiter", true);
        setBooleanField(term29720, term29720.getClass(), "trim", false);
        Character term112077 = new Character('c');
        Character term112078 = new Character('P');
        Character term112093 = new Character('b');
        Class<? extends Object> term112430 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term112429 = ((Class) term112430).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term112429).setAccessible(true);
        Object enum229 = ((Field) term112429).get((Object) null);
        term112076 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term112079 = (Object[]) newArray("java.lang.String", 2);
        Object[] term112084 = (Object[]) newArray("java.lang.String", 3);
        setBooleanField(term112076, term112076.getClass(), "allowMissingColumnNames", false);
        setField(term112076, term112076.getClass(), "commentMarker", term112077);
        setCharField(term112076, term112076.getClass(), "delimiter", 'l');
        setField(term112076, term112076.getClass(), "escapeCharacter", term112078);
        setElement(term112079, 0, "DNOtiLPAIY");
        setElement(term112079, 1, "FnEkAHBfyV");
        setField(term112076, term112076.getClass(), "header", term112079);
        setElement(term112084, 0, "VfmNFpEuax");
        setElement(term112084, 1, "ANHjlWPmZG");
        setElement(term112084, 2, "SibzENsyyy");
        setField(term112076, term112076.getClass(), "headerComments", term112084);
        setBooleanField(term112076, term112076.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term112076, term112076.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term112076, term112076.getClass(), "ignoreSurroundingSpaces", false);
        setField(term112076, term112076.getClass(), "nullString", "mrqGHotaef");
        setField(term112076, term112076.getClass(), "quoteCharacter", term112093);
        setField(term112076, term112076.getClass(), "quoteMode", enum229);
        setField(term112076, term112076.getClass(), "recordSeparator", "UbZGBpQZQW");
        setBooleanField(term112076, term112076.getClass(), "skipHeaderRecord", true);
        setBooleanField(term112076, term112076.getClass(), "trailingDelimiter", true);
        setBooleanField(term112076, term112076.getClass(), "trim", false);
        Character term111977 = new Character('c');
        Character term111980 = new Character('P');
        Character term112059 = new Character('b');
        Class<? extends Object> term112700 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term112699 = ((Class) term112700).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term112699).setAccessible(true);
        Object enum230 = ((Field) term112699).get((Object) null);
        term111975 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term111982 = (Object[]) newArray("java.lang.String", 2);
        Object[] term112007 = (Object[]) newArray("java.lang.String", 3);
        setBooleanField(term111975, term111975.getClass(), "allowMissingColumnNames", false);
        setField(term111975, term111975.getClass(), "commentMarker", term111977);
        setCharField(term111975, term111975.getClass(), "delimiter", 'l');
        setField(term111975, term111975.getClass(), "escapeCharacter", term111980);
        setElement(term111982, 0, "DNOtiLPAIY");
        setElement(term111982, 1, "FnEkAHBfyV");
        setField(term111975, term111975.getClass(), "header", term111982);
        setElement(term112007, 0, "VfmNFpEuax");
        setElement(term112007, 1, "ANHjlWPmZG");
        setElement(term112007, 2, "SibzENsyyy");
        setField(term111975, term111975.getClass(), "headerComments", term112007);
        setBooleanField(term111975, term111975.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term111975, term111975.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term111975, term111975.getClass(), "ignoreSurroundingSpaces", false);
        setField(term111975, term111975.getClass(), "nullString", "mrqGHotaef");
        setField(term111975, term111975.getClass(), "quoteCharacter", term112059);
        setField(term111975, term111975.getClass(), "quoteMode", enum230);
        setField(term111975, term111975.getClass(), "recordSeparator", "UbZGBpQZQW");
        setBooleanField(term111975, term111975.getClass(), "skipHeaderRecord", true);
        setBooleanField(term111975, term111975.getClass(), "trailingDelimiter", true);
        setBooleanField(term111975, term111975.getClass(), "trim", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "withTrailingDelimiter", argTypes, term29720, args);
        assertTrue(recursiveEquals(term29720, term112076));
        assertTrue(recursiveEquals(retValue, term111975));
    }

};



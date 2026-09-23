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

public class CSVFormat_isQuoteCharacterSet_1968985395104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10949;
     Object term59372;

    public CSVFormat_isQuoteCharacterSet_1968985395104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term10951 = new Character('e');
        Character term10954 = new Character('R');
        Character term11093 = new Character('d');
        Class<? extends Object> term59517 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term59516 = ((Class) term59517).getDeclaredField((String) "ALL_NON_NULL");
        ((Field) term59516).setAccessible(true);
        Object enum123 = ((Field) term59516).get((Object) null);
        term10949 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term10956 = (Object[]) newArray("java.lang.String", 7);
        Object[] term11041 = (Object[]) newArray("java.lang.String", 3);
        setBooleanField(term10949, term10949.getClass(), "allowMissingColumnNames", false);
        setField(term10949, term10949.getClass(), "commentMarker", term10951);
        setCharField(term10949, term10949.getClass(), "delimiter", 'N');
        setField(term10949, term10949.getClass(), "escapeCharacter", term10954);
        setElement(term10956, 0, "ypEdrstygY");
        setElement(term10956, 1, "sNQFlATEeQ");
        setElement(term10956, 2, "ZKMLioamsY");
        setElement(term10956, 3, "WVbxuoDBcn");
        setElement(term10956, 4, "pvDEABOxLt");
        setElement(term10956, 5, "beAMpkroCQ");
        setElement(term10956, 6, "uSUvKAyuvd");
        setField(term10949, term10949.getClass(), "header", term10956);
        setElement(term11041, 0, "onQLVONGuf");
        setElement(term11041, 1, "SOrEHbcbmn");
        setElement(term11041, 2, "bnsyeQXFdu");
        setField(term10949, term10949.getClass(), "headerComments", term11041);
        setBooleanField(term10949, term10949.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term10949, term10949.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term10949, term10949.getClass(), "ignoreSurroundingSpaces", true);
        setField(term10949, term10949.getClass(), "nullString", "BwtdjiefJn");
        setField(term10949, term10949.getClass(), "quoteCharacter", term11093);
        setField(term10949, term10949.getClass(), "quoteMode", enum123);
        setField(term10949, term10949.getClass(), "recordSeparator", "jDmhBrIoDa");
        setBooleanField(term10949, term10949.getClass(), "skipHeaderRecord", false);
        setBooleanField(term10949, term10949.getClass(), "trailingDelimiter", true);
        setBooleanField(term10949, term10949.getClass(), "trim", false);
        setBooleanField(term10949, term10949.getClass(), "autoFlush", true);
        Character term59373 = new Character('e');
        Character term59374 = new Character('R');
        Character term59399 = new Character('d');
        Class<? extends Object> term59840 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term59839 = ((Class) term59840).getDeclaredField((String) "ALL_NON_NULL");
        ((Field) term59839).setAccessible(true);
        Object enum124 = ((Field) term59839).get((Object) null);
        term59372 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term59375 = (Object[]) newArray("java.lang.String", 7);
        Object[] term59390 = (Object[]) newArray("java.lang.String", 3);
        setBooleanField(term59372, term59372.getClass(), "allowMissingColumnNames", false);
        setField(term59372, term59372.getClass(), "commentMarker", term59373);
        setCharField(term59372, term59372.getClass(), "delimiter", 'N');
        setField(term59372, term59372.getClass(), "escapeCharacter", term59374);
        setElement(term59375, 0, "ypEdrstygY");
        setElement(term59375, 1, "sNQFlATEeQ");
        setElement(term59375, 2, "ZKMLioamsY");
        setElement(term59375, 3, "WVbxuoDBcn");
        setElement(term59375, 4, "pvDEABOxLt");
        setElement(term59375, 5, "beAMpkroCQ");
        setElement(term59375, 6, "uSUvKAyuvd");
        setField(term59372, term59372.getClass(), "header", term59375);
        setElement(term59390, 0, "onQLVONGuf");
        setElement(term59390, 1, "SOrEHbcbmn");
        setElement(term59390, 2, "bnsyeQXFdu");
        setField(term59372, term59372.getClass(), "headerComments", term59390);
        setBooleanField(term59372, term59372.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term59372, term59372.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term59372, term59372.getClass(), "ignoreSurroundingSpaces", true);
        setField(term59372, term59372.getClass(), "nullString", "BwtdjiefJn");
        setField(term59372, term59372.getClass(), "quoteCharacter", term59399);
        setField(term59372, term59372.getClass(), "quoteMode", enum124);
        setField(term59372, term59372.getClass(), "recordSeparator", "jDmhBrIoDa");
        setBooleanField(term59372, term59372.getClass(), "skipHeaderRecord", false);
        setBooleanField(term59372, term59372.getClass(), "trailingDelimiter", true);
        setBooleanField(term59372, term59372.getClass(), "trim", false);
        setBooleanField(term59372, term59372.getClass(), "autoFlush", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isQuoteCharacterSet", argTypes, term10949, args);
        assertTrue(recursiveEquals(term10949, term59372));
        assertTrue(recursiveEquals(retValue, true));
    }

};



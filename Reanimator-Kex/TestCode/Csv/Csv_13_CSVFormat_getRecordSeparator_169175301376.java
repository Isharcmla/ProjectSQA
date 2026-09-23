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

public class CSVFormat_getRecordSeparator_169175301376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7097;
     Object term51673;

    public CSVFormat_getRecordSeparator_169175301376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term7099 = new Character('y');
        Class<? extends Object> term51703 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term51702 = ((Class) term51703).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term51702).setAccessible(true);
        Object enum87 = ((Field) term51702).get((Object) null);
        Character term7116 = new Character('S');
        Character term7118 = new Character('M');
        term7097 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term7147 = (Object[]) newArray("java.lang.String", 3);
        Object[] term7184 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term7097, term7097.getClass(), "delimiter", 'T');
        setField(term7097, term7097.getClass(), "quoteCharacter", term7099);
        setField(term7097, term7097.getClass(), "quoteMode", enum87);
        setField(term7097, term7097.getClass(), "commentMarker", term7116);
        setField(term7097, term7097.getClass(), "escapeCharacter", term7118);
        setBooleanField(term7097, term7097.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term7097, term7097.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term7097, term7097.getClass(), "ignoreEmptyLines", true);
        setField(term7097, term7097.getClass(), "recordSeparator", "PapWxkhEWe");
        setField(term7097, term7097.getClass(), "nullString", "smnHEqRFRx");
        setElement(term7147, 0, "XYtryyobou");
        setElement(term7147, 1, "OYbzXylRWW");
        setElement(term7147, 2, "DSNsTGYXDF");
        setField(term7097, term7097.getClass(), "header", term7147);
        setElement(term7184, 0, "sQvGcVjdEx");
        setElement(term7184, 1, "rLHAoqXgPh");
        setElement(term7184, 2, "zUlRdimJtU");
        setElement(term7184, 3, "vwbEQQNQrx");
        setElement(term7184, 4, "xtftXXMbem");
        setField(term7097, term7097.getClass(), "headerComments", term7184);
        setBooleanField(term7097, term7097.getClass(), "skipHeaderRecord", false);
        setBooleanField(term7097, term7097.getClass(), "ignoreHeaderCase", true);
        Character term51674 = new Character('y');
        Class<? extends Object> term52579 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term52578 = ((Class) term52579).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term52578).setAccessible(true);
        Object enum90 = ((Field) term52578).get((Object) null);
        Character term51678 = new Character('S');
        Character term51679 = new Character('M');
        term51673 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term51684 = (Object[]) newArray("java.lang.String", 3);
        Object[] term51691 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term51673, term51673.getClass(), "delimiter", 'T');
        setField(term51673, term51673.getClass(), "quoteCharacter", term51674);
        setField(term51673, term51673.getClass(), "quoteMode", enum90);
        setField(term51673, term51673.getClass(), "commentMarker", term51678);
        setField(term51673, term51673.getClass(), "escapeCharacter", term51679);
        setBooleanField(term51673, term51673.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term51673, term51673.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term51673, term51673.getClass(), "ignoreEmptyLines", true);
        setField(term51673, term51673.getClass(), "recordSeparator", "PapWxkhEWe");
        setField(term51673, term51673.getClass(), "nullString", "smnHEqRFRx");
        setElement(term51684, 0, "XYtryyobou");
        setElement(term51684, 1, "OYbzXylRWW");
        setElement(term51684, 2, "DSNsTGYXDF");
        setField(term51673, term51673.getClass(), "header", term51684);
        setElement(term51691, 0, "sQvGcVjdEx");
        setElement(term51691, 1, "rLHAoqXgPh");
        setElement(term51691, 2, "zUlRdimJtU");
        setElement(term51691, 3, "vwbEQQNQrx");
        setElement(term51691, 4, "xtftXXMbem");
        setField(term51673, term51673.getClass(), "headerComments", term51691);
        setBooleanField(term51673, term51673.getClass(), "skipHeaderRecord", false);
        setBooleanField(term51673, term51673.getClass(), "ignoreHeaderCase", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRecordSeparator", argTypes, term7097, args);
        assertTrue(recursiveEquals(term7097, term51673));
        assertTrue(recursiveEquals(retValue, "PapWxkhEWe"));
    }

};



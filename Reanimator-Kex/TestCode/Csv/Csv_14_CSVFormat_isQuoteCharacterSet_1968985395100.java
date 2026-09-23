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

public class CSVFormat_isQuoteCharacterSet_1968985395100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10278;
     Object term57321;

    public CSVFormat_isQuoteCharacterSet_1968985395100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term10280 = new Character('Y');
        Character term10283 = new Character('g');
        Character term10506 = new Character('n');
        Class<? extends Object> term57550 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term57549 = ((Class) term57550).getDeclaredField((String) "NONE");
        ((Field) term57549).setAccessible(true);
        Object enum118 = ((Field) term57549).get((Object) null);
        term10278 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term10285 = (Object[]) newArray("java.lang.String", 8);
        Object[] term10382 = (Object[]) newArray("java.lang.String", 9);
        setBooleanField(term10278, term10278.getClass(), "allowMissingColumnNames", true);
        setField(term10278, term10278.getClass(), "commentMarker", term10280);
        setCharField(term10278, term10278.getClass(), "delimiter", 'G');
        setField(term10278, term10278.getClass(), "escapeCharacter", term10283);
        setElement(term10285, 0, "pJbnHTYrxn");
        setElement(term10285, 1, "iIRsCSYqXH");
        setElement(term10285, 2, "nghfqDXyCG");
        setElement(term10285, 3, "WBAOTqErtm");
        setElement(term10285, 4, "PqtVXXZMqK");
        setElement(term10285, 5, "rYbtIDVdnd");
        setElement(term10285, 6, "UKAReurpHG");
        setElement(term10285, 7, "WVRMUmrljA");
        setField(term10278, term10278.getClass(), "header", term10285);
        setElement(term10382, 0, "NTlKJDDWlk");
        setElement(term10382, 1, "vOuMEpOQAg");
        setElement(term10382, 2, "SIODFGaQhr");
        setElement(term10382, 3, "qYzsiuXOgS");
        setElement(term10382, 4, "bxrCBbrrct");
        setElement(term10382, 5, "CKWpJaaaxX");
        setElement(term10382, 6, "UBRmXJmfrt");
        setElement(term10382, 7, "WZzvmIHhzZ");
        setElement(term10382, 8, "doQLHkjpNm");
        setField(term10278, term10278.getClass(), "headerComments", term10382);
        setBooleanField(term10278, term10278.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term10278, term10278.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term10278, term10278.getClass(), "ignoreSurroundingSpaces", true);
        setField(term10278, term10278.getClass(), "nullString", "lCyLIcSuom");
        setField(term10278, term10278.getClass(), "quoteCharacter", term10506);
        setField(term10278, term10278.getClass(), "quoteMode", enum118);
        setField(term10278, term10278.getClass(), "recordSeparator", "CGOpQSZZwI");
        setBooleanField(term10278, term10278.getClass(), "skipHeaderRecord", true);
        setBooleanField(term10278, term10278.getClass(), "trailingDelimiter", false);
        setBooleanField(term10278, term10278.getClass(), "trim", true);
        Character term57322 = new Character('Y');
        Character term57323 = new Character('g');
        Character term57362 = new Character('n');
        Class<? extends Object> term57919 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term57918 = ((Class) term57919).getDeclaredField((String) "NONE");
        ((Field) term57918).setAccessible(true);
        Object enum119 = ((Field) term57918).get((Object) null);
        term57321 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term57324 = (Object[]) newArray("java.lang.String", 8);
        Object[] term57341 = (Object[]) newArray("java.lang.String", 9);
        setBooleanField(term57321, term57321.getClass(), "allowMissingColumnNames", true);
        setField(term57321, term57321.getClass(), "commentMarker", term57322);
        setCharField(term57321, term57321.getClass(), "delimiter", 'G');
        setField(term57321, term57321.getClass(), "escapeCharacter", term57323);
        setElement(term57324, 0, "pJbnHTYrxn");
        setElement(term57324, 1, "iIRsCSYqXH");
        setElement(term57324, 2, "nghfqDXyCG");
        setElement(term57324, 3, "WBAOTqErtm");
        setElement(term57324, 4, "PqtVXXZMqK");
        setElement(term57324, 5, "rYbtIDVdnd");
        setElement(term57324, 6, "UKAReurpHG");
        setElement(term57324, 7, "WVRMUmrljA");
        setField(term57321, term57321.getClass(), "header", term57324);
        setElement(term57341, 0, "NTlKJDDWlk");
        setElement(term57341, 1, "vOuMEpOQAg");
        setElement(term57341, 2, "SIODFGaQhr");
        setElement(term57341, 3, "qYzsiuXOgS");
        setElement(term57341, 4, "bxrCBbrrct");
        setElement(term57341, 5, "CKWpJaaaxX");
        setElement(term57341, 6, "UBRmXJmfrt");
        setElement(term57341, 7, "WZzvmIHhzZ");
        setElement(term57341, 8, "doQLHkjpNm");
        setField(term57321, term57321.getClass(), "headerComments", term57341);
        setBooleanField(term57321, term57321.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term57321, term57321.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term57321, term57321.getClass(), "ignoreSurroundingSpaces", true);
        setField(term57321, term57321.getClass(), "nullString", "lCyLIcSuom");
        setField(term57321, term57321.getClass(), "quoteCharacter", term57362);
        setField(term57321, term57321.getClass(), "quoteMode", enum119);
        setField(term57321, term57321.getClass(), "recordSeparator", "CGOpQSZZwI");
        setBooleanField(term57321, term57321.getClass(), "skipHeaderRecord", true);
        setBooleanField(term57321, term57321.getClass(), "trailingDelimiter", false);
        setBooleanField(term57321, term57321.getClass(), "trim", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isQuoteCharacterSet", argTypes, term10278, args);
        assertTrue(recursiveEquals(term10278, term57321));
        assertTrue(recursiveEquals(retValue, true));
    }

};



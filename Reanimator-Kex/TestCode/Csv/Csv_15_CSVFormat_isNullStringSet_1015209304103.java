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

public class CSVFormat_isNullStringSet_1015209304103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10294;
     Object term58771;

    public CSVFormat_isNullStringSet_1015209304103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term10296 = new Character('Y');
        Character term10299 = new Character('g');
        Character term10522 = new Character('n');
        Class<? extends Object> term59000 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term58999 = ((Class) term59000).getDeclaredField((String) "ALL_NON_NULL");
        ((Field) term58999).setAccessible(true);
        Object enum122 = ((Field) term58999).get((Object) null);
        term10294 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term10301 = (Object[]) newArray("java.lang.String", 8);
        Object[] term10398 = (Object[]) newArray("java.lang.String", 9);
        setBooleanField(term10294, term10294.getClass(), "allowMissingColumnNames", true);
        setField(term10294, term10294.getClass(), "commentMarker", term10296);
        setCharField(term10294, term10294.getClass(), "delimiter", 'G');
        setField(term10294, term10294.getClass(), "escapeCharacter", term10299);
        setElement(term10301, 0, "pJbnHTYrxn");
        setElement(term10301, 1, "iIRsCSYqXH");
        setElement(term10301, 2, "nghfqDXyCG");
        setElement(term10301, 3, "WBAOTqErtm");
        setElement(term10301, 4, "PqtVXXZMqK");
        setElement(term10301, 5, "rYbtIDVdnd");
        setElement(term10301, 6, "UKAReurpHG");
        setElement(term10301, 7, "WVRMUmrljA");
        setField(term10294, term10294.getClass(), "header", term10301);
        setElement(term10398, 0, "NTlKJDDWlk");
        setElement(term10398, 1, "vOuMEpOQAg");
        setElement(term10398, 2, "SIODFGaQhr");
        setElement(term10398, 3, "qYzsiuXOgS");
        setElement(term10398, 4, "bxrCBbrrct");
        setElement(term10398, 5, "CKWpJaaaxX");
        setElement(term10398, 6, "UBRmXJmfrt");
        setElement(term10398, 7, "WZzvmIHhzZ");
        setElement(term10398, 8, "doQLHkjpNm");
        setField(term10294, term10294.getClass(), "headerComments", term10398);
        setBooleanField(term10294, term10294.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term10294, term10294.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term10294, term10294.getClass(), "ignoreSurroundingSpaces", true);
        setField(term10294, term10294.getClass(), "nullString", "lCyLIcSuom");
        setField(term10294, term10294.getClass(), "quoteCharacter", term10522);
        setField(term10294, term10294.getClass(), "quoteMode", enum122);
        setField(term10294, term10294.getClass(), "recordSeparator", "CGOpQSZZwI");
        setBooleanField(term10294, term10294.getClass(), "skipHeaderRecord", false);
        setBooleanField(term10294, term10294.getClass(), "trailingDelimiter", false);
        setBooleanField(term10294, term10294.getClass(), "trim", false);
        setBooleanField(term10294, term10294.getClass(), "autoFlush", false);
        Character term58772 = new Character('Y');
        Character term58773 = new Character('g');
        Character term58812 = new Character('n');
        Class<? extends Object> term60363 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term60362 = ((Class) term60363).getDeclaredField((String) "ALL_NON_NULL");
        ((Field) term60362).setAccessible(true);
        Object enum125 = ((Field) term60362).get((Object) null);
        term58771 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term58774 = (Object[]) newArray("java.lang.String", 8);
        Object[] term58791 = (Object[]) newArray("java.lang.String", 9);
        setBooleanField(term58771, term58771.getClass(), "allowMissingColumnNames", true);
        setField(term58771, term58771.getClass(), "commentMarker", term58772);
        setCharField(term58771, term58771.getClass(), "delimiter", 'G');
        setField(term58771, term58771.getClass(), "escapeCharacter", term58773);
        setElement(term58774, 0, "pJbnHTYrxn");
        setElement(term58774, 1, "iIRsCSYqXH");
        setElement(term58774, 2, "nghfqDXyCG");
        setElement(term58774, 3, "WBAOTqErtm");
        setElement(term58774, 4, "PqtVXXZMqK");
        setElement(term58774, 5, "rYbtIDVdnd");
        setElement(term58774, 6, "UKAReurpHG");
        setElement(term58774, 7, "WVRMUmrljA");
        setField(term58771, term58771.getClass(), "header", term58774);
        setElement(term58791, 0, "NTlKJDDWlk");
        setElement(term58791, 1, "vOuMEpOQAg");
        setElement(term58791, 2, "SIODFGaQhr");
        setElement(term58791, 3, "qYzsiuXOgS");
        setElement(term58791, 4, "bxrCBbrrct");
        setElement(term58791, 5, "CKWpJaaaxX");
        setElement(term58791, 6, "UBRmXJmfrt");
        setElement(term58791, 7, "WZzvmIHhzZ");
        setElement(term58791, 8, "doQLHkjpNm");
        setField(term58771, term58771.getClass(), "headerComments", term58791);
        setBooleanField(term58771, term58771.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term58771, term58771.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term58771, term58771.getClass(), "ignoreSurroundingSpaces", true);
        setField(term58771, term58771.getClass(), "nullString", "lCyLIcSuom");
        setField(term58771, term58771.getClass(), "quoteCharacter", term58812);
        setField(term58771, term58771.getClass(), "quoteMode", enum125);
        setField(term58771, term58771.getClass(), "recordSeparator", "CGOpQSZZwI");
        setBooleanField(term58771, term58771.getClass(), "skipHeaderRecord", false);
        setBooleanField(term58771, term58771.getClass(), "trailingDelimiter", false);
        setBooleanField(term58771, term58771.getClass(), "trim", false);
        setBooleanField(term58771, term58771.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isNullStringSet", argTypes, term10294, args);
        assertTrue(recursiveEquals(term10294, term58771));
        assertTrue(recursiveEquals(retValue, true));
    }

};



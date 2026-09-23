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

public class CSVFormat_getQuoteCharacter_44758352093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5722;
     Object term50430;
     Object term50259;

    public CSVFormat_getQuoteCharacter_44758352093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term5724 = new Character('R');
        Character term5727 = new Character('S');
        Character term5866 = new Character('S');
        Class<? extends Object> term50574 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term50573 = ((Class) term50574).getDeclaredField((String) "ALL");
        ((Field) term50573).setAccessible(true);
        Object enum101 = ((Field) term50573).get((Object) null);
        term5722 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term5729 = (Object[]) newArray("java.lang.String", 3);
        Object[] term5766 = (Object[]) newArray("java.lang.String", 7);
        setBooleanField(term5722, term5722.getClass(), "allowMissingColumnNames", true);
        setField(term5722, term5722.getClass(), "commentMarker", term5724);
        setCharField(term5722, term5722.getClass(), "delimiter", 'b');
        setField(term5722, term5722.getClass(), "escapeCharacter", term5727);
        setElement(term5729, 0, "xIeFjkHkOe");
        setElement(term5729, 1, "SdCKLMIYnX");
        setElement(term5729, 2, "OJJtVNPyKZ");
        setField(term5722, term5722.getClass(), "header", term5729);
        setElement(term5766, 0, "AKNapTAfmD");
        setElement(term5766, 1, "xJgPlLxpgC");
        setElement(term5766, 2, "EYtfuJaxiM");
        setElement(term5766, 3, "gCWtLVKVVe");
        setElement(term5766, 4, "fWKJoSoCwE");
        setElement(term5766, 5, "wfaXBpWAUH");
        setElement(term5766, 6, "VMeAzAHwZj");
        setField(term5722, term5722.getClass(), "headerComments", term5766);
        setBooleanField(term5722, term5722.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term5722, term5722.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term5722, term5722.getClass(), "ignoreSurroundingSpaces", false);
        setField(term5722, term5722.getClass(), "nullString", "PznxWXsZME");
        setField(term5722, term5722.getClass(), "quoteCharacter", term5866);
        setField(term5722, term5722.getClass(), "quoteMode", enum101);
        setField(term5722, term5722.getClass(), "recordSeparator", "ZzIujlwVsw");
        setBooleanField(term5722, term5722.getClass(), "skipHeaderRecord", true);
        setBooleanField(term5722, term5722.getClass(), "trailingDelimiter", true);
        setBooleanField(term5722, term5722.getClass(), "trim", true);
        setBooleanField(term5722, term5722.getClass(), "autoFlush", false);
        Character term50431 = new Character('R');
        Character term50432 = new Character('S');
        Character term50457 = new Character('S');
        Class<? extends Object> term50870 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term50869 = ((Class) term50870).getDeclaredField((String) "ALL");
        ((Field) term50869).setAccessible(true);
        Object enum102 = ((Field) term50869).get((Object) null);
        term50430 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term50433 = (Object[]) newArray("java.lang.String", 3);
        Object[] term50440 = (Object[]) newArray("java.lang.String", 7);
        setBooleanField(term50430, term50430.getClass(), "allowMissingColumnNames", true);
        setField(term50430, term50430.getClass(), "commentMarker", term50431);
        setCharField(term50430, term50430.getClass(), "delimiter", 'b');
        setField(term50430, term50430.getClass(), "escapeCharacter", term50432);
        setElement(term50433, 0, "xIeFjkHkOe");
        setElement(term50433, 1, "SdCKLMIYnX");
        setElement(term50433, 2, "OJJtVNPyKZ");
        setField(term50430, term50430.getClass(), "header", term50433);
        setElement(term50440, 0, "AKNapTAfmD");
        setElement(term50440, 1, "xJgPlLxpgC");
        setElement(term50440, 2, "EYtfuJaxiM");
        setElement(term50440, 3, "gCWtLVKVVe");
        setElement(term50440, 4, "fWKJoSoCwE");
        setElement(term50440, 5, "wfaXBpWAUH");
        setElement(term50440, 6, "VMeAzAHwZj");
        setField(term50430, term50430.getClass(), "headerComments", term50440);
        setBooleanField(term50430, term50430.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term50430, term50430.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term50430, term50430.getClass(), "ignoreSurroundingSpaces", false);
        setField(term50430, term50430.getClass(), "nullString", "PznxWXsZME");
        setField(term50430, term50430.getClass(), "quoteCharacter", term50457);
        setField(term50430, term50430.getClass(), "quoteMode", enum102);
        setField(term50430, term50430.getClass(), "recordSeparator", "ZzIujlwVsw");
        setBooleanField(term50430, term50430.getClass(), "skipHeaderRecord", true);
        setBooleanField(term50430, term50430.getClass(), "trailingDelimiter", true);
        setBooleanField(term50430, term50430.getClass(), "trim", true);
        setBooleanField(term50430, term50430.getClass(), "autoFlush", false);
        term50259 = new Character('S');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getQuoteCharacter", argTypes, term5722, args);
        assertTrue(recursiveEquals(term5722, term50430));
        assertTrue(recursiveEquals(retValue, term50259));
    }

};



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

public class CSVFormat_getQuoteCharacter_44758352090 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5696;
     Object term49214;
     Object term49043;

    public CSVFormat_getQuoteCharacter_44758352090() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term5698 = new Character('R');
        Character term5701 = new Character('S');
        Character term5840 = new Character('S');
        Class<? extends Object> term49358 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term49357 = ((Class) term49358).getDeclaredField((String) "NONE");
        ((Field) term49357).setAccessible(true);
        Object enum98 = ((Field) term49357).get((Object) null);
        term5696 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term5703 = (Object[]) newArray("java.lang.String", 3);
        Object[] term5740 = (Object[]) newArray("java.lang.String", 7);
        setBooleanField(term5696, term5696.getClass(), "allowMissingColumnNames", true);
        setField(term5696, term5696.getClass(), "commentMarker", term5698);
        setCharField(term5696, term5696.getClass(), "delimiter", 'b');
        setField(term5696, term5696.getClass(), "escapeCharacter", term5701);
        setElement(term5703, 0, "xIeFjkHkOe");
        setElement(term5703, 1, "SdCKLMIYnX");
        setElement(term5703, 2, "OJJtVNPyKZ");
        setField(term5696, term5696.getClass(), "header", term5703);
        setElement(term5740, 0, "AKNapTAfmD");
        setElement(term5740, 1, "xJgPlLxpgC");
        setElement(term5740, 2, "EYtfuJaxiM");
        setElement(term5740, 3, "gCWtLVKVVe");
        setElement(term5740, 4, "fWKJoSoCwE");
        setElement(term5740, 5, "wfaXBpWAUH");
        setElement(term5740, 6, "VMeAzAHwZj");
        setField(term5696, term5696.getClass(), "headerComments", term5740);
        setBooleanField(term5696, term5696.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term5696, term5696.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term5696, term5696.getClass(), "ignoreSurroundingSpaces", false);
        setField(term5696, term5696.getClass(), "nullString", "PznxWXsZME");
        setField(term5696, term5696.getClass(), "quoteCharacter", term5840);
        setField(term5696, term5696.getClass(), "quoteMode", enum98);
        setField(term5696, term5696.getClass(), "recordSeparator", "ZzIujlwVsw");
        setBooleanField(term5696, term5696.getClass(), "skipHeaderRecord", false);
        setBooleanField(term5696, term5696.getClass(), "trailingDelimiter", true);
        setBooleanField(term5696, term5696.getClass(), "trim", true);
        Character term49215 = new Character('R');
        Character term49216 = new Character('S');
        Character term49241 = new Character('S');
        Class<? extends Object> term49657 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term49656 = ((Class) term49657).getDeclaredField((String) "NONE");
        ((Field) term49656).setAccessible(true);
        Object enum99 = ((Field) term49656).get((Object) null);
        term49214 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term49217 = (Object[]) newArray("java.lang.String", 3);
        Object[] term49224 = (Object[]) newArray("java.lang.String", 7);
        setBooleanField(term49214, term49214.getClass(), "allowMissingColumnNames", true);
        setField(term49214, term49214.getClass(), "commentMarker", term49215);
        setCharField(term49214, term49214.getClass(), "delimiter", 'b');
        setField(term49214, term49214.getClass(), "escapeCharacter", term49216);
        setElement(term49217, 0, "xIeFjkHkOe");
        setElement(term49217, 1, "SdCKLMIYnX");
        setElement(term49217, 2, "OJJtVNPyKZ");
        setField(term49214, term49214.getClass(), "header", term49217);
        setElement(term49224, 0, "AKNapTAfmD");
        setElement(term49224, 1, "xJgPlLxpgC");
        setElement(term49224, 2, "EYtfuJaxiM");
        setElement(term49224, 3, "gCWtLVKVVe");
        setElement(term49224, 4, "fWKJoSoCwE");
        setElement(term49224, 5, "wfaXBpWAUH");
        setElement(term49224, 6, "VMeAzAHwZj");
        setField(term49214, term49214.getClass(), "headerComments", term49224);
        setBooleanField(term49214, term49214.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term49214, term49214.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term49214, term49214.getClass(), "ignoreSurroundingSpaces", false);
        setField(term49214, term49214.getClass(), "nullString", "PznxWXsZME");
        setField(term49214, term49214.getClass(), "quoteCharacter", term49241);
        setField(term49214, term49214.getClass(), "quoteMode", enum99);
        setField(term49214, term49214.getClass(), "recordSeparator", "ZzIujlwVsw");
        setBooleanField(term49214, term49214.getClass(), "skipHeaderRecord", false);
        setBooleanField(term49214, term49214.getClass(), "trailingDelimiter", true);
        setBooleanField(term49214, term49214.getClass(), "trim", true);
        term49043 = new Character('S');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getQuoteCharacter", argTypes, term5696, args);
        assertTrue(recursiveEquals(term5696, term49214));
        assertTrue(recursiveEquals(retValue, term49043));
    }

};



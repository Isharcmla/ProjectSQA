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

public class CSVFormat_getNullString_56180501973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5735;
     Object term49018;

    public CSVFormat_getNullString_56180501973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term5737 = new Character('b');
        Class<? extends Object> term49050 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term49049 = ((Class) term49050).getDeclaredField((String) "NONE");
        ((Field) term49049).setAccessible(true);
        Object enum80 = ((Field) term49049).get((Object) null);
        Character term5747 = new Character('S');
        Character term5749 = new Character('S');
        term5735 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term5778 = (Object[]) newArray("java.lang.String", 7);
        Object[] term5863 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term5735, term5735.getClass(), "delimiter", 'R');
        setField(term5735, term5735.getClass(), "quoteCharacter", term5737);
        setField(term5735, term5735.getClass(), "quoteMode", enum80);
        setField(term5735, term5735.getClass(), "commentMarker", term5747);
        setField(term5735, term5735.getClass(), "escapeCharacter", term5749);
        setBooleanField(term5735, term5735.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term5735, term5735.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term5735, term5735.getClass(), "ignoreEmptyLines", true);
        setField(term5735, term5735.getClass(), "recordSeparator", "AKNapTAfmD");
        setField(term5735, term5735.getClass(), "nullString", "xJgPlLxpgC");
        setElement(term5778, 0, "EYtfuJaxiM");
        setElement(term5778, 1, "gCWtLVKVVe");
        setElement(term5778, 2, "fWKJoSoCwE");
        setElement(term5778, 3, "wfaXBpWAUH");
        setElement(term5778, 4, "VMeAzAHwZj");
        setElement(term5778, 5, "PznxWXsZME");
        setElement(term5778, 6, "ZzIujlwVsw");
        setField(term5735, term5735.getClass(), "header", term5778);
        setElement(term5863, 0, "LWyEaeIyAo");
        setElement(term5863, 1, "yVMkkQhvmN");
        setField(term5735, term5735.getClass(), "headerComments", term5863);
        setBooleanField(term5735, term5735.getClass(), "skipHeaderRecord", true);
        setBooleanField(term5735, term5735.getClass(), "ignoreHeaderCase", false);
        Character term49019 = new Character('b');
        Class<? extends Object> term49341 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term49340 = ((Class) term49341).getDeclaredField((String) "NONE");
        ((Field) term49340).setAccessible(true);
        Object enum81 = ((Field) term49340).get((Object) null);
        Character term49023 = new Character('S');
        Character term49024 = new Character('S');
        term49018 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term49029 = (Object[]) newArray("java.lang.String", 7);
        Object[] term49044 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term49018, term49018.getClass(), "delimiter", 'R');
        setField(term49018, term49018.getClass(), "quoteCharacter", term49019);
        setField(term49018, term49018.getClass(), "quoteMode", enum81);
        setField(term49018, term49018.getClass(), "commentMarker", term49023);
        setField(term49018, term49018.getClass(), "escapeCharacter", term49024);
        setBooleanField(term49018, term49018.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term49018, term49018.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term49018, term49018.getClass(), "ignoreEmptyLines", true);
        setField(term49018, term49018.getClass(), "recordSeparator", "AKNapTAfmD");
        setField(term49018, term49018.getClass(), "nullString", "xJgPlLxpgC");
        setElement(term49029, 0, "EYtfuJaxiM");
        setElement(term49029, 1, "gCWtLVKVVe");
        setElement(term49029, 2, "fWKJoSoCwE");
        setElement(term49029, 3, "wfaXBpWAUH");
        setElement(term49029, 4, "VMeAzAHwZj");
        setElement(term49029, 5, "PznxWXsZME");
        setElement(term49029, 6, "ZzIujlwVsw");
        setField(term49018, term49018.getClass(), "header", term49029);
        setElement(term49044, 0, "LWyEaeIyAo");
        setElement(term49044, 1, "yVMkkQhvmN");
        setField(term49018, term49018.getClass(), "headerComments", term49044);
        setBooleanField(term49018, term49018.getClass(), "skipHeaderRecord", true);
        setBooleanField(term49018, term49018.getClass(), "ignoreHeaderCase", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNullString", argTypes, term5735, args);
        assertTrue(recursiveEquals(term5735, term49018));
        assertTrue(recursiveEquals(retValue, "xJgPlLxpgC"));
    }

};



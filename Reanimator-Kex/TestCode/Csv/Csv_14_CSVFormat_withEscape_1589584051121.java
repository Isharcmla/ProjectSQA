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

public class CSVFormat_withEscape_1589584051121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20372;
     Object term20460;
     Object term81476;
     Object term81495;
     Object term81203;

    public CSVFormat_withEscape_1589584051121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term20374 = new Character('f');
        Character term20377 = new Character('S');
        Character term20432 = new Character('Q');
        Class<? extends Object> term81537 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term81536 = ((Class) term81537).getDeclaredField((String) "MINIMAL");
        ((Field) term81536).setAccessible(true);
        Object enum163 = ((Field) term81536).get((Object) null);
        term20372 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term20379 = (Object[]) newArray("java.lang.String", 2);
        Object[] term20404 = (Object[]) newArray("java.lang.String", 1);
        setBooleanField(term20372, term20372.getClass(), "allowMissingColumnNames", true);
        setField(term20372, term20372.getClass(), "commentMarker", term20374);
        setCharField(term20372, term20372.getClass(), "delimiter", 'b');
        setField(term20372, term20372.getClass(), "escapeCharacter", term20377);
        setElement(term20379, 0, "AGXoIndFnm");
        setElement(term20379, 1, "mwmFMNEzkK");
        setField(term20372, term20372.getClass(), "header", term20379);
        setElement(term20404, 0, "kVAmKknVln");
        setField(term20372, term20372.getClass(), "headerComments", term20404);
        setBooleanField(term20372, term20372.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term20372, term20372.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term20372, term20372.getClass(), "ignoreSurroundingSpaces", false);
        setField(term20372, term20372.getClass(), "nullString", "MRFLbEGYKG");
        setField(term20372, term20372.getClass(), "quoteCharacter", term20432);
        setField(term20372, term20372.getClass(), "quoteMode", enum163);
        setField(term20372, term20372.getClass(), "recordSeparator", "BYrGukTyof");
        setBooleanField(term20372, term20372.getClass(), "skipHeaderRecord", true);
        setBooleanField(term20372, term20372.getClass(), "trailingDelimiter", false);
        setBooleanField(term20372, term20372.getClass(), "trim", false);
        term20460 = new Character('Y');
        Character term81477 = new Character('f');
        Character term81478 = new Character('S');
        Character term81489 = new Character('Q');
        Class<? extends Object> term81775 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term81774 = ((Class) term81775).getDeclaredField((String) "MINIMAL");
        ((Field) term81774).setAccessible(true);
        Object enum164 = ((Field) term81774).get((Object) null);
        term81476 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term81479 = (Object[]) newArray("java.lang.String", 2);
        Object[] term81484 = (Object[]) newArray("java.lang.String", 1);
        setBooleanField(term81476, term81476.getClass(), "allowMissingColumnNames", true);
        setField(term81476, term81476.getClass(), "commentMarker", term81477);
        setCharField(term81476, term81476.getClass(), "delimiter", 'b');
        setField(term81476, term81476.getClass(), "escapeCharacter", term81478);
        setElement(term81479, 0, "AGXoIndFnm");
        setElement(term81479, 1, "mwmFMNEzkK");
        setField(term81476, term81476.getClass(), "header", term81479);
        setElement(term81484, 0, "kVAmKknVln");
        setField(term81476, term81476.getClass(), "headerComments", term81484);
        setBooleanField(term81476, term81476.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term81476, term81476.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term81476, term81476.getClass(), "ignoreSurroundingSpaces", false);
        setField(term81476, term81476.getClass(), "nullString", "MRFLbEGYKG");
        setField(term81476, term81476.getClass(), "quoteCharacter", term81489);
        setField(term81476, term81476.getClass(), "quoteMode", enum164);
        setField(term81476, term81476.getClass(), "recordSeparator", "BYrGukTyof");
        setBooleanField(term81476, term81476.getClass(), "skipHeaderRecord", true);
        setBooleanField(term81476, term81476.getClass(), "trailingDelimiter", false);
        setBooleanField(term81476, term81476.getClass(), "trim", false);
        term81495 = new Character('Y');
        Character term81205 = new Character('f');
        Character term81208 = new Character('Y');
        Character term81263 = new Character('Q');
        Class<? extends Object> term82013 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term82012 = ((Class) term82013).getDeclaredField((String) "MINIMAL");
        ((Field) term82012).setAccessible(true);
        Object enum165 = ((Field) term82012).get((Object) null);
        term81203 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term81210 = (Object[]) newArray("java.lang.String", 2);
        Object[] term81235 = (Object[]) newArray("java.lang.String", 1);
        setBooleanField(term81203, term81203.getClass(), "allowMissingColumnNames", true);
        setField(term81203, term81203.getClass(), "commentMarker", term81205);
        setCharField(term81203, term81203.getClass(), "delimiter", 'b');
        setField(term81203, term81203.getClass(), "escapeCharacter", term81208);
        setElement(term81210, 0, "AGXoIndFnm");
        setElement(term81210, 1, "mwmFMNEzkK");
        setField(term81203, term81203.getClass(), "header", term81210);
        setElement(term81235, 0, "kVAmKknVln");
        setField(term81203, term81203.getClass(), "headerComments", term81235);
        setBooleanField(term81203, term81203.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term81203, term81203.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term81203, term81203.getClass(), "ignoreSurroundingSpaces", false);
        setField(term81203, term81203.getClass(), "nullString", "MRFLbEGYKG");
        setField(term81203, term81203.getClass(), "quoteCharacter", term81263);
        setField(term81203, term81203.getClass(), "quoteMode", enum165);
        setField(term81203, term81203.getClass(), "recordSeparator", "BYrGukTyof");
        setBooleanField(term81203, term81203.getClass(), "skipHeaderRecord", true);
        setBooleanField(term81203, term81203.getClass(), "trailingDelimiter", false);
        setBooleanField(term81203, term81203.getClass(), "trim", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Character");
        Object[] args = new Object[1];
        args[0] = term20460;
        Object retValue = callMethod(klass, "withEscape", argTypes, term20372, args);
        assertTrue(recursiveEquals(term20372, term81476));
        assertTrue(recursiveEquals(term20460, term81495));
        assertTrue(recursiveEquals(retValue, term81203));
    }

};



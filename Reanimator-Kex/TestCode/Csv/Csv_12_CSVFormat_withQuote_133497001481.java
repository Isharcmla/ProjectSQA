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

public class CSVFormat_withQuote_133497001481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12231;
     Object term12295;
     Object term45484;
     Object term45498;
     Object term45311;

    public CSVFormat_withQuote_133497001481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term12233 = new Character('a');
        Class<? extends Object> term45500 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term45499 = ((Class) term45500).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term45499).setAccessible(true);
        Object enum116 = ((Field) term45499).get((Object) null);
        Character term12250 = new Character('J');
        Character term12252 = new Character('l');
        term12231 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term12281 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term12231, term12231.getClass(), "delimiter", 'B');
        setField(term12231, term12231.getClass(), "quoteCharacter", term12233);
        setField(term12231, term12231.getClass(), "quoteMode", enum116);
        setField(term12231, term12231.getClass(), "commentMarker", term12250);
        setField(term12231, term12231.getClass(), "escapeCharacter", term12252);
        setBooleanField(term12231, term12231.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term12231, term12231.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term12231, term12231.getClass(), "ignoreEmptyLines", true);
        setField(term12231, term12231.getClass(), "recordSeparator", "SFqCrhEWLm");
        setField(term12231, term12231.getClass(), "nullString", "GZdcJyZntS");
        setElement(term12281, 0, "OIHoJeysUi");
        setField(term12231, term12231.getClass(), "header", term12281);
        setBooleanField(term12231, term12231.getClass(), "skipHeaderRecord", false);
        term12295 = new Character('i');
        Character term45485 = new Character('a');
        Class<? extends Object> term45730 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term45729 = ((Class) term45730).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term45729).setAccessible(true);
        Object enum117 = ((Field) term45729).get((Object) null);
        Character term45489 = new Character('J');
        Character term45490 = new Character('l');
        term45484 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term45495 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term45484, term45484.getClass(), "delimiter", 'B');
        setField(term45484, term45484.getClass(), "quoteCharacter", term45485);
        setField(term45484, term45484.getClass(), "quoteMode", enum117);
        setField(term45484, term45484.getClass(), "commentMarker", term45489);
        setField(term45484, term45484.getClass(), "escapeCharacter", term45490);
        setBooleanField(term45484, term45484.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term45484, term45484.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term45484, term45484.getClass(), "ignoreEmptyLines", true);
        setField(term45484, term45484.getClass(), "recordSeparator", "SFqCrhEWLm");
        setField(term45484, term45484.getClass(), "nullString", "GZdcJyZntS");
        setElement(term45495, 0, "OIHoJeysUi");
        setField(term45484, term45484.getClass(), "header", term45495);
        setBooleanField(term45484, term45484.getClass(), "skipHeaderRecord", false);
        term45498 = new Character('i');
        Character term45313 = new Character('i');
        Class<? extends Object> term45960 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term45959 = ((Class) term45960).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term45959).setAccessible(true);
        Object enum118 = ((Field) term45959).get((Object) null);
        Character term45330 = new Character('J');
        Character term45332 = new Character('l');
        term45311 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term45361 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term45311, term45311.getClass(), "delimiter", 'B');
        setField(term45311, term45311.getClass(), "quoteCharacter", term45313);
        setField(term45311, term45311.getClass(), "quoteMode", enum118);
        setField(term45311, term45311.getClass(), "commentMarker", term45330);
        setField(term45311, term45311.getClass(), "escapeCharacter", term45332);
        setBooleanField(term45311, term45311.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term45311, term45311.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term45311, term45311.getClass(), "ignoreEmptyLines", true);
        setField(term45311, term45311.getClass(), "recordSeparator", "SFqCrhEWLm");
        setField(term45311, term45311.getClass(), "nullString", "GZdcJyZntS");
        setElement(term45361, 0, "OIHoJeysUi");
        setField(term45311, term45311.getClass(), "header", term45361);
        setBooleanField(term45311, term45311.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Character");
        Object[] args = new Object[1];
        args[0] = term12295;
        Object retValue = callMethod(klass, "withQuote", argTypes, term12231, args);
        assertTrue(recursiveEquals(term12231, term45484));
        assertTrue(recursiveEquals(term12295, term45498));
        assertTrue(recursiveEquals(retValue, term45311));
    }

};



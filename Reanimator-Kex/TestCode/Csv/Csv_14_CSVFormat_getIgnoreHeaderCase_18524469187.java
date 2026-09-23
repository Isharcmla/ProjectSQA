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

public class CSVFormat_getIgnoreHeaderCase_18524469187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4290;
     Object term46784;

    public CSVFormat_getIgnoreHeaderCase_18524469187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term4292 = new Character('Z');
        Character term4295 = new Character('V');
        Character term4434 = new Character('m');
        Class<? extends Object> term46928 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term46927 = ((Class) term46928).getDeclaredField((String) "MINIMAL");
        ((Field) term46927).setAccessible(true);
        Object enum92 = ((Field) term46927).get((Object) null);
        term4290 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term4297 = (Object[]) newArray("java.lang.String", 1);
        Object[] term4310 = (Object[]) newArray("java.lang.String", 9);
        setBooleanField(term4290, term4290.getClass(), "allowMissingColumnNames", false);
        setField(term4290, term4290.getClass(), "commentMarker", term4292);
        setCharField(term4290, term4290.getClass(), "delimiter", 'p');
        setField(term4290, term4290.getClass(), "escapeCharacter", term4295);
        setElement(term4297, 0, "JqXGgAhZPl");
        setField(term4290, term4290.getClass(), "header", term4297);
        setElement(term4310, 0, "jiKYgYHqIS");
        setElement(term4310, 1, "DfISiziTgG");
        setElement(term4310, 2, "XqgfKFvPSD");
        setElement(term4310, 3, "JiVRgTZvKc");
        setElement(term4310, 4, "XPKmummaqg");
        setElement(term4310, 5, "BKLfkLiZTH");
        setElement(term4310, 6, "SPpkrGcPRr");
        setElement(term4310, 7, "sEccwbJKYE");
        setElement(term4310, 8, "AWRooQKkdW");
        setField(term4290, term4290.getClass(), "headerComments", term4310);
        setBooleanField(term4290, term4290.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term4290, term4290.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term4290, term4290.getClass(), "ignoreSurroundingSpaces", false);
        setField(term4290, term4290.getClass(), "nullString", "vjxIhXHxGR");
        setField(term4290, term4290.getClass(), "quoteCharacter", term4434);
        setField(term4290, term4290.getClass(), "quoteMode", enum92);
        setField(term4290, term4290.getClass(), "recordSeparator", "QXzGXbEXMu");
        setBooleanField(term4290, term4290.getClass(), "skipHeaderRecord", false);
        setBooleanField(term4290, term4290.getClass(), "trailingDelimiter", false);
        setBooleanField(term4290, term4290.getClass(), "trim", true);
        Character term46785 = new Character('Z');
        Character term46786 = new Character('V');
        Character term46811 = new Character('m');
        Class<? extends Object> term47236 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term47235 = ((Class) term47236).getDeclaredField((String) "MINIMAL");
        ((Field) term47235).setAccessible(true);
        Object enum93 = ((Field) term47235).get((Object) null);
        term46784 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term46787 = (Object[]) newArray("java.lang.String", 1);
        Object[] term46790 = (Object[]) newArray("java.lang.String", 9);
        setBooleanField(term46784, term46784.getClass(), "allowMissingColumnNames", false);
        setField(term46784, term46784.getClass(), "commentMarker", term46785);
        setCharField(term46784, term46784.getClass(), "delimiter", 'p');
        setField(term46784, term46784.getClass(), "escapeCharacter", term46786);
        setElement(term46787, 0, "JqXGgAhZPl");
        setField(term46784, term46784.getClass(), "header", term46787);
        setElement(term46790, 0, "jiKYgYHqIS");
        setElement(term46790, 1, "DfISiziTgG");
        setElement(term46790, 2, "XqgfKFvPSD");
        setElement(term46790, 3, "JiVRgTZvKc");
        setElement(term46790, 4, "XPKmummaqg");
        setElement(term46790, 5, "BKLfkLiZTH");
        setElement(term46790, 6, "SPpkrGcPRr");
        setElement(term46790, 7, "sEccwbJKYE");
        setElement(term46790, 8, "AWRooQKkdW");
        setField(term46784, term46784.getClass(), "headerComments", term46790);
        setBooleanField(term46784, term46784.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term46784, term46784.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term46784, term46784.getClass(), "ignoreSurroundingSpaces", false);
        setField(term46784, term46784.getClass(), "nullString", "vjxIhXHxGR");
        setField(term46784, term46784.getClass(), "quoteCharacter", term46811);
        setField(term46784, term46784.getClass(), "quoteMode", enum93);
        setField(term46784, term46784.getClass(), "recordSeparator", "QXzGXbEXMu");
        setBooleanField(term46784, term46784.getClass(), "skipHeaderRecord", false);
        setBooleanField(term46784, term46784.getClass(), "trailingDelimiter", false);
        setBooleanField(term46784, term46784.getClass(), "trim", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIgnoreHeaderCase", argTypes, term4290, args);
        assertTrue(recursiveEquals(term4290, term46784));
    }

};



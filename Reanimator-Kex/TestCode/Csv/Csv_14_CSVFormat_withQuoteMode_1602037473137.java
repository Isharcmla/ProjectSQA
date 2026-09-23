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

public class CSVFormat_withQuoteMode_1602037473137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27343;
     Object enum212;
     Object term104655;
     Object enum214;
     Object term104090;

    public CSVFormat_withQuoteMode_1602037473137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term27345 = new Character('v');
        Character term27348 = new Character('Q');
        Character term27499 = new Character('L');
        Class<? extends Object> term104814 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term104813 = ((Class) term104814).getDeclaredField((String) "MINIMAL");
        ((Field) term104813).setAccessible(true);
        Object enum211 = ((Field) term104813).get((Object) null);
        term27343 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term27350 = (Object[]) newArray("java.lang.String", 5);
        Object[] term27411 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term27343, term27343.getClass(), "allowMissingColumnNames", false);
        setField(term27343, term27343.getClass(), "commentMarker", term27345);
        setCharField(term27343, term27343.getClass(), "delimiter", 'r');
        setField(term27343, term27343.getClass(), "escapeCharacter", term27348);
        setElement(term27350, 0, "EBYHwsuWAU");
        setElement(term27350, 1, "PtIjKpiSix");
        setElement(term27350, 2, "NZdTuwSCIM");
        setElement(term27350, 3, "dDHcmzPAmP");
        setElement(term27350, 4, "HEaTkWYBgv");
        setField(term27343, term27343.getClass(), "header", term27350);
        setElement(term27411, 0, "MpJsPKLTIU");
        setElement(term27411, 1, "IiNCZfdouL");
        setElement(term27411, 2, "AhOHzCsHKW");
        setElement(term27411, 3, "UqgLPaaAHi");
        setElement(term27411, 4, "xypryEkUPF");
        setElement(term27411, 5, "zyZTzHNjQr");
        setField(term27343, term27343.getClass(), "headerComments", term27411);
        setBooleanField(term27343, term27343.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term27343, term27343.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term27343, term27343.getClass(), "ignoreSurroundingSpaces", false);
        setField(term27343, term27343.getClass(), "nullString", "YSrFKQQwXE");
        setField(term27343, term27343.getClass(), "quoteCharacter", term27499);
        setField(term27343, term27343.getClass(), "quoteMode", enum211);
        setField(term27343, term27343.getClass(), "recordSeparator", "qxhOsmyyjm");
        setBooleanField(term27343, term27343.getClass(), "skipHeaderRecord", true);
        setBooleanField(term27343, term27343.getClass(), "trailingDelimiter", false);
        setBooleanField(term27343, term27343.getClass(), "trim", true);
        Class<? extends Object> term105012 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term105011 = ((Class) term105012).getDeclaredField((String) "ALL");
        ((Field) term105011).setAccessible(true);
        enum212 = ((Field) term105011).get((Object) null);
        Character term104656 = new Character('v');
        Character term104657 = new Character('Q');
        Character term104684 = new Character('L');
        Class<? extends Object> term105308 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term105307 = ((Class) term105308).getDeclaredField((String) "MINIMAL");
        ((Field) term105307).setAccessible(true);
        Object enum213 = ((Field) term105307).get((Object) null);
        term104655 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term104658 = (Object[]) newArray("java.lang.String", 5);
        Object[] term104669 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term104655, term104655.getClass(), "allowMissingColumnNames", false);
        setField(term104655, term104655.getClass(), "commentMarker", term104656);
        setCharField(term104655, term104655.getClass(), "delimiter", 'r');
        setField(term104655, term104655.getClass(), "escapeCharacter", term104657);
        setElement(term104658, 0, "EBYHwsuWAU");
        setElement(term104658, 1, "PtIjKpiSix");
        setElement(term104658, 2, "NZdTuwSCIM");
        setElement(term104658, 3, "dDHcmzPAmP");
        setElement(term104658, 4, "HEaTkWYBgv");
        setField(term104655, term104655.getClass(), "header", term104658);
        setElement(term104669, 0, "MpJsPKLTIU");
        setElement(term104669, 1, "IiNCZfdouL");
        setElement(term104669, 2, "AhOHzCsHKW");
        setElement(term104669, 3, "UqgLPaaAHi");
        setElement(term104669, 4, "xypryEkUPF");
        setElement(term104669, 5, "zyZTzHNjQr");
        setField(term104655, term104655.getClass(), "headerComments", term104669);
        setBooleanField(term104655, term104655.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term104655, term104655.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term104655, term104655.getClass(), "ignoreSurroundingSpaces", false);
        setField(term104655, term104655.getClass(), "nullString", "YSrFKQQwXE");
        setField(term104655, term104655.getClass(), "quoteCharacter", term104684);
        setField(term104655, term104655.getClass(), "quoteMode", enum213);
        setField(term104655, term104655.getClass(), "recordSeparator", "qxhOsmyyjm");
        setBooleanField(term104655, term104655.getClass(), "skipHeaderRecord", true);
        setBooleanField(term104655, term104655.getClass(), "trailingDelimiter", false);
        setBooleanField(term104655, term104655.getClass(), "trim", true);
        Class<? extends Object> term105506 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term105505 = ((Class) term105506).getDeclaredField((String) "ALL");
        ((Field) term105505).setAccessible(true);
        enum214 = ((Field) term105505).get((Object) null);
        Character term104092 = new Character('v');
        Character term104095 = new Character('Q');
        Character term104246 = new Character('L');
        Class<? extends Object> term105802 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term105801 = ((Class) term105802).getDeclaredField((String) "ALL");
        ((Field) term105801).setAccessible(true);
        Object enum215 = ((Field) term105801).get((Object) null);
        term104090 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term104097 = (Object[]) newArray("java.lang.String", 5);
        Object[] term104158 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term104090, term104090.getClass(), "allowMissingColumnNames", false);
        setField(term104090, term104090.getClass(), "commentMarker", term104092);
        setCharField(term104090, term104090.getClass(), "delimiter", 'r');
        setField(term104090, term104090.getClass(), "escapeCharacter", term104095);
        setElement(term104097, 0, "EBYHwsuWAU");
        setElement(term104097, 1, "PtIjKpiSix");
        setElement(term104097, 2, "NZdTuwSCIM");
        setElement(term104097, 3, "dDHcmzPAmP");
        setElement(term104097, 4, "HEaTkWYBgv");
        setField(term104090, term104090.getClass(), "header", term104097);
        setElement(term104158, 0, "MpJsPKLTIU");
        setElement(term104158, 1, "IiNCZfdouL");
        setElement(term104158, 2, "AhOHzCsHKW");
        setElement(term104158, 3, "UqgLPaaAHi");
        setElement(term104158, 4, "xypryEkUPF");
        setElement(term104158, 5, "zyZTzHNjQr");
        setField(term104090, term104090.getClass(), "headerComments", term104158);
        setBooleanField(term104090, term104090.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term104090, term104090.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term104090, term104090.getClass(), "ignoreSurroundingSpaces", false);
        setField(term104090, term104090.getClass(), "nullString", "YSrFKQQwXE");
        setField(term104090, term104090.getClass(), "quoteCharacter", term104246);
        setField(term104090, term104090.getClass(), "quoteMode", enum215);
        setField(term104090, term104090.getClass(), "recordSeparator", "qxhOsmyyjm");
        setBooleanField(term104090, term104090.getClass(), "skipHeaderRecord", true);
        setBooleanField(term104090, term104090.getClass(), "trailingDelimiter", false);
        setBooleanField(term104090, term104090.getClass(), "trim", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.csv.QuoteMode");
        Object[] args = new Object[1];
        args[0] = enum212;
        Object retValue = callMethod(klass, "withQuoteMode", argTypes, term27343, args);
        assertTrue(recursiveEquals(term27343, term104655));
        assertTrue(recursiveEquals(enum212, enum214));
        assertTrue(recursiveEquals(retValue, term104090));
    }

};



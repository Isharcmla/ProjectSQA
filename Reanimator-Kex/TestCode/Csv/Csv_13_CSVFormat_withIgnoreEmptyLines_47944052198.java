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

public class CSVFormat_withIgnoreEmptyLines_47944052198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17320;
     Object term76836;
     Object term76701;

    public CSVFormat_withIgnoreEmptyLines_47944052198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term17322 = new Character('i');
        Class<? extends Object> term76866 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term76865 = ((Class) term76866).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term76865).setAccessible(true);
        Object enum136 = ((Field) term76865).get((Object) null);
        Character term17339 = new Character('a');
        Character term17341 = new Character('G');
        term17320 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term17370 = (Object[]) newArray("java.lang.String", 7);
        Object[] term17455 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term17320, term17320.getClass(), "delimiter", 'Z');
        setField(term17320, term17320.getClass(), "quoteCharacter", term17322);
        setField(term17320, term17320.getClass(), "quoteMode", enum136);
        setField(term17320, term17320.getClass(), "commentMarker", term17339);
        setField(term17320, term17320.getClass(), "escapeCharacter", term17341);
        setBooleanField(term17320, term17320.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term17320, term17320.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term17320, term17320.getClass(), "ignoreEmptyLines", true);
        setField(term17320, term17320.getClass(), "recordSeparator", "huVIXUWLtI");
        setField(term17320, term17320.getClass(), "nullString", "vhKzFyKPOT");
        setElement(term17370, 0, "nQhIgWXdRc");
        setElement(term17370, 1, "EusenEbIoF");
        setElement(term17370, 2, "SScVQYSvWH");
        setElement(term17370, 3, "MnovcqFhCl");
        setElement(term17370, 4, "qYtAeLzOhW");
        setElement(term17370, 5, "tJzmOfcUnY");
        setElement(term17370, 6, "TKlccZUpjz");
        setField(term17320, term17320.getClass(), "header", term17370);
        setElement(term17455, 0, "GGzwMoHZXC");
        setField(term17320, term17320.getClass(), "headerComments", term17455);
        setBooleanField(term17320, term17320.getClass(), "skipHeaderRecord", true);
        setBooleanField(term17320, term17320.getClass(), "ignoreHeaderCase", true);
        Character term76837 = new Character('i');
        Class<? extends Object> term77166 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term77165 = ((Class) term77166).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term77165).setAccessible(true);
        Object enum137 = ((Field) term77165).get((Object) null);
        Character term76841 = new Character('a');
        Character term76842 = new Character('G');
        term76836 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term76847 = (Object[]) newArray("java.lang.String", 7);
        Object[] term76862 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term76836, term76836.getClass(), "delimiter", 'Z');
        setField(term76836, term76836.getClass(), "quoteCharacter", term76837);
        setField(term76836, term76836.getClass(), "quoteMode", enum137);
        setField(term76836, term76836.getClass(), "commentMarker", term76841);
        setField(term76836, term76836.getClass(), "escapeCharacter", term76842);
        setBooleanField(term76836, term76836.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term76836, term76836.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term76836, term76836.getClass(), "ignoreEmptyLines", true);
        setField(term76836, term76836.getClass(), "recordSeparator", "huVIXUWLtI");
        setField(term76836, term76836.getClass(), "nullString", "vhKzFyKPOT");
        setElement(term76847, 0, "nQhIgWXdRc");
        setElement(term76847, 1, "EusenEbIoF");
        setElement(term76847, 2, "SScVQYSvWH");
        setElement(term76847, 3, "MnovcqFhCl");
        setElement(term76847, 4, "qYtAeLzOhW");
        setElement(term76847, 5, "tJzmOfcUnY");
        setElement(term76847, 6, "TKlccZUpjz");
        setField(term76836, term76836.getClass(), "header", term76847);
        setElement(term76862, 0, "GGzwMoHZXC");
        setField(term76836, term76836.getClass(), "headerComments", term76862);
        setBooleanField(term76836, term76836.getClass(), "skipHeaderRecord", true);
        setBooleanField(term76836, term76836.getClass(), "ignoreHeaderCase", true);
        Character term76703 = new Character('i');
        Class<? extends Object> term77466 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term77465 = ((Class) term77466).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term77465).setAccessible(true);
        Object enum138 = ((Field) term77465).get((Object) null);
        Character term76705 = new Character('a');
        Character term76707 = new Character('G');
        term76701 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term76736 = (Object[]) newArray("java.lang.String", 7);
        Object[] term76821 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term76701, term76701.getClass(), "delimiter", 'Z');
        setField(term76701, term76701.getClass(), "quoteCharacter", term76703);
        setField(term76701, term76701.getClass(), "quoteMode", enum138);
        setField(term76701, term76701.getClass(), "commentMarker", term76705);
        setField(term76701, term76701.getClass(), "escapeCharacter", term76707);
        setBooleanField(term76701, term76701.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term76701, term76701.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term76701, term76701.getClass(), "ignoreEmptyLines", true);
        setField(term76701, term76701.getClass(), "recordSeparator", "huVIXUWLtI");
        setField(term76701, term76701.getClass(), "nullString", "vhKzFyKPOT");
        setElement(term76736, 0, "nQhIgWXdRc");
        setElement(term76736, 1, "EusenEbIoF");
        setElement(term76736, 2, "SScVQYSvWH");
        setElement(term76736, 3, "MnovcqFhCl");
        setElement(term76736, 4, "qYtAeLzOhW");
        setElement(term76736, 5, "tJzmOfcUnY");
        setElement(term76736, 6, "TKlccZUpjz");
        setField(term76701, term76701.getClass(), "header", term76736);
        setElement(term76821, 0, "GGzwMoHZXC");
        setField(term76701, term76701.getClass(), "headerComments", term76821);
        setBooleanField(term76701, term76701.getClass(), "skipHeaderRecord", true);
        setBooleanField(term76701, term76701.getClass(), "ignoreHeaderCase", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "withIgnoreEmptyLines", argTypes, term17320, args);
        assertTrue(recursiveEquals(term17320, term76836));
        assertTrue(recursiveEquals(retValue, term76701));
    }

};



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

public class CSVFormat_getEscapeCharacter_105301515366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2705;
     Object term43371;
     Object term42998;

    public CSVFormat_getEscapeCharacter_105301515366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term2707 = new Character('q');
        Class<? extends Object> term43393 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term43392 = ((Class) term43393).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term43392).setAccessible(true);
        Object enum66 = ((Field) term43392).get((Object) null);
        Character term2724 = new Character('z');
        Character term2726 = new Character('x');
        term2705 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term2755 = (Object[]) newArray("java.lang.String", 3);
        Object[] term2792 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term2705, term2705.getClass(), "delimiter", 'g');
        setField(term2705, term2705.getClass(), "quoteCharacter", term2707);
        setField(term2705, term2705.getClass(), "quoteMode", enum66);
        setField(term2705, term2705.getClass(), "commentMarker", term2724);
        setField(term2705, term2705.getClass(), "escapeCharacter", term2726);
        setBooleanField(term2705, term2705.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term2705, term2705.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term2705, term2705.getClass(), "ignoreEmptyLines", true);
        setField(term2705, term2705.getClass(), "recordSeparator", "eqJfYWRaEL");
        setField(term2705, term2705.getClass(), "nullString", "fhkbdRViHi");
        setElement(term2755, 0, "uWHnvSvaPl");
        setElement(term2755, 1, "kBdSllIBVz");
        setElement(term2755, 2, "TJmVBGfTML");
        setField(term2705, term2705.getClass(), "header", term2755);
        setElement(term2792, 0, "tPlsykYBqO");
        setField(term2705, term2705.getClass(), "headerComments", term2792);
        setBooleanField(term2705, term2705.getClass(), "skipHeaderRecord", true);
        setBooleanField(term2705, term2705.getClass(), "ignoreHeaderCase", false);
        Character term43372 = new Character('q');
        Class<? extends Object> term43653 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term43652 = ((Class) term43653).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term43652).setAccessible(true);
        Object enum67 = ((Field) term43652).get((Object) null);
        Character term43376 = new Character('z');
        Character term43377 = new Character('x');
        term43371 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term43382 = (Object[]) newArray("java.lang.String", 3);
        Object[] term43389 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term43371, term43371.getClass(), "delimiter", 'g');
        setField(term43371, term43371.getClass(), "quoteCharacter", term43372);
        setField(term43371, term43371.getClass(), "quoteMode", enum67);
        setField(term43371, term43371.getClass(), "commentMarker", term43376);
        setField(term43371, term43371.getClass(), "escapeCharacter", term43377);
        setBooleanField(term43371, term43371.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term43371, term43371.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term43371, term43371.getClass(), "ignoreEmptyLines", true);
        setField(term43371, term43371.getClass(), "recordSeparator", "eqJfYWRaEL");
        setField(term43371, term43371.getClass(), "nullString", "fhkbdRViHi");
        setElement(term43382, 0, "uWHnvSvaPl");
        setElement(term43382, 1, "kBdSllIBVz");
        setElement(term43382, 2, "TJmVBGfTML");
        setField(term43371, term43371.getClass(), "header", term43382);
        setElement(term43389, 0, "tPlsykYBqO");
        setField(term43371, term43371.getClass(), "headerComments", term43389);
        setBooleanField(term43371, term43371.getClass(), "skipHeaderRecord", true);
        setBooleanField(term43371, term43371.getClass(), "ignoreHeaderCase", false);
        term42998 = new Character('x');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getEscapeCharacter", argTypes, term2705, args);
        assertTrue(recursiveEquals(term2705, term43371));
        assertTrue(recursiveEquals(retValue, term42998));
    }

};



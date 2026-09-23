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

public class CSVFormat_getAllowMissingColumnNames_47810498580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1246;
     Object term41341;

    public CSVFormat_getAllowMissingColumnNames_47810498580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1248 = new Character('E');
        Character term1251 = new Character('R');
        Character term1426 = new Character('r');
        Class<? extends Object> term41521 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term41520 = ((Class) term41521).getDeclaredField((String) "ALL");
        ((Field) term41520).setAccessible(true);
        Object enum78 = ((Field) term41520).get((Object) null);
        term1246 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term1253 = (Object[]) newArray("java.lang.String", 6);
        Object[] term1326 = (Object[]) newArray("java.lang.String", 7);
        setBooleanField(term1246, term1246.getClass(), "allowMissingColumnNames", true);
        setField(term1246, term1246.getClass(), "commentMarker", term1248);
        setCharField(term1246, term1246.getClass(), "delimiter", 't');
        setField(term1246, term1246.getClass(), "escapeCharacter", term1251);
        setElement(term1253, 0, "vrQLuWIDJX");
        setElement(term1253, 1, "flxyYxBRtu");
        setElement(term1253, 2, "OclPbYPkcH");
        setElement(term1253, 3, "IoAlmYsBwc");
        setElement(term1253, 4, "TEParAifyi");
        setElement(term1253, 5, "OWDIEULEFu");
        setField(term1246, term1246.getClass(), "header", term1253);
        setElement(term1326, 0, "dWRymuLBtr");
        setElement(term1326, 1, "AijpHYOFuy");
        setElement(term1326, 2, "SbAoxhfrkn");
        setElement(term1326, 3, "kuTXqwMtDB");
        setElement(term1326, 4, "Ghbwtircqb");
        setElement(term1326, 5, "xrwlQZdwCp");
        setElement(term1326, 6, "IDCWpPLRkE");
        setField(term1246, term1246.getClass(), "headerComments", term1326);
        setBooleanField(term1246, term1246.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term1246, term1246.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term1246, term1246.getClass(), "ignoreSurroundingSpaces", true);
        setField(term1246, term1246.getClass(), "nullString", "nyiiPDVjAc");
        setField(term1246, term1246.getClass(), "quoteCharacter", term1426);
        setField(term1246, term1246.getClass(), "quoteMode", enum78);
        setField(term1246, term1246.getClass(), "recordSeparator", "aKnKipADSo");
        setBooleanField(term1246, term1246.getClass(), "skipHeaderRecord", false);
        setBooleanField(term1246, term1246.getClass(), "trailingDelimiter", false);
        setBooleanField(term1246, term1246.getClass(), "trim", false);
        Character term41342 = new Character('E');
        Character term41343 = new Character('R');
        Character term41374 = new Character('r');
        Class<? extends Object> term41849 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term41848 = ((Class) term41849).getDeclaredField((String) "ALL");
        ((Field) term41848).setAccessible(true);
        Object enum79 = ((Field) term41848).get((Object) null);
        term41341 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term41344 = (Object[]) newArray("java.lang.String", 6);
        Object[] term41357 = (Object[]) newArray("java.lang.String", 7);
        setBooleanField(term41341, term41341.getClass(), "allowMissingColumnNames", true);
        setField(term41341, term41341.getClass(), "commentMarker", term41342);
        setCharField(term41341, term41341.getClass(), "delimiter", 't');
        setField(term41341, term41341.getClass(), "escapeCharacter", term41343);
        setElement(term41344, 0, "vrQLuWIDJX");
        setElement(term41344, 1, "flxyYxBRtu");
        setElement(term41344, 2, "OclPbYPkcH");
        setElement(term41344, 3, "IoAlmYsBwc");
        setElement(term41344, 4, "TEParAifyi");
        setElement(term41344, 5, "OWDIEULEFu");
        setField(term41341, term41341.getClass(), "header", term41344);
        setElement(term41357, 0, "dWRymuLBtr");
        setElement(term41357, 1, "AijpHYOFuy");
        setElement(term41357, 2, "SbAoxhfrkn");
        setElement(term41357, 3, "kuTXqwMtDB");
        setElement(term41357, 4, "Ghbwtircqb");
        setElement(term41357, 5, "xrwlQZdwCp");
        setElement(term41357, 6, "IDCWpPLRkE");
        setField(term41341, term41341.getClass(), "headerComments", term41357);
        setBooleanField(term41341, term41341.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term41341, term41341.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term41341, term41341.getClass(), "ignoreSurroundingSpaces", true);
        setField(term41341, term41341.getClass(), "nullString", "nyiiPDVjAc");
        setField(term41341, term41341.getClass(), "quoteCharacter", term41374);
        setField(term41341, term41341.getClass(), "quoteMode", enum79);
        setField(term41341, term41341.getClass(), "recordSeparator", "aKnKipADSo");
        setBooleanField(term41341, term41341.getClass(), "skipHeaderRecord", false);
        setBooleanField(term41341, term41341.getClass(), "trailingDelimiter", false);
        setBooleanField(term41341, term41341.getClass(), "trim", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllowMissingColumnNames", argTypes, term1246, args);
        assertTrue(recursiveEquals(term1246, term41341));
    }

};



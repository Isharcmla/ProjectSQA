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

public class CSVFormat_getAllowMissingColumnNames_47810498583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1282;
     Object term42589;

    public CSVFormat_getAllowMissingColumnNames_47810498583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1284 = new Character('E');
        Character term1287 = new Character('R');
        Character term1462 = new Character('r');
        Class<? extends Object> term42912 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term42911 = ((Class) term42912).getDeclaredField((String) "ALL");
        ((Field) term42911).setAccessible(true);
        Object enum81 = ((Field) term42911).get((Object) null);
        term1282 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term1289 = (Object[]) newArray("java.lang.String", 6);
        Object[] term1362 = (Object[]) newArray("java.lang.String", 7);
        setBooleanField(term1282, term1282.getClass(), "allowMissingColumnNames", true);
        setField(term1282, term1282.getClass(), "commentMarker", term1284);
        setCharField(term1282, term1282.getClass(), "delimiter", 't');
        setField(term1282, term1282.getClass(), "escapeCharacter", term1287);
        setElement(term1289, 0, "vrQLuWIDJX");
        setElement(term1289, 1, "flxyYxBRtu");
        setElement(term1289, 2, "OclPbYPkcH");
        setElement(term1289, 3, "IoAlmYsBwc");
        setElement(term1289, 4, "TEParAifyi");
        setElement(term1289, 5, "OWDIEULEFu");
        setField(term1282, term1282.getClass(), "header", term1289);
        setElement(term1362, 0, "dWRymuLBtr");
        setElement(term1362, 1, "AijpHYOFuy");
        setElement(term1362, 2, "SbAoxhfrkn");
        setElement(term1362, 3, "kuTXqwMtDB");
        setElement(term1362, 4, "Ghbwtircqb");
        setElement(term1362, 5, "xrwlQZdwCp");
        setElement(term1362, 6, "IDCWpPLRkE");
        setField(term1282, term1282.getClass(), "headerComments", term1362);
        setBooleanField(term1282, term1282.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term1282, term1282.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term1282, term1282.getClass(), "ignoreSurroundingSpaces", false);
        setField(term1282, term1282.getClass(), "nullString", "nyiiPDVjAc");
        setField(term1282, term1282.getClass(), "quoteCharacter", term1462);
        setField(term1282, term1282.getClass(), "quoteMode", enum81);
        setField(term1282, term1282.getClass(), "recordSeparator", "aKnKipADSo");
        setBooleanField(term1282, term1282.getClass(), "skipHeaderRecord", true);
        setBooleanField(term1282, term1282.getClass(), "trailingDelimiter", true);
        setBooleanField(term1282, term1282.getClass(), "trim", true);
        setBooleanField(term1282, term1282.getClass(), "autoFlush", true);
        Character term42590 = new Character('E');
        Character term42591 = new Character('R');
        Character term42622 = new Character('r');
        Class<? extends Object> term43238 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term43237 = ((Class) term43238).getDeclaredField((String) "ALL");
        ((Field) term43237).setAccessible(true);
        Object enum82 = ((Field) term43237).get((Object) null);
        term42589 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term42592 = (Object[]) newArray("java.lang.String", 6);
        Object[] term42605 = (Object[]) newArray("java.lang.String", 7);
        setBooleanField(term42589, term42589.getClass(), "allowMissingColumnNames", true);
        setField(term42589, term42589.getClass(), "commentMarker", term42590);
        setCharField(term42589, term42589.getClass(), "delimiter", 't');
        setField(term42589, term42589.getClass(), "escapeCharacter", term42591);
        setElement(term42592, 0, "vrQLuWIDJX");
        setElement(term42592, 1, "flxyYxBRtu");
        setElement(term42592, 2, "OclPbYPkcH");
        setElement(term42592, 3, "IoAlmYsBwc");
        setElement(term42592, 4, "TEParAifyi");
        setElement(term42592, 5, "OWDIEULEFu");
        setField(term42589, term42589.getClass(), "header", term42592);
        setElement(term42605, 0, "dWRymuLBtr");
        setElement(term42605, 1, "AijpHYOFuy");
        setElement(term42605, 2, "SbAoxhfrkn");
        setElement(term42605, 3, "kuTXqwMtDB");
        setElement(term42605, 4, "Ghbwtircqb");
        setElement(term42605, 5, "xrwlQZdwCp");
        setElement(term42605, 6, "IDCWpPLRkE");
        setField(term42589, term42589.getClass(), "headerComments", term42605);
        setBooleanField(term42589, term42589.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term42589, term42589.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term42589, term42589.getClass(), "ignoreSurroundingSpaces", false);
        setField(term42589, term42589.getClass(), "nullString", "nyiiPDVjAc");
        setField(term42589, term42589.getClass(), "quoteCharacter", term42622);
        setField(term42589, term42589.getClass(), "quoteMode", enum82);
        setField(term42589, term42589.getClass(), "recordSeparator", "aKnKipADSo");
        setBooleanField(term42589, term42589.getClass(), "skipHeaderRecord", true);
        setBooleanField(term42589, term42589.getClass(), "trailingDelimiter", true);
        setBooleanField(term42589, term42589.getClass(), "trim", true);
        setBooleanField(term42589, term42589.getClass(), "autoFlush", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllowMissingColumnNames", argTypes, term1282, args);
        assertTrue(recursiveEquals(term1282, term42589));
    }

};



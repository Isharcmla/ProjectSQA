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

public class CSVFormat_getIgnoreSurroundingSpaces_97078270571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4813;
     Object term47448;

    public CSVFormat_getIgnoreSurroundingSpaces_97078270571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term4815 = new Character('n');
        Class<? extends Object> term47485 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term47484 = ((Class) term47485).getDeclaredField((String) "NONE");
        ((Field) term47484).setAccessible(true);
        Object enum76 = ((Field) term47484).get((Object) null);
        Character term4825 = new Character('W');
        Character term4827 = new Character('E');
        term4813 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term4856 = (Object[]) newArray("java.lang.String", 5);
        Object[] term4917 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term4813, term4813.getClass(), "delimiter", 'a');
        setField(term4813, term4813.getClass(), "quoteCharacter", term4815);
        setField(term4813, term4813.getClass(), "quoteMode", enum76);
        setField(term4813, term4813.getClass(), "commentMarker", term4825);
        setField(term4813, term4813.getClass(), "escapeCharacter", term4827);
        setBooleanField(term4813, term4813.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term4813, term4813.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term4813, term4813.getClass(), "ignoreEmptyLines", true);
        setField(term4813, term4813.getClass(), "recordSeparator", "ZVecLZMLHF");
        setField(term4813, term4813.getClass(), "nullString", "fztQhjqwdP");
        setElement(term4856, 0, "eVpkWxjuki");
        setElement(term4856, 1, "SJiQaLvSKv");
        setElement(term4856, 2, "OEXDRUKcFl");
        setElement(term4856, 3, "RYdKCNNMBR");
        setElement(term4856, 4, "yGtHPyvYiQ");
        setField(term4813, term4813.getClass(), "header", term4856);
        setElement(term4917, 0, "MvRIxilFMJ");
        setElement(term4917, 1, "iNwOJRBEjp");
        setElement(term4917, 2, "XylxrMBraH");
        setElement(term4917, 3, "pORebkoRdD");
        setElement(term4917, 4, "mXGCWJDOqA");
        setElement(term4917, 5, "dpNsDgfPso");
        setField(term4813, term4813.getClass(), "headerComments", term4917);
        setBooleanField(term4813, term4813.getClass(), "skipHeaderRecord", false);
        setBooleanField(term4813, term4813.getClass(), "ignoreHeaderCase", false);
        Character term47449 = new Character('n');
        Class<? extends Object> term47939 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term47938 = ((Class) term47939).getDeclaredField((String) "NONE");
        ((Field) term47938).setAccessible(true);
        Object enum77 = ((Field) term47938).get((Object) null);
        Character term47453 = new Character('W');
        Character term47454 = new Character('E');
        term47448 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term47460 = (Object[]) newArray("java.lang.String", 5);
        Object[] term47471 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term47448, term47448.getClass(), "delimiter", 'a');
        setField(term47448, term47448.getClass(), "quoteCharacter", term47449);
        setField(term47448, term47448.getClass(), "quoteMode", enum77);
        setField(term47448, term47448.getClass(), "commentMarker", term47453);
        setField(term47448, term47448.getClass(), "escapeCharacter", term47454);
        setBooleanField(term47448, term47448.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term47448, term47448.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term47448, term47448.getClass(), "ignoreEmptyLines", true);
        setField(term47448, term47448.getClass(), "recordSeparator", "ZVecLZMLHF");
        setField(term47448, term47448.getClass(), "nullString", "fztQhjqwdP");
        setElement(term47460, 0, "eVpkWxjuki");
        setElement(term47460, 1, "SJiQaLvSKv");
        setElement(term47460, 2, "OEXDRUKcFl");
        setElement(term47460, 3, "RYdKCNNMBR");
        setElement(term47460, 4, "yGtHPyvYiQ");
        setField(term47448, term47448.getClass(), "header", term47460);
        setElement(term47471, 0, "MvRIxilFMJ");
        setElement(term47471, 1, "iNwOJRBEjp");
        setElement(term47471, 2, "XylxrMBraH");
        setElement(term47471, 3, "pORebkoRdD");
        setElement(term47471, 4, "mXGCWJDOqA");
        setElement(term47471, 5, "dpNsDgfPso");
        setField(term47448, term47448.getClass(), "headerComments", term47471);
        setBooleanField(term47448, term47448.getClass(), "skipHeaderRecord", false);
        setBooleanField(term47448, term47448.getClass(), "ignoreHeaderCase", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIgnoreSurroundingSpaces", argTypes, term4813, args);
        assertTrue(recursiveEquals(term4813, term47448));
    }

};



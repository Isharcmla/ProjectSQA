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
import java.lang.Boolean;

public class CSVFormat_withIgnoreSurroundingSpaces_2091065286101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18778;
     Object term18932;
     Object term81865;
     Object term81392;

    public CSVFormat_withIgnoreSurroundingSpaces_2091065286101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term18780 = new Character('d');
        Class<? extends Object> term81897 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term81896 = ((Class) term81897).getDeclaredField((String) "ALL");
        ((Field) term81896).setAccessible(true);
        Object enum145 = ((Field) term81896).get((Object) null);
        Character term18789 = new Character('z');
        Character term18791 = new Character('j');
        term18778 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term18820 = (Object[]) newArray("java.lang.String", 0);
        Object[] term18821 = (Object[]) newArray("java.lang.String", 9);
        setCharField(term18778, term18778.getClass(), "delimiter", 'c');
        setField(term18778, term18778.getClass(), "quoteCharacter", term18780);
        setField(term18778, term18778.getClass(), "quoteMode", enum145);
        setField(term18778, term18778.getClass(), "commentMarker", term18789);
        setField(term18778, term18778.getClass(), "escapeCharacter", term18791);
        setBooleanField(term18778, term18778.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term18778, term18778.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term18778, term18778.getClass(), "ignoreEmptyLines", true);
        setField(term18778, term18778.getClass(), "recordSeparator", "gPzGDOEPPw");
        setField(term18778, term18778.getClass(), "nullString", "rwKoAngzCu");
        setField(term18778, term18778.getClass(), "header", term18820);
        setElement(term18821, 0, "VUkRVwROTl");
        setElement(term18821, 1, "UDlkdccCRn");
        setElement(term18821, 2, "McpzErOcYb");
        setElement(term18821, 3, "jqrVEUvYEz");
        setElement(term18821, 4, "QITgiBrmfj");
        setElement(term18821, 5, "pXxkiXgQnq");
        setElement(term18821, 6, "tKmrUDURku");
        setElement(term18821, 7, "JeZbrwZmsP");
        setElement(term18821, 8, "bxyfeicqrK");
        setField(term18778, term18778.getClass(), "headerComments", term18821);
        setBooleanField(term18778, term18778.getClass(), "skipHeaderRecord", true);
        setBooleanField(term18778, term18778.getClass(), "ignoreHeaderCase", false);
        term18932 = new Boolean(false);
        Character term81866 = new Character('d');
        Class<? extends Object> term82183 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term82182 = ((Class) term82183).getDeclaredField((String) "ALL");
        ((Field) term82182).setAccessible(true);
        Object enum146 = ((Field) term82182).get((Object) null);
        Character term81870 = new Character('z');
        Character term81871 = new Character('j');
        term81865 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term81876 = (Object[]) newArray("java.lang.String", 0);
        Object[] term81877 = (Object[]) newArray("java.lang.String", 9);
        setCharField(term81865, term81865.getClass(), "delimiter", 'c');
        setField(term81865, term81865.getClass(), "quoteCharacter", term81866);
        setField(term81865, term81865.getClass(), "quoteMode", enum146);
        setField(term81865, term81865.getClass(), "commentMarker", term81870);
        setField(term81865, term81865.getClass(), "escapeCharacter", term81871);
        setBooleanField(term81865, term81865.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term81865, term81865.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term81865, term81865.getClass(), "ignoreEmptyLines", true);
        setField(term81865, term81865.getClass(), "recordSeparator", "gPzGDOEPPw");
        setField(term81865, term81865.getClass(), "nullString", "rwKoAngzCu");
        setField(term81865, term81865.getClass(), "header", term81876);
        setElement(term81877, 0, "VUkRVwROTl");
        setElement(term81877, 1, "UDlkdccCRn");
        setElement(term81877, 2, "McpzErOcYb");
        setElement(term81877, 3, "jqrVEUvYEz");
        setElement(term81877, 4, "QITgiBrmfj");
        setElement(term81877, 5, "pXxkiXgQnq");
        setElement(term81877, 6, "tKmrUDURku");
        setElement(term81877, 7, "JeZbrwZmsP");
        setElement(term81877, 8, "bxyfeicqrK");
        setField(term81865, term81865.getClass(), "headerComments", term81877);
        setBooleanField(term81865, term81865.getClass(), "skipHeaderRecord", true);
        setBooleanField(term81865, term81865.getClass(), "ignoreHeaderCase", false);
        Character term81394 = new Character('d');
        Class<? extends Object> term82469 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term82468 = ((Class) term82469).getDeclaredField((String) "ALL");
        ((Field) term82468).setAccessible(true);
        Object enum147 = ((Field) term82468).get((Object) null);
        Character term81403 = new Character('z');
        Character term81405 = new Character('j');
        term81392 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term81434 = (Object[]) newArray("java.lang.String", 0);
        Object[] term81435 = (Object[]) newArray("java.lang.String", 9);
        setCharField(term81392, term81392.getClass(), "delimiter", 'c');
        setField(term81392, term81392.getClass(), "quoteCharacter", term81394);
        setField(term81392, term81392.getClass(), "quoteMode", enum147);
        setField(term81392, term81392.getClass(), "commentMarker", term81403);
        setField(term81392, term81392.getClass(), "escapeCharacter", term81405);
        setBooleanField(term81392, term81392.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term81392, term81392.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term81392, term81392.getClass(), "ignoreEmptyLines", true);
        setField(term81392, term81392.getClass(), "recordSeparator", "gPzGDOEPPw");
        setField(term81392, term81392.getClass(), "nullString", "rwKoAngzCu");
        setField(term81392, term81392.getClass(), "header", term81434);
        setElement(term81435, 0, "VUkRVwROTl");
        setElement(term81435, 1, "UDlkdccCRn");
        setElement(term81435, 2, "McpzErOcYb");
        setElement(term81435, 3, "jqrVEUvYEz");
        setElement(term81435, 4, "QITgiBrmfj");
        setElement(term81435, 5, "pXxkiXgQnq");
        setElement(term81435, 6, "tKmrUDURku");
        setElement(term81435, 7, "JeZbrwZmsP");
        setElement(term81435, 8, "bxyfeicqrK");
        setField(term81392, term81392.getClass(), "headerComments", term81435);
        setBooleanField(term81392, term81392.getClass(), "skipHeaderRecord", true);
        setBooleanField(term81392, term81392.getClass(), "ignoreHeaderCase", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term18932;
        Object retValue = callMethod(klass, "withIgnoreSurroundingSpaces", argTypes, term18778, args);
        assertTrue(recursiveEquals(term18778, term81865));
        assertTrue(recursiveEquals(term18932, false));
        assertTrue(recursiveEquals(retValue, term81392));
    }

};



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

public class CSVFormat_withCommentMarker_72835359118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18834;
     Object term18966;
     Object term76406;
     Object term76433;
     Object term75987;

    public CSVFormat_withCommentMarker_72835359118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term18836 = new Character('T');
        Character term18839 = new Character('t');
        Character term18942 = new Character('b');
        Class<? extends Object> term76515 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term76514 = ((Class) term76515).getDeclaredField((String) "ALL");
        ((Field) term76514).setAccessible(true);
        Object enum154 = ((Field) term76514).get((Object) null);
        term18834 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term18841 = (Object[]) newArray("java.lang.String", 7);
        Object[] term18926 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term18834, term18834.getClass(), "allowMissingColumnNames", false);
        setField(term18834, term18834.getClass(), "commentMarker", term18836);
        setCharField(term18834, term18834.getClass(), "delimiter", 's');
        setField(term18834, term18834.getClass(), "escapeCharacter", term18839);
        setElement(term18841, 0, "weddIktxOA");
        setElement(term18841, 1, "uSlMeISsDD");
        setElement(term18841, 2, "WdCiTDUKqn");
        setElement(term18841, 3, "PSizQDoxxe");
        setElement(term18841, 4, "mKaHyMybrK");
        setElement(term18841, 5, "AyrEXuGrEj");
        setElement(term18841, 6, "yevIIoVYHq");
        setField(term18834, term18834.getClass(), "header", term18841);
        setField(term18834, term18834.getClass(), "headerComments", term18926);
        setBooleanField(term18834, term18834.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term18834, term18834.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term18834, term18834.getClass(), "ignoreSurroundingSpaces", true);
        setField(term18834, term18834.getClass(), "nullString", "UuYWMTqWTV");
        setField(term18834, term18834.getClass(), "quoteCharacter", term18942);
        setField(term18834, term18834.getClass(), "quoteMode", enum154);
        setField(term18834, term18834.getClass(), "recordSeparator", "DSFGlcaXUb");
        setBooleanField(term18834, term18834.getClass(), "skipHeaderRecord", true);
        setBooleanField(term18834, term18834.getClass(), "trailingDelimiter", false);
        setBooleanField(term18834, term18834.getClass(), "trim", false);
        term18966 = new Character('c');
        Character term76407 = new Character('T');
        Character term76408 = new Character('t');
        Character term76427 = new Character('b');
        Class<? extends Object> term76781 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term76780 = ((Class) term76781).getDeclaredField((String) "ALL");
        ((Field) term76780).setAccessible(true);
        Object enum155 = ((Field) term76780).get((Object) null);
        term76406 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term76409 = (Object[]) newArray("java.lang.String", 7);
        Object[] term76424 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term76406, term76406.getClass(), "allowMissingColumnNames", false);
        setField(term76406, term76406.getClass(), "commentMarker", term76407);
        setCharField(term76406, term76406.getClass(), "delimiter", 's');
        setField(term76406, term76406.getClass(), "escapeCharacter", term76408);
        setElement(term76409, 0, "weddIktxOA");
        setElement(term76409, 1, "uSlMeISsDD");
        setElement(term76409, 2, "WdCiTDUKqn");
        setElement(term76409, 3, "PSizQDoxxe");
        setElement(term76409, 4, "mKaHyMybrK");
        setElement(term76409, 5, "AyrEXuGrEj");
        setElement(term76409, 6, "yevIIoVYHq");
        setField(term76406, term76406.getClass(), "header", term76409);
        setField(term76406, term76406.getClass(), "headerComments", term76424);
        setBooleanField(term76406, term76406.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term76406, term76406.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term76406, term76406.getClass(), "ignoreSurroundingSpaces", true);
        setField(term76406, term76406.getClass(), "nullString", "UuYWMTqWTV");
        setField(term76406, term76406.getClass(), "quoteCharacter", term76427);
        setField(term76406, term76406.getClass(), "quoteMode", enum155);
        setField(term76406, term76406.getClass(), "recordSeparator", "DSFGlcaXUb");
        setBooleanField(term76406, term76406.getClass(), "skipHeaderRecord", true);
        setBooleanField(term76406, term76406.getClass(), "trailingDelimiter", false);
        setBooleanField(term76406, term76406.getClass(), "trim", false);
        term76433 = new Character('c');
        Character term75989 = new Character('c');
        Character term75992 = new Character('t');
        Character term76095 = new Character('b');
        Class<? extends Object> term77047 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term77046 = ((Class) term77047).getDeclaredField((String) "ALL");
        ((Field) term77046).setAccessible(true);
        Object enum156 = ((Field) term77046).get((Object) null);
        term75987 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term75994 = (Object[]) newArray("java.lang.String", 7);
        Object[] term76079 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term75987, term75987.getClass(), "allowMissingColumnNames", false);
        setField(term75987, term75987.getClass(), "commentMarker", term75989);
        setCharField(term75987, term75987.getClass(), "delimiter", 's');
        setField(term75987, term75987.getClass(), "escapeCharacter", term75992);
        setElement(term75994, 0, "weddIktxOA");
        setElement(term75994, 1, "uSlMeISsDD");
        setElement(term75994, 2, "WdCiTDUKqn");
        setElement(term75994, 3, "PSizQDoxxe");
        setElement(term75994, 4, "mKaHyMybrK");
        setElement(term75994, 5, "AyrEXuGrEj");
        setElement(term75994, 6, "yevIIoVYHq");
        setField(term75987, term75987.getClass(), "header", term75994);
        setField(term75987, term75987.getClass(), "headerComments", term76079);
        setBooleanField(term75987, term75987.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term75987, term75987.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term75987, term75987.getClass(), "ignoreSurroundingSpaces", true);
        setField(term75987, term75987.getClass(), "nullString", "UuYWMTqWTV");
        setField(term75987, term75987.getClass(), "quoteCharacter", term76095);
        setField(term75987, term75987.getClass(), "quoteMode", enum156);
        setField(term75987, term75987.getClass(), "recordSeparator", "DSFGlcaXUb");
        setBooleanField(term75987, term75987.getClass(), "skipHeaderRecord", true);
        setBooleanField(term75987, term75987.getClass(), "trailingDelimiter", false);
        setBooleanField(term75987, term75987.getClass(), "trim", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Character");
        Object[] args = new Object[1];
        args[0] = term18966;
        Object retValue = callMethod(klass, "withCommentMarker", argTypes, term18834, args);
        assertTrue(recursiveEquals(term18834, term76406));
        assertTrue(recursiveEquals(term18966, term76433));
        assertTrue(recursiveEquals(retValue, term75987));
    }

};



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

public class CSVFormat_withIgnoreSurroundingSpaces_2091066216132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25107;
     Object term97185;
     Object term97036;

    public CSVFormat_withIgnoreSurroundingSpaces_2091066216132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term25109 = new Character('D');
        Character term25112 = new Character('e');
        Character term25239 = new Character('Z');
        Class<? extends Object> term97317 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term97316 = ((Class) term97317).getDeclaredField((String) "ALL");
        ((Field) term97316).setAccessible(true);
        Object enum196 = ((Field) term97316).get((Object) null);
        term25107 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term25114 = (Object[]) newArray("java.lang.String", 5);
        Object[] term25175 = (Object[]) newArray("java.lang.String", 4);
        setBooleanField(term25107, term25107.getClass(), "allowMissingColumnNames", true);
        setField(term25107, term25107.getClass(), "commentMarker", term25109);
        setCharField(term25107, term25107.getClass(), "delimiter", 'U');
        setField(term25107, term25107.getClass(), "escapeCharacter", term25112);
        setElement(term25114, 0, "HJwNgUzZZR");
        setElement(term25114, 1, "FvUCZgTXhq");
        setElement(term25114, 2, "wWWidPCHzx");
        setElement(term25114, 3, "OwPIiBRuKK");
        setElement(term25114, 4, "sgfGySMODT");
        setField(term25107, term25107.getClass(), "header", term25114);
        setElement(term25175, 0, "ndAITnOsny");
        setElement(term25175, 1, "CVZnTiJucs");
        setElement(term25175, 2, "ecHEQufXoq");
        setElement(term25175, 3, "btBLMvHzJg");
        setField(term25107, term25107.getClass(), "headerComments", term25175);
        setBooleanField(term25107, term25107.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term25107, term25107.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term25107, term25107.getClass(), "ignoreSurroundingSpaces", false);
        setField(term25107, term25107.getClass(), "nullString", "JdOMfNWgLP");
        setField(term25107, term25107.getClass(), "quoteCharacter", term25239);
        setField(term25107, term25107.getClass(), "quoteMode", enum196);
        setField(term25107, term25107.getClass(), "recordSeparator", "uWqXrwAsDU");
        setBooleanField(term25107, term25107.getClass(), "skipHeaderRecord", false);
        setBooleanField(term25107, term25107.getClass(), "trailingDelimiter", false);
        setBooleanField(term25107, term25107.getClass(), "trim", false);
        Character term97186 = new Character('D');
        Character term97187 = new Character('e');
        Character term97210 = new Character('Z');
        Class<? extends Object> term97603 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term97602 = ((Class) term97603).getDeclaredField((String) "ALL");
        ((Field) term97602).setAccessible(true);
        Object enum197 = ((Field) term97602).get((Object) null);
        term97185 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term97188 = (Object[]) newArray("java.lang.String", 5);
        Object[] term97199 = (Object[]) newArray("java.lang.String", 4);
        setBooleanField(term97185, term97185.getClass(), "allowMissingColumnNames", true);
        setField(term97185, term97185.getClass(), "commentMarker", term97186);
        setCharField(term97185, term97185.getClass(), "delimiter", 'U');
        setField(term97185, term97185.getClass(), "escapeCharacter", term97187);
        setElement(term97188, 0, "HJwNgUzZZR");
        setElement(term97188, 1, "FvUCZgTXhq");
        setElement(term97188, 2, "wWWidPCHzx");
        setElement(term97188, 3, "OwPIiBRuKK");
        setElement(term97188, 4, "sgfGySMODT");
        setField(term97185, term97185.getClass(), "header", term97188);
        setElement(term97199, 0, "ndAITnOsny");
        setElement(term97199, 1, "CVZnTiJucs");
        setElement(term97199, 2, "ecHEQufXoq");
        setElement(term97199, 3, "btBLMvHzJg");
        setField(term97185, term97185.getClass(), "headerComments", term97199);
        setBooleanField(term97185, term97185.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term97185, term97185.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term97185, term97185.getClass(), "ignoreSurroundingSpaces", false);
        setField(term97185, term97185.getClass(), "nullString", "JdOMfNWgLP");
        setField(term97185, term97185.getClass(), "quoteCharacter", term97210);
        setField(term97185, term97185.getClass(), "quoteMode", enum197);
        setField(term97185, term97185.getClass(), "recordSeparator", "uWqXrwAsDU");
        setBooleanField(term97185, term97185.getClass(), "skipHeaderRecord", false);
        setBooleanField(term97185, term97185.getClass(), "trailingDelimiter", false);
        setBooleanField(term97185, term97185.getClass(), "trim", false);
        Character term97038 = new Character('D');
        Character term97041 = new Character('e');
        Character term97168 = new Character('Z');
        Class<? extends Object> term97889 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term97888 = ((Class) term97889).getDeclaredField((String) "ALL");
        ((Field) term97888).setAccessible(true);
        Object enum198 = ((Field) term97888).get((Object) null);
        term97036 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term97043 = (Object[]) newArray("java.lang.String", 5);
        Object[] term97104 = (Object[]) newArray("java.lang.String", 4);
        setBooleanField(term97036, term97036.getClass(), "allowMissingColumnNames", true);
        setField(term97036, term97036.getClass(), "commentMarker", term97038);
        setCharField(term97036, term97036.getClass(), "delimiter", 'U');
        setField(term97036, term97036.getClass(), "escapeCharacter", term97041);
        setElement(term97043, 0, "HJwNgUzZZR");
        setElement(term97043, 1, "FvUCZgTXhq");
        setElement(term97043, 2, "wWWidPCHzx");
        setElement(term97043, 3, "OwPIiBRuKK");
        setElement(term97043, 4, "sgfGySMODT");
        setField(term97036, term97036.getClass(), "header", term97043);
        setElement(term97104, 0, "ndAITnOsny");
        setElement(term97104, 1, "CVZnTiJucs");
        setElement(term97104, 2, "ecHEQufXoq");
        setElement(term97104, 3, "btBLMvHzJg");
        setField(term97036, term97036.getClass(), "headerComments", term97104);
        setBooleanField(term97036, term97036.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term97036, term97036.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term97036, term97036.getClass(), "ignoreSurroundingSpaces", true);
        setField(term97036, term97036.getClass(), "nullString", "JdOMfNWgLP");
        setField(term97036, term97036.getClass(), "quoteCharacter", term97168);
        setField(term97036, term97036.getClass(), "quoteMode", enum198);
        setField(term97036, term97036.getClass(), "recordSeparator", "uWqXrwAsDU");
        setBooleanField(term97036, term97036.getClass(), "skipHeaderRecord", false);
        setBooleanField(term97036, term97036.getClass(), "trailingDelimiter", false);
        setBooleanField(term97036, term97036.getClass(), "trim", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "withIgnoreSurroundingSpaces", argTypes, term25107, args);
        assertTrue(recursiveEquals(term25107, term97185));
        assertTrue(recursiveEquals(retValue, term97036));
    }

};



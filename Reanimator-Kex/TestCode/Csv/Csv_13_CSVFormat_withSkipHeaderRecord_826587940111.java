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

public class CSVFormat_withSkipHeaderRecord_826587940111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23433;
     Object term23559;
     Object term97878;
     Object term97495;

    public CSVFormat_withSkipHeaderRecord_826587940111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term23435 = new Character('p');
        Class<? extends Object> term97904 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term97903 = ((Class) term97904).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term97903).setAccessible(true);
        Object enum177 = ((Field) term97903).get((Object) null);
        Character term23452 = new Character('y');
        Character term23454 = new Character('b');
        term23433 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term23483 = (Object[]) newArray("java.lang.String", 1);
        Object[] term23496 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term23433, term23433.getClass(), "delimiter", 'r');
        setField(term23433, term23433.getClass(), "quoteCharacter", term23435);
        setField(term23433, term23433.getClass(), "quoteMode", enum177);
        setField(term23433, term23433.getClass(), "commentMarker", term23452);
        setField(term23433, term23433.getClass(), "escapeCharacter", term23454);
        setBooleanField(term23433, term23433.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term23433, term23433.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term23433, term23433.getClass(), "ignoreEmptyLines", false);
        setField(term23433, term23433.getClass(), "recordSeparator", "WaEcyVlcIx");
        setField(term23433, term23433.getClass(), "nullString", "ONcbPCQnHd");
        setElement(term23483, 0, "AobDaplFLl");
        setField(term23433, term23433.getClass(), "header", term23483);
        setElement(term23496, 0, "pDkMNnAGgv");
        setElement(term23496, 1, "PaCpFXGzdX");
        setElement(term23496, 2, "FftYCNbnks");
        setElement(term23496, 3, "lJoltmsadS");
        setElement(term23496, 4, "mvfDtZNEHr");
        setField(term23433, term23433.getClass(), "headerComments", term23496);
        setBooleanField(term23433, term23433.getClass(), "skipHeaderRecord", false);
        setBooleanField(term23433, term23433.getClass(), "ignoreHeaderCase", false);
        term23559 = new Boolean(false);
        Character term97879 = new Character('p');
        Class<? extends Object> term98184 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term98183 = ((Class) term98184).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term98183).setAccessible(true);
        Object enum178 = ((Field) term98183).get((Object) null);
        Character term97883 = new Character('y');
        Character term97884 = new Character('b');
        term97878 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term97889 = (Object[]) newArray("java.lang.String", 1);
        Object[] term97892 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term97878, term97878.getClass(), "delimiter", 'r');
        setField(term97878, term97878.getClass(), "quoteCharacter", term97879);
        setField(term97878, term97878.getClass(), "quoteMode", enum178);
        setField(term97878, term97878.getClass(), "commentMarker", term97883);
        setField(term97878, term97878.getClass(), "escapeCharacter", term97884);
        setBooleanField(term97878, term97878.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term97878, term97878.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term97878, term97878.getClass(), "ignoreEmptyLines", false);
        setField(term97878, term97878.getClass(), "recordSeparator", "WaEcyVlcIx");
        setField(term97878, term97878.getClass(), "nullString", "ONcbPCQnHd");
        setElement(term97889, 0, "AobDaplFLl");
        setField(term97878, term97878.getClass(), "header", term97889);
        setElement(term97892, 0, "pDkMNnAGgv");
        setElement(term97892, 1, "PaCpFXGzdX");
        setElement(term97892, 2, "FftYCNbnks");
        setElement(term97892, 3, "lJoltmsadS");
        setElement(term97892, 4, "mvfDtZNEHr");
        setField(term97878, term97878.getClass(), "headerComments", term97892);
        setBooleanField(term97878, term97878.getClass(), "skipHeaderRecord", false);
        setBooleanField(term97878, term97878.getClass(), "ignoreHeaderCase", false);
        Character term97497 = new Character('p');
        Class<? extends Object> term98464 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term98463 = ((Class) term98464).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term98463).setAccessible(true);
        Object enum179 = ((Field) term98463).get((Object) null);
        Character term97514 = new Character('y');
        Character term97516 = new Character('b');
        term97495 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term97545 = (Object[]) newArray("java.lang.String", 1);
        Object[] term97558 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term97495, term97495.getClass(), "delimiter", 'r');
        setField(term97495, term97495.getClass(), "quoteCharacter", term97497);
        setField(term97495, term97495.getClass(), "quoteMode", enum179);
        setField(term97495, term97495.getClass(), "commentMarker", term97514);
        setField(term97495, term97495.getClass(), "escapeCharacter", term97516);
        setBooleanField(term97495, term97495.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term97495, term97495.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term97495, term97495.getClass(), "ignoreEmptyLines", false);
        setField(term97495, term97495.getClass(), "recordSeparator", "WaEcyVlcIx");
        setField(term97495, term97495.getClass(), "nullString", "ONcbPCQnHd");
        setElement(term97545, 0, "AobDaplFLl");
        setField(term97495, term97495.getClass(), "header", term97545);
        setElement(term97558, 0, "pDkMNnAGgv");
        setElement(term97558, 1, "PaCpFXGzdX");
        setElement(term97558, 2, "FftYCNbnks");
        setElement(term97558, 3, "lJoltmsadS");
        setElement(term97558, 4, "mvfDtZNEHr");
        setField(term97495, term97495.getClass(), "headerComments", term97558);
        setBooleanField(term97495, term97495.getClass(), "skipHeaderRecord", false);
        setBooleanField(term97495, term97495.getClass(), "ignoreHeaderCase", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term23559;
        Object retValue = callMethod(klass, "withSkipHeaderRecord", argTypes, term23433, args);
        assertTrue(recursiveEquals(term23433, term97878));
        assertTrue(recursiveEquals(term23559, false));
        assertTrue(recursiveEquals(retValue, term97495));
    }

};



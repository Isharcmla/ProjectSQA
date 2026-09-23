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

public class CSVFormat_withIgnoreEmptyLines_479440521128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23437;
     Object term91502;
     Object term91365;

    public CSVFormat_withIgnoreEmptyLines_479440521128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term23439 = new Character('y');
        Character term23442 = new Character('S');
        Character term23557 = new Character('r');
        Class<? extends Object> term91622 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term91621 = ((Class) term91622).getDeclaredField((String) "ALL");
        ((Field) term91621).setAccessible(true);
        Object enum184 = ((Field) term91621).get((Object) null);
        term23437 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term23444 = (Object[]) newArray("java.lang.String", 5);
        Object[] term23505 = (Object[]) newArray("java.lang.String", 3);
        setBooleanField(term23437, term23437.getClass(), "allowMissingColumnNames", true);
        setField(term23437, term23437.getClass(), "commentMarker", term23439);
        setCharField(term23437, term23437.getClass(), "delimiter", 'b');
        setField(term23437, term23437.getClass(), "escapeCharacter", term23442);
        setElement(term23444, 0, "fhZgTouhCC");
        setElement(term23444, 1, "wrikqJwXvL");
        setElement(term23444, 2, "UiWhvbypdr");
        setElement(term23444, 3, "CgleElJNje");
        setElement(term23444, 4, "ZrchvNGMtd");
        setField(term23437, term23437.getClass(), "header", term23444);
        setElement(term23505, 0, "WaEcyVlcIx");
        setElement(term23505, 1, "ONcbPCQnHd");
        setElement(term23505, 2, "AobDaplFLl");
        setField(term23437, term23437.getClass(), "headerComments", term23505);
        setBooleanField(term23437, term23437.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term23437, term23437.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term23437, term23437.getClass(), "ignoreSurroundingSpaces", false);
        setField(term23437, term23437.getClass(), "nullString", "pDkMNnAGgv");
        setField(term23437, term23437.getClass(), "quoteCharacter", term23557);
        setField(term23437, term23437.getClass(), "quoteMode", enum184);
        setField(term23437, term23437.getClass(), "recordSeparator", "PaCpFXGzdX");
        setBooleanField(term23437, term23437.getClass(), "skipHeaderRecord", true);
        setBooleanField(term23437, term23437.getClass(), "trailingDelimiter", true);
        setBooleanField(term23437, term23437.getClass(), "trim", false);
        Character term91503 = new Character('y');
        Character term91504 = new Character('S');
        Character term91525 = new Character('r');
        Class<? extends Object> term91898 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term91897 = ((Class) term91898).getDeclaredField((String) "ALL");
        ((Field) term91897).setAccessible(true);
        Object enum185 = ((Field) term91897).get((Object) null);
        term91502 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term91505 = (Object[]) newArray("java.lang.String", 5);
        Object[] term91516 = (Object[]) newArray("java.lang.String", 3);
        setBooleanField(term91502, term91502.getClass(), "allowMissingColumnNames", true);
        setField(term91502, term91502.getClass(), "commentMarker", term91503);
        setCharField(term91502, term91502.getClass(), "delimiter", 'b');
        setField(term91502, term91502.getClass(), "escapeCharacter", term91504);
        setElement(term91505, 0, "fhZgTouhCC");
        setElement(term91505, 1, "wrikqJwXvL");
        setElement(term91505, 2, "UiWhvbypdr");
        setElement(term91505, 3, "CgleElJNje");
        setElement(term91505, 4, "ZrchvNGMtd");
        setField(term91502, term91502.getClass(), "header", term91505);
        setElement(term91516, 0, "WaEcyVlcIx");
        setElement(term91516, 1, "ONcbPCQnHd");
        setElement(term91516, 2, "AobDaplFLl");
        setField(term91502, term91502.getClass(), "headerComments", term91516);
        setBooleanField(term91502, term91502.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term91502, term91502.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term91502, term91502.getClass(), "ignoreSurroundingSpaces", false);
        setField(term91502, term91502.getClass(), "nullString", "pDkMNnAGgv");
        setField(term91502, term91502.getClass(), "quoteCharacter", term91525);
        setField(term91502, term91502.getClass(), "quoteMode", enum185);
        setField(term91502, term91502.getClass(), "recordSeparator", "PaCpFXGzdX");
        setBooleanField(term91502, term91502.getClass(), "skipHeaderRecord", true);
        setBooleanField(term91502, term91502.getClass(), "trailingDelimiter", true);
        setBooleanField(term91502, term91502.getClass(), "trim", false);
        Character term91367 = new Character('y');
        Character term91370 = new Character('S');
        Character term91485 = new Character('r');
        Class<? extends Object> term92174 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term92173 = ((Class) term92174).getDeclaredField((String) "ALL");
        ((Field) term92173).setAccessible(true);
        Object enum186 = ((Field) term92173).get((Object) null);
        term91365 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term91372 = (Object[]) newArray("java.lang.String", 5);
        Object[] term91433 = (Object[]) newArray("java.lang.String", 3);
        setBooleanField(term91365, term91365.getClass(), "allowMissingColumnNames", true);
        setField(term91365, term91365.getClass(), "commentMarker", term91367);
        setCharField(term91365, term91365.getClass(), "delimiter", 'b');
        setField(term91365, term91365.getClass(), "escapeCharacter", term91370);
        setElement(term91372, 0, "fhZgTouhCC");
        setElement(term91372, 1, "wrikqJwXvL");
        setElement(term91372, 2, "UiWhvbypdr");
        setElement(term91372, 3, "CgleElJNje");
        setElement(term91372, 4, "ZrchvNGMtd");
        setField(term91365, term91365.getClass(), "header", term91372);
        setElement(term91433, 0, "WaEcyVlcIx");
        setElement(term91433, 1, "ONcbPCQnHd");
        setElement(term91433, 2, "AobDaplFLl");
        setField(term91365, term91365.getClass(), "headerComments", term91433);
        setBooleanField(term91365, term91365.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term91365, term91365.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term91365, term91365.getClass(), "ignoreSurroundingSpaces", false);
        setField(term91365, term91365.getClass(), "nullString", "pDkMNnAGgv");
        setField(term91365, term91365.getClass(), "quoteCharacter", term91485);
        setField(term91365, term91365.getClass(), "quoteMode", enum186);
        setField(term91365, term91365.getClass(), "recordSeparator", "PaCpFXGzdX");
        setBooleanField(term91365, term91365.getClass(), "skipHeaderRecord", true);
        setBooleanField(term91365, term91365.getClass(), "trailingDelimiter", true);
        setBooleanField(term91365, term91365.getClass(), "trim", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "withIgnoreEmptyLines", argTypes, term23437, args);
        assertTrue(recursiveEquals(term23437, term91502));
        assertTrue(recursiveEquals(retValue, term91365));
    }

};



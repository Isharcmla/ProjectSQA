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

public class CSVFormat_getEscapeCharacter_105301515383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2674;
     Object term43700;
     Object term43582;

    public CSVFormat_getEscapeCharacter_105301515383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term2676 = new Character('g');
        Character term2679 = new Character('z');
        Character term2758 = new Character('x');
        Class<? extends Object> term43784 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term43783 = ((Class) term43784).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term43783).setAccessible(true);
        Object enum84 = ((Field) term43783).get((Object) null);
        term2674 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term2681 = (Object[]) newArray("java.lang.String", 2);
        Object[] term2706 = (Object[]) newArray("java.lang.String", 3);
        setBooleanField(term2674, term2674.getClass(), "allowMissingColumnNames", true);
        setField(term2674, term2674.getClass(), "commentMarker", term2676);
        setCharField(term2674, term2674.getClass(), "delimiter", 'q');
        setField(term2674, term2674.getClass(), "escapeCharacter", term2679);
        setElement(term2681, 0, "dEnhdmILtU");
        setElement(term2681, 1, "hoicvmsovO");
        setField(term2674, term2674.getClass(), "header", term2681);
        setElement(term2706, 0, "eqJfYWRaEL");
        setElement(term2706, 1, "fhkbdRViHi");
        setElement(term2706, 2, "uWHnvSvaPl");
        setField(term2674, term2674.getClass(), "headerComments", term2706);
        setBooleanField(term2674, term2674.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term2674, term2674.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term2674, term2674.getClass(), "ignoreSurroundingSpaces", true);
        setField(term2674, term2674.getClass(), "nullString", "kBdSllIBVz");
        setField(term2674, term2674.getClass(), "quoteCharacter", term2758);
        setField(term2674, term2674.getClass(), "quoteMode", enum84);
        setField(term2674, term2674.getClass(), "recordSeparator", "TJmVBGfTML");
        setBooleanField(term2674, term2674.getClass(), "skipHeaderRecord", true);
        setBooleanField(term2674, term2674.getClass(), "trailingDelimiter", true);
        setBooleanField(term2674, term2674.getClass(), "trim", false);
        Character term43701 = new Character('g');
        Character term43702 = new Character('z');
        Character term43717 = new Character('x');
        Class<? extends Object> term44054 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term44053 = ((Class) term44054).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term44053).setAccessible(true);
        Object enum85 = ((Field) term44053).get((Object) null);
        term43700 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term43703 = (Object[]) newArray("java.lang.String", 2);
        Object[] term43708 = (Object[]) newArray("java.lang.String", 3);
        setBooleanField(term43700, term43700.getClass(), "allowMissingColumnNames", true);
        setField(term43700, term43700.getClass(), "commentMarker", term43701);
        setCharField(term43700, term43700.getClass(), "delimiter", 'q');
        setField(term43700, term43700.getClass(), "escapeCharacter", term43702);
        setElement(term43703, 0, "dEnhdmILtU");
        setElement(term43703, 1, "hoicvmsovO");
        setField(term43700, term43700.getClass(), "header", term43703);
        setElement(term43708, 0, "eqJfYWRaEL");
        setElement(term43708, 1, "fhkbdRViHi");
        setElement(term43708, 2, "uWHnvSvaPl");
        setField(term43700, term43700.getClass(), "headerComments", term43708);
        setBooleanField(term43700, term43700.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term43700, term43700.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term43700, term43700.getClass(), "ignoreSurroundingSpaces", true);
        setField(term43700, term43700.getClass(), "nullString", "kBdSllIBVz");
        setField(term43700, term43700.getClass(), "quoteCharacter", term43717);
        setField(term43700, term43700.getClass(), "quoteMode", enum85);
        setField(term43700, term43700.getClass(), "recordSeparator", "TJmVBGfTML");
        setBooleanField(term43700, term43700.getClass(), "skipHeaderRecord", true);
        setBooleanField(term43700, term43700.getClass(), "trailingDelimiter", true);
        setBooleanField(term43700, term43700.getClass(), "trim", false);
        term43582 = new Character('z');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getEscapeCharacter", argTypes, term2674, args);
        assertTrue(recursiveEquals(term2674, term43700));
        assertTrue(recursiveEquals(retValue, term43582));
    }

};



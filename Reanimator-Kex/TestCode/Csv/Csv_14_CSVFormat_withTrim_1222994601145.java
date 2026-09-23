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
import java.lang.Boolean;

public class CSVFormat_withTrim_1222994601145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30956;
     Object term31112;
     Object term116406;
     Object term115913;

    public CSVFormat_withTrim_1222994601145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term30958 = new Character('l');
        Character term30961 = new Character('Y');
        Character term31088 = new Character('s');
        Class<? extends Object> term116538 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term116537 = ((Class) term116538).getDeclaredField((String) "ALL");
        ((Field) term116537).setAccessible(true);
        Object enum237 = ((Field) term116537).get((Object) null);
        term30956 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term30963 = (Object[]) newArray("java.lang.String", 7);
        Object[] term31048 = (Object[]) newArray("java.lang.String", 2);
        setBooleanField(term30956, term30956.getClass(), "allowMissingColumnNames", true);
        setField(term30956, term30956.getClass(), "commentMarker", term30958);
        setCharField(term30956, term30956.getClass(), "delimiter", 'm');
        setField(term30956, term30956.getClass(), "escapeCharacter", term30961);
        setElement(term30963, 0, "gXFNBHJSey");
        setElement(term30963, 1, "wUcSfItZgv");
        setElement(term30963, 2, "rOfPCPHmtJ");
        setElement(term30963, 3, "EnmiAvfpJv");
        setElement(term30963, 4, "AdYzLPMcwe");
        setElement(term30963, 5, "FrTZLybkKk");
        setElement(term30963, 6, "FlxVmiMYKP");
        setField(term30956, term30956.getClass(), "header", term30963);
        setElement(term31048, 0, "fgOpAWlGYN");
        setElement(term31048, 1, "PNzNzzjSXM");
        setField(term30956, term30956.getClass(), "headerComments", term31048);
        setBooleanField(term30956, term30956.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term30956, term30956.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term30956, term30956.getClass(), "ignoreSurroundingSpaces", false);
        setField(term30956, term30956.getClass(), "nullString", "ktKcSZiuGM");
        setField(term30956, term30956.getClass(), "quoteCharacter", term31088);
        setField(term30956, term30956.getClass(), "quoteMode", enum237);
        setField(term30956, term30956.getClass(), "recordSeparator", "PSOttyUeqv");
        setBooleanField(term30956, term30956.getClass(), "skipHeaderRecord", true);
        setBooleanField(term30956, term30956.getClass(), "trailingDelimiter", false);
        setBooleanField(term30956, term30956.getClass(), "trim", true);
        term31112 = new Boolean(true);
        Character term116407 = new Character('l');
        Character term116408 = new Character('Y');
        Character term116431 = new Character('s');
        Class<? extends Object> term116824 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term116823 = ((Class) term116824).getDeclaredField((String) "ALL");
        ((Field) term116823).setAccessible(true);
        Object enum238 = ((Field) term116823).get((Object) null);
        term116406 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term116409 = (Object[]) newArray("java.lang.String", 7);
        Object[] term116424 = (Object[]) newArray("java.lang.String", 2);
        setBooleanField(term116406, term116406.getClass(), "allowMissingColumnNames", true);
        setField(term116406, term116406.getClass(), "commentMarker", term116407);
        setCharField(term116406, term116406.getClass(), "delimiter", 'm');
        setField(term116406, term116406.getClass(), "escapeCharacter", term116408);
        setElement(term116409, 0, "gXFNBHJSey");
        setElement(term116409, 1, "wUcSfItZgv");
        setElement(term116409, 2, "rOfPCPHmtJ");
        setElement(term116409, 3, "EnmiAvfpJv");
        setElement(term116409, 4, "AdYzLPMcwe");
        setElement(term116409, 5, "FrTZLybkKk");
        setElement(term116409, 6, "FlxVmiMYKP");
        setField(term116406, term116406.getClass(), "header", term116409);
        setElement(term116424, 0, "fgOpAWlGYN");
        setElement(term116424, 1, "PNzNzzjSXM");
        setField(term116406, term116406.getClass(), "headerComments", term116424);
        setBooleanField(term116406, term116406.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term116406, term116406.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term116406, term116406.getClass(), "ignoreSurroundingSpaces", false);
        setField(term116406, term116406.getClass(), "nullString", "ktKcSZiuGM");
        setField(term116406, term116406.getClass(), "quoteCharacter", term116431);
        setField(term116406, term116406.getClass(), "quoteMode", enum238);
        setField(term116406, term116406.getClass(), "recordSeparator", "PSOttyUeqv");
        setBooleanField(term116406, term116406.getClass(), "skipHeaderRecord", true);
        setBooleanField(term116406, term116406.getClass(), "trailingDelimiter", false);
        setBooleanField(term116406, term116406.getClass(), "trim", true);
        Character term115915 = new Character('l');
        Character term115918 = new Character('Y');
        Character term116045 = new Character('s');
        Class<? extends Object> term117110 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term117109 = ((Class) term117110).getDeclaredField((String) "ALL");
        ((Field) term117109).setAccessible(true);
        Object enum239 = ((Field) term117109).get((Object) null);
        term115913 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term115920 = (Object[]) newArray("java.lang.String", 7);
        Object[] term116005 = (Object[]) newArray("java.lang.String", 2);
        setBooleanField(term115913, term115913.getClass(), "allowMissingColumnNames", true);
        setField(term115913, term115913.getClass(), "commentMarker", term115915);
        setCharField(term115913, term115913.getClass(), "delimiter", 'm');
        setField(term115913, term115913.getClass(), "escapeCharacter", term115918);
        setElement(term115920, 0, "gXFNBHJSey");
        setElement(term115920, 1, "wUcSfItZgv");
        setElement(term115920, 2, "rOfPCPHmtJ");
        setElement(term115920, 3, "EnmiAvfpJv");
        setElement(term115920, 4, "AdYzLPMcwe");
        setElement(term115920, 5, "FrTZLybkKk");
        setElement(term115920, 6, "FlxVmiMYKP");
        setField(term115913, term115913.getClass(), "header", term115920);
        setElement(term116005, 0, "fgOpAWlGYN");
        setElement(term116005, 1, "PNzNzzjSXM");
        setField(term115913, term115913.getClass(), "headerComments", term116005);
        setBooleanField(term115913, term115913.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term115913, term115913.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term115913, term115913.getClass(), "ignoreSurroundingSpaces", false);
        setField(term115913, term115913.getClass(), "nullString", "ktKcSZiuGM");
        setField(term115913, term115913.getClass(), "quoteCharacter", term116045);
        setField(term115913, term115913.getClass(), "quoteMode", enum239);
        setField(term115913, term115913.getClass(), "recordSeparator", "PSOttyUeqv");
        setBooleanField(term115913, term115913.getClass(), "skipHeaderRecord", true);
        setBooleanField(term115913, term115913.getClass(), "trailingDelimiter", false);
        setBooleanField(term115913, term115913.getClass(), "trim", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term31112;
        Object retValue = callMethod(klass, "withTrim", argTypes, term30956, args);
        assertTrue(recursiveEquals(term30956, term116406));
        assertTrue(recursiveEquals(term31112, true));
        assertTrue(recursiveEquals(retValue, term115913));
    }

};



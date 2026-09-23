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
import java.lang.IllegalArgumentException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Character;
import java.lang.Object;
import java.lang.String;

public class CSVFormat_parse_760316323101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10900;

    public CSVFormat_parse_760316323101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term10902 = new Character('e');
        Character term10905 = new Character('R');
        Character term11044 = new Character('d');
        Class<? extends Object> term58656 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term58655 = ((Class) term58656).getDeclaredField((String) "NONE");
        ((Field) term58655).setAccessible(true);
        Object enum121 = ((Field) term58655).get((Object) null);
        term10900 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term10907 = (Object[]) newArray("java.lang.String", 7);
        Object[] term10992 = (Object[]) newArray("java.lang.String", 3);
        setBooleanField(term10900, term10900.getClass(), "allowMissingColumnNames", true);
        setField(term10900, term10900.getClass(), "commentMarker", term10902);
        setCharField(term10900, term10900.getClass(), "delimiter", 'N');
        setField(term10900, term10900.getClass(), "escapeCharacter", term10905);
        setElement(term10907, 0, "ypEdrstygY");
        setElement(term10907, 1, "sNQFlATEeQ");
        setElement(term10907, 2, "ZKMLioamsY");
        setElement(term10907, 3, "WVbxuoDBcn");
        setElement(term10907, 4, "pvDEABOxLt");
        setElement(term10907, 5, "beAMpkroCQ");
        setElement(term10907, 6, "uSUvKAyuvd");
        setField(term10900, term10900.getClass(), "header", term10907);
        setElement(term10992, 0, "onQLVONGuf");
        setElement(term10992, 1, "SOrEHbcbmn");
        setElement(term10992, 2, "bnsyeQXFdu");
        setField(term10900, term10900.getClass(), "headerComments", term10992);
        setBooleanField(term10900, term10900.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term10900, term10900.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term10900, term10900.getClass(), "ignoreSurroundingSpaces", true);
        setField(term10900, term10900.getClass(), "nullString", "BwtdjiefJn");
        setField(term10900, term10900.getClass(), "quoteCharacter", term11044);
        setField(term10900, term10900.getClass(), "quoteMode", enum121);
        setField(term10900, term10900.getClass(), "recordSeparator", "jDmhBrIoDa");
        setBooleanField(term10900, term10900.getClass(), "skipHeaderRecord", false);
        setBooleanField(term10900, term10900.getClass(), "trailingDelimiter", true);
        setBooleanField(term10900, term10900.getClass(), "trim", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.Reader");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "parse", argTypes, term10900, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



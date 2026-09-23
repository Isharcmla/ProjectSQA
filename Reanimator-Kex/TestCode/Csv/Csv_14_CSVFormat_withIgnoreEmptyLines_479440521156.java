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
import java.lang.String;
import java.lang.Object;

public class CSVFormat_withIgnoreEmptyLines_479440521156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122686;

    public CSVFormat_withIgnoreEmptyLines_479440521156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term122738 = new Character((char) 8192);
        Class<? extends Object> term124262 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term124261 = ((Class) term124262).getDeclaredField((String) "NONE");
        ((Field) term124261).setAccessible(true);
        Object enum244 = ((Field) term124261).get((Object) null);
        Character term122898 = new Character((char) 0);
        Character term122950 = new Character((char) 0);
        term122686 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term122483 = (Object[]) newArray("java.lang.String", 3);
        Object[] term122487 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term122686, term122686.getClass(), "delimiter", (char) 57340);
        setField(term122686, term122686.getClass(), "quoteCharacter", term122738);
        setField(term122686, term122686.getClass(), "quoteMode", enum244);
        setField(term122686, term122686.getClass(), "commentMarker", term122898);
        setField(term122686, term122686.getClass(), "escapeCharacter", term122950);
        setBooleanField(term122686, term122686.getClass(), "ignoreSurroundingSpaces", false);
        setField(term122686, term122686.getClass(), "recordSeparator", null);
        setField(term122686, term122686.getClass(), "nullString", "");
        setElement(term122483, 0, "");
        setElement(term122483, 1, "");
        setElement(term122483, 2, "");
        setField(term122686, term122686.getClass(), "headerComments", term122483);
        setField(term122686, term122686.getClass(), "header", term122487);
        setBooleanField(term122686, term122686.getClass(), "skipHeaderRecord", false);
        setBooleanField(term122686, term122686.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term122686, term122686.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term122686, term122686.getClass(), "trim", false);
        setBooleanField(term122686, term122686.getClass(), "trailingDelimiter", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "withIgnoreEmptyLines", argTypes, term122686, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



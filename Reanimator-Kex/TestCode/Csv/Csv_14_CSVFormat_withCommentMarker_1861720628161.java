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

public class CSVFormat_withCommentMarker_1861720628161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125692;

    public CSVFormat_withCommentMarker_1861720628161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term125744 = new Character((char) 0);
        Class<? extends Object> term134983 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term134982 = ((Class) term134983).getDeclaredField((String) "ALL");
        ((Field) term134982).setAccessible(true);
        Object enum251 = ((Field) term134982).get((Object) null);
        term125692 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term125486 = (Object[]) newArray("java.lang.String", 6);
        Object[] term125492 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term125692, term125692.getClass(), "delimiter", (char) 0);
        setField(term125692, term125692.getClass(), "quoteCharacter", term125744);
        setField(term125692, term125692.getClass(), "quoteMode", enum251);
        setField(term125692, term125692.getClass(), "escapeCharacter", null);
        setBooleanField(term125692, term125692.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term125692, term125692.getClass(), "ignoreEmptyLines", false);
        setField(term125692, term125692.getClass(), "recordSeparator", null);
        setField(term125692, term125692.getClass(), "nullString", "");
        setElement(term125486, 0, "");
        setElement(term125486, 1, "");
        setElement(term125486, 2, "");
        setElement(term125486, 3, "");
        setElement(term125486, 4, "");
        setElement(term125486, 5, "");
        setField(term125692, term125692.getClass(), "headerComments", term125486);
        setField(term125692, term125692.getClass(), "header", term125492);
        setBooleanField(term125692, term125692.getClass(), "skipHeaderRecord", false);
        setBooleanField(term125692, term125692.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term125692, term125692.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term125692, term125692.getClass(), "trim", false);
        setBooleanField(term125692, term125692.getClass(), "trailingDelimiter", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        try {
            callMethod(klass, "withCommentMarker", argTypes, term125692, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



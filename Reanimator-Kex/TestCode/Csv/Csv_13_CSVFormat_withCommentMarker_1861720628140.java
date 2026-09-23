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

public class CSVFormat_withCommentMarker_1861720628140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119082;

    public CSVFormat_withCommentMarker_1861720628140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term119134 = new Character((char) 0);
        Class<? extends Object> term119941 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term119940 = ((Class) term119941).getDeclaredField((String) "MINIMAL");
        ((Field) term119940).setAccessible(true);
        Object enum195 = ((Field) term119940).get((Object) null);
        Character term119294 = new Character((char) 0);
        term119082 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term118943 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term119082, term119082.getClass(), "delimiter", (char) 0);
        setField(term119082, term119082.getClass(), "quoteCharacter", term119134);
        setField(term119082, term119082.getClass(), "quoteMode", enum195);
        setField(term119082, term119082.getClass(), "escapeCharacter", term119294);
        setBooleanField(term119082, term119082.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term119082, term119082.getClass(), "ignoreEmptyLines", false);
        setField(term119082, term119082.getClass(), "recordSeparator", null);
        setField(term119082, term119082.getClass(), "nullString", "NONE");
        setElement(term118943, 0, "");
        setField(term119082, term119082.getClass(), "headerComments", term118943);
        setField(term119082, term119082.getClass(), "header", null);
        setBooleanField(term119082, term119082.getClass(), "skipHeaderRecord", false);
        setBooleanField(term119082, term119082.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term119082, term119082.getClass(), "ignoreHeaderCase", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        try {
            callMethod(klass, "withCommentMarker", argTypes, term119082, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



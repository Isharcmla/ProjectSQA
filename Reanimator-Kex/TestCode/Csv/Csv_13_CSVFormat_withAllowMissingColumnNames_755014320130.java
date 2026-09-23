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

public class CSVFormat_withAllowMissingColumnNames_755014320130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110683;

    public CSVFormat_withAllowMissingColumnNames_755014320130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term110735 = new Character((char) 0);
        Class<? extends Object> term111439 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term111438 = ((Class) term111439).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term111438).setAccessible(true);
        Object enum187 = ((Field) term111438).get((Object) null);
        term110683 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term110548 = (Object[]) newArray("java.lang.String", 0);
        Object[] term110549 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term110683, term110683.getClass(), "delimiter", (char) 0);
        setField(term110683, term110683.getClass(), "quoteCharacter", term110735);
        setField(term110683, term110683.getClass(), "quoteMode", enum187);
        setField(term110683, term110683.getClass(), "commentMarker", null);
        setField(term110683, term110683.getClass(), "escapeCharacter", null);
        setBooleanField(term110683, term110683.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term110683, term110683.getClass(), "ignoreEmptyLines", false);
        setField(term110683, term110683.getClass(), "recordSeparator", "");
        setField(term110683, term110683.getClass(), "nullString", "");
        setField(term110683, term110683.getClass(), "headerComments", term110548);
        setField(term110683, term110683.getClass(), "header", term110549);
        setBooleanField(term110683, term110683.getClass(), "skipHeaderRecord", false);
        setBooleanField(term110683, term110683.getClass(), "ignoreHeaderCase", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = true;
        try {
            callMethod(klass, "withAllowMissingColumnNames", argTypes, term110683, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



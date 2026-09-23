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

public class CSVFormat_withHeader_269759087126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107707;

    public CSVFormat_withHeader_269759087126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term107759 = new Character((char) 0);
        Class<? extends Object> term108487 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term108486 = ((Class) term108487).getDeclaredField((String) "MINIMAL");
        ((Field) term108486).setAccessible(true);
        Object enum185 = ((Field) term108486).get((Object) null);
        term107707 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term107585 = (Object[]) newArray("java.lang.String", 16);
        setCharField(term107707, term107707.getClass(), "delimiter", (char) 0);
        setField(term107707, term107707.getClass(), "quoteCharacter", term107759);
        setField(term107707, term107707.getClass(), "quoteMode", enum185);
        setField(term107707, term107707.getClass(), "commentMarker", null);
        setField(term107707, term107707.getClass(), "escapeCharacter", null);
        setBooleanField(term107707, term107707.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term107707, term107707.getClass(), "ignoreEmptyLines", false);
        setField(term107707, term107707.getClass(), "recordSeparator", null);
        setField(term107707, term107707.getClass(), "nullString", "NONE");
        setField(term107707, term107707.getClass(), "headerComments", term107585);
        setBooleanField(term107707, term107707.getClass(), "skipHeaderRecord", false);
        setBooleanField(term107707, term107707.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term107707, term107707.getClass(), "ignoreHeaderCase", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "withHeader", argTypes, term107707, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



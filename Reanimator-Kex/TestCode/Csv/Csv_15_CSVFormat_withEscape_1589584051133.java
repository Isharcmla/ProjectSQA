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

public class CSVFormat_withEscape_1589584051133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76768;

    public CSVFormat_withEscape_1589584051133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76768 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term76768, term76768.getClass(), "allowMissingColumnNames", false);
        setField(term76768, term76768.getClass(), "commentMarker", null);
        setCharField(term76768, term76768.getClass(), "delimiter", (char) 0);
        setField(term76768, term76768.getClass(), "escapeCharacter", null);
        setField(term76768, term76768.getClass(), "header", null);
        setField(term76768, term76768.getClass(), "headerComments", null);
        setBooleanField(term76768, term76768.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term76768, term76768.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term76768, term76768.getClass(), "ignoreSurroundingSpaces", false);
        setField(term76768, term76768.getClass(), "nullString", null);
        setField(term76768, term76768.getClass(), "quoteCharacter", null);
        setField(term76768, term76768.getClass(), "quoteMode", null);
        setField(term76768, term76768.getClass(), "recordSeparator", null);
        setBooleanField(term76768, term76768.getClass(), "skipHeaderRecord", false);
        setBooleanField(term76768, term76768.getClass(), "trailingDelimiter", false);
        setBooleanField(term76768, term76768.getClass(), "trim", false);
        setBooleanField(term76768, term76768.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Character");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withEscape", argTypes, term76768, args);
    }

};



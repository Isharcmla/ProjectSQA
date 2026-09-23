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
import java.lang.Character;

public class CSVFormat_withCommentMarker_1861720628129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76722;
     Object term76732;

    public CSVFormat_withCommentMarker_1861720628129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76722 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term76722, term76722.getClass(), "allowMissingColumnNames", false);
        setField(term76722, term76722.getClass(), "commentMarker", null);
        setCharField(term76722, term76722.getClass(), "delimiter", (char) 0);
        setField(term76722, term76722.getClass(), "escapeCharacter", null);
        setField(term76722, term76722.getClass(), "header", null);
        setField(term76722, term76722.getClass(), "headerComments", null);
        setBooleanField(term76722, term76722.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term76722, term76722.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term76722, term76722.getClass(), "ignoreSurroundingSpaces", false);
        setField(term76722, term76722.getClass(), "nullString", null);
        setField(term76722, term76722.getClass(), "quoteCharacter", null);
        setField(term76722, term76722.getClass(), "quoteMode", null);
        setField(term76722, term76722.getClass(), "recordSeparator", null);
        setBooleanField(term76722, term76722.getClass(), "skipHeaderRecord", false);
        setBooleanField(term76722, term76722.getClass(), "trailingDelimiter", false);
        setBooleanField(term76722, term76722.getClass(), "trim", false);
        setBooleanField(term76722, term76722.getClass(), "autoFlush", false);
        term76732 = new Character((char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term76732;
        callMethod(klass, "withCommentMarker", argTypes, term76722, args);
    }

};



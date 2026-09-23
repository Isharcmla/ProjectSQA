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
import java.lang.Object;

public class CSVParser_getCurrentLineNumber_54759987245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38150;
     Object term38360;

    public CSVParser_getCurrentLineNumber_54759987245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38150 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term38212 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term38308 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        setIntField(term38308, term38308.getClass(), "lastChar", 10);
        setField(term38212, term38212.getClass(), "reader", term38308);
        setField(term38150, term38150.getClass(), "lexer", term38212);
        term38360 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term38361 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term38362 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(term38360, term38360.getClass(), "format", null);
        setField(term38360, term38360.getClass(), "headerMap", null);
        setCharField(term38361, term38361.getClass(), "delimiter", (char) 0);
        setCharField(term38361, term38361.getClass(), "escape", (char) 0);
        setCharField(term38361, term38361.getClass(), "quoteChar", (char) 0);
        setCharField(term38361, term38361.getClass(), "commentStart", (char) 0);
        setBooleanField(term38361, term38361.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term38361, term38361.getClass(), "ignoreEmptyLines", false);
        setIntField(term38362, term38362.getClass(), "lastChar", 10);
        setLongField(term38362, term38362.getClass(), "eolCounter", 0L);
        setBooleanField(term38362, term38362.getClass(), "closed", false);
        setField(term38362, term38362.getClass(), "in", null);
        setField(term38362, term38362.getClass(), "cb", null);
        setIntField(term38362, term38362.getClass(), "nChars", 0);
        setIntField(term38362, term38362.getClass(), "nextChar", 0);
        setIntField(term38362, term38362.getClass(), "markedChar", 0);
        setIntField(term38362, term38362.getClass(), "readAheadLimit", 0);
        setBooleanField(term38362, term38362.getClass(), "skipLF", false);
        setBooleanField(term38362, term38362.getClass(), "markedSkipLF", false);
        setField(term38362, term38362.getClass(), "lock", null);
        setField(term38362, term38362.getClass(), "skipBuffer", null);
        setField(term38361, term38361.getClass(), "reader", term38362);
        setField(term38360, term38360.getClass(), "lexer", term38361);
        setField(term38360, term38360.getClass(), "record", null);
        setLongField(term38360, term38360.getClass(), "recordNumber", 0L);
        setField(term38360, term38360.getClass(), "reusableToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCurrentLineNumber", argTypes, term38150, args);
        assertTrue(recursiveEquals(term38150, term38360));
        assertTrue(recursiveEquals(retValue, 0L));
    }

};



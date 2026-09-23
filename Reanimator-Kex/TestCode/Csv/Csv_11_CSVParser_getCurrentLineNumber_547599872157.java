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

public class CSVParser_getCurrentLineNumber_547599872157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term364708;
     Object term364918;

    public CSVParser_getCurrentLineNumber_547599872157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term364708 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term364770 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term364866 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        setIntField(term364866, term364866.getClass(), "lastChar", 10);
        setField(term364770, term364770.getClass(), "reader", term364866);
        setField(term364708, term364708.getClass(), "lexer", term364770);
        term364918 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term364919 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term364920 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(term364918, term364918.getClass(), "format", null);
        setField(term364918, term364918.getClass(), "headerMap", null);
        setCharField(term364919, term364919.getClass(), "delimiter", (char) 0);
        setCharField(term364919, term364919.getClass(), "escape", (char) 0);
        setCharField(term364919, term364919.getClass(), "quoteChar", (char) 0);
        setCharField(term364919, term364919.getClass(), "commentStart", (char) 0);
        setBooleanField(term364919, term364919.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term364919, term364919.getClass(), "ignoreEmptyLines", false);
        setIntField(term364920, term364920.getClass(), "lastChar", 10);
        setLongField(term364920, term364920.getClass(), "eolCounter", 0L);
        setBooleanField(term364920, term364920.getClass(), "closed", false);
        setField(term364920, term364920.getClass(), "in", null);
        setField(term364920, term364920.getClass(), "cb", null);
        setIntField(term364920, term364920.getClass(), "nChars", 0);
        setIntField(term364920, term364920.getClass(), "nextChar", 0);
        setIntField(term364920, term364920.getClass(), "markedChar", 0);
        setIntField(term364920, term364920.getClass(), "readAheadLimit", 0);
        setBooleanField(term364920, term364920.getClass(), "skipLF", false);
        setBooleanField(term364920, term364920.getClass(), "markedSkipLF", false);
        setField(term364920, term364920.getClass(), "lock", null);
        setField(term364920, term364920.getClass(), "skipBuffer", null);
        setField(term364919, term364919.getClass(), "reader", term364920);
        setField(term364918, term364918.getClass(), "lexer", term364919);
        setField(term364918, term364918.getClass(), "record", null);
        setLongField(term364918, term364918.getClass(), "recordNumber", 0L);
        setField(term364918, term364918.getClass(), "reusableToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCurrentLineNumber", argTypes, term364708, args);
        assertTrue(recursiveEquals(term364708, term364918));
        assertTrue(recursiveEquals(retValue, 0L));
    }

};



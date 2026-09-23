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

public class CSVParser_getCurrentLineNumber_547599872165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term646361;
     Object term646583;

    public CSVParser_getCurrentLineNumber_547599872165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term646361 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term646423 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term646519 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        setIntField(term646519, term646519.getClass(), "lastChar", 13);
        setField(term646423, term646423.getClass(), "reader", term646519);
        setField(term646361, term646361.getClass(), "lexer", term646423);
        term646583 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term646584 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term646585 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(term646583, term646583.getClass(), "format", null);
        setField(term646583, term646583.getClass(), "headerMap", null);
        setCharField(term646584, term646584.getClass(), "delimiter", (char) 0);
        setCharField(term646584, term646584.getClass(), "escape", (char) 0);
        setCharField(term646584, term646584.getClass(), "quoteChar", (char) 0);
        setCharField(term646584, term646584.getClass(), "commentStart", (char) 0);
        setBooleanField(term646584, term646584.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term646584, term646584.getClass(), "ignoreEmptyLines", false);
        setIntField(term646585, term646585.getClass(), "lastChar", 13);
        setLongField(term646585, term646585.getClass(), "eolCounter", 0L);
        setBooleanField(term646585, term646585.getClass(), "closed", false);
        setField(term646585, term646585.getClass(), "in", null);
        setField(term646585, term646585.getClass(), "cb", null);
        setIntField(term646585, term646585.getClass(), "nChars", 0);
        setIntField(term646585, term646585.getClass(), "nextChar", 0);
        setIntField(term646585, term646585.getClass(), "markedChar", 0);
        setIntField(term646585, term646585.getClass(), "readAheadLimit", 0);
        setBooleanField(term646585, term646585.getClass(), "skipLF", false);
        setBooleanField(term646585, term646585.getClass(), "markedSkipLF", false);
        setField(term646585, term646585.getClass(), "lock", null);
        setField(term646585, term646585.getClass(), "skipBuffer", null);
        setField(term646584, term646584.getClass(), "reader", term646585);
        setField(term646583, term646583.getClass(), "lexer", term646584);
        setField(term646583, term646583.getClass(), "record", null);
        setLongField(term646583, term646583.getClass(), "recordNumber", 0L);
        setField(term646583, term646583.getClass(), "reusableToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCurrentLineNumber", argTypes, term646361, args);
        assertTrue(recursiveEquals(term646361, term646583));
        assertTrue(recursiveEquals(retValue, 0L));
    }

};



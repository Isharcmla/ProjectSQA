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

public class CSVParser_getCurrentLineNumber_54759987247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43730;
     Object term43942;

    public CSVParser_getCurrentLineNumber_54759987247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43730 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term43792 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term43888 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        setIntField(term43888, term43888.getClass(), "lastChar", -1);
        setField(term43792, term43792.getClass(), "reader", term43888);
        setField(term43730, term43730.getClass(), "lexer", term43792);
        term43942 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term43943 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term43944 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        setField(term43942, term43942.getClass(), "format", null);
        setField(term43942, term43942.getClass(), "headerMap", null);
        setCharField(term43943, term43943.getClass(), "delimiter", (char) 0);
        setCharField(term43943, term43943.getClass(), "escape", (char) 0);
        setCharField(term43943, term43943.getClass(), "quoteChar", (char) 0);
        setCharField(term43943, term43943.getClass(), "commentStart", (char) 0);
        setBooleanField(term43943, term43943.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term43943, term43943.getClass(), "ignoreEmptyLines", false);
        setIntField(term43944, term43944.getClass(), "lastChar", -1);
        setLongField(term43944, term43944.getClass(), "eolCounter", 0L);
        setBooleanField(term43944, term43944.getClass(), "closed", false);
        setField(term43944, term43944.getClass(), "in", null);
        setField(term43944, term43944.getClass(), "cb", null);
        setIntField(term43944, term43944.getClass(), "nChars", 0);
        setIntField(term43944, term43944.getClass(), "nextChar", 0);
        setIntField(term43944, term43944.getClass(), "markedChar", 0);
        setIntField(term43944, term43944.getClass(), "readAheadLimit", 0);
        setBooleanField(term43944, term43944.getClass(), "skipLF", false);
        setBooleanField(term43944, term43944.getClass(), "markedSkipLF", false);
        setField(term43944, term43944.getClass(), "lock", null);
        setField(term43944, term43944.getClass(), "skipBuffer", null);
        setField(term43943, term43943.getClass(), "reader", term43944);
        setField(term43942, term43942.getClass(), "lexer", term43943);
        setField(term43942, term43942.getClass(), "record", null);
        setLongField(term43942, term43942.getClass(), "recordNumber", 0L);
        setField(term43942, term43942.getClass(), "reusableToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCurrentLineNumber", argTypes, term43730, args);
        assertTrue(recursiveEquals(term43730, term43942));
        assertTrue(recursiveEquals(retValue, 0L));
    }

};



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

public class CSVFormat_withQuoteMode_1602037473149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76936;

    public CSVFormat_withQuoteMode_1602037473149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76936 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term76936, term76936.getClass(), "allowMissingColumnNames", false);
        setField(term76936, term76936.getClass(), "commentMarker", null);
        setCharField(term76936, term76936.getClass(), "delimiter", (char) 0);
        setField(term76936, term76936.getClass(), "escapeCharacter", null);
        setField(term76936, term76936.getClass(), "header", null);
        setField(term76936, term76936.getClass(), "headerComments", null);
        setBooleanField(term76936, term76936.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term76936, term76936.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term76936, term76936.getClass(), "ignoreSurroundingSpaces", false);
        setField(term76936, term76936.getClass(), "nullString", null);
        setField(term76936, term76936.getClass(), "quoteCharacter", null);
        setField(term76936, term76936.getClass(), "quoteMode", null);
        setField(term76936, term76936.getClass(), "recordSeparator", null);
        setBooleanField(term76936, term76936.getClass(), "skipHeaderRecord", false);
        setBooleanField(term76936, term76936.getClass(), "trailingDelimiter", false);
        setBooleanField(term76936, term76936.getClass(), "trim", false);
        setBooleanField(term76936, term76936.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.csv.QuoteMode");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withQuoteMode", argTypes, term76936, args);
    }

};



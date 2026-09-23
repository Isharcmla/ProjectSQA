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

public class CSVFormat_validate_725288942126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76690;

    public CSVFormat_validate_725288942126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76690 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term76690, term76690.getClass(), "allowMissingColumnNames", false);
        setField(term76690, term76690.getClass(), "commentMarker", null);
        setCharField(term76690, term76690.getClass(), "delimiter", (char) 0);
        setField(term76690, term76690.getClass(), "escapeCharacter", null);
        setField(term76690, term76690.getClass(), "header", null);
        setField(term76690, term76690.getClass(), "headerComments", null);
        setBooleanField(term76690, term76690.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term76690, term76690.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term76690, term76690.getClass(), "ignoreSurroundingSpaces", false);
        setField(term76690, term76690.getClass(), "nullString", null);
        setField(term76690, term76690.getClass(), "quoteCharacter", null);
        setField(term76690, term76690.getClass(), "quoteMode", null);
        setField(term76690, term76690.getClass(), "recordSeparator", null);
        setBooleanField(term76690, term76690.getClass(), "skipHeaderRecord", false);
        setBooleanField(term76690, term76690.getClass(), "trailingDelimiter", false);
        setBooleanField(term76690, term76690.getClass(), "trim", false);
        setBooleanField(term76690, term76690.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "validate", argTypes, term76690, args);
    }

};



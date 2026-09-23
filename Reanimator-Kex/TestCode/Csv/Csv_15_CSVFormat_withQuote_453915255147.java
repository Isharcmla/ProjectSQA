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

public class CSVFormat_withQuote_453915255147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76914;
     Object term76924;

    public CSVFormat_withQuote_453915255147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76914 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term76914, term76914.getClass(), "allowMissingColumnNames", false);
        setField(term76914, term76914.getClass(), "commentMarker", null);
        setCharField(term76914, term76914.getClass(), "delimiter", (char) 0);
        setField(term76914, term76914.getClass(), "escapeCharacter", null);
        setField(term76914, term76914.getClass(), "header", null);
        setField(term76914, term76914.getClass(), "headerComments", null);
        setBooleanField(term76914, term76914.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term76914, term76914.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term76914, term76914.getClass(), "ignoreSurroundingSpaces", false);
        setField(term76914, term76914.getClass(), "nullString", null);
        setField(term76914, term76914.getClass(), "quoteCharacter", null);
        setField(term76914, term76914.getClass(), "quoteMode", null);
        setField(term76914, term76914.getClass(), "recordSeparator", null);
        setBooleanField(term76914, term76914.getClass(), "skipHeaderRecord", false);
        setBooleanField(term76914, term76914.getClass(), "trailingDelimiter", false);
        setBooleanField(term76914, term76914.getClass(), "trim", false);
        setBooleanField(term76914, term76914.getClass(), "autoFlush", false);
        term76924 = new Character((char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term76924;
        callMethod(klass, "withQuote", argTypes, term76914, args);
    }

};



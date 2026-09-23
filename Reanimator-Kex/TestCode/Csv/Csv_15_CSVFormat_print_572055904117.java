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
import java.lang.Boolean;

public class CSVFormat_print_572055904117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76582;
     Object term76592;

    public CSVFormat_print_572055904117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76582 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term76582, term76582.getClass(), "allowMissingColumnNames", false);
        setField(term76582, term76582.getClass(), "commentMarker", null);
        setCharField(term76582, term76582.getClass(), "delimiter", (char) 0);
        setField(term76582, term76582.getClass(), "escapeCharacter", null);
        setField(term76582, term76582.getClass(), "header", null);
        setField(term76582, term76582.getClass(), "headerComments", null);
        setBooleanField(term76582, term76582.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term76582, term76582.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term76582, term76582.getClass(), "ignoreSurroundingSpaces", false);
        setField(term76582, term76582.getClass(), "nullString", null);
        setField(term76582, term76582.getClass(), "quoteCharacter", null);
        setField(term76582, term76582.getClass(), "quoteMode", null);
        setField(term76582, term76582.getClass(), "recordSeparator", null);
        setBooleanField(term76582, term76582.getClass(), "skipHeaderRecord", false);
        setBooleanField(term76582, term76582.getClass(), "trailingDelimiter", false);
        setBooleanField(term76582, term76582.getClass(), "trim", false);
        setBooleanField(term76582, term76582.getClass(), "autoFlush", false);
        term76592 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Appendable");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term76592;
        callMethod(klass, "print", argTypes, term76582, args);
    }

};



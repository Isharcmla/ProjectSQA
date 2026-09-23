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
import java.lang.Integer;
import java.lang.Boolean;

public class CSVFormat_print_1793762119118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76594;
     Object term76604;
     Object term76606;
     Object term76608;

    public CSVFormat_print_1793762119118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76594 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setBooleanField(term76594, term76594.getClass(), "allowMissingColumnNames", false);
        setField(term76594, term76594.getClass(), "commentMarker", null);
        setCharField(term76594, term76594.getClass(), "delimiter", (char) 0);
        setField(term76594, term76594.getClass(), "escapeCharacter", null);
        setField(term76594, term76594.getClass(), "header", null);
        setField(term76594, term76594.getClass(), "headerComments", null);
        setBooleanField(term76594, term76594.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term76594, term76594.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term76594, term76594.getClass(), "ignoreSurroundingSpaces", false);
        setField(term76594, term76594.getClass(), "nullString", null);
        setField(term76594, term76594.getClass(), "quoteCharacter", null);
        setField(term76594, term76594.getClass(), "quoteMode", null);
        setField(term76594, term76594.getClass(), "recordSeparator", null);
        setBooleanField(term76594, term76594.getClass(), "skipHeaderRecord", false);
        setBooleanField(term76594, term76594.getClass(), "trailingDelimiter", false);
        setBooleanField(term76594, term76594.getClass(), "trim", false);
        setBooleanField(term76594, term76594.getClass(), "autoFlush", false);
        term76604 = new Integer(0);
        term76606 = new Integer(0);
        term76608 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.CharSequence");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.Appendable");
        argTypes[5] = boolean.class;
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = term76604;
        args[3] = term76606;
        args[4] = null;
        args[5] = term76608;
        callMethod(klass, "print", argTypes, term76594, args);
    }

};



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
import java.lang.IllegalArgumentException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class CSVFormat_withEscape_916497976125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57501;

    public CSVFormat_withEscape_916497976125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term58072 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term58071 = ((Class) term58072).getDeclaredField((String) "MINIMAL");
        ((Field) term58071).setAccessible(true);
        Object enum148 = ((Field) term58071).get((Object) null);
        term57501 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term57384 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term57501, term57501.getClass(), "delimiter", (char) 13);
        setField(term57501, term57501.getClass(), "quoteChar", null);
        setField(term57501, term57501.getClass(), "quotePolicy", enum148);
        setField(term57501, term57501.getClass(), "commentStart", null);
        setBooleanField(term57501, term57501.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term57501, term57501.getClass(), "ignoreEmptyLines", false);
        setField(term57501, term57501.getClass(), "recordSeparator", null);
        setField(term57501, term57501.getClass(), "nullString", null);
        setField(term57501, term57501.getClass(), "header", term57384);
        setBooleanField(term57501, term57501.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        try {
            callMethod(klass, "withEscape", argTypes, term57501, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



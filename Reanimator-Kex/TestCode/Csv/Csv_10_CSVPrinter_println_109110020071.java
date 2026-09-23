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

public class CSVPrinter_println_109110020071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29476;
     Object term29920;

    public CSVPrinter_println_109110020071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29476 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term29546 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object term29642 = newInstance(Class.forName("java.nio.DirectCharBufferS"));
        setField(term29546, term29546.getClass(), "recordSeparator", "");
        setField(term29476, term29476.getClass(), "format", term29546);
        setField(term29476, term29476.getClass(), "out", term29642);
        term29920 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term29921 = newInstance(Class.forName("java.nio.DirectCharBufferS"));
        Object term29922 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term29921, term29921.getClass(), "att", null);
        setField(term29921, term29921.getClass(), "hb", null);
        setIntField(term29921, term29921.getClass(), "offset", 0);
        setBooleanField(term29921, term29921.getClass(), "isReadOnly", false);
        setIntField(term29921, term29921.getClass(), "mark", 0);
        setIntField(term29921, term29921.getClass(), "position", 0);
        setIntField(term29921, term29921.getClass(), "limit", 0);
        setIntField(term29921, term29921.getClass(), "capacity", 0);
        setLongField(term29921, term29921.getClass(), "address", 0L);
        setField(term29920, term29920.getClass(), "out", term29921);
        setCharField(term29922, term29922.getClass(), "delimiter", (char) 0);
        setField(term29922, term29922.getClass(), "quoteChar", null);
        setField(term29922, term29922.getClass(), "quotePolicy", null);
        setField(term29922, term29922.getClass(), "commentStart", null);
        setField(term29922, term29922.getClass(), "escape", null);
        setBooleanField(term29922, term29922.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term29922, term29922.getClass(), "ignoreEmptyLines", false);
        setField(term29922, term29922.getClass(), "recordSeparator", "");
        setField(term29922, term29922.getClass(), "nullString", null);
        setField(term29922, term29922.getClass(), "header", null);
        setBooleanField(term29922, term29922.getClass(), "skipHeaderRecord", false);
        setField(term29920, term29920.getClass(), "format", term29922);
        setBooleanField(term29920, term29920.getClass(), "newRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "println", argTypes, term29476, args);
        assertTrue(recursiveEquals(term29476, term29920));
    }

};



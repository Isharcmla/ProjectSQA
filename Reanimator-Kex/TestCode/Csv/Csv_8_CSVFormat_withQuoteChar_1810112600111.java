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
import java.lang.Character;

public class CSVFormat_withQuoteChar_1810112600111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53009;
     Object term53199;

    public CSVFormat_withQuoteChar_1810112600111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term53661 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term53660 = ((Class) term53661).getDeclaredField((String) "NONE");
        ((Field) term53660).setAccessible(true);
        Object enum140 = ((Field) term53660).get((Object) null);
        term53009 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setCharField(term53009, term53009.getClass(), "delimiter", (char) 10);
        setField(term53009, term53009.getClass(), "quotePolicy", enum140);
        setField(term53009, term53009.getClass(), "commentStart", null);
        setField(term53009, term53009.getClass(), "escape", null);
        setBooleanField(term53009, term53009.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term53009, term53009.getClass(), "ignoreEmptyLines", false);
        setField(term53009, term53009.getClass(), "recordSeparator", null);
        setField(term53009, term53009.getClass(), "nullString", "");
        setField(term53009, term53009.getClass(), "header", null);
        setBooleanField(term53009, term53009.getClass(), "skipHeaderRecord", false);
        term53199 = new Character((char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Character");
        Object[] args = new Object[1];
        args[0] = term53199;
        try {
            callMethod(klass, "withQuoteChar", argTypes, term53009, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



package org.joda.time.format;

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
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.format.EqualityUtils.*;

public class DateTimeFormatterBuilder_isPrinter_616256218216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26259;
     Object term26375;
     Object term26932;
     Object term26933;

    public DateTimeFormatterBuilder_isPrinter_616256218216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26259 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        term26375 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TextField"));
        term26932 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term26932, term26932.getClass(), "iElementPairs", null);
        setField(term26932, term26932.getClass(), "iFormatter", null);
        term26933 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TextField"));
        setField(term26933, term26933.getClass(), "iFieldType", null);
        setBooleanField(term26933, term26933.getClass(), "iShort", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term26375;
        callMethod(klass, "isPrinter", argTypes, term26259, args);
        assertTrue(recursiveEquals(term26259, term26932));
        assertTrue(recursiveEquals(term26375, term26933));
    }

};



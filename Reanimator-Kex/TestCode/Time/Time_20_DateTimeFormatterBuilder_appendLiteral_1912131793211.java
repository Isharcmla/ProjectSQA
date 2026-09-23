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

public class DateTimeFormatterBuilder_appendLiteral_1912131793211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25974;
     Object term26025;
     Object term26022;

    public DateTimeFormatterBuilder_appendLiteral_1912131793211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25974 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        term26025 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term26025, term26025.getClass(), "iElementPairs", null);
        setField(term26025, term26025.getClass(), "iFormatter", null);
        term26022 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term26022, term26022.getClass(), "iElementPairs", null);
        setField(term26022, term26022.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "appendLiteral", argTypes, term25974, args);
        assertTrue(recursiveEquals(term25974, term26025));
        assertTrue(recursiveEquals(retValue, term26022));
    }

};



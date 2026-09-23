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
import java.lang.Object;

public class DateTimeFormatterBuilder_canBuildParser_228301192346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53487;
     Object term53920;

    public DateTimeFormatterBuilder_canBuildParser_228301192346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53487 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term53603 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        setField(term53487, term53487.getClass(), "iFormatter", term53603);
        term53920 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term53921 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        setField(term53920, term53920.getClass(), "iElementPairs", null);
        setField(term53921, term53921.getClass(), "iPrinters", null);
        setField(term53921, term53921.getClass(), "iParsers", null);
        setIntField(term53921, term53921.getClass(), "iPrintedLengthEstimate", 0);
        setIntField(term53921, term53921.getClass(), "iParsedLengthEstimate", 0);
        setField(term53920, term53920.getClass(), "iFormatter", term53921);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "canBuildParser", argTypes, term53487, args);
        assertTrue(recursiveEquals(term53487, term53920));
    }

};



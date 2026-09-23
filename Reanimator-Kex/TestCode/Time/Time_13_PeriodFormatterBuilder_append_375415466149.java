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
import java.lang.Object;

public class PeriodFormatterBuilder_append_375415466149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26339;
     Object term26539;

    public PeriodFormatterBuilder_append_375415466149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26339 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object term26461 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$CompositeAffix"));
        setField(term26339, term26339.getClass(), "iPrefix", term26461);
        term26539 = newInstance(Class.forName("org.joda.time.format.PeriodFormatter"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.format.PeriodFormatter");
        Object[] args = new Object[1];
        args[0] = term26539;
        try {
            callMethod(klass, "append", argTypes, term26339, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



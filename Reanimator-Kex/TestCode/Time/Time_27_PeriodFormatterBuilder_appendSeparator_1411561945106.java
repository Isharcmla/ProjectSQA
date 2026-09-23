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

public class PeriodFormatterBuilder_appendSeparator_1411561945106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7611;

    public PeriodFormatterBuilder_appendSeparator_1411561945106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7611 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder"));
        Object term7733 = newInstance(Class.forName("org.joda.time.format.PeriodFormatterBuilder$CompositeAffix"));
        setField(term7611, term7611.getClass(), "iPrefix", term7733);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.PeriodFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = "";
        args[1] = "";
        args[2] = null;
        args[3] = false;
        args[4] = false;
        try {
            callMethod(klass, "appendSeparator", argTypes, term7611, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



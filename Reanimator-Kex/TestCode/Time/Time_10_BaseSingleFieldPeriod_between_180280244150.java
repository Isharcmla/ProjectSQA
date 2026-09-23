package org.joda.time.base;

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
import static org.joda.time.base.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BaseSingleFieldPeriod_between_180280244150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36454;
     Object term36502;

    public BaseSingleFieldPeriod_between_180280244150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36454 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term36386 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        setField(term36454, term36454.getClass(), "iTypes", term36386);
        term36502 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term36387 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        setField(term36502, term36502.getClass(), "iTypes", term36387);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.base.BaseSingleFieldPeriod");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.joda.time.ReadablePartial");
        argTypes[1] = Class.forName("org.joda.time.ReadablePartial");
        argTypes[2] = Class.forName("org.joda.time.ReadablePeriod");
        Object[] args = new Object[3];
        args[0] = term36454;
        args[1] = term36502;
        args[2] = null;
        callMethod(klass, "between", argTypes, null, args);
    }

};



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
import java.lang.IllegalArgumentException;
import static org.joda.time.base.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BaseSingleFieldPeriod_between_18028024468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12127;
     Object term12175;

    public BaseSingleFieldPeriod_between_18028024468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12127 = newInstance(Class.forName("org.joda.time.YearMonth"));
        term12175 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term12058 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 105);
        setField(term12175, term12175.getClass(), "iTypes", term12058);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.base.BaseSingleFieldPeriod");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.joda.time.ReadablePartial");
        argTypes[1] = Class.forName("org.joda.time.ReadablePartial");
        argTypes[2] = Class.forName("org.joda.time.ReadablePeriod");
        Object[] args = new Object[3];
        args[0] = term12127;
        args[1] = term12175;
        args[2] = null;
        try {
            callMethod(klass, "between", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



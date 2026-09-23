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

public class BaseSingleFieldPeriod_between_196431616536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4934;

    public BaseSingleFieldPeriod_between_196431616536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4934 = newInstance(Class.forName("org.joda.time.DateTime"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.base.BaseSingleFieldPeriod");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.joda.time.ReadableInstant");
        argTypes[1] = Class.forName("org.joda.time.ReadableInstant");
        argTypes[2] = Class.forName("org.joda.time.DurationFieldType");
        Object[] args = new Object[3];
        args[0] = term4934;
        args[1] = term4934;
        args[2] = null;
        callMethod(klass, "between", argTypes, null, args);
    }

};



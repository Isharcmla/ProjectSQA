package org.joda.time.tz;

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
import static org.joda.time.tz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.tz.EqualityUtils.*;
import java.lang.Object;

public class ZoneInfoCompiler_main_401837095117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111489;
     Object term111807;

    public ZoneInfoCompiler_main_401837095117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111489 = (Object[]) newArray("java.lang.String", 2);
        setElement(term111489, 0, "-verbose");
        setElement(term111489, 1, "-verbose");
        term111807 = (Object[]) newArray("java.lang.String", 2);
        setElement(term111807, 0, "-verbose");
        setElement(term111807, 1, "-verbose");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.tz.ZoneInfoCompiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term111489;
        callMethod(klass, "main", argTypes, null, args);
        assertTrue(recursiveEquals(term111489, term111807));
    }

};



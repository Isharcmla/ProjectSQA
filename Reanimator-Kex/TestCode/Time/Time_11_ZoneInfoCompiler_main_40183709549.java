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

public class ZoneInfoCompiler_main_40183709549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61809;
     Object term62009;

    public ZoneInfoCompiler_main_40183709549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61809 = (Object[]) newArray("java.lang.String", 1);
        setElement(term61809, 0, "-verbose");
        term62009 = (Object[]) newArray("java.lang.String", 1);
        setElement(term62009, 0, "-verbose");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.tz.ZoneInfoCompiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term61809;
        callMethod(klass, "main", argTypes, null, args);
        assertTrue(recursiveEquals(term61809, term62009));
    }

};



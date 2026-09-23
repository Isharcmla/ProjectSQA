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
import java.lang.NullPointerException;
import static org.joda.time.tz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ZoneInfoCompiler_compile_15140647645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61268;
     Object term61298;
     Object term61179;

    public ZoneInfoCompiler_compile_15140647645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61268 = newInstance(Class.forName("org.joda.time.tz.ZoneInfoCompiler"));
        term61298 = newInstance(Class.forName("java.io.File"));
        term61179 = (Object[]) newArray("java.io.File", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.tz.ZoneInfoCompiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Array.newInstance(Class.forName("java.io.File"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term61298;
        args[1] = term61179;
        try {
            callMethod(klass, "compile", argTypes, term61268, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



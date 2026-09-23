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
import java.util.ArrayList;
import java.lang.Object;

public class ZoneInfoCompiler_compile_151406476138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201093;

    public ZoneInfoCompiler_compile_151406476138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term201145 = new ArrayList();
        ArrayList term201197 = new ArrayList();
        ((ArrayList) term201197).add((Object)null);
        ((ArrayList) term201197).add((Object)null);
        term201093 = newInstance(Class.forName("org.joda.time.tz.ZoneInfoCompiler"));
        setField(term201093, term201093.getClass(), "iZones", term201145);
        setField(term201093, term201093.getClass(), "iLinks", term201197);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.tz.ZoneInfoCompiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Array.newInstance(Class.forName("java.io.File"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "compile", argTypes, term201093, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



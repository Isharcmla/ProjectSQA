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
import java.io.FileNotFoundException;
import static org.joda.time.tz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ZoneInfoCompiler_main_401837095125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166557;

    public ZoneInfoCompiler_main_401837095125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166557 = (Object[]) newArray("java.lang.String", 4);
        setElement(term166557, 0, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setElement(term166557, 1, "");
        setElement(term166557, 2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setElement(term166557, 3, "");
        Object term169112 = newInstance(Class.forName("java.util.concurrent.locks.ReentrantReadWriteLock$Sync$ThreadLocalHoldCounter"));
        setField(null, Class.forName("org.joda.time.tz.ZoneInfoCompiler"), "cVerbose", term169112);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.tz.ZoneInfoCompiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term166557;
        try {
            callMethod(klass, "main", argTypes, null, args);
            assertTrue(false);
        }
        catch (FileNotFoundException e) {
        }

    }

};



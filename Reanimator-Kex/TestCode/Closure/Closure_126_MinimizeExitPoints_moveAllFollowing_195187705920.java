package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class MinimizeExitPoints_moveAllFollowing_195187705920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2674;
     Object term2948;

    public MinimizeExitPoints_moveAllFollowing_195187705920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2674 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2674, term2674.getClass(), "next", null);
        term2948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2948, term2948.getClass(), "type", 0);
        setField(term2948, term2948.getClass(), "next", null);
        setField(term2948, term2948.getClass(), "first", null);
        setField(term2948, term2948.getClass(), "last", null);
        setField(term2948, term2948.getClass(), "propListHead", null);
        setIntField(term2948, term2948.getClass(), "sourcePosition", 0);
        setField(term2948, term2948.getClass(), "jsType", null);
        setField(term2948, term2948.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term2674;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "moveAllFollowing", argTypes, null, args);
        assertTrue(recursiveEquals(term2674, term2948));
    }

};



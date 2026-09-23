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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34182;
     Object term34332;
     Object term34507;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34182 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        Object term34262 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term34182, term34182.getClass(), "compiler", term34262);
        term34332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34332, term34332.getClass(), "type", 0);
        setField(term34332, term34332.getClass(), "first", null);
        term34507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34542 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term34507, term34507.getClass(), "next", term34542);
        setField(term34507, term34507.getClass(), "propListHead", null);
        setIntField(term34507, term34507.getClass(), "sourcePosition", 0);
        setIntField(term34507, term34507.getClass(), "type", 0);
        setField(term34507, term34507.getClass(), "first", term34507);
        setField(term34507, term34507.getClass(), "last", null);
        setField(term34507, term34507.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term34332;
        args[1] = term34507;
        args[2] = term34507;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term34182, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



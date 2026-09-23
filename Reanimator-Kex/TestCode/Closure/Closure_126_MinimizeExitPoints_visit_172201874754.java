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

public class MinimizeExitPoints_visit_172201874754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8320;
     Object term8390;

    public MinimizeExitPoints_visit_172201874754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8320 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term8390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8460 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8390, term8390.getClass(), "type", 113);
        setIntField(term8460, term8460.getClass(), "type", 117);
        setField(term8390, term8390.getClass(), "last", term8460);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term8390;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term8320, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



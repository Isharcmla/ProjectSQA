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
import java.lang.Object;

public class MinimizeExitPoints_visit_1722018747102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23321;
     Object term23413;

    public MinimizeExitPoints_visit_1722018747102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23321 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term23413 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term23505 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term23597 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term23413, term23413.getClass(), "type", 126);
        setField(term23413, term23413.getClass(), "last", term23505);
        setField(term23413, term23413.getClass(), "first", term23597);
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
        args[1] = term23413;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term23321, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



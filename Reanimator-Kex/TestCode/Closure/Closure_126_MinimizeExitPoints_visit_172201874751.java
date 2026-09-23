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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MinimizeExitPoints_visit_172201874751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7243;
     Object term7313;

    public MinimizeExitPoints_visit_172201874751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7243 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term7313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7383 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7313, term7313.getClass(), "type", 126);
        setField(term7313, term7313.getClass(), "last", term7383);
        setField(term7313, term7313.getClass(), "first", term7313);
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
        args[1] = term7313;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term7243, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};



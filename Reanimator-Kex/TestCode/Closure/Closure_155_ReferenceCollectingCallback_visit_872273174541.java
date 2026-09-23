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

public class ReferenceCollectingCallback_visit_872273174541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137518;
     Object term137610;
     Object term137696;

    public ReferenceCollectingCallback_visit_872273174541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137518 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term137610 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term137610, term137610.getClass(), "type", 0);
        term137696 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term137696, term137696.getClass(), "type", 108);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term137610;
        args[2] = term137696;
        try {
            callMethod(klass, "visit", argTypes, term137518, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



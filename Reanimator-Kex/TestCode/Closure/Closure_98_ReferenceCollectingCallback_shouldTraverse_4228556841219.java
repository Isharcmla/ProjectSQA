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

public class ReferenceCollectingCallback_shouldTraverse_4228556841219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term365297;
     Object term365389;
     Object term365481;

    public ReferenceCollectingCallback_shouldTraverse_4228556841219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term365297 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term365389 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term365481 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term365573 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term365481, term365481.getClass(), "type", 101);
        setField(term365481, term365481.getClass(), "first", term365573);
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
        args[1] = term365389;
        args[2] = term365481;
        try {
            callMethod(klass, "shouldTraverse", argTypes, term365297, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



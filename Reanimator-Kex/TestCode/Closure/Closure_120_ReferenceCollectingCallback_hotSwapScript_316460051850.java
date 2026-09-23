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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ReferenceCollectingCallback_hotSwapScript_316460051850 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term342124;
     Object term342480;

    public ReferenceCollectingCallback_hotSwapScript_316460051850() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term342124 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term342204 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term342296 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        Object term342526 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setBooleanField(term342296, term342296.getClass(), "inLoop", true);
        setIntField(term342526, term342526.getClass(), "type", 0);
        setField(term342296, term342296.getClass(), "jsRoot", term342526);
        setField(term342204, term342204.getClass(), "phaseOptimizer", term342296);
        setField(term342124, term342124.getClass(), "compiler", term342204);
        term342480 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term342480, term342480.getClass(), "type", 132);
        setField(term342480, term342480.getClass(), "propListHead", null);
        setField(term342480, term342480.getClass(), "parent", term342526);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term342480;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term342124, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



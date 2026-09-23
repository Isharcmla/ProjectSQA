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

public class ReferenceCollectingCallback_hotSwapScript_316460051540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163284;
     Object term163640;

    public ReferenceCollectingCallback_hotSwapScript_316460051540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163284 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term163364 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term163456 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        Object term163548 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setBooleanField(term163456, term163456.getClass(), "inLoop", true);
        setField(term163456, term163456.getClass(), "jsRoot", term163548);
        setField(term163364, term163364.getClass(), "phaseOptimizer", term163456);
        setField(term163284, term163284.getClass(), "compiler", term163364);
        term163640 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term163732 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term163640, term163640.getClass(), "type", 0);
        setIntField(term163732, term163732.getClass(), "type", 0);
        setField(term163732, term163732.getClass(), "parent", null);
        setField(term163640, term163640.getClass(), "parent", term163732);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term163640;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term163284, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



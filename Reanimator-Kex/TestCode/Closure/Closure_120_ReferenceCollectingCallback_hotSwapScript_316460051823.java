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

public class ReferenceCollectingCallback_hotSwapScript_316460051823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323718;
     Object term324074;

    public ReferenceCollectingCallback_hotSwapScript_316460051823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term323718 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term323798 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term323890 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        Object term324120 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setBooleanField(term323890, term323890.getClass(), "inLoop", true);
        setIntField(term324120, term324120.getClass(), "type", 0);
        setField(term323890, term323890.getClass(), "jsRoot", term324120);
        setField(term323798, term323798.getClass(), "phaseOptimizer", term323890);
        setField(term323718, term323718.getClass(), "compiler", term323798);
        term324074 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term324074, term324074.getClass(), "type", 132);
        setField(term324074, term324074.getClass(), "propListHead", null);
        setField(term324074, term324074.getClass(), "parent", term324120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term324074;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term323718, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



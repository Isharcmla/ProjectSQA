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

public class ReferenceCollectingCallback_hotSwapScript_316460051495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135462;
     Object term135704;

    public ReferenceCollectingCallback_hotSwapScript_316460051495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135462 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term135542 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term135634 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setBooleanField(term135634, term135634.getClass(), "inLoop", true);
        setField(term135542, term135542.getClass(), "phaseOptimizer", term135634);
        setField(term135462, term135462.getClass(), "compiler", term135542);
        term135704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term135774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term135704, term135704.getClass(), "type", 0);
        setIntField(term135774, term135774.getClass(), "type", 0);
        setField(term135774, term135774.getClass(), "parent", null);
        setField(term135704, term135704.getClass(), "parent", term135774);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term135704;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term135462, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



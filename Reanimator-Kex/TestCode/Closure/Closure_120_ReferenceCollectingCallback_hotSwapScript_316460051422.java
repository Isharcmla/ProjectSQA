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

public class ReferenceCollectingCallback_hotSwapScript_316460051422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103559;
     Object term103823;

    public ReferenceCollectingCallback_hotSwapScript_316460051422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103559 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term103639 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term103731 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(term103639, term103639.getClass(), "phaseOptimizer", term103731);
        setField(term103559, term103559.getClass(), "compiler", term103639);
        term103823 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term103823, term103823.getClass(), "type", -133);
        setField(term103823, term103823.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term103823;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term103559, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



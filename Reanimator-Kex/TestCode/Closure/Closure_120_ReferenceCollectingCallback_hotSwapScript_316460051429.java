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

public class ReferenceCollectingCallback_hotSwapScript_316460051429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106825;
     Object term107067;

    public ReferenceCollectingCallback_hotSwapScript_316460051429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106825 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term106905 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term106997 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(term106905, term106905.getClass(), "phaseOptimizer", term106997);
        setField(term106825, term106825.getClass(), "compiler", term106905);
        term107067 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term107067, term107067.getClass(), "type", -133);
        setField(term107067, term107067.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term107067;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term106825, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



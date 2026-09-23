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

public class ReferenceCollectingCallback_hotSwapScript_316460051645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210415;
     Object term210679;

    public ReferenceCollectingCallback_hotSwapScript_316460051645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210415 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term210495 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term210587 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setBooleanField(term210587, term210587.getClass(), "inLoop", false);
        setField(term210495, term210495.getClass(), "phaseOptimizer", term210587);
        setField(term210415, term210415.getClass(), "compiler", term210495);
        term210679 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term210771 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term210679, term210679.getClass(), "type", 0);
        setIntField(term210771, term210771.getClass(), "type", 0);
        setField(term210771, term210771.getClass(), "parent", null);
        setField(term210679, term210679.getClass(), "parent", term210771);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term210679;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term210415, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ReferenceCollectingCallback_hotSwapScript_316460051853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term346233;
     Object term346497;

    public ReferenceCollectingCallback_hotSwapScript_316460051853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term346233 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term346313 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term346405 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setBooleanField(term346405, term346405.getClass(), "inLoop", true);
        setField(term346405, term346405.getClass(), "jsRoot", null);
        setField(term346313, term346313.getClass(), "phaseOptimizer", term346405);
        setField(term346233, term346233.getClass(), "compiler", term346313);
        term346497 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term346589 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term346497, term346497.getClass(), "type", 132);
        setField(term346497, term346497.getClass(), "propListHead", null);
        setField(term346497, term346497.getClass(), "parent", term346589);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term346497;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term346233, args);
    }

};



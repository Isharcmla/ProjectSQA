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

public class ReferenceCollectingCallback_hotSwapScript_316460051693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241153;
     Object term241487;

    public ReferenceCollectingCallback_hotSwapScript_316460051693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term241153 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term241233 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term241325 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        Object term241395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setBooleanField(term241325, term241325.getClass(), "inLoop", true);
        setField(term241325, term241325.getClass(), "jsRoot", term241395);
        setField(term241233, term241233.getClass(), "phaseOptimizer", term241325);
        setField(term241153, term241153.getClass(), "compiler", term241233);
        term241487 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term241579 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term241487, term241487.getClass(), "type", 0);
        setIntField(term241579, term241579.getClass(), "type", 0);
        setField(term241579, term241579.getClass(), "parent", null);
        setField(term241487, term241487.getClass(), "parent", term241579);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term241487;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term241153, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



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

public class ReferenceCollectingCallback_hotSwapScript_316460051650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212492;
     Object term212894;

    public ReferenceCollectingCallback_hotSwapScript_316460051650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term212492 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term212572 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term212664 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        term212894 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term212940 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setBooleanField(term212664, term212664.getClass(), "inLoop", true);
        setIntField(term212894, term212894.getClass(), "type", 0);
        setIntField(term212940, term212940.getClass(), "type", 0);
        setField(term212940, term212940.getClass(), "parent", null);
        setField(term212894, term212894.getClass(), "parent", term212940);
        setField(term212664, term212664.getClass(), "jsRoot", term212894);
        setField(term212572, term212572.getClass(), "phaseOptimizer", term212664);
        setField(term212492, term212492.getClass(), "compiler", term212572);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term212894;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term212492, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



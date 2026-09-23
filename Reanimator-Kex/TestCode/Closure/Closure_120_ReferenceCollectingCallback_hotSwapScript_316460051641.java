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

public class ReferenceCollectingCallback_hotSwapScript_316460051641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207027;
     Object term207429;

    public ReferenceCollectingCallback_hotSwapScript_316460051641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207027 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term207107 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term207199 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        term207429 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term207475 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setBooleanField(term207199, term207199.getClass(), "inLoop", true);
        setIntField(term207429, term207429.getClass(), "type", 0);
        setIntField(term207475, term207475.getClass(), "type", 0);
        setField(term207475, term207475.getClass(), "parent", null);
        setField(term207429, term207429.getClass(), "parent", term207475);
        setField(term207199, term207199.getClass(), "jsRoot", term207429);
        setField(term207107, term207107.getClass(), "phaseOptimizer", term207199);
        setField(term207027, term207027.getClass(), "compiler", term207107);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term207429;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term207027, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



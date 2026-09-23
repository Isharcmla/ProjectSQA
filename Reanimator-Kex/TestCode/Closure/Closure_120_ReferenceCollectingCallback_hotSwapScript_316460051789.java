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

public class ReferenceCollectingCallback_hotSwapScript_316460051789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term298047;
     Object term298403;

    public ReferenceCollectingCallback_hotSwapScript_316460051789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term298047 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term298127 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term298219 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        Object term298311 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setBooleanField(term298219, term298219.getClass(), "inLoop", true);
        setField(term298219, term298219.getClass(), "jsRoot", term298311);
        setField(term298127, term298127.getClass(), "phaseOptimizer", term298219);
        setField(term298047, term298047.getClass(), "compiler", term298127);
        term298403 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term298495 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term298403, term298403.getClass(), "type", 132);
        setField(term298403, term298403.getClass(), "propListHead", null);
        setField(term298403, term298403.getClass(), "parent", term298495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term298403;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term298047, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



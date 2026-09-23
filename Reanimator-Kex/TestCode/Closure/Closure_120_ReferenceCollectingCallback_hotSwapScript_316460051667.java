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

public class ReferenceCollectingCallback_hotSwapScript_316460051667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224959;
     Object term225201;

    public ReferenceCollectingCallback_hotSwapScript_316460051667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term224959 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term225039 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term225131 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setBooleanField(term225131, term225131.getClass(), "inLoop", true);
        setField(term225131, term225131.getClass(), "jsRoot", null);
        setField(term225039, term225039.getClass(), "phaseOptimizer", term225131);
        setField(term224959, term224959.getClass(), "compiler", term225039);
        term225201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term225271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term225341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term225201, term225201.getClass(), "type", 132);
        setField(term225201, term225201.getClass(), "propListHead", null);
        setIntField(term225271, term225271.getClass(), "type", 0);
        setField(term225271, term225271.getClass(), "parent", term225341);
        setField(term225201, term225201.getClass(), "parent", term225271);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term225201;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term224959, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



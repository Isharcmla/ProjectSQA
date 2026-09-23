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

public class ReferenceCollectingCallback_hotSwapScript_316460051669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227787;
     Object term228097;

    public ReferenceCollectingCallback_hotSwapScript_316460051669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227787 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term227867 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term227959 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        term228097 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setBooleanField(term227959, term227959.getClass(), "inLoop", true);
        setIntField(term228097, term228097.getClass(), "type", 132);
        setField(term228097, term228097.getClass(), "propListHead", null);
        setField(term227959, term227959.getClass(), "jsRoot", term228097);
        setField(term227867, term227867.getClass(), "phaseOptimizer", term227959);
        setField(term227787, term227787.getClass(), "compiler", term227867);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term228097;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term227787, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



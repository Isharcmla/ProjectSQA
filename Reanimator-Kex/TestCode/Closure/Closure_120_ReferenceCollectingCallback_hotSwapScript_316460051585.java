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

public class ReferenceCollectingCallback_hotSwapScript_316460051585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181560;
     Object term181824;

    public ReferenceCollectingCallback_hotSwapScript_316460051585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181560 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term181640 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term181732 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setBooleanField(term181732, term181732.getClass(), "inLoop", true);
        setField(term181640, term181640.getClass(), "phaseOptimizer", term181732);
        setField(term181560, term181560.getClass(), "compiler", term181640);
        term181824 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term181824, term181824.getClass(), "type", 132);
        setField(term181824, term181824.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term181824;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term181560, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



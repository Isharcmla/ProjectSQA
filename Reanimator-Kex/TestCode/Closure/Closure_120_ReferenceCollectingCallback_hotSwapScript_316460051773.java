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

public class ReferenceCollectingCallback_hotSwapScript_316460051773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287307;
     Object term287571;

    public ReferenceCollectingCallback_hotSwapScript_316460051773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287307 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term287387 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term287479 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setBooleanField(term287479, term287479.getClass(), "inLoop", true);
        setField(term287387, term287387.getClass(), "phaseOptimizer", term287479);
        setField(term287307, term287307.getClass(), "compiler", term287387);
        term287571 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term287571, term287571.getClass(), "type", 132);
        setField(term287571, term287571.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term287571;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term287307, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



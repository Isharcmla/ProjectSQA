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

public class ReferenceCollectingCallback_hotSwapScript_316460051518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152344;
     Object term152691;

    public ReferenceCollectingCallback_hotSwapScript_316460051518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152344 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term152424 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term152516 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        term152691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term152726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setBooleanField(term152516, term152516.getClass(), "inLoop", true);
        setIntField(term152691, term152691.getClass(), "type", 0);
        setIntField(term152726, term152726.getClass(), "type", 0);
        setField(term152726, term152726.getClass(), "parent", null);
        setField(term152691, term152691.getClass(), "parent", term152726);
        setField(term152516, term152516.getClass(), "jsRoot", term152691);
        setField(term152424, term152424.getClass(), "phaseOptimizer", term152516);
        setField(term152344, term152344.getClass(), "compiler", term152424);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term152691;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term152344, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



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

public class ReferenceCollectingCallback_hotSwapScript_316460051861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350256;
     Object term350658;

    public ReferenceCollectingCallback_hotSwapScript_316460051861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350256 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term350336 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term350428 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        term350658 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term350704 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setBooleanField(term350428, term350428.getClass(), "inLoop", true);
        setIntField(term350658, term350658.getClass(), "type", 0);
        setIntField(term350704, term350704.getClass(), "type", 0);
        setField(term350704, term350704.getClass(), "parent", null);
        setField(term350658, term350658.getClass(), "parent", term350704);
        setField(term350428, term350428.getClass(), "jsRoot", term350658);
        setField(term350428, term350428.getClass(), "currentScope", null);
        setField(term350336, term350336.getClass(), "phaseOptimizer", term350428);
        setField(term350256, term350256.getClass(), "compiler", term350336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term350658;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term350256, args);
    }

};



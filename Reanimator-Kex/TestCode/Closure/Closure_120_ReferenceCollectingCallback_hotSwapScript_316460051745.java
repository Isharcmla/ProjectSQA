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

public class ReferenceCollectingCallback_hotSwapScript_316460051745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267009;
     Object term267321;

    public ReferenceCollectingCallback_hotSwapScript_316460051745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term267009 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term267089 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term267181 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        Object term267251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setBooleanField(term267181, term267181.getClass(), "inLoop", true);
        setField(term267181, term267181.getClass(), "jsRoot", term267251);
        setField(term267089, term267089.getClass(), "phaseOptimizer", term267181);
        setField(term267009, term267009.getClass(), "compiler", term267089);
        term267321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term267391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term267461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term267531 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term267321, term267321.getClass(), "type", 132);
        setField(term267321, term267321.getClass(), "propListHead", null);
        setIntField(term267391, term267391.getClass(), "type", 0);
        setIntField(term267461, term267461.getClass(), "type", 0);
        setField(term267461, term267461.getClass(), "parent", term267531);
        setField(term267391, term267391.getClass(), "parent", term267461);
        setField(term267321, term267321.getClass(), "parent", term267391);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term267321;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term267009, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



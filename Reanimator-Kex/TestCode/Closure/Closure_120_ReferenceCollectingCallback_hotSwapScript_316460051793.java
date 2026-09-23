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

public class ReferenceCollectingCallback_hotSwapScript_316460051793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term301103;
     Object term301485;

    public ReferenceCollectingCallback_hotSwapScript_316460051793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term301103 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term301183 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term301275 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        Object term301520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term301415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setBooleanField(term301275, term301275.getClass(), "inLoop", true);
        setIntField(term301520, term301520.getClass(), "type", 0);
        setField(term301520, term301520.getClass(), "parent", null);
        setField(term301275, term301275.getClass(), "jsRoot", term301520);
        setField(term301275, term301275.getClass(), "currentScope", term301415);
        setField(term301183, term301183.getClass(), "phaseOptimizer", term301275);
        setField(term301103, term301103.getClass(), "compiler", term301183);
        term301485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term301485, term301485.getClass(), "type", 0);
        setField(term301485, term301485.getClass(), "parent", term301520);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term301485;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term301103, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



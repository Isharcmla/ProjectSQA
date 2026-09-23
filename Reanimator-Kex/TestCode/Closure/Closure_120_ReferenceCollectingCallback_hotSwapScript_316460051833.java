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

public class ReferenceCollectingCallback_hotSwapScript_316460051833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term330256;
     Object term330520;

    public ReferenceCollectingCallback_hotSwapScript_316460051833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term330256 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term330336 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term330428 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setBooleanField(term330428, term330428.getClass(), "inLoop", true);
        setField(term330428, term330428.getClass(), "jsRoot", null);
        setField(term330336, term330336.getClass(), "phaseOptimizer", term330428);
        setField(term330256, term330256.getClass(), "compiler", term330336);
        term330520 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term330612 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term330704 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term330774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term330520, term330520.getClass(), "type", 132);
        setField(term330520, term330520.getClass(), "propListHead", null);
        setIntField(term330612, term330612.getClass(), "type", 0);
        setIntField(term330704, term330704.getClass(), "type", 0);
        setField(term330704, term330704.getClass(), "parent", term330774);
        setField(term330612, term330612.getClass(), "parent", term330704);
        setField(term330520, term330520.getClass(), "parent", term330612);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term330520;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term330256, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



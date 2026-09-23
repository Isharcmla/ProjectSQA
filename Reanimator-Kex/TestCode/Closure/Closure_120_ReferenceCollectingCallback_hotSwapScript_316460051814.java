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

public class ReferenceCollectingCallback_hotSwapScript_316460051814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315112;
     Object term315468;

    public ReferenceCollectingCallback_hotSwapScript_316460051814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term315112 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term315192 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term315284 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        Object term315514 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setBooleanField(term315284, term315284.getClass(), "inLoop", true);
        setIntField(term315514, term315514.getClass(), "type", 0);
        setField(term315284, term315284.getClass(), "jsRoot", term315514);
        setField(term315192, term315192.getClass(), "phaseOptimizer", term315284);
        setField(term315112, term315112.getClass(), "compiler", term315192);
        term315468 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term315468, term315468.getClass(), "type", 132);
        setField(term315468, term315468.getClass(), "propListHead", null);
        setField(term315468, term315468.getClass(), "parent", term315514);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term315468;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term315112, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



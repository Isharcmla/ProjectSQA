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

public class ReferenceCollectingCallback_hotSwapScript_316460051847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term339047;
     Object term339381;

    public ReferenceCollectingCallback_hotSwapScript_316460051847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term339047 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term339127 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term339219 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        Object term339289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setBooleanField(term339219, term339219.getClass(), "inLoop", true);
        setField(term339219, term339219.getClass(), "jsRoot", term339289);
        setField(term339127, term339127.getClass(), "phaseOptimizer", term339219);
        setField(term339047, term339047.getClass(), "compiler", term339127);
        term339381 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term339473 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term339543 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term339613 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term339381, term339381.getClass(), "type", 132);
        setField(term339381, term339381.getClass(), "propListHead", null);
        setIntField(term339473, term339473.getClass(), "type", 0);
        setIntField(term339543, term339543.getClass(), "type", 0);
        setField(term339543, term339543.getClass(), "parent", term339613);
        setField(term339473, term339473.getClass(), "parent", term339543);
        setField(term339381, term339381.getClass(), "parent", term339473);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term339381;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term339047, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



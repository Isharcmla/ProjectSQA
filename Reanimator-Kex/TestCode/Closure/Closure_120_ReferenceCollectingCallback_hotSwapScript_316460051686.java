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

public class ReferenceCollectingCallback_hotSwapScript_316460051686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237423;
     Object term237665;

    public ReferenceCollectingCallback_hotSwapScript_316460051686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237423 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term237503 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term237595 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setBooleanField(term237595, term237595.getClass(), "inLoop", true);
        setField(term237595, term237595.getClass(), "jsRoot", null);
        setField(term237503, term237503.getClass(), "phaseOptimizer", term237595);
        setField(term237423, term237423.getClass(), "compiler", term237503);
        term237665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term237757 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term237665, term237665.getClass(), "type", 132);
        setField(term237665, term237665.getClass(), "propListHead", null);
        setField(term237665, term237665.getClass(), "parent", term237757);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term237665;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term237423, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



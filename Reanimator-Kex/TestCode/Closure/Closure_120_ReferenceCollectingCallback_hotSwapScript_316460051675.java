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

public class ReferenceCollectingCallback_hotSwapScript_316460051675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231805;
     Object term231977;

    public ReferenceCollectingCallback_hotSwapScript_316460051675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term231805 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term231885 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term231885, term231885.getClass(), "phaseOptimizer", null);
        setField(term231805, term231805.getClass(), "compiler", term231885);
        term231977 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term231977, term231977.getClass(), "type", -133);
        setField(term231977, term231977.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term231977;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term231805, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



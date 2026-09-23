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

public class ReferenceCollectingCallback_hotSwapScript_316460051760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278835;
     Object term279099;

    public ReferenceCollectingCallback_hotSwapScript_316460051760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term278835 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term278915 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term279007 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(term278915, term278915.getClass(), "phaseOptimizer", term279007);
        setField(term278835, term278835.getClass(), "compiler", term278915);
        term279099 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term279191 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term279099, term279099.getClass(), "type", 0);
        setIntField(term279191, term279191.getClass(), "type", 0);
        setField(term279191, term279191.getClass(), "parent", null);
        setField(term279099, term279099.getClass(), "parent", term279191);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term279099;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term278835, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



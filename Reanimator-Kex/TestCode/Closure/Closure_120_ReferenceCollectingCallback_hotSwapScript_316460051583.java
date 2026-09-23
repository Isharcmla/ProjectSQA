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

public class ReferenceCollectingCallback_hotSwapScript_316460051583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180144;
     Object term180294;

    public ReferenceCollectingCallback_hotSwapScript_316460051583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180144 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term180224 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term180224, term180224.getClass(), "phaseOptimizer", null);
        setField(term180144, term180144.getClass(), "compiler", term180224);
        term180294 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term180386 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term180294, term180294.getClass(), "type", 0);
        setIntField(term180386, term180386.getClass(), "type", 0);
        setField(term180386, term180386.getClass(), "parent", null);
        setField(term180294, term180294.getClass(), "parent", term180386);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term180294;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term180144, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



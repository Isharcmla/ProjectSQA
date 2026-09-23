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

public class ReferenceCollectingCallback_hotSwapScript_316460051505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142410;
     Object term142687;

    public ReferenceCollectingCallback_hotSwapScript_316460051505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142410 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term142490 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term142582 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        term142687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setBooleanField(term142582, term142582.getClass(), "inLoop", true);
        setIntField(term142687, term142687.getClass(), "type", 132);
        setField(term142687, term142687.getClass(), "propListHead", null);
        setField(term142582, term142582.getClass(), "jsRoot", term142687);
        setField(term142490, term142490.getClass(), "phaseOptimizer", term142582);
        setField(term142410, term142410.getClass(), "compiler", term142490);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term142687;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term142410, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



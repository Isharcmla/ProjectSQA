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

public class ReferenceCollectingCallback_hotSwapScript_316460051747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270033;
     Object term270389;

    public ReferenceCollectingCallback_hotSwapScript_316460051747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270033 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term270113 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term270205 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        Object term270435 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setBooleanField(term270205, term270205.getClass(), "inLoop", true);
        setIntField(term270435, term270435.getClass(), "type", 0);
        setField(term270205, term270205.getClass(), "jsRoot", term270435);
        setField(term270113, term270113.getClass(), "phaseOptimizer", term270205);
        setField(term270033, term270033.getClass(), "compiler", term270113);
        term270389 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term270389, term270389.getClass(), "type", 132);
        setField(term270389, term270389.getClass(), "propListHead", null);
        setField(term270389, term270389.getClass(), "parent", term270435);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term270389;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term270033, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



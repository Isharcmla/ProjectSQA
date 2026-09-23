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

public class ReferenceCollectingCallback_hotSwapScript_316460051819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319257;
     Object term319591;

    public ReferenceCollectingCallback_hotSwapScript_316460051819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term319257 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term319337 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term319429 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        Object term319729 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setBooleanField(term319429, term319429.getClass(), "inLoop", true);
        setIntField(term319729, term319729.getClass(), "type", 0);
        setField(term319429, term319429.getClass(), "jsRoot", term319729);
        setField(term319337, term319337.getClass(), "phaseOptimizer", term319429);
        setField(term319257, term319257.getClass(), "compiler", term319337);
        term319591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term319683 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term319591, term319591.getClass(), "type", 132);
        setField(term319591, term319591.getClass(), "propListHead", null);
        setIntField(term319683, term319683.getClass(), "type", 0);
        setField(term319683, term319683.getClass(), "parent", term319729);
        setField(term319591, term319591.getClass(), "parent", term319683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term319591;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term319257, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



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

public class ReferenceCollectingCallback_hotSwapScript_316460051477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126588;
     Object term126898;

    public ReferenceCollectingCallback_hotSwapScript_316460051477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126588 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term126668 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term126760 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        term126898 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setBooleanField(term126760, term126760.getClass(), "inLoop", true);
        setIntField(term126898, term126898.getClass(), "type", 0);
        setField(term126898, term126898.getClass(), "parent", null);
        setField(term126760, term126760.getClass(), "jsRoot", term126898);
        setField(term126668, term126668.getClass(), "phaseOptimizer", term126760);
        setField(term126588, term126588.getClass(), "compiler", term126668);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term126898;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term126588, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



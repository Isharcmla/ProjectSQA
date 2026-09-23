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

public class ReferenceCollectingCallback_hotSwapScript_316460051829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term328422;
     Object term328686;

    public ReferenceCollectingCallback_hotSwapScript_316460051829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term328422 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term328502 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term328594 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setBooleanField(term328594, term328594.getClass(), "inLoop", true);
        setField(term328594, term328594.getClass(), "jsRoot", null);
        setField(term328502, term328502.getClass(), "phaseOptimizer", term328594);
        setField(term328422, term328422.getClass(), "compiler", term328502);
        term328686 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term328778 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term328686, term328686.getClass(), "type", 132);
        setField(term328686, term328686.getClass(), "propListHead", null);
        setIntField(term328778, term328778.getClass(), "type", 0);
        setField(term328778, term328778.getClass(), "parent", null);
        setField(term328686, term328686.getClass(), "parent", term328778);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term328686;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term328422, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



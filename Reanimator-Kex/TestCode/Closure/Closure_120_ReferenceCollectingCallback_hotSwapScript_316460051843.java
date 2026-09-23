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

public class ReferenceCollectingCallback_hotSwapScript_316460051843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term335541;
     Object term335897;

    public ReferenceCollectingCallback_hotSwapScript_316460051843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term335541 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term335621 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term335713 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        Object term336035 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setBooleanField(term335713, term335713.getClass(), "inLoop", true);
        setIntField(term336035, term336035.getClass(), "type", 0);
        setField(term335713, term335713.getClass(), "jsRoot", term336035);
        setField(term335621, term335621.getClass(), "phaseOptimizer", term335713);
        setField(term335541, term335541.getClass(), "compiler", term335621);
        term335897 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term335989 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term335897, term335897.getClass(), "type", 132);
        setField(term335897, term335897.getClass(), "propListHead", null);
        setIntField(term335989, term335989.getClass(), "type", 0);
        setField(term335989, term335989.getClass(), "parent", term336035);
        setField(term335897, term335897.getClass(), "parent", term335989);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term335897;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term335541, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



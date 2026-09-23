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

public class ReferenceCollectingCallback_hotSwapScript_316460051807 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309647;
     Object term309981;

    public ReferenceCollectingCallback_hotSwapScript_316460051807() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term309647 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term309727 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term309819 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        Object term309889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setBooleanField(term309819, term309819.getClass(), "inLoop", true);
        setField(term309819, term309819.getClass(), "jsRoot", term309889);
        setField(term309727, term309727.getClass(), "phaseOptimizer", term309819);
        setField(term309647, term309647.getClass(), "compiler", term309727);
        term309981 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term309981, term309981.getClass(), "type", 132);
        setField(term309981, term309981.getClass(), "propListHead", null);
        setField(term309981, term309981.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term309981;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term309647, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



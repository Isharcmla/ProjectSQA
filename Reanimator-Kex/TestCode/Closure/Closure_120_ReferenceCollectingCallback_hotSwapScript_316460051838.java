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

public class ReferenceCollectingCallback_hotSwapScript_316460051838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332457;
     Object term332699;

    public ReferenceCollectingCallback_hotSwapScript_316460051838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term332457 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term332537 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term332629 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setBooleanField(term332629, term332629.getClass(), "inLoop", true);
        setField(term332537, term332537.getClass(), "phaseOptimizer", term332629);
        setField(term332457, term332457.getClass(), "compiler", term332537);
        term332699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term332769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term332699, term332699.getClass(), "type", 0);
        setIntField(term332769, term332769.getClass(), "type", 132);
        setField(term332769, term332769.getClass(), "propListHead", null);
        setField(term332699, term332699.getClass(), "parent", term332769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term332699;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term332457, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



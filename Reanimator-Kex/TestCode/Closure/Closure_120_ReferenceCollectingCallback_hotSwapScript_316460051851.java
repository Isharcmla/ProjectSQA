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

public class ReferenceCollectingCallback_hotSwapScript_316460051851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term342770;
     Object term343104;

    public ReferenceCollectingCallback_hotSwapScript_316460051851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term342770 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term342850 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term342942 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        Object term343012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setBooleanField(term342942, term342942.getClass(), "inLoop", true);
        setField(term342942, term342942.getClass(), "jsRoot", term343012);
        setField(term342850, term342850.getClass(), "phaseOptimizer", term342942);
        setField(term342770, term342770.getClass(), "compiler", term342850);
        term343104 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term343196 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term343266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term343104, term343104.getClass(), "type", 132);
        setField(term343104, term343104.getClass(), "propListHead", null);
        setIntField(term343196, term343196.getClass(), "type", 0);
        setField(term343196, term343196.getClass(), "parent", term343266);
        setField(term343104, term343104.getClass(), "parent", term343196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term343104;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term342770, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



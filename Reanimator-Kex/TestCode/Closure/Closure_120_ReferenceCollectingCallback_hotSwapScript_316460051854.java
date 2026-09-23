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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ReferenceCollectingCallback_hotSwapScript_316460051854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term346853;
     Object term347165;

    public ReferenceCollectingCallback_hotSwapScript_316460051854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term346853 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term346933 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term347025 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        Object term347095 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setBooleanField(term347025, term347025.getClass(), "inLoop", true);
        setField(term347025, term347025.getClass(), "jsRoot", term347095);
        setField(term346933, term346933.getClass(), "phaseOptimizer", term347025);
        setField(term346853, term346853.getClass(), "compiler", term346933);
        term347165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term347257 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term347349 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term347165, term347165.getClass(), "type", 132);
        setField(term347165, term347165.getClass(), "propListHead", null);
        setIntField(term347257, term347257.getClass(), "type", 0);
        setIntField(term347349, term347349.getClass(), "type", 105);
        setField(term347257, term347257.getClass(), "parent", term347349);
        setField(term347165, term347165.getClass(), "parent", term347257);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term347165;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term346853, args);
    }

};



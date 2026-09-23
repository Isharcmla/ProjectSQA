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

public class ReferenceCollectingCallback_hotSwapScript_316460051862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350949;
     Object term351213;

    public ReferenceCollectingCallback_hotSwapScript_316460051862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350949 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term351029 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term351121 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        setBooleanField(term351121, term351121.getClass(), "inLoop", true);
        setField(term351121, term351121.getClass(), "jsRoot", null);
        setField(term351029, term351029.getClass(), "phaseOptimizer", term351121);
        setField(term350949, term350949.getClass(), "compiler", term351029);
        term351213 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term351305 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term351375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term351213, term351213.getClass(), "type", 132);
        setField(term351213, term351213.getClass(), "propListHead", null);
        setIntField(term351305, term351305.getClass(), "type", 0);
        setField(term351305, term351305.getClass(), "parent", term351375);
        setField(term351213, term351213.getClass(), "parent", term351305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term351213;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term350949, args);
    }

};



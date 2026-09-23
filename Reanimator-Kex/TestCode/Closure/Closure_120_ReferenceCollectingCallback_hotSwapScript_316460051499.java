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

public class ReferenceCollectingCallback_hotSwapScript_316460051499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139316;
     Object term139628;

    public ReferenceCollectingCallback_hotSwapScript_316460051499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139316 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object term139396 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term139488 = newInstance(Class.forName("com.google.javascript.jscomp.PhaseOptimizer"));
        Object term139558 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setBooleanField(term139488, term139488.getClass(), "inLoop", true);
        setField(term139488, term139488.getClass(), "jsRoot", term139558);
        setField(term139396, term139396.getClass(), "phaseOptimizer", term139488);
        setField(term139316, term139316.getClass(), "compiler", term139396);
        term139628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term139698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term139628, term139628.getClass(), "type", 132);
        setField(term139628, term139628.getClass(), "propListHead", null);
        setField(term139628, term139628.getClass(), "parent", term139698);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term139628;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term139316, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



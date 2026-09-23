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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class PeepholeOptimizationsPass_endTraversal_19248370819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279;

    public PeepholeOptimizationsPass_endTraversal_19248370819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term284 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState"));
        setBooleanField(term284, term284.getClass(), "changed", false);
        setBooleanField(term284, term284.getClass(), "traverseChildScopes", true);
        ArrayList term282 = new ArrayList();
        ((ArrayList) term282).add(term284);
        term279 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object[] term280 = (Object[]) newArray("com.google.javascript.jscomp.AbstractPeepholeOptimization", 1);
        Object term281 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack"));
        setField(term279, term279.getClass(), "compiler", null);
        setField(term279, term279.getClass(), "peepholeOptimizations", term280);
        setField(term281, term281.getClass(), "states", term282);
        setIntField(term281, term281.getClass(), "currentDepth", 1375330971);
        setField(term279, term279.getClass(), "traversalState", term281);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "endTraversal", argTypes, term279, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



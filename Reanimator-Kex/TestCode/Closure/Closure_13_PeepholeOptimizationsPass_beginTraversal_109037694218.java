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

public class PeepholeOptimizationsPass_beginTraversal_109037694218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268;

    public PeepholeOptimizationsPass_beginTraversal_109037694218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term273 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState"));
        setBooleanField(term273, term273.getClass(), "changed", false);
        setBooleanField(term273, term273.getClass(), "traverseChildScopes", true);
        ArrayList term271 = new ArrayList();
        ((ArrayList) term271).add(term273);
        term268 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object[] term269 = (Object[]) newArray("com.google.javascript.jscomp.AbstractPeepholeOptimization", 7);
        Object term270 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack"));
        setField(term268, term268.getClass(), "compiler", null);
        setField(term268, term268.getClass(), "peepholeOptimizations", term269);
        setField(term270, term270.getClass(), "states", term271);
        setIntField(term270, term270.getClass(), "currentDepth", 1063420942);
        setField(term268, term268.getClass(), "traversalState", term270);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "beginTraversal", argTypes, term268, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class PeepholeOptimizationsPass_getCompiler_15282954411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2;
     Object term336;

    public PeepholeOptimizationsPass_getCompiler_15282954411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState"));
        setBooleanField(term7, term7.getClass(), "changed", false);
        setBooleanField(term7, term7.getClass(), "traverseChildScopes", true);
        ArrayList term5 = new ArrayList();
        ((ArrayList) term5).add(term7);
        term2 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object[] term3 = (Object[]) newArray("com.google.javascript.jscomp.AbstractPeepholeOptimization", 4);
        Object term4 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack"));
        setField(term2, term2.getClass(), "compiler", null);
        setField(term2, term2.getClass(), "peepholeOptimizations", term3);
        setField(term4, term4.getClass(), "states", term5);
        setIntField(term4, term4.getClass(), "currentDepth", 568599855);
        setField(term2, term2.getClass(), "traversalState", term4);
        Object term341 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState"));
        setBooleanField(term341, term341.getClass(), "changed", false);
        setBooleanField(term341, term341.getClass(), "traverseChildScopes", true);
        ArrayList term339 = new ArrayList();
        ((ArrayList) term339).add(term341);
        term336 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object[] term337 = (Object[]) newArray("com.google.javascript.jscomp.AbstractPeepholeOptimization", 4);
        Object term338 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack"));
        setField(term336, term336.getClass(), "compiler", null);
        setField(term336, term336.getClass(), "peepholeOptimizations", term337);
        setField(term338, term338.getClass(), "states", term339);
        setIntField(term338, term338.getClass(), "currentDepth", 568599855);
        setField(term336, term336.getClass(), "traversalState", term338);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCompiler", argTypes, term2, args);
        assertTrue(recursiveEquals(term2, term336));
        assertTrue(recursiveEquals(retValue, null));
    }

};



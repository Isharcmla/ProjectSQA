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

public class PeepholeOptimizationsPass_endTraversal_19248370841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6236;
     Object term44260;

    public PeepholeOptimizationsPass_endTraversal_19248370841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6236 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object[] term6111 = (Object[]) newArray("com.google.javascript.jscomp.AbstractPeepholeOptimization", 0);
        setField(term6236, term6236.getClass(), "peepholeOptimizations", term6111);
        term44260 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object[] term44261 = (Object[]) newArray("com.google.javascript.jscomp.AbstractPeepholeOptimization", 0);
        setField(term44260, term44260.getClass(), "compiler", null);
        setField(term44260, term44260.getClass(), "peepholeOptimizations", term44261);
        setField(term44260, term44260.getClass(), "traversalState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "endTraversal", argTypes, term6236, args);
        assertTrue(recursiveEquals(term6236, term44260));
    }

};



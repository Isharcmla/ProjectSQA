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

public class GlobalNamespace_isGlobalScope_203822180225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5809;
     Object term5883;
     Object term6376;
     Object term6377;

    public GlobalNamespace_isGlobalScope_203822180225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5809 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        term5883 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term5883, term5883.getClass(), "parent", null);
        term6376 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        setField(term6376, term6376.getClass(), "compiler", null);
        setField(term6376, term6376.getClass(), "root", null);
        setField(term6376, term6376.getClass(), "externsRoot", null);
        setBooleanField(term6376, term6376.getClass(), "inExterns", false);
        setField(term6376, term6376.getClass(), "externsScope", null);
        setBooleanField(term6376, term6376.getClass(), "generated", false);
        setField(term6376, term6376.getClass(), "globalNames", null);
        setField(term6376, term6376.getClass(), "nameMap", null);
        term6377 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term6377, term6377.getClass(), "vars", null);
        setField(term6377, term6377.getClass(), "parent", null);
        setField(term6377, term6377.getClass(), "rootNode", null);
        setField(term6377, term6377.getClass(), "thisType", null);
        setBooleanField(term6377, term6377.getClass(), "isBottom", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[1];
        args[0] = term5883;
        Object retValue = callMethod(klass, "isGlobalScope", argTypes, term5809, args);
        assertTrue(recursiveEquals(term5809, term6376));
        assertTrue(recursiveEquals(term5883, term6377));
        assertTrue(recursiveEquals(retValue, true));
    }

};



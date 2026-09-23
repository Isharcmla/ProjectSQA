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

public class InlineFunctions_resolveInlineConflictsForFunction_198685906781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15200;
     Object term15322;
     Object term15613;
     Object term15614;

    public InlineFunctions_resolveInlineConflictsForFunction_198685906781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15200 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        term15322 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions$FunctionState"));
        setField(term15322, term15322.getClass(), "references", null);
        term15613 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        setField(term15613, term15613.getClass(), "fns", null);
        setField(term15613, term15613.getClass(), "anonFns", null);
        setField(term15613, term15613.getClass(), "compiler", null);
        setField(term15613, term15613.getClass(), "injector", null);
        setBooleanField(term15613, term15613.getClass(), "blockFunctionInliningEnabled", false);
        setBooleanField(term15613, term15613.getClass(), "inlineGlobalFunctions", false);
        setBooleanField(term15613, term15613.getClass(), "inlineLocalFunctions", false);
        setField(term15613, term15613.getClass(), "specializationState", null);
        term15614 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions$FunctionState"));
        setField(term15614, term15614.getClass(), "fn", null);
        setField(term15614, term15614.getClass(), "safeFnNode", null);
        setBooleanField(term15614, term15614.getClass(), "inline", false);
        setBooleanField(term15614, term15614.getClass(), "remove", false);
        setBooleanField(term15614, term15614.getClass(), "inlineDirectly", false);
        setBooleanField(term15614, term15614.getClass(), "referencesThis", false);
        setBooleanField(term15614, term15614.getClass(), "hasInnerFunctions", false);
        setField(term15614, term15614.getClass(), "references", null);
        setField(term15614, term15614.getClass(), "module", null);
        setField(term15614, term15614.getClass(), "namesToAlias", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        Object[] args = new Object[1];
        args[0] = term15322;
        callMethod(klass, "resolveInlineConflictsForFunction", argTypes, term15200, args);
        assertTrue(recursiveEquals(term15200, term15613));
        assertTrue(recursiveEquals(term15322, term15614));
    }

};



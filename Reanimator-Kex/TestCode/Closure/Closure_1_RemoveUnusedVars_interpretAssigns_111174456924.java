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

public class RemoveUnusedVars_interpretAssigns_111174456924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term685;

    public RemoveUnusedVars_interpretAssigns_111174456924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term685 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(term685, term685.getClass(), "compiler", null);
        setField(term685, term685.getClass(), "codingConvention", null);
        setBooleanField(term685, term685.getClass(), "removeGlobals", true);
        setBooleanField(term685, term685.getClass(), "preserveFunctionExpressionNames", true);
        setField(term685, term685.getClass(), "referenced", null);
        setField(term685, term685.getClass(), "maybeUnreferenced", null);
        setField(term685, term685.getClass(), "allFunctionScopes", null);
        setField(term685, term685.getClass(), "assignsByVar", null);
        setField(term685, term685.getClass(), "assignsByNode", null);
        setField(term685, term685.getClass(), "classDefiningCalls", null);
        setField(term685, term685.getClass(), "continuations", null);
        setBooleanField(term685, term685.getClass(), "modifyCallSites", false);
        setField(term685, term685.getClass(), "callSiteOptimizer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "interpretAssigns", argTypes, term685, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};

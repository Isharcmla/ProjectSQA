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
     Object term665;

    public RemoveUnusedVars_interpretAssigns_111174456924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term665 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(term665, term665.getClass(), "compiler", null);
        setField(term665, term665.getClass(), "codingConvention", null);
        setBooleanField(term665, term665.getClass(), "removeGlobals", false);
        setBooleanField(term665, term665.getClass(), "preserveFunctionExpressionNames", true);
        setField(term665, term665.getClass(), "referenced", null);
        setField(term665, term665.getClass(), "maybeUnreferenced", null);
        setField(term665, term665.getClass(), "allFunctionScopes", null);
        setField(term665, term665.getClass(), "assignsByVar", null);
        setField(term665, term665.getClass(), "assignsByNode", null);
        setField(term665, term665.getClass(), "inheritsCalls", null);
        setField(term665, term665.getClass(), "continuations", null);
        setBooleanField(term665, term665.getClass(), "modifyCallSites", false);
        setField(term665, term665.getClass(), "callSiteOptimizer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "interpretAssigns", argTypes, term665, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



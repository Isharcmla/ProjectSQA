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
import java.util.ArrayList;

public class RemoveUnusedVars_interpretAssigns_111174456946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9236;
     Object term9885;

    public RemoveUnusedVars_interpretAssigns_111174456946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9288 = new ArrayList();
        term9236 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(term9236, term9236.getClass(), "maybeUnreferenced", term9288);
        ArrayList term9886 = new ArrayList();
        term9885 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(term9885, term9885.getClass(), "compiler", null);
        setField(term9885, term9885.getClass(), "codingConvention", null);
        setBooleanField(term9885, term9885.getClass(), "removeGlobals", false);
        setBooleanField(term9885, term9885.getClass(), "preserveFunctionExpressionNames", false);
        setField(term9885, term9885.getClass(), "referenced", null);
        setField(term9885, term9885.getClass(), "maybeUnreferenced", term9886);
        setField(term9885, term9885.getClass(), "allFunctionScopes", null);
        setField(term9885, term9885.getClass(), "assignsByVar", null);
        setField(term9885, term9885.getClass(), "assignsByNode", null);
        setField(term9885, term9885.getClass(), "inheritsCalls", null);
        setField(term9885, term9885.getClass(), "continuations", null);
        setBooleanField(term9885, term9885.getClass(), "modifyCallSites", false);
        setField(term9885, term9885.getClass(), "callSiteOptimizer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "interpretAssigns", argTypes, term9236, args);
        assertTrue(recursiveEquals(term9236, term9885));
    }

};



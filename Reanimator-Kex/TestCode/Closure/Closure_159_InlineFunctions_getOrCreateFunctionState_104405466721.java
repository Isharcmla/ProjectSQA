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
import java.util.HashMap;

public class InlineFunctions_getOrCreateFunctionState_104405466721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;
     Object term1592;
     Object term1556;

    public InlineFunctions_getOrCreateFunctionState_104405466721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8 = new HashMap();
        HashMap term23 = new HashMap();
        term7 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        setField(term7, term7.getClass(), "fns", term8);
        setField(term7, term7.getClass(), "anonFns", term23);
        setField(term7, term7.getClass(), "compiler", null);
        setField(term7, term7.getClass(), "injector", null);
        setBooleanField(term7, term7.getClass(), "blockFunctionInliningEnabled", false);
        setBooleanField(term7, term7.getClass(), "inlineGlobalFunctions", false);
        setBooleanField(term7, term7.getClass(), "inlineLocalFunctions", false);
        setField(term7, term7.getClass(), "specializationState", null);
        HashMap term1593 = new HashMap();
        HashMap term1598 = new HashMap();
        term1592 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        setField(term1592, term1592.getClass(), "fns", term1593);
        setField(term1592, term1592.getClass(), "anonFns", term1598);
        setField(term1592, term1592.getClass(), "compiler", null);
        setField(term1592, term1592.getClass(), "injector", null);
        setBooleanField(term1592, term1592.getClass(), "blockFunctionInliningEnabled", false);
        setBooleanField(term1592, term1592.getClass(), "inlineGlobalFunctions", false);
        setBooleanField(term1592, term1592.getClass(), "inlineLocalFunctions", false);
        setField(term1592, term1592.getClass(), "specializationState", null);
        term1556 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions$FunctionState"));
        setField(term1556, term1556.getClass(), "fn", null);
        setField(term1556, term1556.getClass(), "safeFnNode", null);
        setBooleanField(term1556, term1556.getClass(), "inline", true);
        setBooleanField(term1556, term1556.getClass(), "remove", true);
        setBooleanField(term1556, term1556.getClass(), "inlineDirectly", false);
        setBooleanField(term1556, term1556.getClass(), "referencesThis", false);
        setBooleanField(term1556, term1556.getClass(), "hasInnerFunctions", false);
        setField(term1556, term1556.getClass(), "references", null);
        setField(term1556, term1556.getClass(), "module", null);
        setField(term1556, term1556.getClass(), "namesToAlias", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MjGYSRKTNF";
        Object retValue = callMethod(klass, "getOrCreateFunctionState", argTypes, term7, args);
        assertTrue(recursiveEquals(term7, term1592));
        assertTrue(recursiveEquals(retValue, term1556));
    }

};



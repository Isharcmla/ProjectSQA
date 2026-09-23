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

public class FunctionInjector_inliningLowersCost_101369078668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10285;
     Object term10337;
     Object term14205;
     Object term14206;

    public FunctionInjector_inliningLowersCost_101369078668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10285 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector"));
        term10337 = new ArrayList();
        term14205 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector"));
        setField(term14205, term14205.getClass(), "compiler", null);
        setField(term14205, term14205.getClass(), "safeNameIdSupplier", null);
        setBooleanField(term14205, term14205.getClass(), "allowDecomposition", false);
        setField(term14205, term14205.getClass(), "knownConstants", null);
        setBooleanField(term14205, term14205.getClass(), "assumeStrictThis", false);
        setBooleanField(term14205, term14205.getClass(), "assumeMinimumCapture", false);
        term14206 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSModule");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.util.Collection");
        argTypes[3] = Class.forName("java.util.Set");
        argTypes[4] = boolean.class;
        argTypes[5] = boolean.class;
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = term10337;
        args[3] = null;
        args[4] = false;
        args[5] = false;
        Object retValue = callMethod(klass, "inliningLowersCost", argTypes, term10285, args);
        assertTrue(recursiveEquals(term10285, term14205));
        assertTrue(recursiveEquals(term10337, term14206));
        assertTrue(recursiveEquals(retValue, true));
    }

};



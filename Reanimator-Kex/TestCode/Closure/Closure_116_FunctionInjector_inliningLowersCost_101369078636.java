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
import java.lang.Boolean;

public class FunctionInjector_inliningLowersCost_101369078636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1810;
     Object term1814;
     Object term1816;

    public FunctionInjector_inliningLowersCost_101369078636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1810 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector"));
        setField(term1810, term1810.getClass(), "compiler", null);
        setField(term1810, term1810.getClass(), "safeNameIdSupplier", null);
        setBooleanField(term1810, term1810.getClass(), "allowDecomposition", false);
        setField(term1810, term1810.getClass(), "knownConstants", null);
        setBooleanField(term1810, term1810.getClass(), "assumeStrictThis", false);
        setBooleanField(term1810, term1810.getClass(), "assumeMinimumCapture", false);
        term1814 = new Boolean(false);
        term1816 = new Boolean(false);
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
        args[2] = null;
        args[3] = null;
        args[4] = term1814;
        args[5] = term1816;
        try {
            callMethod(klass, "inliningLowersCost", argTypes, term1810, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



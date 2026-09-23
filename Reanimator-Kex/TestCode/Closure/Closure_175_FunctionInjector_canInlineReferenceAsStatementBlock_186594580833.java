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

public class FunctionInjector_canInlineReferenceAsStatementBlock_186594580833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1546;

    public FunctionInjector_canInlineReferenceAsStatementBlock_186594580833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1546 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector"));
        setField(term1546, term1546.getClass(), "compiler", null);
        setBooleanField(term1546, term1546.getClass(), "allowDecomposition", false);
        setField(term1546, term1546.getClass(), "knownConstants", null);
        setBooleanField(term1546, term1546.getClass(), "assumeStrictThis", false);
        setBooleanField(term1546, term1546.getClass(), "assumeMinimumCapture", false);
        setField(term1546, term1546.getClass(), "safeNameIdSupplier", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("java.util.Set");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        try {
            callMethod(klass, "canInlineReferenceAsStatementBlock", argTypes, term1546, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



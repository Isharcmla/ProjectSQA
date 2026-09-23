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

public class FunctionInjector_canInlineReferenceToFunction_177899829724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term605;
     Object term609;
     Object term611;

    public FunctionInjector_canInlineReferenceToFunction_177899829724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term605 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector"));
        setField(term605, term605.getClass(), "compiler", null);
        setBooleanField(term605, term605.getClass(), "allowDecomposition", false);
        setField(term605, term605.getClass(), "knownConstants", null);
        setBooleanField(term605, term605.getClass(), "assumeStrictThis", false);
        setBooleanField(term605, term605.getClass(), "assumeMinimumCapture", false);
        setField(term605, term605.getClass(), "safeNameIdSupplier", null);
        term609 = new Boolean(false);
        term611 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("java.util.Set");
        argTypes[4] = Class.forName("com.google.javascript.jscomp.FunctionInjector$InliningMode");
        argTypes[5] = boolean.class;
        argTypes[6] = boolean.class;
        Object[] args = new Object[7];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = term609;
        args[6] = term611;
        try {
            callMethod(klass, "canInlineReferenceToFunction", argTypes, term605, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



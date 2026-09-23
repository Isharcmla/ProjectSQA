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

public class FunctionInjector_callMeetsBlockInliningRequirements_73360858434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1730;

    public FunctionInjector_callMeetsBlockInliningRequirements_73360858434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1730 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector"));
        setField(term1730, term1730.getClass(), "compiler", null);
        setField(term1730, term1730.getClass(), "safeNameIdSupplier", null);
        setBooleanField(term1730, term1730.getClass(), "allowDecomposition", false);
        setField(term1730, term1730.getClass(), "knownConstants", null);
        setBooleanField(term1730, term1730.getClass(), "assumeStrictThis", false);
        setBooleanField(term1730, term1730.getClass(), "assumeMinimumCapture", false);
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
            callMethod(klass, "callMeetsBlockInliningRequirements", argTypes, term1730, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



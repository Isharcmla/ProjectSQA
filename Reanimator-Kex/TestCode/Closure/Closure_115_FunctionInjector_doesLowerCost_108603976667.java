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

public class FunctionInjector_doesLowerCost_108603976667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10178;
     Object term14191;

    public FunctionInjector_doesLowerCost_108603976667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10178 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector"));
        term14191 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector"));
        setField(term14191, term14191.getClass(), "compiler", null);
        setField(term14191, term14191.getClass(), "safeNameIdSupplier", null);
        setBooleanField(term14191, term14191.getClass(), "allowDecomposition", false);
        setField(term14191, term14191.getClass(), "knownConstants", null);
        setBooleanField(term14191, term14191.getClass(), "assumeStrictThis", false);
        setBooleanField(term14191, term14191.getClass(), "assumeMinimumCapture", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = boolean.class;
        Object[] args = new Object[7];
        args[0] = null;
        args[1] = 0;
        args[2] = 1;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = true;
        Object retValue = callMethod(klass, "doesLowerCost", argTypes, term10178, args);
        assertTrue(recursiveEquals(term10178, term14191));
        assertTrue(recursiveEquals(retValue, true));
    }

};



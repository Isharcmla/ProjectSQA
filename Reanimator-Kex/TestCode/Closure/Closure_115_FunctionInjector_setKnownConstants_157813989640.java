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
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FunctionInjector_setKnownConstants_157813989640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2284;
     Object term2309;
     Object term8379;
     Object term8382;

    public FunctionInjector_setKnownConstants_157813989640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2287 = new HashMap();
        Set<Object> term8384 =  ((Map) term2287).keySet();
        HashSet term2286 = new HashSet((Collection<? extends Object>) term8384);
        term2284 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector"));
        setField(term2284, term2284.getClass(), "compiler", null);
        setField(term2284, term2284.getClass(), "safeNameIdSupplier", null);
        setBooleanField(term2284, term2284.getClass(), "allowDecomposition", false);
        setField(term2284, term2284.getClass(), "knownConstants", term2286);
        setBooleanField(term2284, term2284.getClass(), "assumeStrictThis", true);
        setBooleanField(term2284, term2284.getClass(), "assumeMinimumCapture", false);
        HashMap term2310 = new HashMap();
        Set<Object> term8385 =  ((Map) term2310).keySet();
        term2309 = new HashSet((Collection<? extends Object>) term8385);
        HashMap term8381 = new HashMap();
        Set<Object> term8386 =  ((Map) term8381).keySet();
        HashSet term8380 = new HashSet((Collection<? extends Object>) term8386);
        term8379 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector"));
        setField(term8379, term8379.getClass(), "compiler", null);
        setField(term8379, term8379.getClass(), "safeNameIdSupplier", null);
        setBooleanField(term8379, term8379.getClass(), "allowDecomposition", false);
        setField(term8379, term8379.getClass(), "knownConstants", term8380);
        setBooleanField(term8379, term8379.getClass(), "assumeStrictThis", true);
        setBooleanField(term8379, term8379.getClass(), "assumeMinimumCapture", false);
        HashMap term8383 = new HashMap();
        Set<Object> term8387 =  ((Map) term8383).keySet();
        term8382 = new HashSet((Collection<? extends Object>) term8387);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term2309;
        callMethod(klass, "setKnownConstants", argTypes, term2284, args);
        assertTrue(recursiveEquals(term2284, term8379));
        assertTrue(recursiveEquals(term2309, term8382));
    }

};



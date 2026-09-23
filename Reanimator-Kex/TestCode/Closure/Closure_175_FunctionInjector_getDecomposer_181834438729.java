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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FunctionInjector_getDecomposer_181834438729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1203;

    public FunctionInjector_getDecomposer_181834438729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1206 = new HashMap();
        Set<Object> term5050 =  ((Map) term1206).keySet();
        HashSet term1205 = new HashSet((Collection<? extends Object>) term5050);
        term1203 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector"));
        setField(term1203, term1203.getClass(), "compiler", null);
        setBooleanField(term1203, term1203.getClass(), "allowDecomposition", true);
        setField(term1203, term1203.getClass(), "knownConstants", term1205);
        setBooleanField(term1203, term1203.getClass(), "assumeStrictThis", true);
        setBooleanField(term1203, term1203.getClass(), "assumeMinimumCapture", false);
        setField(term1203, term1203.getClass(), "safeNameIdSupplier", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getDecomposer", argTypes, term1203, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



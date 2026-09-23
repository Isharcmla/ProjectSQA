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

public class InlineFunctions_decomposeExpressions_13639624837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term993;
     Object term1024;

    public InlineFunctions_decomposeExpressions_13639624837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term994 = new HashMap();
        HashMap term1009 = new HashMap();
        term993 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        setField(term993, term993.getClass(), "fns", term994);
        setField(term993, term993.getClass(), "anonFns", term1009);
        setField(term993, term993.getClass(), "compiler", null);
        setField(term993, term993.getClass(), "injector", null);
        setBooleanField(term993, term993.getClass(), "blockFunctionInliningEnabled", false);
        setBooleanField(term993, term993.getClass(), "inlineGlobalFunctions", false);
        setBooleanField(term993, term993.getClass(), "inlineLocalFunctions", false);
        setField(term993, term993.getClass(), "specializationState", null);
        HashMap term1025 = new HashMap();
        Set<Object> term4534 =  ((Map) term1025).keySet();
        term1024 = new HashSet((Collection<? extends Object>) term4534);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term1024;
        try {
            callMethod(klass, "decomposeExpressions", argTypes, term993, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



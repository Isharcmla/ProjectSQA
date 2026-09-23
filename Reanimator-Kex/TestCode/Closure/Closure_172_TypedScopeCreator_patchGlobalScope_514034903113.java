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

public class TypedScopeCreator_patchGlobalScope_514034903113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47180;
     Object term47254;
     Object term47346;

    public TypedScopeCreator_patchGlobalScope_514034903113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47180 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        term47254 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        term47346 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term47346, term47346.getClass(), "type", 132);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term47254;
        args[1] = term47346;
        try {
            callMethod(klass, "patchGlobalScope", argTypes, term47180, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



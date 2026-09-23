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

public class TypedScopeCreator_patchGlobalScope_514034903120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52806;
     Object term52880;
     Object term52950;

    public TypedScopeCreator_patchGlobalScope_514034903120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52806 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        term52880 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term52880, term52880.getClass(), "parent", null);
        term52950 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term52950, term52950.getClass(), "type", 132);
        setField(term52950, term52950.getClass(), "propListHead", null);
        setField(term52950, term52950.getClass(), "parent", term52950);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term52880;
        args[1] = term52950;
        callMethod(klass, "patchGlobalScope", argTypes, term52806, args);
    }

};



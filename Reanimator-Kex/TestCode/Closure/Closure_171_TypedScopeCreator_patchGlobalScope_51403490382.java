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

public class TypedScopeCreator_patchGlobalScope_51403490382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33683;
     Object term33757;
     Object term33827;

    public TypedScopeCreator_patchGlobalScope_51403490382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33683 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        term33757 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term33757, term33757.getClass(), "parent", null);
        term33827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33827, term33827.getClass(), "type", 132);
        setField(term33827, term33827.getClass(), "propListHead", null);
        setField(term33827, term33827.getClass(), "parent", term33827);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term33757;
        args[1] = term33827;
        callMethod(klass, "patchGlobalScope", argTypes, term33683, args);
    }

};



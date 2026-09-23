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

public class TypedScopeCreator_patchGlobalScope_51403490397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38241;
     Object term38315;
     Object term38385;

    public TypedScopeCreator_patchGlobalScope_51403490397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38241 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        term38315 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        term38385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38385, term38385.getClass(), "type", 132);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term38315;
        args[1] = term38385;
        try {
            callMethod(klass, "patchGlobalScope", argTypes, term38241, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



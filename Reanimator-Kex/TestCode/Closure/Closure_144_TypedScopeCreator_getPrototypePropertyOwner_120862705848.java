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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypedScopeCreator_getPrototypePropertyOwner_120862705848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22123;

    public TypedScopeCreator_getPrototypePropertyOwner_120862705848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22123 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term22213 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term22303 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term22123, term22123.getClass(), "type", 33);
        setIntField(term22213, term22213.getClass(), "type", 33);
        setField(term22213, term22213.getClass(), "last", term22303);
        setField(term22123, term22123.getClass(), "first", term22213);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term22123;
        try {
            callMethod(klass, "getPrototypePropertyOwner", argTypes, null, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};



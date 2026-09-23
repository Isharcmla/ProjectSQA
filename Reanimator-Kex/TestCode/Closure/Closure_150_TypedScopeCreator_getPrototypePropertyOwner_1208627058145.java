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

public class TypedScopeCreator_getPrototypePropertyOwner_1208627058145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92679;

    public TypedScopeCreator_getPrototypePropertyOwner_1208627058145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92679 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term92765 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term92857 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term92679, term92679.getClass(), "type", 33);
        setIntField(term92765, term92765.getClass(), "type", 33);
        setField(term92765, term92765.getClass(), "last", term92857);
        setField(term92679, term92679.getClass(), "first", term92765);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term92679;
        try {
            callMethod(klass, "getPrototypePropertyOwner", argTypes, null, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};



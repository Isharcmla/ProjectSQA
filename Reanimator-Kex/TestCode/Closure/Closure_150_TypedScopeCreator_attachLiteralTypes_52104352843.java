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
import java.lang.Object;

public class TypedScopeCreator_attachLiteralTypes_52104352843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21749;
     Object term21923;

    public TypedScopeCreator_attachLiteralTypes_52104352843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21749 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term21853 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term21749, term21749.getClass(), "typeRegistry", term21853);
        term21923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21923, term21923.getClass(), "type", 64);
        setField(term21923, term21923.getClass(), "jsType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term21923;
        try {
            callMethod(klass, "attachLiteralTypes", argTypes, term21749, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



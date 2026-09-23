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

public class TypedScopeCreator_createScope_265732215104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65865;
     Object term65935;
     Object term66247;

    public TypedScopeCreator_createScope_265732215104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65865 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term65865, term65865.getClass(), "compiler", null);
        term65935 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66173 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term65935, term65935.getClass(), "jsType", null);
        setIntField(term65935, term65935.getClass(), "type", 0);
        setField(term66075, term66075.getClass(), "next", null);
        setIntField(term66075, term66075.getClass(), "type", 64);
        setField(term66075, term66075.getClass(), "first", null);
        setField(term66005, term66005.getClass(), "next", term66075);
        setIntField(term66005, term66005.getClass(), "type", 64);
        setField(term66005, term66005.getClass(), "first", null);
        setField(term66005, term66005.getClass(), "jsType", term66173);
        setField(term65935, term65935.getClass(), "first", term66005);
        term66247 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term66317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66417 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term66247, term66247.getClass(), "rootNode", term66317);
        setField(term66247, term66247.getClass(), "thisType", term66417);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term65935;
        args[1] = term66247;
        try {
            callMethod(klass, "createScope", argTypes, term65865, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



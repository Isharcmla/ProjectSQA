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
import java.lang.Object;

public class TypedScopeCreator_createScope_26573221586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65013;
     Object term65163;
     Object term65237;

    public TypedScopeCreator_createScope_26573221586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65013 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term65093 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term65013, term65013.getClass(), "compiler", term65093);
        term65163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term65163, term65163.getClass(), "jsType", null);
        setIntField(term65163, term65163.getClass(), "type", 0);
        setField(term65163, term65163.getClass(), "parent", null);
        setField(term65163, term65163.getClass(), "first", null);
        term65237 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term65237, term65237.getClass(), "rootNode", null);
        setField(term65237, term65237.getClass(), "thisType", null);
        setIntField(term65237, term65237.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term65163;
        args[1] = term65237;
        callMethod(klass, "createScope", argTypes, term65013, args);
    }

};



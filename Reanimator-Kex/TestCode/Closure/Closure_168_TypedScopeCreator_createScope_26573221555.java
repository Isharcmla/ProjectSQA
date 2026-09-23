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

public class TypedScopeCreator_createScope_26573221555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29058;
     Object term29128;
     Object term29412;

    public TypedScopeCreator_createScope_26573221555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29058 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term29058, term29058.getClass(), "compiler", null);
        term29128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29517 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term29128, term29128.getClass(), "jsType", null);
        setIntField(term29128, term29128.getClass(), "type", 0);
        setField(term29128, term29128.getClass(), "parent", null);
        setField(term29447, term29447.getClass(), "next", term29482);
        setIntField(term29447, term29447.getClass(), "type", 39);
        setField(term29517, term29517.getClass(), "next", null);
        setIntField(term29517, term29517.getClass(), "type", 0);
        setField(term29517, term29517.getClass(), "first", null);
        setField(term29517, term29517.getClass(), "parent", null);
        setField(term29447, term29447.getClass(), "first", term29517);
        setField(term29128, term29128.getClass(), "first", term29447);
        term29412 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term29617 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term29412, term29412.getClass(), "rootNode", term29447);
        setField(term29412, term29412.getClass(), "thisType", term29617);
        setIntField(term29412, term29412.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term29128;
        args[1] = term29412;
        try {
            callMethod(klass, "createScope", argTypes, term29058, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



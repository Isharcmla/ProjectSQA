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

public class TypedScopeCreator_createScope_26573221549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21506;
     Object term21576;
     Object term21790;

    public TypedScopeCreator_createScope_26573221549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21506 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term21506, term21506.getClass(), "compiler", null);
        term21576 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21646 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term21576, term21576.getClass(), "jsType", null);
        setIntField(term21576, term21576.getClass(), "type", 0);
        setField(term21576, term21576.getClass(), "parent", null);
        setField(term21646, term21646.getClass(), "next", null);
        setIntField(term21646, term21646.getClass(), "type", 37);
        setField(term21716, term21716.getClass(), "next", null);
        setIntField(term21716, term21716.getClass(), "type", 0);
        setField(term21716, term21716.getClass(), "first", null);
        setField(term21716, term21716.getClass(), "parent", null);
        setField(term21646, term21646.getClass(), "first", term21716);
        setField(term21576, term21576.getClass(), "first", term21646);
        term21790 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term21860 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term21790, term21790.getClass(), "rootNode", term21860);
        setField(term21790, term21790.getClass(), "thisType", null);
        setIntField(term21790, term21790.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term21576;
        args[1] = term21790;
        try {
            callMethod(klass, "createScope", argTypes, term21506, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



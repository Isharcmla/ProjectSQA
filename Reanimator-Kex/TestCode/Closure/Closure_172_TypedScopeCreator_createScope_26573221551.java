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

public class TypedScopeCreator_createScope_26573221551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17858;
     Object term17932;

    public TypedScopeCreator_createScope_26573221551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17858 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term17858, term17858.getClass(), "compiler", null);
        term17932 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term18002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term17932, term17932.getClass(), "rootNode", term18002);
        setIntField(term17932, term17932.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term17932;
        callMethod(klass, "createScope", argTypes, term17858, args);
    }

};



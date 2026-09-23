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

public class TypedScopeCreator_createScope_26573221544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17331;
     Object term17481;
     Object term17695;

    public TypedScopeCreator_createScope_26573221544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17331 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term17411 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term17331, term17331.getClass(), "compiler", term17411);
        term17481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term17481, term17481.getClass(), "jsType", null);
        setIntField(term17481, term17481.getClass(), "type", 0);
        setField(term17481, term17481.getClass(), "parent", null);
        setField(term17551, term17551.getClass(), "next", term17621);
        setIntField(term17551, term17551.getClass(), "type", 33);
        setField(term17551, term17551.getClass(), "first", null);
        setField(term17481, term17481.getClass(), "first", term17551);
        term17695 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term17695, term17695.getClass(), "rootNode", null);
        setField(term17695, term17695.getClass(), "thisType", null);
        setIntField(term17695, term17695.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term17481;
        args[1] = term17695;
        callMethod(klass, "createScope", argTypes, term17331, args);
    }

};



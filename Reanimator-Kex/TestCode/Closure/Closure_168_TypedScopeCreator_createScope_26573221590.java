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

public class TypedScopeCreator_createScope_26573221590 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55450;
     Object term55600;
     Object term55674;

    public TypedScopeCreator_createScope_26573221590() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55450 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term55530 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term55450, term55450.getClass(), "compiler", term55530);
        term55600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term55600, term55600.getClass(), "jsType", null);
        setIntField(term55600, term55600.getClass(), "type", 126);
        setField(term55600, term55600.getClass(), "parent", null);
        setField(term55600, term55600.getClass(), "first", null);
        term55674 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term55744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term55674, term55674.getClass(), "rootNode", term55744);
        setField(term55674, term55674.getClass(), "thisType", null);
        setIntField(term55674, term55674.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term55600;
        args[1] = term55674;
        callMethod(klass, "createScope", argTypes, term55450, args);
    }

};



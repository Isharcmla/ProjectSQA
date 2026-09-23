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

public class TypedScopeCreator_createScope_26573221585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52204;
     Object term52354;
     Object term52498;

    public TypedScopeCreator_createScope_26573221585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52204 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term52284 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term52204, term52204.getClass(), "compiler", term52284);
        term52354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term52354, term52354.getClass(), "jsType", null);
        setIntField(term52354, term52354.getClass(), "type", 0);
        setField(term52354, term52354.getClass(), "parent", null);
        setField(term52424, term52424.getClass(), "next", term52354);
        setIntField(term52424, term52424.getClass(), "type", 0);
        setField(term52424, term52424.getClass(), "first", null);
        setField(term52354, term52354.getClass(), "first", term52424);
        term52498 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term52568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52668 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term52498, term52498.getClass(), "rootNode", term52568);
        setField(term52498, term52498.getClass(), "thisType", term52668);
        setIntField(term52498, term52498.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term52354;
        args[1] = term52498;
        callMethod(klass, "createScope", argTypes, term52204, args);
    }

};



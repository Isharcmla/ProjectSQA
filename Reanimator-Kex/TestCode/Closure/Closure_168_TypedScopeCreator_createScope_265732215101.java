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
import java.util.HashMap;

public class TypedScopeCreator_createScope_265732215101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63134;
     Object term63332;

    public TypedScopeCreator_createScope_265732215101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term63262 = new HashMap();
        term63134 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term63214 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term63134, term63134.getClass(), "compiler", term63214);
        setField(term63134, term63134.getClass(), "functionAnalysisResults", term63262);
        term63332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term63332, term63332.getClass(), "first", null);
        setField(term63332, term63332.getClass(), "last", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term63332;
        args[1] = null;
        callMethod(klass, "createScope", argTypes, term63134, args);
    }

};



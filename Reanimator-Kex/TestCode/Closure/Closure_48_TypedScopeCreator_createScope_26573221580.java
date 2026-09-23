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

public class TypedScopeCreator_createScope_26573221580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46508;
     Object term46658;
     Object term46802;

    public TypedScopeCreator_createScope_26573221580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46508 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term46588 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term46508, term46508.getClass(), "compiler", term46588);
        term46658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term46658, term46658.getClass(), "jsType", null);
        setIntField(term46658, term46658.getClass(), "type", 0);
        setField(term46658, term46658.getClass(), "parent", null);
        setField(term46728, term46728.getClass(), "next", null);
        setIntField(term46728, term46728.getClass(), "type", 126);
        setField(term46728, term46728.getClass(), "first", null);
        setField(term46658, term46658.getClass(), "first", term46728);
        term46802 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term46912 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term46802, term46802.getClass(), "rootNode", null);
        setField(term46802, term46802.getClass(), "thisType", term46912);
        setIntField(term46802, term46802.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term46658;
        args[1] = term46802;
        callMethod(klass, "createScope", argTypes, term46508, args);
    }

};



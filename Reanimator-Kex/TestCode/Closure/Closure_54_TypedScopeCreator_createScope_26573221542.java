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

public class TypedScopeCreator_createScope_26573221542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16273;
     Object term16343;
     Object term16417;

    public TypedScopeCreator_createScope_26573221542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16273 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term16273, term16273.getClass(), "compiler", null);
        term16343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term16343, term16343.getClass(), "jsType", null);
        setIntField(term16343, term16343.getClass(), "type", 126);
        setField(term16343, term16343.getClass(), "parent", null);
        term16417 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term16487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16597 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term16417, term16417.getClass(), "rootNode", term16487);
        setField(term16417, term16417.getClass(), "thisType", term16597);
        setIntField(term16417, term16417.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term16343;
        args[1] = term16417;
        callMethod(klass, "createScope", argTypes, term16273, args);
    }

};



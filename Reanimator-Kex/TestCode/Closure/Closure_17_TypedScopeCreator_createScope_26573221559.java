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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypedScopeCreator_createScope_26573221559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32668;
     Object term32818;
     Object term33102;

    public TypedScopeCreator_createScope_26573221559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32668 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term32748 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term32668, term32668.getClass(), "compiler", term32748);
        term32818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32888 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term32818, term32818.getClass(), "jsType", null);
        setIntField(term32818, term32818.getClass(), "type", 0);
        setField(term32818, term32818.getClass(), "parent", null);
        setField(term32888, term32888.getClass(), "next", term32958);
        setIntField(term32888, term32888.getClass(), "type", 0);
        setField(term33028, term33028.getClass(), "next", null);
        setIntField(term33028, term33028.getClass(), "type", 44);
        setField(term33028, term33028.getClass(), "first", null);
        setField(term32888, term32888.getClass(), "first", term33028);
        setField(term32818, term32818.getClass(), "first", term32888);
        term33102 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term33172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term33102, term33102.getClass(), "rootNode", term33172);
        setField(term33102, term33102.getClass(), "thisType", null);
        setIntField(term33102, term33102.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term32818;
        args[1] = term33102;
        try {
            callMethod(klass, "createScope", argTypes, term32668, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



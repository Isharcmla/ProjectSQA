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

public class TypedScopeCreator_createScope_26573221558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31202;
     Object term31272;
     Object term31556;

    public TypedScopeCreator_createScope_26573221558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31202 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term31202, term31202.getClass(), "compiler", null);
        term31272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term31272, term31272.getClass(), "jsType", null);
        setIntField(term31272, term31272.getClass(), "type", 0);
        setField(term31272, term31272.getClass(), "parent", null);
        setField(term31412, term31412.getClass(), "next", null);
        setIntField(term31412, term31412.getClass(), "type", 33);
        setField(term31412, term31412.getClass(), "first", null);
        setField(term31412, term31412.getClass(), "parent", null);
        setField(term31342, term31342.getClass(), "next", term31412);
        setIntField(term31342, term31342.getClass(), "type", 0);
        setField(term31482, term31482.getClass(), "next", null);
        setIntField(term31482, term31482.getClass(), "type", 0);
        setField(term31482, term31482.getClass(), "first", null);
        setField(term31482, term31482.getClass(), "parent", null);
        setField(term31342, term31342.getClass(), "first", term31482);
        setField(term31342, term31342.getClass(), "parent", null);
        setField(term31272, term31272.getClass(), "first", term31342);
        term31556 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term31666 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term31556, term31556.getClass(), "rootNode", null);
        setField(term31556, term31556.getClass(), "thisType", term31666);
        setIntField(term31556, term31556.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term31272;
        args[1] = term31556;
        try {
            callMethod(klass, "createScope", argTypes, term31202, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



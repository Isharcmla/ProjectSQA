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

public class TypedScopeCreator_createScope_26573221595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61383;
     Object term61533;
     Object term61817;

    public TypedScopeCreator_createScope_26573221595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61383 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term61463 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term61383, term61383.getClass(), "compiler", term61463);
        term61533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term61533, term61533.getClass(), "jsType", null);
        setIntField(term61533, term61533.getClass(), "type", 0);
        setField(term61533, term61533.getClass(), "parent", null);
        setField(term61673, term61673.getClass(), "next", null);
        setIntField(term61673, term61673.getClass(), "type", 83);
        setField(term61673, term61673.getClass(), "first", null);
        setField(term61603, term61603.getClass(), "next", term61673);
        setIntField(term61603, term61603.getClass(), "type", 0);
        setField(term61743, term61743.getClass(), "next", null);
        setIntField(term61743, term61743.getClass(), "type", 0);
        setField(term61743, term61743.getClass(), "first", null);
        setField(term61603, term61603.getClass(), "first", term61743);
        setField(term61533, term61533.getClass(), "first", term61603);
        term61817 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term61929 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term61817, term61817.getClass(), "rootNode", null);
        setField(term61817, term61817.getClass(), "thisType", term61929);
        setIntField(term61817, term61817.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term61533;
        args[1] = term61817;
        try {
            callMethod(klass, "createScope", argTypes, term61383, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



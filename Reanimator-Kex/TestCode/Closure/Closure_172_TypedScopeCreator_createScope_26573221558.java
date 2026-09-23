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

public class TypedScopeCreator_createScope_26573221558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22481;
     Object term22573;
     Object term22647;

    public TypedScopeCreator_createScope_26573221558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22481 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term22481, term22481.getClass(), "compiler", null);
        term22573 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term22647 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term22717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term22647, term22647.getClass(), "rootNode", term22717);
        setIntField(term22647, term22647.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term22573;
        args[1] = term22647;
        callMethod(klass, "createScope", argTypes, term22481, args);
    }

};



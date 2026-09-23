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

public class TypedScopeCreator_createScope_265732215141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105686;
     Object term105756;
     Object term105900;

    public TypedScopeCreator_createScope_265732215141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105686 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term105686, term105686.getClass(), "compiler", null);
        term105756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term105826 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term105756, term105756.getClass(), "jsType", null);
        setIntField(term105756, term105756.getClass(), "type", 0);
        setField(term105756, term105756.getClass(), "parent", null);
        setField(term105826, term105826.getClass(), "next", null);
        setIntField(term105826, term105826.getClass(), "type", 83);
        setField(term105826, term105826.getClass(), "first", null);
        setField(term105756, term105756.getClass(), "first", term105826);
        term105900 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term105900, term105900.getClass(), "rootNode", null);
        setField(term105900, term105900.getClass(), "thisType", null);
        setIntField(term105900, term105900.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term105756;
        args[1] = term105900;
        callMethod(klass, "createScope", argTypes, term105686, args);
    }

};



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

public class TypedScopeCreator_createScope_26573221582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49603;
     Object term49753;
     Object term50037;

    public TypedScopeCreator_createScope_26573221582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49603 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term49683 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term49603, term49603.getClass(), "compiler", term49683);
        term49753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term49753, term49753.getClass(), "jsType", null);
        setIntField(term49753, term49753.getClass(), "type", 0);
        setField(term49753, term49753.getClass(), "parent", null);
        setField(term49893, term49893.getClass(), "next", null);
        setIntField(term49893, term49893.getClass(), "type", 0);
        setField(term49893, term49893.getClass(), "first", null);
        setField(term49823, term49823.getClass(), "next", term49893);
        setIntField(term49823, term49823.getClass(), "type", 0);
        setField(term49963, term49963.getClass(), "next", null);
        setIntField(term49963, term49963.getClass(), "type", 0);
        setField(term49963, term49963.getClass(), "first", null);
        setField(term49823, term49823.getClass(), "first", term49963);
        setField(term49753, term49753.getClass(), "first", term49823);
        term50037 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term50107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50207 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term50037, term50037.getClass(), "rootNode", term50107);
        setField(term50037, term50037.getClass(), "thisType", term50207);
        setIntField(term50037, term50037.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term49753;
        args[1] = term50037;
        try {
            callMethod(klass, "createScope", argTypes, term49603, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



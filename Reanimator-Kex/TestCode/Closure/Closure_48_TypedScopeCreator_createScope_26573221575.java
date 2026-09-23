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

public class TypedScopeCreator_createScope_26573221575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40551;
     Object term40621;
     Object term40835;

    public TypedScopeCreator_createScope_26573221575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40551 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term40551, term40551.getClass(), "compiler", null);
        term40621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term40621, term40621.getClass(), "jsType", null);
        setIntField(term40621, term40621.getClass(), "type", 0);
        setField(term40621, term40621.getClass(), "parent", null);
        setField(term40691, term40691.getClass(), "next", null);
        setIntField(term40691, term40691.getClass(), "type", 122);
        setField(term40761, term40761.getClass(), "next", null);
        setIntField(term40761, term40761.getClass(), "type", 0);
        setField(term40761, term40761.getClass(), "first", null);
        setField(term40691, term40691.getClass(), "first", term40761);
        setField(term40621, term40621.getClass(), "first", term40691);
        term40835 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term40959 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term40835, term40835.getClass(), "rootNode", null);
        setField(term40835, term40835.getClass(), "thisType", term40959);
        setIntField(term40835, term40835.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term40621;
        args[1] = term40835;
        try {
            callMethod(klass, "createScope", argTypes, term40551, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



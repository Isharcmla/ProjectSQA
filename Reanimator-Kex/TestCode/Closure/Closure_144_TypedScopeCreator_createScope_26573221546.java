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

public class TypedScopeCreator_createScope_26573221546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21537;
     Object term21629;
     Object term21795;

    public TypedScopeCreator_createScope_26573221546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21537 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term21537, term21537.getClass(), "compiler", null);
        term21629 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term21721 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term21629, term21629.getClass(), "jsType", null);
        setIntField(term21629, term21629.getClass(), "type", 0);
        setField(term21629, term21629.getClass(), "first", term21721);
        term21795 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term21887 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term22011 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term21795, term21795.getClass(), "rootNode", term21887);
        setField(term21795, term21795.getClass(), "thisType", term22011);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term21629;
        args[1] = term21795;
        try {
            callMethod(klass, "createScope", argTypes, term21537, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



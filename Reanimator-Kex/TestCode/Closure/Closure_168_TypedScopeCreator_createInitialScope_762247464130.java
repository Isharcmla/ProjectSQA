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

public class TypedScopeCreator_createInitialScope_762247464130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79885;
     Object term80081;

    public TypedScopeCreator_createInitialScope_762247464130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79885 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term79989 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term79885, term79885.getClass(), "compiler", null);
        setField(term79885, term79885.getClass(), "typeRegistry", term79989);
        term80081 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term80151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80243 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term80081, term80081.getClass(), "type", 77);
        setField(term80081, term80081.getClass(), "parent", null);
        setField(term80151, term80151.getClass(), "next", term80243);
        setIntField(term80151, term80151.getClass(), "type", 0);
        setField(term80151, term80151.getClass(), "first", null);
        setField(term80081, term80081.getClass(), "first", term80151);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term80081;
        callMethod(klass, "createInitialScope", argTypes, term79885, args);
    }

};



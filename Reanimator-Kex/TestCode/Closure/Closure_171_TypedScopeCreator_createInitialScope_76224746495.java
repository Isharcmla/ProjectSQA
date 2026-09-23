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

public class TypedScopeCreator_createInitialScope_76224746495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39851;
     Object term40047;

    public TypedScopeCreator_createInitialScope_76224746495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39851 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term39955 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term39851, term39851.getClass(), "compiler", null);
        setField(term39851, term39851.getClass(), "typeRegistry", term39955);
        term40047 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term40139 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term40047, term40047.getClass(), "type", -133);
        setField(term40047, term40047.getClass(), "parent", term40139);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term40047;
        callMethod(klass, "createInitialScope", argTypes, term39851, args);
    }

};



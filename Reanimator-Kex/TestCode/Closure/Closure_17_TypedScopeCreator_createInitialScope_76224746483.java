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

public class TypedScopeCreator_createInitialScope_76224746483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62647;
     Object term62821;

    public TypedScopeCreator_createInitialScope_76224746483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62647 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term62751 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term62647, term62647.getClass(), "compiler", null);
        setField(term62647, term62647.getClass(), "typeRegistry", term62751);
        term62821 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62891 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term62821, term62821.getClass(), "type", 0);
        setField(term62821, term62821.getClass(), "parent", null);
        setField(term62891, term62891.getClass(), "next", null);
        setIntField(term62891, term62891.getClass(), "type", 0);
        setField(term62821, term62821.getClass(), "first", term62891);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term62821;
        callMethod(klass, "createInitialScope", argTypes, term62647, args);
    }

};



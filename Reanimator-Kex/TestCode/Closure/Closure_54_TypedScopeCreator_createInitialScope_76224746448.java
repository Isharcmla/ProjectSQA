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

public class TypedScopeCreator_createInitialScope_76224746448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15226;
     Object term15480;

    public TypedScopeCreator_createInitialScope_76224746448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15226 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term15306 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term15410 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term15226, term15226.getClass(), "compiler", term15306);
        setField(term15226, term15226.getClass(), "typeRegistry", term15410);
        term15480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15480, term15480.getClass(), "type", 105);
        setField(term15480, term15480.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term15480;
        try {
            callMethod(klass, "createInitialScope", argTypes, term15226, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



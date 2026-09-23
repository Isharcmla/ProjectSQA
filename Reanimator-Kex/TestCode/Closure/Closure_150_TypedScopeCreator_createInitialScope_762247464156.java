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

public class TypedScopeCreator_createInitialScope_762247464156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102394;
     Object term102544;

    public TypedScopeCreator_createInitialScope_762247464156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102394 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term102474 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term102394, term102394.getClass(), "compiler", term102474);
        setField(term102394, term102394.getClass(), "typeRegistry", null);
        term102544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term102544, term102544.getClass(), "type", 0);
        setField(term102614, term102614.getClass(), "next", term102684);
        setIntField(term102614, term102614.getClass(), "type", 0);
        setField(term102754, term102754.getClass(), "next", null);
        setIntField(term102754, term102754.getClass(), "type", 105);
        setField(term102614, term102614.getClass(), "first", term102754);
        setField(term102544, term102544.getClass(), "first", term102614);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term102544;
        try {
            callMethod(klass, "createInitialScope", argTypes, term102394, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



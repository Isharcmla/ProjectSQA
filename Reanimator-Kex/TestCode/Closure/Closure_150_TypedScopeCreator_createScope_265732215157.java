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

public class TypedScopeCreator_createScope_265732215157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103035;
     Object term103207;
     Object term103373;

    public TypedScopeCreator_createScope_265732215157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103035 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term103115 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term103035, term103035.getClass(), "compiler", term103115);
        term103207 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term103299 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term103207, term103207.getClass(), "jsType", null);
        setIntField(term103207, term103207.getClass(), "type", 0);
        setField(term103207, term103207.getClass(), "first", term103299);
        term103373 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term103443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term103373, term103373.getClass(), "rootNode", term103443);
        setField(term103373, term103373.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term103207;
        args[1] = term103373;
        try {
            callMethod(klass, "createScope", argTypes, term103035, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



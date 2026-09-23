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
     Object term74850;
     Object term74942;
     Object term75108;

    public TypedScopeCreator_createScope_265732215157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74850 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term74850, term74850.getClass(), "compiler", null);
        term74942 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term75034 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term74942, term74942.getClass(), "jsType", null);
        setIntField(term74942, term74942.getClass(), "type", 0);
        setField(term75034, term75034.getClass(), "next", null);
        setIntField(term75034, term75034.getClass(), "type", 0);
        setField(term75034, term75034.getClass(), "first", null);
        setField(term74942, term74942.getClass(), "first", term75034);
        term75108 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term75178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75296 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term75108, term75108.getClass(), "rootNode", term75178);
        setField(term75108, term75108.getClass(), "thisType", term75296);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term74942;
        args[1] = term75108;
        try {
            callMethod(klass, "createScope", argTypes, term74850, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



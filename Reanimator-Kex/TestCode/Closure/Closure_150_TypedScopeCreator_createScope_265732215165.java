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

public class TypedScopeCreator_createScope_265732215165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109288;
     Object term109460;
     Object term109718;

    public TypedScopeCreator_createScope_265732215165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109288 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term109368 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term109288, term109288.getClass(), "compiler", term109368);
        term109460 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term109552 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term109644 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term109460, term109460.getClass(), "jsType", null);
        setIntField(term109460, term109460.getClass(), "type", 0);
        setField(term109552, term109552.getClass(), "next", term109644);
        setIntField(term109552, term109552.getClass(), "type", 69);
        setField(term109552, term109552.getClass(), "first", null);
        setField(term109460, term109460.getClass(), "first", term109552);
        term109718 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term109788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term109884 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term109718, term109718.getClass(), "rootNode", term109788);
        setField(term109718, term109718.getClass(), "thisType", term109884);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term109460;
        args[1] = term109718;
        try {
            callMethod(klass, "createScope", argTypes, term109288, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



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

public class TypedScopeCreator_createInitialScope_76224746495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56884;
     Object term57138;

    public TypedScopeCreator_createInitialScope_76224746495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56884 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term56964 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term57068 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term56884, term56884.getClass(), "compiler", term56964);
        setField(term56884, term56884.getClass(), "typeRegistry", term57068);
        term57138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57138, term57138.getClass(), "type", 0);
        setField(term57208, term57208.getClass(), "next", null);
        setIntField(term57208, term57208.getClass(), "type", 0);
        setField(term57278, term57278.getClass(), "next", null);
        setIntField(term57278, term57278.getClass(), "type", 0);
        setField(term57278, term57278.getClass(), "first", null);
        setField(term57208, term57208.getClass(), "first", term57278);
        setField(term57138, term57138.getClass(), "first", term57208);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term57138;
        try {
            callMethod(klass, "createInitialScope", argTypes, term56884, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



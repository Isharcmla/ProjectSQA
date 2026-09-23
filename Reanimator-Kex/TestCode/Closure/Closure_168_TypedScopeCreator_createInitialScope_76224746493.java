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

public class TypedScopeCreator_createInitialScope_76224746493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57325;
     Object term57579;

    public TypedScopeCreator_createInitialScope_76224746493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57325 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term57405 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term57509 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term57405, term57405.getClass(), "typeRegistry", term57509);
        setField(term57325, term57325.getClass(), "compiler", term57405);
        setField(term57325, term57325.getClass(), "typeRegistry", null);
        term57579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57649 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57579, term57579.getClass(), "type", 0);
        setField(term57579, term57579.getClass(), "parent", null);
        setField(term57649, term57649.getClass(), "next", null);
        setIntField(term57649, term57649.getClass(), "type", 0);
        setField(term57579, term57579.getClass(), "first", term57649);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term57579;
        callMethod(klass, "createInitialScope", argTypes, term57325, args);
    }

};



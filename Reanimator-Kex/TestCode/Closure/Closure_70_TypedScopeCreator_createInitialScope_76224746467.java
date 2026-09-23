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

public class TypedScopeCreator_createInitialScope_76224746467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19229;
     Object term19483;

    public TypedScopeCreator_createInitialScope_76224746467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19229 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term19309 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term19413 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term19229, term19229.getClass(), "compiler", term19309);
        setField(term19229, term19229.getClass(), "typeRegistry", term19413);
        term19483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19483, term19483.getClass(), "type", 113);
        setField(term19553, term19553.getClass(), "next", null);
        setIntField(term19553, term19553.getClass(), "type", 0);
        setField(term19483, term19483.getClass(), "first", term19553);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term19483;
        callMethod(klass, "createInitialScope", argTypes, term19229, args);
    }

};



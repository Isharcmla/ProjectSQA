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

public class TypedScopeCreator_createInitialScope_762247464140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104250;
     Object term104504;

    public TypedScopeCreator_createInitialScope_762247464140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104250 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term104330 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term104434 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term104250, term104250.getClass(), "compiler", term104330);
        setField(term104250, term104250.getClass(), "typeRegistry", term104434);
        term104504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term104504, term104504.getClass(), "type", 0);
        setField(term104504, term104504.getClass(), "parent", null);
        setField(term104644, term104644.getClass(), "next", term104574);
        setIntField(term104644, term104644.getClass(), "type", 0);
        setField(term104574, term104574.getClass(), "next", term104644);
        setIntField(term104574, term104574.getClass(), "type", 0);
        setField(term104504, term104504.getClass(), "first", term104574);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term104504;
        callMethod(klass, "createInitialScope", argTypes, term104250, args);
    }

};



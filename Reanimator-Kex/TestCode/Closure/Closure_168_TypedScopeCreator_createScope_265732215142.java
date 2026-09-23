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

public class TypedScopeCreator_createScope_265732215142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91160;
     Object term91230;
     Object term91374;

    public TypedScopeCreator_createScope_265732215142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91160 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term91160, term91160.getClass(), "compiler", null);
        term91230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term91300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term91230, term91230.getClass(), "jsType", null);
        setIntField(term91230, term91230.getClass(), "type", 126);
        setField(term91230, term91230.getClass(), "parent", null);
        setIntField(term91300, term91300.getClass(), "type", 120);
        setField(term91300, term91300.getClass(), "next", null);
        setField(term91300, term91300.getClass(), "first", null);
        setField(term91230, term91230.getClass(), "first", term91300);
        term91374 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term91444 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term91374, term91374.getClass(), "rootNode", term91444);
        setField(term91374, term91374.getClass(), "thisType", null);
        setIntField(term91374, term91374.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term91230;
        args[1] = term91374;
        callMethod(klass, "createScope", argTypes, term91160, args);
    }

};



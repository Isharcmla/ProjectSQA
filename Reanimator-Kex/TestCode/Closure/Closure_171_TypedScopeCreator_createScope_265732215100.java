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

public class TypedScopeCreator_createScope_265732215100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42088;
     Object term42238;
     Object term42452;

    public TypedScopeCreator_createScope_265732215100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42088 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term42168 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term42168, term42168.getClass(), "phaseOptimizer", null);
        setField(term42088, term42088.getClass(), "compiler", term42168);
        term42238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42238, term42238.getClass(), "type", 0);
        setIntField(term42308, term42308.getClass(), "type", 0);
        setField(term42308, term42308.getClass(), "parent", null);
        setField(term42238, term42238.getClass(), "parent", term42308);
        setField(term42238, term42238.getClass(), "first", term42378);
        term42452 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term42522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term42452, term42452.getClass(), "rootNode", term42522);
        setIntField(term42452, term42452.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term42238;
        args[1] = term42452;
        callMethod(klass, "createScope", argTypes, term42088, args);
    }

};



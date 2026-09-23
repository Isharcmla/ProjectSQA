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

public class TypedScopeCreator_createScope_26573221562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36792;
     Object term36862;
     Object term37216;

    public TypedScopeCreator_createScope_26573221562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36792 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term36792, term36792.getClass(), "compiler", null);
        term36862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term36862, term36862.getClass(), "jsType", null);
        setIntField(term36862, term36862.getClass(), "type", 0);
        setField(term36862, term36862.getClass(), "parent", null);
        setField(term37002, term37002.getClass(), "next", term37072);
        setIntField(term37002, term37002.getClass(), "type", 44);
        setField(term37002, term37002.getClass(), "first", null);
        setField(term36932, term36932.getClass(), "next", term37002);
        setIntField(term36932, term36932.getClass(), "type", 0);
        setField(term37142, term37142.getClass(), "next", null);
        setIntField(term37142, term37142.getClass(), "type", 0);
        setField(term37142, term37142.getClass(), "first", null);
        setField(term37142, term37142.getClass(), "parent", null);
        setField(term36932, term36932.getClass(), "first", term37142);
        setField(term36932, term36932.getClass(), "parent", null);
        setField(term36862, term36862.getClass(), "first", term36932);
        term37216 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term37314 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term37216, term37216.getClass(), "rootNode", null);
        setField(term37216, term37216.getClass(), "thisType", term37314);
        setIntField(term37216, term37216.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term36862;
        args[1] = term37216;
        try {
            callMethod(klass, "createScope", argTypes, term36792, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



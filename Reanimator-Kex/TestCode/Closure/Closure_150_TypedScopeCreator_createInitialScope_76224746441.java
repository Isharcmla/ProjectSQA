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

public class TypedScopeCreator_createInitialScope_76224746441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20073;
     Object term20247;

    public TypedScopeCreator_createInitialScope_76224746441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20073 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term20177 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term20073, term20073.getClass(), "compiler", null);
        setField(term20073, term20073.getClass(), "typeRegistry", term20177);
        term20247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20247, term20247.getClass(), "type", 0);
        setField(term20317, term20317.getClass(), "next", term20387);
        setIntField(term20317, term20317.getClass(), "type", 0);
        setField(term20317, term20317.getClass(), "first", term20457);
        setField(term20247, term20247.getClass(), "first", term20317);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term20247;
        try {
            callMethod(klass, "createInitialScope", argTypes, term20073, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



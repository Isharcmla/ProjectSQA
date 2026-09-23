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

public class TypedScopeCreator_createScope_26573221559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29600;
     Object term29670;
     Object term29814;

    public TypedScopeCreator_createScope_26573221559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29600 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term29600, term29600.getClass(), "compiler", null);
        term29670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term29670, term29670.getClass(), "jsType", null);
        setIntField(term29670, term29670.getClass(), "type", 0);
        setField(term29740, term29740.getClass(), "next", term29670);
        setIntField(term29740, term29740.getClass(), "type", 69);
        setField(term29740, term29740.getClass(), "first", null);
        setField(term29670, term29670.getClass(), "first", term29740);
        term29814 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term29814, term29814.getClass(), "rootNode", null);
        setField(term29814, term29814.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term29670;
        args[1] = term29814;
        try {
            callMethod(klass, "createScope", argTypes, term29600, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



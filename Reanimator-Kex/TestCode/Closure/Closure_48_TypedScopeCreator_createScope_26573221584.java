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

public class TypedScopeCreator_createScope_26573221584 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50321;
     Object term50413;
     Object term50649;

    public TypedScopeCreator_createScope_26573221584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50321 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term50321, term50321.getClass(), "compiler", null);
        term50413 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term50505 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term50575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term50413, term50413.getClass(), "jsType", null);
        setIntField(term50413, term50413.getClass(), "type", 0);
        setField(term50413, term50413.getClass(), "parent", null);
        setField(term50505, term50505.getClass(), "next", term50575);
        setIntField(term50505, term50505.getClass(), "type", 122);
        setField(term50505, term50505.getClass(), "first", null);
        setField(term50413, term50413.getClass(), "first", term50505);
        term50649 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term50649, term50649.getClass(), "rootNode", null);
        setField(term50649, term50649.getClass(), "thisType", null);
        setIntField(term50649, term50649.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term50413;
        args[1] = term50649;
        callMethod(klass, "createScope", argTypes, term50321, args);
    }

};



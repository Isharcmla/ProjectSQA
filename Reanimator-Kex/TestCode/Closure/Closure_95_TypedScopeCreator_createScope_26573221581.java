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

public class TypedScopeCreator_createScope_26573221581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50632;
     Object term50702;
     Object term50846;

    public TypedScopeCreator_createScope_26573221581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50632 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term50632, term50632.getClass(), "compiler", null);
        term50702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50881 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term50702, term50702.getClass(), "jsType", null);
        setIntField(term50702, term50702.getClass(), "type", 0);
        setField(term50881, term50881.getClass(), "next", null);
        setIntField(term50881, term50881.getClass(), "type", 0);
        setField(term50881, term50881.getClass(), "first", null);
        setField(term50702, term50702.getClass(), "first", term50881);
        term50846 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term50987 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term50846, term50846.getClass(), "rootNode", term50881);
        setField(term50846, term50846.getClass(), "thisType", term50987);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term50702;
        args[1] = term50846;
        try {
            callMethod(klass, "createScope", argTypes, term50632, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



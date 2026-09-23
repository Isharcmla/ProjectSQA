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

public class TypedScopeCreator_createScope_265732215127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85637;
     Object term85707;
     Object term86021;

    public TypedScopeCreator_createScope_265732215127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85637 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term85637, term85637.getClass(), "compiler", null);
        term85707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85847 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85947 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term85707, term85707.getClass(), "jsType", null);
        setIntField(term85707, term85707.getClass(), "type", 0);
        setField(term85847, term85847.getClass(), "next", null);
        setIntField(term85847, term85847.getClass(), "type", 43);
        setField(term85847, term85847.getClass(), "first", null);
        setField(term85777, term85777.getClass(), "next", term85847);
        setIntField(term85777, term85777.getClass(), "type", 64);
        setField(term85777, term85777.getClass(), "first", null);
        setField(term85777, term85777.getClass(), "jsType", term85947);
        setField(term85707, term85707.getClass(), "first", term85777);
        term86021 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term86091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term86021, term86021.getClass(), "rootNode", term86091);
        setField(term86021, term86021.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term85707;
        args[1] = term86021;
        try {
            callMethod(klass, "createScope", argTypes, term85637, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



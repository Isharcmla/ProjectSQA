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

public class TypedScopeCreator_createScope_26573221553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23409;
     Object term23479;
     Object term23693;

    public TypedScopeCreator_createScope_26573221553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23409 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term23409, term23409.getClass(), "compiler", null);
        term23479 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23549 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term23479, term23479.getClass(), "jsType", null);
        setIntField(term23479, term23479.getClass(), "type", 0);
        setField(term23479, term23479.getClass(), "parent", null);
        setField(term23549, term23549.getClass(), "next", null);
        setIntField(term23549, term23549.getClass(), "type", 83);
        setField(term23619, term23619.getClass(), "next", null);
        setIntField(term23619, term23619.getClass(), "type", 0);
        setField(term23619, term23619.getClass(), "first", null);
        setField(term23549, term23549.getClass(), "first", term23619);
        setField(term23479, term23479.getClass(), "first", term23549);
        term23693 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term23763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term23693, term23693.getClass(), "rootNode", term23763);
        setField(term23693, term23693.getClass(), "thisType", null);
        setIntField(term23693, term23693.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term23479;
        args[1] = term23693;
        try {
            callMethod(klass, "createScope", argTypes, term23409, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



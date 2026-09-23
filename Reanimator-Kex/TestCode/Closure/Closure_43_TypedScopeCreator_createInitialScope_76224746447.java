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

public class TypedScopeCreator_createInitialScope_76224746447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17583;
     Object term17837;

    public TypedScopeCreator_createInitialScope_76224746447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17583 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term17663 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term17767 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term17583, term17583.getClass(), "compiler", term17663);
        setField(term17583, term17583.getClass(), "typeRegistry", term17767);
        term17837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17907 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17837, term17837.getClass(), "type", 119);
        setField(term17837, term17837.getClass(), "parent", null);
        setField(term17907, term17907.getClass(), "next", term17977);
        setIntField(term17907, term17907.getClass(), "type", 0);
        setField(term17837, term17837.getClass(), "first", term17907);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term17837;
        try {
            callMethod(klass, "createInitialScope", argTypes, term17583, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class TypedScopeCreator_createScope_265732215131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96844;
     Object term96914;
     Object term97128;

    public TypedScopeCreator_createScope_265732215131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96844 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term96844, term96844.getClass(), "compiler", null);
        term96914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term96914, term96914.getClass(), "jsType", null);
        setIntField(term96914, term96914.getClass(), "type", 0);
        setField(term96914, term96914.getClass(), "parent", null);
        setField(term97054, term97054.getClass(), "next", null);
        setIntField(term97054, term97054.getClass(), "type", 0);
        setField(term97054, term97054.getClass(), "first", null);
        setField(term96984, term96984.getClass(), "next", term97054);
        setIntField(term96984, term96984.getClass(), "type", 0);
        setField(term96984, term96984.getClass(), "first", null);
        setField(term96914, term96914.getClass(), "first", term96984);
        term97128 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term97128, term97128.getClass(), "rootNode", null);
        setField(term97128, term97128.getClass(), "thisType", null);
        setIntField(term97128, term97128.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term96914;
        args[1] = term97128;
        try {
            callMethod(klass, "createScope", argTypes, term96844, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



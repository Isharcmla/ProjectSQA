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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypedScopeCreator_createScope_265732215140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88815;
     Object term88965;
     Object term89273;

    public TypedScopeCreator_createScope_265732215140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88815 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term88895 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term88815, term88815.getClass(), "compiler", term88895);
        term88965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89199 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term88965, term88965.getClass(), "jsType", null);
        setIntField(term88965, term88965.getClass(), "type", 0);
        setField(term89105, term89105.getClass(), "next", null);
        setIntField(term89105, term89105.getClass(), "type", 41);
        setField(term89105, term89105.getClass(), "first", null);
        setField(term89035, term89035.getClass(), "next", term89105);
        setIntField(term89035, term89035.getClass(), "type", 64);
        setField(term89035, term89035.getClass(), "first", null);
        setField(term89035, term89035.getClass(), "jsType", term89199);
        setField(term88965, term88965.getClass(), "first", term89035);
        term89273 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term89273, term89273.getClass(), "rootNode", null);
        setField(term89273, term89273.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term88965;
        args[1] = term89273;
        try {
            callMethod(klass, "createScope", argTypes, term88815, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



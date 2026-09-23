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

public class TypedScopeCreator_createScope_265732215149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96459;
     Object term96529;
     Object term96785;

    public TypedScopeCreator_createScope_265732215149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96459 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term96459, term96459.getClass(), "compiler", null);
        term96529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96711 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term96529, term96529.getClass(), "jsType", null);
        setIntField(term96529, term96529.getClass(), "type", 0);
        setField(term96599, term96599.getClass(), "next", null);
        setIntField(term96599, term96599.getClass(), "type", 64);
        setField(term96599, term96599.getClass(), "first", null);
        setField(term96599, term96599.getClass(), "jsType", term96711);
        setField(term96529, term96529.getClass(), "first", term96599);
        term96785 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term96855 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term96785, term96785.getClass(), "rootNode", term96855);
        setField(term96785, term96785.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term96529;
        args[1] = term96785;
        try {
            callMethod(klass, "createScope", argTypes, term96459, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



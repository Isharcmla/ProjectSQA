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

public class TypedScopeCreator_createScope_265732215130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80915;
     Object term80985;
     Object term81297;

    public TypedScopeCreator_createScope_265732215130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80915 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term80915, term80915.getClass(), "compiler", null);
        term80985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81055 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81223 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term80985, term80985.getClass(), "jsType", null);
        setIntField(term80985, term80985.getClass(), "type", 0);
        setField(term81125, term81125.getClass(), "next", null);
        setIntField(term81125, term81125.getClass(), "type", 0);
        setField(term81125, term81125.getClass(), "first", null);
        setField(term81055, term81055.getClass(), "next", term81125);
        setIntField(term81055, term81055.getClass(), "type", 64);
        setField(term81055, term81055.getClass(), "first", null);
        setField(term81055, term81055.getClass(), "jsType", term81223);
        setField(term80985, term80985.getClass(), "first", term81055);
        term81297 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term81411 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term81297, term81297.getClass(), "rootNode", null);
        setField(term81297, term81297.getClass(), "thisType", term81411);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term80985;
        args[1] = term81297;
        try {
            callMethod(klass, "createScope", argTypes, term80915, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



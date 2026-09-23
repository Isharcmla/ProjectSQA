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

public class TypedScopeCreator_createScope_265732215163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119256;
     Object term119326;
     Object term119680;

    public TypedScopeCreator_createScope_265732215163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119256 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term119256, term119256.getClass(), "compiler", null);
        term119326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term119396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term119466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term119536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term119606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term119326, term119326.getClass(), "jsType", null);
        setIntField(term119326, term119326.getClass(), "type", 0);
        setField(term119466, term119466.getClass(), "next", term119536);
        setIntField(term119466, term119466.getClass(), "type", 64);
        setField(term119466, term119466.getClass(), "first", null);
        setField(term119396, term119396.getClass(), "next", term119466);
        setIntField(term119396, term119396.getClass(), "type", 0);
        setField(term119606, term119606.getClass(), "next", null);
        setIntField(term119606, term119606.getClass(), "type", 0);
        setField(term119606, term119606.getClass(), "first", null);
        setField(term119396, term119396.getClass(), "first", term119606);
        setField(term119326, term119326.getClass(), "first", term119396);
        term119680 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term119680, term119680.getClass(), "rootNode", null);
        setField(term119680, term119680.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term119326;
        args[1] = term119680;
        try {
            callMethod(klass, "createScope", argTypes, term119256, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



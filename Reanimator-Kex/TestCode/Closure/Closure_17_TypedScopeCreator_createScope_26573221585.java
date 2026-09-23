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

public class TypedScopeCreator_createScope_26573221585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64219;
     Object term64289;
     Object term64713;

    public TypedScopeCreator_createScope_26573221585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64219 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term64219, term64219.getClass(), "compiler", null);
        term64289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term64359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term64429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term64499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term64569 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term64639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term64289, term64289.getClass(), "jsType", null);
        setIntField(term64289, term64289.getClass(), "type", 0);
        setField(term64289, term64289.getClass(), "parent", null);
        setField(term64499, term64499.getClass(), "next", term64569);
        setIntField(term64499, term64499.getClass(), "type", 37);
        setField(term64499, term64499.getClass(), "first", null);
        setField(term64429, term64429.getClass(), "next", term64499);
        setIntField(term64429, term64429.getClass(), "type", 125);
        setField(term64429, term64429.getClass(), "first", null);
        setField(term64429, term64429.getClass(), "parent", null);
        setField(term64359, term64359.getClass(), "next", term64429);
        setIntField(term64359, term64359.getClass(), "type", 0);
        setField(term64639, term64639.getClass(), "next", null);
        setIntField(term64639, term64639.getClass(), "type", 0);
        setField(term64639, term64639.getClass(), "first", null);
        setField(term64639, term64639.getClass(), "parent", null);
        setField(term64359, term64359.getClass(), "first", term64639);
        setField(term64359, term64359.getClass(), "parent", null);
        setField(term64289, term64289.getClass(), "first", term64359);
        term64713 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term64713, term64713.getClass(), "rootNode", null);
        setField(term64713, term64713.getClass(), "thisType", null);
        setIntField(term64713, term64713.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term64289;
        args[1] = term64713;
        callMethod(klass, "createScope", argTypes, term64219, args);
    }

};



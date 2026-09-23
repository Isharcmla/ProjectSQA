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

public class TypedScopeCreator_createScope_265732215123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74325;
     Object term74395;
     Object term74679;

    public TypedScopeCreator_createScope_265732215123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74325 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term74325, term74325.getClass(), "compiler", null);
        term74395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term74395, term74395.getClass(), "jsType", null);
        setIntField(term74395, term74395.getClass(), "type", 0);
        setField(term74395, term74395.getClass(), "parent", null);
        setField(term74465, term74465.getClass(), "next", null);
        setIntField(term74465, term74465.getClass(), "type", 122);
        setField(term74605, term74605.getClass(), "next", null);
        setIntField(term74605, term74605.getClass(), "type", 0);
        setField(term74605, term74605.getClass(), "first", null);
        setField(term74605, term74605.getClass(), "parent", null);
        setField(term74535, term74535.getClass(), "next", term74605);
        setIntField(term74535, term74535.getClass(), "type", 0);
        setField(term74535, term74535.getClass(), "first", null);
        setField(term74535, term74535.getClass(), "parent", null);
        setField(term74465, term74465.getClass(), "first", term74535);
        setField(term74395, term74395.getClass(), "first", term74465);
        term74679 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term74679, term74679.getClass(), "rootNode", null);
        setField(term74679, term74679.getClass(), "thisType", null);
        setIntField(term74679, term74679.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term74395;
        args[1] = term74679;
        try {
            callMethod(klass, "createScope", argTypes, term74325, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



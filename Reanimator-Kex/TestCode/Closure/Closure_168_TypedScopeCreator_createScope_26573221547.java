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

public class TypedScopeCreator_createScope_26573221547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21594;
     Object term21664;
     Object term21948;

    public TypedScopeCreator_createScope_26573221547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21594 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term21594, term21594.getClass(), "compiler", null);
        term21664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21874 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term21664, term21664.getClass(), "jsType", null);
        setIntField(term21664, term21664.getClass(), "type", 0);
        setField(term21664, term21664.getClass(), "parent", null);
        setField(term21804, term21804.getClass(), "next", null);
        setIntField(term21804, term21804.getClass(), "type", 0);
        setField(term21804, term21804.getClass(), "first", null);
        setField(term21804, term21804.getClass(), "parent", null);
        setField(term21734, term21734.getClass(), "next", term21804);
        setIntField(term21734, term21734.getClass(), "type", 0);
        setField(term21874, term21874.getClass(), "next", null);
        setIntField(term21874, term21874.getClass(), "type", 0);
        setField(term21874, term21874.getClass(), "first", null);
        setField(term21874, term21874.getClass(), "parent", null);
        setField(term21734, term21734.getClass(), "first", term21874);
        setField(term21734, term21734.getClass(), "parent", null);
        setField(term21664, term21664.getClass(), "first", term21734);
        term21948 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term21948, term21948.getClass(), "rootNode", null);
        setField(term21948, term21948.getClass(), "thisType", null);
        setIntField(term21948, term21948.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term21664;
        args[1] = term21948;
        try {
            callMethod(klass, "createScope", argTypes, term21594, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



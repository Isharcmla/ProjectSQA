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

public class TypedScopeCreator_createScope_26573221570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46563;
     Object term46633;
     Object term46917;

    public TypedScopeCreator_createScope_26573221570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46563 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term46563, term46563.getClass(), "compiler", null);
        term46633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46773 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term46633, term46633.getClass(), "jsType", null);
        setIntField(term46633, term46633.getClass(), "type", 0);
        setField(term46633, term46633.getClass(), "parent", null);
        setField(term46843, term46843.getClass(), "next", null);
        setIntField(term46843, term46843.getClass(), "type", 0);
        setField(term46843, term46843.getClass(), "first", null);
        setField(term46843, term46843.getClass(), "parent", null);
        setField(term46773, term46773.getClass(), "next", term46843);
        setIntField(term46773, term46773.getClass(), "type", 0);
        setField(term46773, term46773.getClass(), "first", null);
        setField(term46773, term46773.getClass(), "parent", null);
        setField(term46703, term46703.getClass(), "next", term46773);
        setIntField(term46703, term46703.getClass(), "type", 0);
        setField(term46703, term46703.getClass(), "first", term46843);
        setField(term46703, term46703.getClass(), "parent", null);
        setField(term46633, term46633.getClass(), "first", term46703);
        term46917 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term46917, term46917.getClass(), "rootNode", null);
        setField(term46917, term46917.getClass(), "thisType", null);
        setIntField(term46917, term46917.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term46633;
        args[1] = term46917;
        try {
            callMethod(klass, "createScope", argTypes, term46563, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



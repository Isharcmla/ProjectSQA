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

public class TypedScopeCreator_createScope_26573221579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57271;
     Object term57341;
     Object term57625;

    public TypedScopeCreator_createScope_26573221579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57271 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term57271, term57271.getClass(), "compiler", null);
        term57341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term57341, term57341.getClass(), "jsType", null);
        setIntField(term57341, term57341.getClass(), "type", 0);
        setField(term57341, term57341.getClass(), "parent", null);
        setField(term57551, term57551.getClass(), "next", null);
        setIntField(term57551, term57551.getClass(), "type", 0);
        setField(term57551, term57551.getClass(), "first", null);
        setField(term57551, term57551.getClass(), "parent", null);
        setField(term57481, term57481.getClass(), "next", term57551);
        setIntField(term57481, term57481.getClass(), "type", 125);
        setField(term57481, term57481.getClass(), "first", null);
        setField(term57481, term57481.getClass(), "parent", null);
        setField(term57411, term57411.getClass(), "next", term57481);
        setIntField(term57411, term57411.getClass(), "type", 0);
        setField(term57411, term57411.getClass(), "first", term57551);
        setField(term57411, term57411.getClass(), "parent", null);
        setField(term57341, term57341.getClass(), "first", term57411);
        term57625 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term57695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term57625, term57625.getClass(), "rootNode", term57695);
        setField(term57625, term57625.getClass(), "thisType", null);
        setIntField(term57625, term57625.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term57341;
        args[1] = term57625;
        try {
            callMethod(klass, "createScope", argTypes, term57271, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



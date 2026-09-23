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

public class TypedScopeCreator_createInitialScope_76224746439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14666;
     Object term14840;

    public TypedScopeCreator_createInitialScope_76224746439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14666 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term14770 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term14666, term14666.getClass(), "compiler", null);
        setField(term14666, term14666.getClass(), "typeRegistry", term14770);
        term14840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14910 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14840, term14840.getClass(), "type", 0);
        setField(term14840, term14840.getClass(), "parent", null);
        setField(term14910, term14910.getClass(), "next", null);
        setIntField(term14910, term14910.getClass(), "type", 0);
        setField(term14840, term14840.getClass(), "first", term14910);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term14840;
        try {
            callMethod(klass, "createInitialScope", argTypes, term14666, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class TypedScopeCreator_createScope_265732215159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105609;
     Object term105759;
     Object term105833;

    public TypedScopeCreator_createScope_265732215159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105609 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term105689 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term105609, term105609.getClass(), "compiler", term105689);
        term105759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term105759, term105759.getClass(), "jsType", null);
        setIntField(term105759, term105759.getClass(), "type", 0);
        setField(term105759, term105759.getClass(), "first", null);
        term105833 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term105903 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term105833, term105833.getClass(), "rootNode", term105903);
        setField(term105833, term105833.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term105759;
        args[1] = term105833;
        try {
            callMethod(klass, "createScope", argTypes, term105609, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



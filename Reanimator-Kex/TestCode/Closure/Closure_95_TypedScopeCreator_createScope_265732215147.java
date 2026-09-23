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

public class TypedScopeCreator_createScope_265732215147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103743;
     Object term103813;
     Object term104167;

    public TypedScopeCreator_createScope_265732215147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103743 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term103743, term103743.getClass(), "compiler", null);
        term103813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103883 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term103813, term103813.getClass(), "jsType", null);
        setIntField(term103813, term103813.getClass(), "type", 0);
        setField(term103883, term103883.getClass(), "next", term103953);
        setIntField(term103883, term103883.getClass(), "type", 0);
        setField(term104023, term104023.getClass(), "next", term104093);
        setIntField(term104023, term104023.getClass(), "type", 122);
        setField(term104023, term104023.getClass(), "first", null);
        setField(term103883, term103883.getClass(), "first", term104023);
        setField(term103813, term103813.getClass(), "first", term103883);
        term104167 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term104237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term104167, term104167.getClass(), "rootNode", term104237);
        setField(term104167, term104167.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term103813;
        args[1] = term104167;
        try {
            callMethod(klass, "createScope", argTypes, term103743, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



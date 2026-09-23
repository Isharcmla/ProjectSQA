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

public class TypedScopeCreator_createScope_265732215129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87455;
     Object term87525;
     Object term87839;

    public TypedScopeCreator_createScope_265732215129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87455 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term87455, term87455.getClass(), "compiler", null);
        term87525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87765 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term87525, term87525.getClass(), "jsType", null);
        setIntField(term87525, term87525.getClass(), "type", 0);
        setField(term87665, term87665.getClass(), "next", null);
        setIntField(term87665, term87665.getClass(), "type", 0);
        setField(term87665, term87665.getClass(), "first", null);
        setField(term87595, term87595.getClass(), "next", term87665);
        setIntField(term87595, term87595.getClass(), "type", 64);
        setField(term87595, term87595.getClass(), "first", null);
        setField(term87595, term87595.getClass(), "jsType", term87765);
        setField(term87525, term87525.getClass(), "first", term87595);
        term87839 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term87839, term87839.getClass(), "rootNode", null);
        setField(term87839, term87839.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term87525;
        args[1] = term87839;
        try {
            callMethod(klass, "createScope", argTypes, term87455, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class TypedScopeCreator_createScope_265732215124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75709;
     Object term75859;
     Object term76143;

    public TypedScopeCreator_createScope_265732215124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75709 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term75789 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term75709, term75709.getClass(), "compiler", term75789);
        term75859 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term75859, term75859.getClass(), "jsType", null);
        setIntField(term75859, term75859.getClass(), "type", 0);
        setField(term75859, term75859.getClass(), "parent", null);
        setField(term75929, term75929.getClass(), "next", null);
        setIntField(term75929, term75929.getClass(), "type", 0);
        setField(term76069, term76069.getClass(), "next", null);
        setIntField(term76069, term76069.getClass(), "type", 0);
        setField(term76069, term76069.getClass(), "first", null);
        setField(term76069, term76069.getClass(), "parent", null);
        setField(term75999, term75999.getClass(), "next", term76069);
        setIntField(term75999, term75999.getClass(), "type", 0);
        setField(term75999, term75999.getClass(), "first", null);
        setField(term75999, term75999.getClass(), "parent", null);
        setField(term75929, term75929.getClass(), "first", term75999);
        setField(term75929, term75929.getClass(), "parent", null);
        setField(term75859, term75859.getClass(), "first", term75929);
        term76143 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term76143, term76143.getClass(), "rootNode", null);
        setField(term76143, term76143.getClass(), "thisType", null);
        setIntField(term76143, term76143.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term75859;
        args[1] = term76143;
        callMethod(klass, "createScope", argTypes, term75709, args);
    }

};



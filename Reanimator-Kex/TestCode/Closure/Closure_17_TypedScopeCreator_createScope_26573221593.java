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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypedScopeCreator_createScope_26573221593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66954;
     Object term67104;
     Object term67458;

    public TypedScopeCreator_createScope_26573221593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66954 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term67034 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term66954, term66954.getClass(), "compiler", term67034);
        term67104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67314 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term67104, term67104.getClass(), "jsType", null);
        setIntField(term67104, term67104.getClass(), "type", 0);
        setField(term67104, term67104.getClass(), "parent", null);
        setField(term67314, term67314.getClass(), "next", null);
        setIntField(term67314, term67314.getClass(), "type", 47);
        setField(term67314, term67314.getClass(), "first", null);
        setField(term67244, term67244.getClass(), "next", term67314);
        setIntField(term67244, term67244.getClass(), "type", 125);
        setField(term67244, term67244.getClass(), "first", null);
        setField(term67244, term67244.getClass(), "parent", null);
        setField(term67174, term67174.getClass(), "next", term67244);
        setIntField(term67174, term67174.getClass(), "type", 0);
        setField(term67384, term67384.getClass(), "next", null);
        setIntField(term67384, term67384.getClass(), "type", 0);
        setField(term67384, term67384.getClass(), "first", null);
        setField(term67384, term67384.getClass(), "parent", null);
        setField(term67174, term67174.getClass(), "first", term67384);
        setField(term67174, term67174.getClass(), "parent", null);
        setField(term67104, term67104.getClass(), "first", term67174);
        term67458 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term67458, term67458.getClass(), "rootNode", null);
        setField(term67458, term67458.getClass(), "thisType", null);
        setIntField(term67458, term67458.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term67104;
        args[1] = term67458;
        try {
            callMethod(klass, "createScope", argTypes, term66954, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



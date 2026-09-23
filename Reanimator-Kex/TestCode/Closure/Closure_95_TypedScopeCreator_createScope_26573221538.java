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

public class TypedScopeCreator_createScope_26573221538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21525;
     Object term21675;
     Object term21889;

    public TypedScopeCreator_createScope_26573221538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21525 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term21605 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term21525, term21525.getClass(), "compiler", term21605);
        term21675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term21675, term21675.getClass(), "jsType", null);
        setIntField(term21675, term21675.getClass(), "type", 0);
        setField(term21745, term21745.getClass(), "next", term21815);
        setIntField(term21745, term21745.getClass(), "type", 41);
        setField(term21745, term21745.getClass(), "first", null);
        setField(term21675, term21675.getClass(), "first", term21745);
        term21889 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term21959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term21889, term21889.getClass(), "rootNode", term21959);
        setField(term21889, term21889.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term21675;
        args[1] = term21889;
        try {
            callMethod(klass, "createScope", argTypes, term21525, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



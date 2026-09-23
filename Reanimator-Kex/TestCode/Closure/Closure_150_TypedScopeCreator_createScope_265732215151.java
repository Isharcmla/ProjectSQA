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

public class TypedScopeCreator_createScope_265732215151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97975;
     Object term98045;
     Object term98439;

    public TypedScopeCreator_createScope_265732215151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97975 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term97975, term97975.getClass(), "compiler", null);
        term98045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98365 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term98045, term98045.getClass(), "jsType", null);
        setIntField(term98045, term98045.getClass(), "type", 0);
        setField(term98185, term98185.getClass(), "next", term98255);
        setIntField(term98185, term98185.getClass(), "type", 0);
        setField(term98185, term98185.getClass(), "first", null);
        setField(term98115, term98115.getClass(), "next", term98185);
        setIntField(term98115, term98115.getClass(), "type", 64);
        setField(term98115, term98115.getClass(), "first", null);
        setField(term98115, term98115.getClass(), "jsType", term98365);
        setField(term98045, term98045.getClass(), "first", term98115);
        term98439 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term98509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term98439, term98439.getClass(), "rootNode", term98509);
        setField(term98439, term98439.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term98045;
        args[1] = term98439;
        try {
            callMethod(klass, "createScope", argTypes, term97975, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



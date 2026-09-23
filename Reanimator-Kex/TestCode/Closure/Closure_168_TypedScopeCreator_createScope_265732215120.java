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

public class TypedScopeCreator_createScope_265732215120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72833;
     Object term72903;
     Object term73327;

    public TypedScopeCreator_createScope_265732215120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72833 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term72833, term72833.getClass(), "compiler", null);
        term72903 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term72903, term72903.getClass(), "jsType", null);
        setIntField(term72903, term72903.getClass(), "type", 0);
        setField(term72903, term72903.getClass(), "parent", null);
        setField(term72973, term72973.getClass(), "next", term73043);
        setIntField(term72973, term72973.getClass(), "type", 0);
        setField(term73183, term73183.getClass(), "next", term73253);
        setIntField(term73183, term73183.getClass(), "type", 122);
        setField(term73183, term73183.getClass(), "first", null);
        setField(term73113, term73113.getClass(), "next", term73183);
        setIntField(term73113, term73113.getClass(), "type", 0);
        setField(term73113, term73113.getClass(), "first", null);
        setField(term73113, term73113.getClass(), "parent", null);
        setField(term72973, term72973.getClass(), "first", term73113);
        setField(term72903, term72903.getClass(), "first", term72973);
        term73327 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term73397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73497 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term73327, term73327.getClass(), "rootNode", term73397);
        setField(term73327, term73327.getClass(), "thisType", term73497);
        setIntField(term73327, term73327.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term72903;
        args[1] = term73327;
        callMethod(klass, "createScope", argTypes, term72833, args);
    }

};



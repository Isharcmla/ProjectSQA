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

public class TypedScopeCreator_createScope_265732215136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86962;
     Object term87032;
     Object term87456;

    public TypedScopeCreator_createScope_265732215136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86962 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term86962, term86962.getClass(), "compiler", null);
        term87032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87312 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term87032, term87032.getClass(), "jsType", null);
        setIntField(term87032, term87032.getClass(), "type", 0);
        setField(term87032, term87032.getClass(), "parent", null);
        setField(term87242, term87242.getClass(), "next", term87312);
        setIntField(term87242, term87242.getClass(), "type", 41);
        setField(term87242, term87242.getClass(), "first", null);
        setField(term87172, term87172.getClass(), "next", term87242);
        setIntField(term87172, term87172.getClass(), "type", 33);
        setField(term87172, term87172.getClass(), "first", null);
        setField(term87172, term87172.getClass(), "parent", null);
        setField(term87102, term87102.getClass(), "next", term87172);
        setIntField(term87102, term87102.getClass(), "type", 0);
        setField(term87382, term87382.getClass(), "next", null);
        setIntField(term87382, term87382.getClass(), "type", 0);
        setField(term87382, term87382.getClass(), "first", null);
        setField(term87382, term87382.getClass(), "parent", null);
        setField(term87102, term87102.getClass(), "first", term87382);
        setField(term87102, term87102.getClass(), "parent", null);
        setField(term87032, term87032.getClass(), "first", term87102);
        term87456 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term87526 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87626 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term87456, term87456.getClass(), "rootNode", term87526);
        setField(term87456, term87456.getClass(), "thisType", term87626);
        setIntField(term87456, term87456.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term87032;
        args[1] = term87456;
        callMethod(klass, "createScope", argTypes, term86962, args);
    }

};



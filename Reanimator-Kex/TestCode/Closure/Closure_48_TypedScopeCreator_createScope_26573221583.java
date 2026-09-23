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

public class TypedScopeCreator_createScope_26573221583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49407;
     Object term49557;
     Object term49911;

    public TypedScopeCreator_createScope_26573221583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49407 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term49487 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term49407, term49407.getClass(), "compiler", term49487);
        term49557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49767 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term49557, term49557.getClass(), "jsType", null);
        setIntField(term49557, term49557.getClass(), "type", 0);
        setField(term49557, term49557.getClass(), "parent", null);
        setField(term49767, term49767.getClass(), "next", null);
        setIntField(term49767, term49767.getClass(), "type", 122);
        setField(term49767, term49767.getClass(), "first", null);
        setField(term49697, term49697.getClass(), "next", term49767);
        setIntField(term49697, term49697.getClass(), "type", 125);
        setField(term49697, term49697.getClass(), "first", null);
        setField(term49627, term49627.getClass(), "next", term49697);
        setIntField(term49627, term49627.getClass(), "type", 0);
        setField(term49837, term49837.getClass(), "next", null);
        setIntField(term49837, term49837.getClass(), "type", 0);
        setField(term49837, term49837.getClass(), "first", null);
        setField(term49627, term49627.getClass(), "first", term49837);
        setField(term49557, term49557.getClass(), "first", term49627);
        term49911 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term49981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term49911, term49911.getClass(), "rootNode", term49981);
        setField(term49911, term49911.getClass(), "thisType", null);
        setIntField(term49911, term49911.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term49557;
        args[1] = term49911;
        callMethod(klass, "createScope", argTypes, term49407, args);
    }

};



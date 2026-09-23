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

public class TypedScopeCreator_createScope_26573221558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31703;
     Object term31853;
     Object term32207;

    public TypedScopeCreator_createScope_26573221558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31703 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term31783 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term31703, term31703.getClass(), "compiler", term31783);
        term31853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term31853, term31853.getClass(), "jsType", null);
        setIntField(term31853, term31853.getClass(), "type", 0);
        setField(term31853, term31853.getClass(), "parent", null);
        setField(term32063, term32063.getClass(), "next", null);
        setIntField(term32063, term32063.getClass(), "type", 43);
        setField(term32063, term32063.getClass(), "first", null);
        setField(term31993, term31993.getClass(), "next", term32063);
        setIntField(term31993, term31993.getClass(), "type", 0);
        setField(term31993, term31993.getClass(), "first", null);
        setField(term31993, term31993.getClass(), "parent", null);
        setField(term31923, term31923.getClass(), "next", term31993);
        setIntField(term31923, term31923.getClass(), "type", 0);
        setField(term32133, term32133.getClass(), "next", null);
        setIntField(term32133, term32133.getClass(), "type", 0);
        setField(term32133, term32133.getClass(), "first", null);
        setField(term32133, term32133.getClass(), "parent", null);
        setField(term31923, term31923.getClass(), "first", term32133);
        setField(term31923, term31923.getClass(), "parent", null);
        setField(term31853, term31853.getClass(), "first", term31923);
        term32207 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term32299 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term32207, term32207.getClass(), "rootNode", null);
        setField(term32207, term32207.getClass(), "thisType", term32299);
        setIntField(term32207, term32207.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term31853;
        args[1] = term32207;
        try {
            callMethod(klass, "createScope", argTypes, term31703, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};



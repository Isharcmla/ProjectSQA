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
     Object term94627;
     Object term94697;
     Object term95035;

    public TypedScopeCreator_createScope_265732215147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94627 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term94627, term94627.getClass(), "compiler", null);
        term94697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94767 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94961 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term94697, term94697.getClass(), "jsType", null);
        setIntField(term94697, term94697.getClass(), "type", 0);
        setField(term94837, term94837.getClass(), "next", null);
        setIntField(term94837, term94837.getClass(), "type", 69);
        setField(term94837, term94837.getClass(), "first", null);
        setField(term94767, term94767.getClass(), "next", term94837);
        setIntField(term94767, term94767.getClass(), "type", 64);
        setField(term94767, term94767.getClass(), "first", null);
        setField(term94767, term94767.getClass(), "jsType", term94961);
        setField(term94697, term94697.getClass(), "first", term94767);
        term95035 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term95105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term95035, term95035.getClass(), "rootNode", term95105);
        setField(term95035, term95035.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term94697;
        args[1] = term95035;
        try {
            callMethod(klass, "createScope", argTypes, term94627, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



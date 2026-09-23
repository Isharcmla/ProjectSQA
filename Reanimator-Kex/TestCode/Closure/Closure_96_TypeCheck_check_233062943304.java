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

public class TypeCheck_check_233062943304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133883;
     Object term134211;

    public TypeCheck_check_233062943304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133883 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term133963 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term134067 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term134141 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term133883, term133883.getClass(), "compiler", term133963);
        setField(term133883, term133883.getClass(), "scopeCreator", term134067);
        setBooleanField(term133883, term133883.getClass(), "inExterns", false);
        setField(term134141, term134141.getClass(), "parent", null);
        setField(term133883, term133883.getClass(), "topScope", term134141);
        term134211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term134281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term134351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term134421 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term134491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term134211, term134211.getClass(), "type", 0);
        setField(term134421, term134421.getClass(), "next", term134491);
        setIntField(term134421, term134421.getClass(), "type", 85);
        setField(term134421, term134421.getClass(), "first", null);
        setField(term134351, term134351.getClass(), "next", term134421);
        setIntField(term134351, term134351.getClass(), "type", 108);
        setField(term134351, term134351.getClass(), "first", null);
        setField(term134281, term134281.getClass(), "next", term134351);
        setIntField(term134281, term134281.getClass(), "type", 130);
        setField(term134281, term134281.getClass(), "first", null);
        setField(term134211, term134211.getClass(), "first", term134281);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term134211;
        args[1] = true;
        callMethod(klass, "check", argTypes, term133883, args);
    }

};



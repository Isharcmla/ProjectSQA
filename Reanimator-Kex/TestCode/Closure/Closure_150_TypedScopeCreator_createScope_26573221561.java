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

public class TypedScopeCreator_createScope_26573221561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30902;
     Object term30972;
     Object term31116;

    public TypedScopeCreator_createScope_26573221561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30902 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term30902, term30902.getClass(), "compiler", null);
        term30972 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term30972, term30972.getClass(), "jsType", null);
        setIntField(term30972, term30972.getClass(), "type", 0);
        setField(term31151, term31151.getClass(), "next", null);
        setIntField(term31151, term31151.getClass(), "type", 0);
        setField(term31151, term31151.getClass(), "first", null);
        setField(term30972, term30972.getClass(), "first", term31151);
        term31116 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term31269 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term31116, term31116.getClass(), "rootNode", term31151);
        setField(term31116, term31116.getClass(), "thisType", term31269);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term30972;
        args[1] = term31116;
        try {
            callMethod(klass, "createScope", argTypes, term30902, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class TypedScopeCreator_createScope_26573221567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34762;
     Object term34832;
     Object term35046;

    public TypedScopeCreator_createScope_26573221567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34762 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term34762, term34762.getClass(), "compiler", null);
        term34832 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34972 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term34832, term34832.getClass(), "jsType", null);
        setIntField(term34832, term34832.getClass(), "type", 0);
        setField(term34902, term34902.getClass(), "next", term34972);
        setIntField(term34902, term34902.getClass(), "type", 41);
        setField(term34902, term34902.getClass(), "first", null);
        setField(term34832, term34832.getClass(), "first", term34902);
        term35046 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term35116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35216 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term35046, term35046.getClass(), "rootNode", term35116);
        setField(term35046, term35046.getClass(), "thisType", term35216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term34832;
        args[1] = term35046;
        try {
            callMethod(klass, "createScope", argTypes, term34762, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



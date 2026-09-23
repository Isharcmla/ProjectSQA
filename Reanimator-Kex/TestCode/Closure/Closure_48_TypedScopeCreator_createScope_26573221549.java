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

public class TypedScopeCreator_createScope_26573221549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20867;
     Object term20937;
     Object term21221;

    public TypedScopeCreator_createScope_26573221549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20867 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term20867, term20867.getClass(), "compiler", null);
        term20937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term20937, term20937.getClass(), "jsType", null);
        setIntField(term20937, term20937.getClass(), "type", 0);
        setField(term20937, term20937.getClass(), "parent", null);
        setField(term21077, term21077.getClass(), "next", null);
        setIntField(term21077, term21077.getClass(), "type", 83);
        setField(term21077, term21077.getClass(), "first", null);
        setField(term21007, term21007.getClass(), "next", term21077);
        setIntField(term21007, term21007.getClass(), "type", 0);
        setField(term21147, term21147.getClass(), "next", null);
        setIntField(term21147, term21147.getClass(), "type", 0);
        setField(term21147, term21147.getClass(), "first", null);
        setField(term21007, term21007.getClass(), "first", term21147);
        setField(term20937, term20937.getClass(), "first", term21007);
        term21221 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term21291 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21383 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term21221, term21221.getClass(), "rootNode", term21291);
        setField(term21221, term21221.getClass(), "thisType", term21383);
        setIntField(term21221, term21221.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term20937;
        args[1] = term21221;
        try {
            callMethod(klass, "createScope", argTypes, term20867, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



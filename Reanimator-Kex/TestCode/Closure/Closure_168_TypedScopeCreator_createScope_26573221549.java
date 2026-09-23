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
     Object term23411;
     Object term23481;
     Object term23765;

    public TypedScopeCreator_createScope_26573221549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23411 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term23411, term23411.getClass(), "compiler", null);
        term23481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term23481, term23481.getClass(), "jsType", null);
        setIntField(term23481, term23481.getClass(), "type", 0);
        setField(term23481, term23481.getClass(), "parent", null);
        setField(term23621, term23621.getClass(), "next", null);
        setIntField(term23621, term23621.getClass(), "type", 122);
        setField(term23621, term23621.getClass(), "first", null);
        setField(term23551, term23551.getClass(), "next", term23621);
        setIntField(term23551, term23551.getClass(), "type", 0);
        setField(term23691, term23691.getClass(), "next", null);
        setIntField(term23691, term23691.getClass(), "type", 0);
        setField(term23691, term23691.getClass(), "first", null);
        setField(term23691, term23691.getClass(), "parent", null);
        setField(term23551, term23551.getClass(), "first", term23691);
        setField(term23551, term23551.getClass(), "parent", null);
        setField(term23481, term23481.getClass(), "first", term23551);
        term23765 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term23857 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term23765, term23765.getClass(), "rootNode", null);
        setField(term23765, term23765.getClass(), "thisType", term23857);
        setIntField(term23765, term23765.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term23481;
        args[1] = term23765;
        try {
            callMethod(klass, "createScope", argTypes, term23411, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



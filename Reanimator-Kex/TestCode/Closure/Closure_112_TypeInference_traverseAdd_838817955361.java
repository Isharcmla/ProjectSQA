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

public class TypeInference_traverseAdd_838817955361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term700110;
     Object term700180;

    public TypeInference_traverseAdd_838817955361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term700110 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term700180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term700250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term700320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term700390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term700460 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term700530 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term700250, term700250.getClass(), "next", term700320);
        setIntField(term700250, term700250.getClass(), "type", 14);
        setIntField(term700390, term700390.getClass(), "type", 14);
        setIntField(term700460, term700460.getClass(), "type", 14);
        setIntField(term700530, term700530.getClass(), "type", 116);
        setField(term700460, term700460.getClass(), "first", term700530);
        setField(term700390, term700390.getClass(), "first", term700460);
        setField(term700250, term700250.getClass(), "first", term700390);
        setField(term700180, term700180.getClass(), "first", term700250);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term700180;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term700110, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



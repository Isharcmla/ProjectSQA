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

public class TypeCheck_visit_8595247841690 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term575596;
     Object term575770;

    public TypeCheck_visit_8595247841690() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term575596 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term575700 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term575596, term575596.getClass(), "typeRegistry", term575700);
        term575770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term575840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term575936 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setIntField(term575770, term575770.getClass(), "type", 88);
        setIntField(term575840, term575840.getClass(), "type", 0);
        setField(term575840, term575840.getClass(), "jsType", term575936);
        setField(term575770, term575770.getClass(), "first", term575840);
        setField(term575770, term575770.getClass(), "last", term575770);
        setField(term575770, term575770.getClass(), "jsType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term575770;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term575596, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class TypeCheck_visit_859524784570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152478;
     Object term152548;

    public TypeCheck_visit_859524784570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152478 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term152548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term152618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term152706 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setIntField(term152548, term152548.getClass(), "type", 24);
        setField(term152618, term152618.getClass(), "jsType", term152706);
        setField(term152548, term152548.getClass(), "first", term152618);
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
        args[1] = term152548;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term152478, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



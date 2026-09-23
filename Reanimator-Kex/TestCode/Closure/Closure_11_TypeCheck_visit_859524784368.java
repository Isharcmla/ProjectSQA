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

public class TypeCheck_visit_859524784368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89682;
     Object term89842;

    public TypeCheck_visit_859524784368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89682 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term89772 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term89682, term89682.getClass(), "validator", term89772);
        term89842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89948 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setIntField(term89842, term89842.getClass(), "type", 103);
        setField(term89842, term89842.getClass(), "first", term89842);
        setField(term89842, term89842.getClass(), "jsType", term89948);
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
        args[1] = term89842;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term89682, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



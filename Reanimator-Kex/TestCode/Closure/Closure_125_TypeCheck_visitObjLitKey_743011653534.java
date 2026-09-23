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

public class TypeCheck_visitObjLitKey_743011653534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141104;
     Object term141174;
     Object term141244;
     Object term141336;

    public TypeCheck_visitObjLitKey_743011653534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141104 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term141174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term141244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term141244, term141244.getClass(), "propListHead", null);
        term141336 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term141174;
        args[2] = term141244;
        args[3] = term141336;
        try {
            callMethod(klass, "visitObjLitKey", argTypes, term141104, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



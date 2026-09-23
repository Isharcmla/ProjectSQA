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

public class TypeCheck_visitGetProp_513394509113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27011;
     Object term27081;

    public TypeCheck_visitGetProp_513394509113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27011 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term27081 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27319 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setField(term27081, term27081.getClass(), "last", term27151);
        setField(term27221, term27221.getClass(), "jsType", term27319);
        setField(term27081, term27081.getClass(), "first", term27221);
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
        args[1] = term27081;
        args[2] = null;
        try {
            callMethod(klass, "visitGetProp", argTypes, term27011, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeCheck_visitGetProp_513394509307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83197;
     Object term83387;

    public TypeCheck_visitGetProp_513394509307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83197 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term83301 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term83197, term83197.getClass(), "typeRegistry", term83301);
        term83387 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term83473 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term83387, term83387.getClass(), "jsType", null);
        setField(term83387, term83387.getClass(), "last", null);
        setField(term83473, term83473.getClass(), "jsType", null);
        setField(term83387, term83387.getClass(), "first", term83473);
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
        args[1] = term83387;
        args[2] = null;
        callMethod(klass, "visitGetProp", argTypes, term83197, args);
    }

};



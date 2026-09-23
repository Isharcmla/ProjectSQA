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

public class TypeCheck_visitGetProp_513394509550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152166;
     Object term152258;

    public TypeCheck_visitGetProp_513394509550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152166 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term152258 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term152350 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term152442 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term152258, term152258.getClass(), "jsType", null);
        setField(term152258, term152258.getClass(), "last", term152350);
        setField(term152258, term152258.getClass(), "first", term152442);
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
        args[1] = term152258;
        args[2] = null;
        callMethod(klass, "visitGetProp", argTypes, term152166, args);
    }

};



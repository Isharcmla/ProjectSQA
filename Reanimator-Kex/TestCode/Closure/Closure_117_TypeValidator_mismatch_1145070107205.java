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

public class TypeValidator_mismatch_1145070107205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73244;
     Object term73334;
     Object term73404;
     Object term73502;
     Object term73610;

    public TypeValidator_mismatch_1145070107205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73244 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term73334 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term73334, term73334.getClass(), "sourceName", null);
        term73404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term73502 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        term73610 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[4] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[5];
        args[0] = term73334;
        args[1] = term73404;
        args[2] = null;
        args[3] = term73502;
        args[4] = term73610;
        callMethod(klass, "mismatch", argTypes, term73244, args);
    }

};



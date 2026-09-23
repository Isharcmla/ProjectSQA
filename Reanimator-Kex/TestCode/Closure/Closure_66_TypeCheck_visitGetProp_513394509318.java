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

public class TypeCheck_visitGetProp_513394509318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85323;
     Object term85393;

    public TypeCheck_visitGetProp_513394509318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85323 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term85393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85629 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setField(term85393, term85393.getClass(), "jsType", null);
        setField(term85393, term85393.getClass(), "last", term85463);
        setField(term85533, term85533.getClass(), "jsType", term85629);
        setField(term85393, term85393.getClass(), "first", term85533);
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
        args[1] = term85393;
        args[2] = null;
        callMethod(klass, "visitGetProp", argTypes, term85323, args);
    }

};



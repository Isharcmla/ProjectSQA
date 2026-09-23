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

public class CheckAccessControls_getClassOfMethod_1679898606436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218957;
     Object term219043;
     Object term219227;

    public CheckAccessControls_getClassOfMethod_1679898606436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term218957 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term219043 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term219135 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        setIntField(term219043, term219043.getClass(), "type", 38);
        setField(term219043, term219043.getClass(), "jsType", term219135);
        term219227 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term219227, term219227.getClass(), "type", 38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term219043;
        args[1] = term219227;
        callMethod(klass, "getClassOfMethod", argTypes, term218957, args);
    }

};



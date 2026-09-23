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

public class CheckAccessControls_getClassOfMethod_1679898606441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221716;
     Object term221808;

    public CheckAccessControls_getClassOfMethod_1679898606441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221716 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term221808 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term221894 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term221808, term221808.getClass(), "type", 86);
        setField(term221808, term221808.getClass(), "first", term221894);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term221808;
        callMethod(klass, "getClassOfMethod", argTypes, term221716, args);
    }

};



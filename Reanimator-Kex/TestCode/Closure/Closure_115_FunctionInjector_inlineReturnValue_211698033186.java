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

public class FunctionInjector_inlineReturnValue_211698033186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17429;
     Object term17521;
     Object term17613;

    public FunctionInjector_inlineReturnValue_211698033186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17429 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector"));
        term17521 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term17613 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term17705 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term17613, term17613.getClass(), "last", term17705);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term17521;
        args[1] = term17613;
        callMethod(klass, "inlineReturnValue", argTypes, term17429, args);
    }

};



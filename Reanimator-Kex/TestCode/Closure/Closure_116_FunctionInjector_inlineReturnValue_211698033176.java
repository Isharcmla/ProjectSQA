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

public class FunctionInjector_inlineReturnValue_211698033176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17109;
     Object term17201;
     Object term17293;

    public FunctionInjector_inlineReturnValue_211698033176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17109 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector"));
        term17201 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term17293 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term17385 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term17293, term17293.getClass(), "last", term17385);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term17201;
        args[1] = term17293;
        callMethod(klass, "inlineReturnValue", argTypes, term17109, args);
    }

};



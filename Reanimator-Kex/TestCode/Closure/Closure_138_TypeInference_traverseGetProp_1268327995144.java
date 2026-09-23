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

public class TypeInference_traverseGetProp_1268327995144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77923;
     Object term77993;

    public TypeInference_traverseGetProp_1268327995144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77923 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term77993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term78063, term78063.getClass(), "type", 30);
        setField(term77993, term77993.getClass(), "first", term78063);
        setField(term77993, term77993.getClass(), "last", term78133);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term77993;
        args[1] = null;
        callMethod(klass, "traverseGetProp", argTypes, term77923, args);
    }

};



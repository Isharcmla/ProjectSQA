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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseGetProp_1268327995126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66228;
     Object term66298;

    public TypeInference_traverseGetProp_1268327995126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66228 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term66298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66368 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term66368, term66368.getClass(), "type", 99);
        setField(term66298, term66298.getClass(), "first", term66368);
        setField(term66298, term66298.getClass(), "last", term66438);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term66298;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetProp", argTypes, term66228, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};



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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseGetElem_100203513115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65198;
     Object term65268;

    public TypeInference_traverseGetElem_100203513115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65198 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term65268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term65338, term65338.getClass(), "type", -1639041228);
        setIntField(term65408, term65408.getClass(), "type", 138);
        setField(term65338, term65338.getClass(), "next", term65408);
        setField(term65268, term65268.getClass(), "first", term65338);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term65268;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term65198, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



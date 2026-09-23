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

public class TypeInference_traverseGetElem_100203513138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73201;
     Object term73271;

    public TypeInference_traverseGetElem_100203513138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73201 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term73271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term73341, term73341.getClass(), "type", -1639041228);
        setIntField(term73411, term73411.getClass(), "type", 113);
        setField(term73341, term73341.getClass(), "next", term73411);
        setField(term73271, term73271.getClass(), "first", term73341);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term73271;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term73201, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



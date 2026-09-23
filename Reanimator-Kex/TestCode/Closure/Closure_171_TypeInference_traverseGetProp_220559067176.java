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

public class TypeInference_traverseGetProp_220559067176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88201;
     Object term88271;

    public TypeInference_traverseGetProp_220559067176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88201 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term88271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term88271, term88271.getClass(), "first", term88271);
        setField(term88271, term88271.getClass(), "last", term88341);
        setIntField(term88271, term88271.getClass(), "type", 1545119095);
        setIntField(term88411, term88411.getClass(), "type", 98);
        setField(term88271, term88271.getClass(), "next", term88411);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term88271;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetProp", argTypes, term88201, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



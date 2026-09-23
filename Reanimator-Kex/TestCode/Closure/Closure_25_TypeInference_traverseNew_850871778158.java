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

public class TypeInference_traverseNew_850871778158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50364;
     Object term50434;

    public TypeInference_traverseNew_850871778158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50364 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term50434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50504, term50504.getClass(), "type", -233024044);
        setField(term50504, term50504.getClass(), "propListHead", null);
        setField(term50504, term50504.getClass(), "jsType", null);
        setIntField(term50574, term50574.getClass(), "type", 103);
        setField(term50504, term50504.getClass(), "next", term50574);
        setField(term50434, term50434.getClass(), "first", term50504);
        setField(term50434, term50434.getClass(), "jsType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term50434;
        args[1] = null;
        try {
            callMethod(klass, "traverseNew", argTypes, term50364, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



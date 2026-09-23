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

public class TypeInference_traverseNew_850871778126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71484;
     Object term71554;

    public TypeInference_traverseNew_850871778126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71484 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term71554 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term71624, term71624.getClass(), "type", -128490829);
        setIntField(term71694, term71694.getClass(), "type", 87);
        setField(term71624, term71624.getClass(), "next", term71694);
        setField(term71554, term71554.getClass(), "first", term71624);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term71554;
        args[1] = null;
        try {
            callMethod(klass, "traverseNew", argTypes, term71484, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



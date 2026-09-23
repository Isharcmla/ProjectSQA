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

public class TypeInference_traverseAssign_157422923356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1315984;
     Object term1316054;

    public TypeInference_traverseAssign_157422923356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1315984 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1316054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1316124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1316194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1316124, term1316124.getClass(), "type", -615654495);
        setField(term1316124, term1316124.getClass(), "propListHead", null);
        setIntField(term1316194, term1316194.getClass(), "type", 8);
        setField(term1316124, term1316124.getClass(), "next", term1316194);
        setField(term1316054, term1316054.getClass(), "first", term1316124);
        setField(term1316054, term1316054.getClass(), "last", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1316054;
        args[1] = null;
        callMethod(klass, "traverseAssign", argTypes, term1315984, args);
    }

};



package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.util.ArrayList;

public class FunctionType_resolveInternal_5807426447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term298977;
     Object term299095;

    public FunctionType_resolveInternal_5807426447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term299029 = new ArrayList();
        ArrayList term299081 = new ArrayList();
        term298977 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term298977, term298977.getClass(), "call", null);
        setField(term298977, term298977.getClass(), "prototype", null);
        setField(term298977, term298977.getClass(), "typeOfThis", null);
        setField(term298977, term298977.getClass(), "implementedInterfaces", term299029);
        setField(term298977, term298977.getClass(), "subTypes", term299081);
        ArrayList term299096 = new ArrayList();
        ArrayList term299098 = new ArrayList();
        term299095 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term299095, term299095.getClass(), "leastSupertypeVisitor", null);
        setField(term299095, term299095.getClass(), "greatestSubtypeVisitor", null);
        setField(term299095, term299095.getClass(), "call", null);
        setField(term299095, term299095.getClass(), "prototype", null);
        setField(term299095, term299095.getClass(), "kind", null);
        setField(term299095, term299095.getClass(), "typeOfThis", null);
        setField(term299095, term299095.getClass(), "source", null);
        setField(term299095, term299095.getClass(), "implementedInterfaces", term299096);
        setField(term299095, term299095.getClass(), "subTypes", term299098);
        setField(term299095, term299095.getClass(), "templateTypeName", null);
        setField(term299095, term299095.getClass(), "className", null);
        setField(term299095, term299095.getClass(), "properties", null);
        setField(term299095, term299095.getClass(), "implicitPrototype", null);
        setBooleanField(term299095, term299095.getClass(), "nativeType", false);
        setBooleanField(term299095, term299095.getClass(), "visited", false);
        setField(term299095, term299095.getClass(), "docInfo", null);
        setBooleanField(term299095, term299095.getClass(), "unknown", false);
        setBooleanField(term299095, term299095.getClass(), "resolved", false);
        setField(term299095, term299095.getClass(), "resolveResult", null);
        setField(term299095, term299095.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "resolveInternal", argTypes, term298977, args);
        assertTrue(recursiveEquals(term298977, term299095));
    }

};



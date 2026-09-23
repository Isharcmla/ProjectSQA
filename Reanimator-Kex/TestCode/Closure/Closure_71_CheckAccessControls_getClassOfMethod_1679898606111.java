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
import static com.google.javascript.jscomp.EqualityUtils.*;

public class CheckAccessControls_getClassOfMethod_1679898606111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29752;
     Object term29844;
     Object term29936;
     Object term29955;
     Object term29956;
     Object term29957;

    public CheckAccessControls_getClassOfMethod_1679898606111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29752 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term29844 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term29844, term29844.getClass(), "type", 38);
        term29936 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term29936, term29936.getClass(), "type", 38);
        term29955 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term29955, term29955.getClass(), "compiler", null);
        setField(term29955, term29955.getClass(), "validator", null);
        setIntField(term29955, term29955.getClass(), "deprecatedDepth", 0);
        setIntField(term29955, term29955.getClass(), "methodDepth", 0);
        setField(term29955, term29955.getClass(), "currentClass", null);
        setField(term29955, term29955.getClass(), "initializedConstantProperties", null);
        term29956 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term29956, term29956.getClass(), "str", null);
        setIntField(term29956, term29956.getClass(), "type", 38);
        setField(term29956, term29956.getClass(), "next", null);
        setField(term29956, term29956.getClass(), "first", null);
        setField(term29956, term29956.getClass(), "last", null);
        setField(term29956, term29956.getClass(), "propListHead", null);
        setIntField(term29956, term29956.getClass(), "sourcePosition", 0);
        setField(term29956, term29956.getClass(), "jsType", null);
        setField(term29956, term29956.getClass(), "parent", null);
        term29957 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term29957, term29957.getClass(), "str", null);
        setIntField(term29957, term29957.getClass(), "type", 38);
        setField(term29957, term29957.getClass(), "next", null);
        setField(term29957, term29957.getClass(), "first", null);
        setField(term29957, term29957.getClass(), "last", null);
        setField(term29957, term29957.getClass(), "propListHead", null);
        setIntField(term29957, term29957.getClass(), "sourcePosition", 0);
        setField(term29957, term29957.getClass(), "jsType", null);
        setField(term29957, term29957.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term29844;
        args[1] = term29936;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term29752, args);
        assertTrue(recursiveEquals(term29752, term29955));
        assertTrue(recursiveEquals(term29844, term29956));
        assertTrue(recursiveEquals(term29936, term29957));
        assertTrue(recursiveEquals(retValue, null));
    }

};



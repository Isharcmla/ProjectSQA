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

public class CheckAccessControls_getClassOfMethod_167989860679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21154;
     Object term21246;
     Object term21338;
     Object term22001;
     Object term22002;
     Object term22003;

    public CheckAccessControls_getClassOfMethod_167989860679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21154 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term21246 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term21338 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term21338, term21338.getClass(), "type", -87);
        term22001 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term22001, term22001.getClass(), "compiler", null);
        setField(term22001, term22001.getClass(), "validator", null);
        setIntField(term22001, term22001.getClass(), "deprecatedDepth", 0);
        setIntField(term22001, term22001.getClass(), "methodDepth", 0);
        setField(term22001, term22001.getClass(), "currentClass", null);
        setField(term22001, term22001.getClass(), "initializedConstantProperties", null);
        term22002 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term22002, term22002.getClass(), "number", 0.0);
        setIntField(term22002, term22002.getClass(), "type", -87);
        setField(term22002, term22002.getClass(), "next", null);
        setField(term22002, term22002.getClass(), "first", null);
        setField(term22002, term22002.getClass(), "last", null);
        setField(term22002, term22002.getClass(), "propListHead", null);
        setIntField(term22002, term22002.getClass(), "sourcePosition", 0);
        setField(term22002, term22002.getClass(), "jsType", null);
        setField(term22002, term22002.getClass(), "parent", null);
        term22003 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term22003, term22003.getClass(), "number", 0.0);
        setIntField(term22003, term22003.getClass(), "type", 0);
        setField(term22003, term22003.getClass(), "next", null);
        setField(term22003, term22003.getClass(), "first", null);
        setField(term22003, term22003.getClass(), "last", null);
        setField(term22003, term22003.getClass(), "propListHead", null);
        setIntField(term22003, term22003.getClass(), "sourcePosition", 0);
        setField(term22003, term22003.getClass(), "jsType", null);
        setField(term22003, term22003.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term21246;
        args[1] = term21338;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term21154, args);
        assertTrue(recursiveEquals(term21154, term22001));
        assertTrue(recursiveEquals(term21246, term22002));
        assertTrue(recursiveEquals(term21338, term22003));
        assertTrue(recursiveEquals(retValue, null));
    }

};



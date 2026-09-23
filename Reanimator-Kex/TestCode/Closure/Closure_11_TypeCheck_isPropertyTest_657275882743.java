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

public class TypeCheck_isPropertyTest_657275882743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188732;
     Object term188824;
     Object term189035;
     Object term189036;

    public TypeCheck_isPropertyTest_657275882743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188732 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term188824 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term188824, term188824.getClass(), "parent", term188824);
        setIntField(term188824, term188824.getClass(), "type", 98);
        term189035 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term189035, term189035.getClass(), "compiler", null);
        setField(term189035, term189035.getClass(), "validator", null);
        setField(term189035, term189035.getClass(), "reverseInterpreter", null);
        setField(term189035, term189035.getClass(), "typeRegistry", null);
        setField(term189035, term189035.getClass(), "topScope", null);
        setField(term189035, term189035.getClass(), "scopeCreator", null);
        setField(term189035, term189035.getClass(), "reportMissingOverride", null);
        setField(term189035, term189035.getClass(), "reportUnknownTypes", null);
        setBooleanField(term189035, term189035.getClass(), "reportMissingProperties", false);
        setField(term189035, term189035.getClass(), "inferJSDocInfo", null);
        setIntField(term189035, term189035.getClass(), "typedCount", 0);
        setIntField(term189035, term189035.getClass(), "nullCount", 0);
        setIntField(term189035, term189035.getClass(), "unknownCount", 0);
        setBooleanField(term189035, term189035.getClass(), "inExterns", false);
        setIntField(term189035, term189035.getClass(), "noTypeCheckSection", 0);
        term189036 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term189036, term189036.getClass(), "number", 0.0);
        setIntField(term189036, term189036.getClass(), "type", 98);
        setField(term189036, term189036.getClass(), "next", null);
        setField(term189036, term189036.getClass(), "first", null);
        setField(term189036, term189036.getClass(), "last", null);
        setField(term189036, term189036.getClass(), "propListHead", null);
        setIntField(term189036, term189036.getClass(), "sourcePosition", 0);
        setField(term189036, term189036.getClass(), "jsType", null);
        setField(term189036, term189036.getClass(), "parent", term189036);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term188824;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term188732, args);
        assertTrue(recursiveEquals(term188732, term189035));
        assertTrue(recursiveEquals(term188824, term189036));
        assertTrue(recursiveEquals(retValue, false));
    }

};



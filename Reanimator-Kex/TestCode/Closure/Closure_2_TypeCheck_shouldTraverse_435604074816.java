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
import java.lang.Object;

public class TypeCheck_shouldTraverse_435604074816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220776;
     Object term220958;
     Object term220983;
     Object term220985;

    public TypeCheck_shouldTraverse_435604074816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term220776 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term220866 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term220776, term220776.getClass(), "validator", term220866);
        setIntField(term220776, term220776.getClass(), "noTypeCheckSection", 0);
        term220958 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term220958, term220958.getClass(), "type", 132);
        setField(term220958, term220958.getClass(), "propListHead", null);
        term220983 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term220984 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term220983, term220983.getClass(), "compiler", null);
        setField(term220984, term220984.getClass(), "compiler", null);
        setField(term220984, term220984.getClass(), "typeRegistry", null);
        setField(term220984, term220984.getClass(), "allValueTypes", null);
        setBooleanField(term220984, term220984.getClass(), "shouldReport", true);
        setField(term220984, term220984.getClass(), "nullOrUndefined", null);
        setField(term220984, term220984.getClass(), "mismatches", null);
        setField(term220983, term220983.getClass(), "validator", term220984);
        setField(term220983, term220983.getClass(), "reverseInterpreter", null);
        setField(term220983, term220983.getClass(), "typeRegistry", null);
        setField(term220983, term220983.getClass(), "topScope", null);
        setField(term220983, term220983.getClass(), "scopeCreator", null);
        setField(term220983, term220983.getClass(), "reportMissingOverride", null);
        setField(term220983, term220983.getClass(), "reportUnknownTypes", null);
        setBooleanField(term220983, term220983.getClass(), "reportMissingProperties", false);
        setField(term220983, term220983.getClass(), "inferJSDocInfo", null);
        setIntField(term220983, term220983.getClass(), "typedCount", 0);
        setIntField(term220983, term220983.getClass(), "nullCount", 0);
        setIntField(term220983, term220983.getClass(), "unknownCount", 0);
        setBooleanField(term220983, term220983.getClass(), "inExterns", false);
        setIntField(term220983, term220983.getClass(), "noTypeCheckSection", 0);
        term220985 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term220985, term220985.getClass(), "number", 0.0);
        setIntField(term220985, term220985.getClass(), "type", 132);
        setField(term220985, term220985.getClass(), "next", null);
        setField(term220985, term220985.getClass(), "first", null);
        setField(term220985, term220985.getClass(), "last", null);
        setField(term220985, term220985.getClass(), "propListHead", null);
        setIntField(term220985, term220985.getClass(), "sourcePosition", 0);
        setField(term220985, term220985.getClass(), "jsType", null);
        setField(term220985, term220985.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term220958;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term220776, args);
        assertTrue(recursiveEquals(term220776, term220983));
        assertTrue(recursiveEquals(term220958, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};



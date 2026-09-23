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

public class TypeCheck_visit_859524784538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149332;
     Object term149424;
     Object term149628;
     Object term149629;

    public TypeCheck_visit_859524784538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149332 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term149424 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term149424, term149424.getClass(), "type", 120);
        term149628 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term149628, term149628.getClass(), "compiler", null);
        setField(term149628, term149628.getClass(), "validator", null);
        setField(term149628, term149628.getClass(), "reverseInterpreter", null);
        setField(term149628, term149628.getClass(), "typeRegistry", null);
        setField(term149628, term149628.getClass(), "topScope", null);
        setField(term149628, term149628.getClass(), "scopeCreator", null);
        setField(term149628, term149628.getClass(), "reportMissingOverride", null);
        setField(term149628, term149628.getClass(), "reportUnknownTypes", null);
        setBooleanField(term149628, term149628.getClass(), "reportMissingProperties", false);
        setField(term149628, term149628.getClass(), "inferJSDocInfo", null);
        setIntField(term149628, term149628.getClass(), "typedCount", 0);
        setIntField(term149628, term149628.getClass(), "nullCount", 0);
        setIntField(term149628, term149628.getClass(), "unknownCount", 0);
        setBooleanField(term149628, term149628.getClass(), "inExterns", false);
        setIntField(term149628, term149628.getClass(), "noTypeCheckSection", 0);
        term149629 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term149629, term149629.getClass(), "str", null);
        setIntField(term149629, term149629.getClass(), "type", 120);
        setField(term149629, term149629.getClass(), "next", null);
        setField(term149629, term149629.getClass(), "first", null);
        setField(term149629, term149629.getClass(), "last", null);
        setField(term149629, term149629.getClass(), "propListHead", null);
        setIntField(term149629, term149629.getClass(), "sourcePosition", 0);
        setField(term149629, term149629.getClass(), "jsType", null);
        setField(term149629, term149629.getClass(), "parent", null);
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
        args[1] = term149424;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term149332, args);
        assertTrue(recursiveEquals(term149332, term149628));
        assertTrue(recursiveEquals(term149424, null));
    }

};



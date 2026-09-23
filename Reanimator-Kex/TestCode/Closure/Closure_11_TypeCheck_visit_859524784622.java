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

public class TypeCheck_visit_859524784622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158556;
     Object term158648;
     Object term158664;
     Object term158665;

    public TypeCheck_visit_859524784622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158556 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term158648 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term158648, term158648.getClass(), "type", 126);
        term158664 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term158664, term158664.getClass(), "compiler", null);
        setField(term158664, term158664.getClass(), "validator", null);
        setField(term158664, term158664.getClass(), "reverseInterpreter", null);
        setField(term158664, term158664.getClass(), "typeRegistry", null);
        setField(term158664, term158664.getClass(), "topScope", null);
        setField(term158664, term158664.getClass(), "scopeCreator", null);
        setField(term158664, term158664.getClass(), "reportMissingOverride", null);
        setField(term158664, term158664.getClass(), "reportUnknownTypes", null);
        setBooleanField(term158664, term158664.getClass(), "reportMissingProperties", false);
        setField(term158664, term158664.getClass(), "inferJSDocInfo", null);
        setIntField(term158664, term158664.getClass(), "typedCount", 0);
        setIntField(term158664, term158664.getClass(), "nullCount", 0);
        setIntField(term158664, term158664.getClass(), "unknownCount", 0);
        setBooleanField(term158664, term158664.getClass(), "inExterns", false);
        setIntField(term158664, term158664.getClass(), "noTypeCheckSection", 0);
        term158665 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term158665, term158665.getClass(), "str", null);
        setIntField(term158665, term158665.getClass(), "type", 126);
        setField(term158665, term158665.getClass(), "next", null);
        setField(term158665, term158665.getClass(), "first", null);
        setField(term158665, term158665.getClass(), "last", null);
        setField(term158665, term158665.getClass(), "propListHead", null);
        setIntField(term158665, term158665.getClass(), "sourcePosition", 0);
        setField(term158665, term158665.getClass(), "jsType", null);
        setField(term158665, term158665.getClass(), "parent", null);
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
        args[1] = term158648;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term158556, args);
        assertTrue(recursiveEquals(term158556, term158664));
        assertTrue(recursiveEquals(term158648, null));
    }

};



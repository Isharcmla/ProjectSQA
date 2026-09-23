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

public class TypeCheck_visit_859524784438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107916;
     Object term107986;
     Object term108002;
     Object term108003;

    public TypeCheck_visit_859524784438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107916 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term107986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term107986, term107986.getClass(), "type", 112);
        term108002 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term108002, term108002.getClass(), "compiler", null);
        setField(term108002, term108002.getClass(), "validator", null);
        setField(term108002, term108002.getClass(), "reverseInterpreter", null);
        setField(term108002, term108002.getClass(), "typeRegistry", null);
        setField(term108002, term108002.getClass(), "topScope", null);
        setField(term108002, term108002.getClass(), "scopeCreator", null);
        setField(term108002, term108002.getClass(), "reportMissingOverride", null);
        setField(term108002, term108002.getClass(), "reportUnknownTypes", null);
        setBooleanField(term108002, term108002.getClass(), "reportMissingProperties", false);
        setField(term108002, term108002.getClass(), "inferJSDocInfo", null);
        setIntField(term108002, term108002.getClass(), "typedCount", 0);
        setIntField(term108002, term108002.getClass(), "nullCount", 0);
        setIntField(term108002, term108002.getClass(), "unknownCount", 0);
        setBooleanField(term108002, term108002.getClass(), "inExterns", false);
        setIntField(term108002, term108002.getClass(), "noTypeCheckSection", 0);
        term108003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term108003, term108003.getClass(), "type", 112);
        setField(term108003, term108003.getClass(), "next", null);
        setField(term108003, term108003.getClass(), "first", null);
        setField(term108003, term108003.getClass(), "last", null);
        setField(term108003, term108003.getClass(), "propListHead", null);
        setIntField(term108003, term108003.getClass(), "sourcePosition", 0);
        setField(term108003, term108003.getClass(), "jsType", null);
        setField(term108003, term108003.getClass(), "parent", null);
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
        args[1] = term107986;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term107916, args);
        assertTrue(recursiveEquals(term107916, term108002));
        assertTrue(recursiveEquals(term107986, null));
    }

};



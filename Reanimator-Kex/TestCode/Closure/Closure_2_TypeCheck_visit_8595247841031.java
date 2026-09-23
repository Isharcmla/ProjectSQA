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

public class TypeCheck_visit_8595247841031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292092;
     Object term292184;
     Object term292388;
     Object term292389;

    public TypeCheck_visit_8595247841031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292092 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term292184 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term292184, term292184.getClass(), "type", 77);
        term292388 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term292388, term292388.getClass(), "compiler", null);
        setField(term292388, term292388.getClass(), "validator", null);
        setField(term292388, term292388.getClass(), "reverseInterpreter", null);
        setField(term292388, term292388.getClass(), "typeRegistry", null);
        setField(term292388, term292388.getClass(), "topScope", null);
        setField(term292388, term292388.getClass(), "scopeCreator", null);
        setField(term292388, term292388.getClass(), "reportMissingOverride", null);
        setField(term292388, term292388.getClass(), "reportUnknownTypes", null);
        setBooleanField(term292388, term292388.getClass(), "reportMissingProperties", false);
        setField(term292388, term292388.getClass(), "inferJSDocInfo", null);
        setIntField(term292388, term292388.getClass(), "typedCount", 0);
        setIntField(term292388, term292388.getClass(), "nullCount", 0);
        setIntField(term292388, term292388.getClass(), "unknownCount", 0);
        setBooleanField(term292388, term292388.getClass(), "inExterns", false);
        setIntField(term292388, term292388.getClass(), "noTypeCheckSection", 0);
        term292389 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term292389, term292389.getClass(), "str", null);
        setIntField(term292389, term292389.getClass(), "type", 77);
        setField(term292389, term292389.getClass(), "next", null);
        setField(term292389, term292389.getClass(), "first", null);
        setField(term292389, term292389.getClass(), "last", null);
        setField(term292389, term292389.getClass(), "propListHead", null);
        setIntField(term292389, term292389.getClass(), "sourcePosition", 0);
        setField(term292389, term292389.getClass(), "jsType", null);
        setField(term292389, term292389.getClass(), "parent", null);
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
        args[1] = term292184;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term292092, args);
        assertTrue(recursiveEquals(term292092, term292388));
        assertTrue(recursiveEquals(term292184, null));
    }

};



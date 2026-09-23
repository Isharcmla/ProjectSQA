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

public class TypeCheck_visit_8595247841128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323942;
     Object term324012;
     Object term324028;
     Object term324029;

    public TypeCheck_visit_8595247841128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term323942 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term324012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term324012, term324012.getClass(), "type", 83);
        term324028 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term324028, term324028.getClass(), "compiler", null);
        setField(term324028, term324028.getClass(), "validator", null);
        setField(term324028, term324028.getClass(), "reverseInterpreter", null);
        setField(term324028, term324028.getClass(), "typeRegistry", null);
        setField(term324028, term324028.getClass(), "topScope", null);
        setField(term324028, term324028.getClass(), "scopeCreator", null);
        setField(term324028, term324028.getClass(), "reportMissingOverride", null);
        setField(term324028, term324028.getClass(), "reportUnknownTypes", null);
        setBooleanField(term324028, term324028.getClass(), "reportMissingProperties", false);
        setField(term324028, term324028.getClass(), "inferJSDocInfo", null);
        setIntField(term324028, term324028.getClass(), "typedCount", 0);
        setIntField(term324028, term324028.getClass(), "nullCount", 0);
        setIntField(term324028, term324028.getClass(), "unknownCount", 0);
        setBooleanField(term324028, term324028.getClass(), "inExterns", false);
        setIntField(term324028, term324028.getClass(), "noTypeCheckSection", 0);
        term324029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term324029, term324029.getClass(), "type", 83);
        setField(term324029, term324029.getClass(), "next", null);
        setField(term324029, term324029.getClass(), "first", null);
        setField(term324029, term324029.getClass(), "last", null);
        setField(term324029, term324029.getClass(), "propListHead", null);
        setIntField(term324029, term324029.getClass(), "sourcePosition", 0);
        setField(term324029, term324029.getClass(), "jsType", null);
        setField(term324029, term324029.getClass(), "parent", null);
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
        args[1] = term324012;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term323942, args);
        assertTrue(recursiveEquals(term323942, term324028));
        assertTrue(recursiveEquals(term324012, null));
    }

};



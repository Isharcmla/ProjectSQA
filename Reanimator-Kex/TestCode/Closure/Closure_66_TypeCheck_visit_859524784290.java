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

public class TypeCheck_visit_859524784290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76451;
     Object term76521;
     Object term76538;
     Object term76539;

    public TypeCheck_visit_859524784290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76451 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setBooleanField(term76451, term76451.getClass(), "inExterns", true);
        term76521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term76521, term76521.getClass(), "type", 147);
        term76538 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term76538, term76538.getClass(), "compiler", null);
        setField(term76538, term76538.getClass(), "validator", null);
        setField(term76538, term76538.getClass(), "reverseInterpreter", null);
        setField(term76538, term76538.getClass(), "typeRegistry", null);
        setField(term76538, term76538.getClass(), "topScope", null);
        setField(term76538, term76538.getClass(), "scopeCreator", null);
        setField(term76538, term76538.getClass(), "reportMissingOverride", null);
        setField(term76538, term76538.getClass(), "reportUnknownTypes", null);
        setBooleanField(term76538, term76538.getClass(), "reportMissingProperties", false);
        setField(term76538, term76538.getClass(), "inferJSDocInfo", null);
        setIntField(term76538, term76538.getClass(), "typedCount", 0);
        setIntField(term76538, term76538.getClass(), "nullCount", 0);
        setIntField(term76538, term76538.getClass(), "unknownCount", 0);
        setBooleanField(term76538, term76538.getClass(), "inExterns", true);
        setIntField(term76538, term76538.getClass(), "noTypeCheckSection", 0);
        term76539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term76539, term76539.getClass(), "type", 147);
        setField(term76539, term76539.getClass(), "next", null);
        setField(term76539, term76539.getClass(), "first", null);
        setField(term76539, term76539.getClass(), "last", null);
        setField(term76539, term76539.getClass(), "propListHead", null);
        setIntField(term76539, term76539.getClass(), "sourcePosition", 0);
        setField(term76539, term76539.getClass(), "jsType", null);
        setField(term76539, term76539.getClass(), "parent", null);
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
        args[1] = term76521;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term76451, args);
        assertTrue(recursiveEquals(term76451, term76538));
        assertTrue(recursiveEquals(term76521, null));
    }

};



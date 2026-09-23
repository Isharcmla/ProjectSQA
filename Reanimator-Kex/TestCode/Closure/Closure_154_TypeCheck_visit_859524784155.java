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

public class TypeCheck_visit_859524784155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45216;
     Object term45286;
     Object term45302;
     Object term45303;

    public TypeCheck_visit_859524784155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45216 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term45286 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45286, term45286.getClass(), "type", 153);
        term45302 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term45302, term45302.getClass(), "compiler", null);
        setField(term45302, term45302.getClass(), "validator", null);
        setField(term45302, term45302.getClass(), "reverseInterpreter", null);
        setField(term45302, term45302.getClass(), "typeRegistry", null);
        setField(term45302, term45302.getClass(), "topScope", null);
        setField(term45302, term45302.getClass(), "scopeCreator", null);
        setField(term45302, term45302.getClass(), "reportMissingOverride", null);
        setField(term45302, term45302.getClass(), "reportUnknownTypes", null);
        setBooleanField(term45302, term45302.getClass(), "reportMissingProperties", false);
        setField(term45302, term45302.getClass(), "inferJSDocInfo", null);
        setIntField(term45302, term45302.getClass(), "typedCount", 0);
        setIntField(term45302, term45302.getClass(), "nullCount", 0);
        setIntField(term45302, term45302.getClass(), "unknownCount", 0);
        setBooleanField(term45302, term45302.getClass(), "inExterns", false);
        setIntField(term45302, term45302.getClass(), "noTypeCheckSection", 0);
        term45303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45303, term45303.getClass(), "type", 153);
        setField(term45303, term45303.getClass(), "next", null);
        setField(term45303, term45303.getClass(), "first", null);
        setField(term45303, term45303.getClass(), "last", null);
        setField(term45303, term45303.getClass(), "propListHead", null);
        setIntField(term45303, term45303.getClass(), "sourcePosition", 0);
        setField(term45303, term45303.getClass(), "jsType", null);
        setField(term45303, term45303.getClass(), "parent", null);
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
        args[1] = term45286;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term45216, args);
        assertTrue(recursiveEquals(term45216, term45302));
        assertTrue(recursiveEquals(term45286, null));
    }

};



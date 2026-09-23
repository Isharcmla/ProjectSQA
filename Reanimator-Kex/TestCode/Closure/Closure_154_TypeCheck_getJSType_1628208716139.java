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

public class TypeCheck_getJSType_1628208716139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40478;
     Object term40548;
     Object term40690;
     Object term40691;
     Object term40676;

    public TypeCheck_getJSType_1628208716139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40478 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term40548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40666 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term40548, term40548.getClass(), "jsType", term40666);
        term40690 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term40690, term40690.getClass(), "compiler", null);
        setField(term40690, term40690.getClass(), "validator", null);
        setField(term40690, term40690.getClass(), "reverseInterpreter", null);
        setField(term40690, term40690.getClass(), "typeRegistry", null);
        setField(term40690, term40690.getClass(), "topScope", null);
        setField(term40690, term40690.getClass(), "scopeCreator", null);
        setField(term40690, term40690.getClass(), "reportMissingOverride", null);
        setField(term40690, term40690.getClass(), "reportUnknownTypes", null);
        setBooleanField(term40690, term40690.getClass(), "reportMissingProperties", false);
        setField(term40690, term40690.getClass(), "inferJSDocInfo", null);
        setIntField(term40690, term40690.getClass(), "typedCount", 0);
        setIntField(term40690, term40690.getClass(), "nullCount", 0);
        setIntField(term40690, term40690.getClass(), "unknownCount", 0);
        setBooleanField(term40690, term40690.getClass(), "inExterns", false);
        setIntField(term40690, term40690.getClass(), "noTypeCheckSection", 0);
        term40691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40692 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term40691, term40691.getClass(), "type", 0);
        setField(term40691, term40691.getClass(), "next", null);
        setField(term40691, term40691.getClass(), "first", null);
        setField(term40691, term40691.getClass(), "last", null);
        setField(term40691, term40691.getClass(), "propListHead", null);
        setIntField(term40691, term40691.getClass(), "sourcePosition", 0);
        setField(term40692, term40692.getClass(), "ownerFunction", null);
        setField(term40692, term40692.getClass(), "className", null);
        setField(term40692, term40692.getClass(), "properties", null);
        setBooleanField(term40692, term40692.getClass(), "nativeType", false);
        setField(term40692, term40692.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term40692, term40692.getClass(), "prettyPrint", false);
        setBooleanField(term40692, term40692.getClass(), "visited", false);
        setField(term40692, term40692.getClass(), "docInfo", null);
        setBooleanField(term40692, term40692.getClass(), "unknown", false);
        setBooleanField(term40692, term40692.getClass(), "resolved", false);
        setField(term40692, term40692.getClass(), "resolveResult", null);
        setField(term40692, term40692.getClass(), "registry", null);
        setField(term40691, term40691.getClass(), "jsType", term40692);
        setField(term40691, term40691.getClass(), "parent", null);
        term40676 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term40676, term40676.getClass(), "ownerFunction", null);
        setField(term40676, term40676.getClass(), "className", null);
        setField(term40676, term40676.getClass(), "properties", null);
        setBooleanField(term40676, term40676.getClass(), "nativeType", false);
        setField(term40676, term40676.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term40676, term40676.getClass(), "prettyPrint", false);
        setBooleanField(term40676, term40676.getClass(), "visited", false);
        setField(term40676, term40676.getClass(), "docInfo", null);
        setBooleanField(term40676, term40676.getClass(), "unknown", false);
        setBooleanField(term40676, term40676.getClass(), "resolved", false);
        setField(term40676, term40676.getClass(), "resolveResult", null);
        setField(term40676, term40676.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term40548;
        Object retValue = callMethod(klass, "getJSType", argTypes, term40478, args);
        assertTrue(recursiveEquals(term40478, term40690));
        assertTrue(recursiveEquals(term40548, term40691));
        assertTrue(recursiveEquals(retValue, term40676));
    }

};



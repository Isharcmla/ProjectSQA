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

public class TypeCheck_visitParameterList_2094647345476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144598;
     Object term144684;
     Object term144854;
     Object term145506;
     Object term145507;
     Object term145509;

    public TypeCheck_visitParameterList_2094647345476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144598 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term144684 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term144754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term144684, term144684.getClass(), "first", term144754);
        term144854 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term144948 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term145034 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term144948, term144948.getClass(), "parameters", term145034);
        setField(term144854, term144854.getClass(), "call", term144948);
        term145506 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term145506, term145506.getClass(), "compiler", null);
        setField(term145506, term145506.getClass(), "validator", null);
        setField(term145506, term145506.getClass(), "reverseInterpreter", null);
        setField(term145506, term145506.getClass(), "typeRegistry", null);
        setField(term145506, term145506.getClass(), "topScope", null);
        setField(term145506, term145506.getClass(), "scopeCreator", null);
        setField(term145506, term145506.getClass(), "reportMissingOverride", null);
        setField(term145506, term145506.getClass(), "reportUnknownTypes", null);
        setBooleanField(term145506, term145506.getClass(), "reportMissingProperties", false);
        setField(term145506, term145506.getClass(), "inferJSDocInfo", null);
        setIntField(term145506, term145506.getClass(), "typedCount", 0);
        setIntField(term145506, term145506.getClass(), "nullCount", 0);
        setIntField(term145506, term145506.getClass(), "unknownCount", 0);
        setBooleanField(term145506, term145506.getClass(), "inExterns", false);
        setIntField(term145506, term145506.getClass(), "noTypeCheckSection", 0);
        term145507 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term145508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term145507, term145507.getClass(), "functionName", null);
        setBooleanField(term145507, term145507.getClass(), "itsNeedsActivation", false);
        setIntField(term145507, term145507.getClass(), "itsFunctionType", 0);
        setBooleanField(term145507, term145507.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term145507, term145507.getClass(), "encodedSourceStart", 0);
        setIntField(term145507, term145507.getClass(), "encodedSourceEnd", 0);
        setField(term145507, term145507.getClass(), "sourceName", null);
        setIntField(term145507, term145507.getClass(), "baseLineno", 0);
        setIntField(term145507, term145507.getClass(), "endLineno", 0);
        setField(term145507, term145507.getClass(), "functions", null);
        setField(term145507, term145507.getClass(), "regexps", null);
        setField(term145507, term145507.getClass(), "itsVariables", null);
        setField(term145507, term145507.getClass(), "itsConst", null);
        setField(term145507, term145507.getClass(), "itsVariableNames", null);
        setIntField(term145507, term145507.getClass(), "varStart", 0);
        setField(term145507, term145507.getClass(), "compilerData", null);
        setIntField(term145507, term145507.getClass(), "type", 0);
        setField(term145507, term145507.getClass(), "next", null);
        setIntField(term145508, term145508.getClass(), "type", 0);
        setField(term145508, term145508.getClass(), "next", null);
        setField(term145508, term145508.getClass(), "first", null);
        setField(term145508, term145508.getClass(), "last", null);
        setField(term145508, term145508.getClass(), "propListHead", null);
        setIntField(term145508, term145508.getClass(), "sourcePosition", 0);
        setField(term145508, term145508.getClass(), "jsType", null);
        setField(term145508, term145508.getClass(), "parent", null);
        setField(term145507, term145507.getClass(), "first", term145508);
        setField(term145507, term145507.getClass(), "last", null);
        setField(term145507, term145507.getClass(), "propListHead", null);
        setIntField(term145507, term145507.getClass(), "sourcePosition", 0);
        setField(term145507, term145507.getClass(), "jsType", null);
        setField(term145507, term145507.getClass(), "parent", null);
        term145509 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term145510 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term145511 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term145511, term145511.getClass(), "functionName", null);
        setBooleanField(term145511, term145511.getClass(), "itsNeedsActivation", false);
        setIntField(term145511, term145511.getClass(), "itsFunctionType", 0);
        setBooleanField(term145511, term145511.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term145511, term145511.getClass(), "encodedSourceStart", 0);
        setIntField(term145511, term145511.getClass(), "encodedSourceEnd", 0);
        setField(term145511, term145511.getClass(), "sourceName", null);
        setIntField(term145511, term145511.getClass(), "baseLineno", 0);
        setIntField(term145511, term145511.getClass(), "endLineno", 0);
        setField(term145511, term145511.getClass(), "functions", null);
        setField(term145511, term145511.getClass(), "regexps", null);
        setField(term145511, term145511.getClass(), "itsVariables", null);
        setField(term145511, term145511.getClass(), "itsConst", null);
        setField(term145511, term145511.getClass(), "itsVariableNames", null);
        setIntField(term145511, term145511.getClass(), "varStart", 0);
        setField(term145511, term145511.getClass(), "compilerData", null);
        setIntField(term145511, term145511.getClass(), "type", 0);
        setField(term145511, term145511.getClass(), "next", null);
        setField(term145511, term145511.getClass(), "first", null);
        setField(term145511, term145511.getClass(), "last", null);
        setField(term145511, term145511.getClass(), "propListHead", null);
        setIntField(term145511, term145511.getClass(), "sourcePosition", 0);
        setField(term145511, term145511.getClass(), "jsType", null);
        setField(term145511, term145511.getClass(), "parent", null);
        setField(term145510, term145510.getClass(), "parameters", term145511);
        setField(term145510, term145510.getClass(), "returnType", null);
        setBooleanField(term145510, term145510.getClass(), "returnTypeInferred", false);
        setBooleanField(term145510, term145510.getClass(), "resolved", false);
        setField(term145510, term145510.getClass(), "resolveResult", null);
        setField(term145510, term145510.getClass(), "registry", null);
        setField(term145509, term145509.getClass(), "call", term145510);
        setField(term145509, term145509.getClass(), "prototype", null);
        setField(term145509, term145509.getClass(), "kind", null);
        setField(term145509, term145509.getClass(), "typeOfThis", null);
        setField(term145509, term145509.getClass(), "source", null);
        setField(term145509, term145509.getClass(), "implementedInterfaces", null);
        setField(term145509, term145509.getClass(), "extendedInterfaces", null);
        setField(term145509, term145509.getClass(), "subTypes", null);
        setField(term145509, term145509.getClass(), "templateTypeName", null);
        setField(term145509, term145509.getClass(), "className", null);
        setField(term145509, term145509.getClass(), "properties", null);
        setBooleanField(term145509, term145509.getClass(), "nativeType", false);
        setField(term145509, term145509.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term145509, term145509.getClass(), "prettyPrint", false);
        setBooleanField(term145509, term145509.getClass(), "visited", false);
        setField(term145509, term145509.getClass(), "docInfo", null);
        setBooleanField(term145509, term145509.getClass(), "unknown", false);
        setBooleanField(term145509, term145509.getClass(), "resolved", false);
        setField(term145509, term145509.getClass(), "resolveResult", null);
        setField(term145509, term145509.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term144684;
        args[2] = term144854;
        callMethod(klass, "visitParameterList", argTypes, term144598, args);
        assertTrue(recursiveEquals(term144598, term145506));
        assertTrue(recursiveEquals(term144684, term145509));
        assertTrue(recursiveEquals(term144854, null));
    }

};



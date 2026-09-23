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

public class TypeCheck_visitParameterList_2094647345412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121931;
     Object term122001;
     Object term122187;
     Object term122890;
     Object term122891;
     Object term122893;

    public TypeCheck_visitParameterList_2094647345412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121931 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term122001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122087 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term122001, term122001.getClass(), "first", term122087);
        term122187 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term122281 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term122367 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term122281, term122281.getClass(), "parameters", term122367);
        setField(term122187, term122187.getClass(), "call", term122281);
        term122890 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term122890, term122890.getClass(), "compiler", null);
        setField(term122890, term122890.getClass(), "validator", null);
        setField(term122890, term122890.getClass(), "reverseInterpreter", null);
        setField(term122890, term122890.getClass(), "typeRegistry", null);
        setField(term122890, term122890.getClass(), "topScope", null);
        setField(term122890, term122890.getClass(), "scopeCreator", null);
        setField(term122890, term122890.getClass(), "reportMissingOverride", null);
        setField(term122890, term122890.getClass(), "reportUnknownTypes", null);
        setBooleanField(term122890, term122890.getClass(), "reportMissingProperties", false);
        setField(term122890, term122890.getClass(), "inferJSDocInfo", null);
        setIntField(term122890, term122890.getClass(), "typedCount", 0);
        setIntField(term122890, term122890.getClass(), "nullCount", 0);
        setIntField(term122890, term122890.getClass(), "unknownCount", 0);
        setBooleanField(term122890, term122890.getClass(), "inExterns", false);
        setIntField(term122890, term122890.getClass(), "noTypeCheckSection", 0);
        term122891 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122892 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term122891, term122891.getClass(), "type", 0);
        setField(term122891, term122891.getClass(), "next", null);
        setField(term122892, term122892.getClass(), "functionName", null);
        setBooleanField(term122892, term122892.getClass(), "itsNeedsActivation", false);
        setIntField(term122892, term122892.getClass(), "itsFunctionType", 0);
        setBooleanField(term122892, term122892.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term122892, term122892.getClass(), "encodedSourceStart", 0);
        setIntField(term122892, term122892.getClass(), "encodedSourceEnd", 0);
        setField(term122892, term122892.getClass(), "sourceName", null);
        setIntField(term122892, term122892.getClass(), "baseLineno", 0);
        setIntField(term122892, term122892.getClass(), "endLineno", 0);
        setField(term122892, term122892.getClass(), "functions", null);
        setField(term122892, term122892.getClass(), "regexps", null);
        setField(term122892, term122892.getClass(), "itsVariables", null);
        setField(term122892, term122892.getClass(), "itsConst", null);
        setField(term122892, term122892.getClass(), "itsVariableNames", null);
        setIntField(term122892, term122892.getClass(), "varStart", 0);
        setField(term122892, term122892.getClass(), "compilerData", null);
        setIntField(term122892, term122892.getClass(), "type", 0);
        setField(term122892, term122892.getClass(), "next", null);
        setField(term122892, term122892.getClass(), "first", null);
        setField(term122892, term122892.getClass(), "last", null);
        setField(term122892, term122892.getClass(), "propListHead", null);
        setIntField(term122892, term122892.getClass(), "sourcePosition", 0);
        setField(term122892, term122892.getClass(), "jsType", null);
        setField(term122892, term122892.getClass(), "parent", null);
        setField(term122891, term122891.getClass(), "first", term122892);
        setField(term122891, term122891.getClass(), "last", null);
        setField(term122891, term122891.getClass(), "propListHead", null);
        setIntField(term122891, term122891.getClass(), "sourcePosition", 0);
        setField(term122891, term122891.getClass(), "jsType", null);
        setField(term122891, term122891.getClass(), "parent", null);
        term122893 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term122894 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term122895 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term122895, term122895.getClass(), "functionName", null);
        setBooleanField(term122895, term122895.getClass(), "itsNeedsActivation", false);
        setIntField(term122895, term122895.getClass(), "itsFunctionType", 0);
        setBooleanField(term122895, term122895.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term122895, term122895.getClass(), "encodedSourceStart", 0);
        setIntField(term122895, term122895.getClass(), "encodedSourceEnd", 0);
        setField(term122895, term122895.getClass(), "sourceName", null);
        setIntField(term122895, term122895.getClass(), "baseLineno", 0);
        setIntField(term122895, term122895.getClass(), "endLineno", 0);
        setField(term122895, term122895.getClass(), "functions", null);
        setField(term122895, term122895.getClass(), "regexps", null);
        setField(term122895, term122895.getClass(), "itsVariables", null);
        setField(term122895, term122895.getClass(), "itsConst", null);
        setField(term122895, term122895.getClass(), "itsVariableNames", null);
        setIntField(term122895, term122895.getClass(), "varStart", 0);
        setField(term122895, term122895.getClass(), "compilerData", null);
        setIntField(term122895, term122895.getClass(), "type", 0);
        setField(term122895, term122895.getClass(), "next", null);
        setField(term122895, term122895.getClass(), "first", null);
        setField(term122895, term122895.getClass(), "last", null);
        setField(term122895, term122895.getClass(), "propListHead", null);
        setIntField(term122895, term122895.getClass(), "sourcePosition", 0);
        setField(term122895, term122895.getClass(), "jsType", null);
        setField(term122895, term122895.getClass(), "parent", null);
        setField(term122894, term122894.getClass(), "parameters", term122895);
        setField(term122894, term122894.getClass(), "returnType", null);
        setBooleanField(term122894, term122894.getClass(), "returnTypeInferred", false);
        setBooleanField(term122894, term122894.getClass(), "resolved", false);
        setField(term122894, term122894.getClass(), "resolveResult", null);
        setField(term122894, term122894.getClass(), "registry", null);
        setField(term122893, term122893.getClass(), "call", term122894);
        setField(term122893, term122893.getClass(), "prototype", null);
        setField(term122893, term122893.getClass(), "kind", null);
        setField(term122893, term122893.getClass(), "typeOfThis", null);
        setField(term122893, term122893.getClass(), "source", null);
        setField(term122893, term122893.getClass(), "implementedInterfaces", null);
        setField(term122893, term122893.getClass(), "extendedInterfaces", null);
        setField(term122893, term122893.getClass(), "subTypes", null);
        setField(term122893, term122893.getClass(), "templateTypeName", null);
        setField(term122893, term122893.getClass(), "className", null);
        setField(term122893, term122893.getClass(), "properties", null);
        setBooleanField(term122893, term122893.getClass(), "nativeType", false);
        setField(term122893, term122893.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term122893, term122893.getClass(), "prettyPrint", false);
        setBooleanField(term122893, term122893.getClass(), "visited", false);
        setField(term122893, term122893.getClass(), "docInfo", null);
        setBooleanField(term122893, term122893.getClass(), "unknown", false);
        setBooleanField(term122893, term122893.getClass(), "resolved", false);
        setField(term122893, term122893.getClass(), "resolveResult", null);
        setField(term122893, term122893.getClass(), "registry", null);
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
        args[1] = term122001;
        args[2] = term122187;
        callMethod(klass, "visitParameterList", argTypes, term121931, args);
        assertTrue(recursiveEquals(term121931, term122890));
        assertTrue(recursiveEquals(term122001, term122893));
        assertTrue(recursiveEquals(term122187, null));
    }

};



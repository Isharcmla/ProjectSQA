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

public class TypeCheck_getFunctionType_861075670237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65187;
     Object term65257;
     Object term65403;
     Object term65404;
     Object term65367;

    public TypeCheck_getFunctionType_861075670237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65187 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term65257 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65357 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term65257, term65257.getClass(), "jsType", term65357);
        term65403 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term65403, term65403.getClass(), "compiler", null);
        setField(term65403, term65403.getClass(), "validator", null);
        setField(term65403, term65403.getClass(), "reverseInterpreter", null);
        setField(term65403, term65403.getClass(), "typeRegistry", null);
        setField(term65403, term65403.getClass(), "topScope", null);
        setField(term65403, term65403.getClass(), "scopeCreator", null);
        setField(term65403, term65403.getClass(), "reportMissingOverride", null);
        setField(term65403, term65403.getClass(), "reportUnknownTypes", null);
        setBooleanField(term65403, term65403.getClass(), "reportMissingProperties", false);
        setField(term65403, term65403.getClass(), "inferJSDocInfo", null);
        setIntField(term65403, term65403.getClass(), "typedCount", 0);
        setIntField(term65403, term65403.getClass(), "nullCount", 0);
        setIntField(term65403, term65403.getClass(), "unknownCount", 0);
        setBooleanField(term65403, term65403.getClass(), "inExterns", false);
        setIntField(term65403, term65403.getClass(), "noTypeCheckSection", 0);
        term65404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65405 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setIntField(term65404, term65404.getClass(), "type", 0);
        setField(term65404, term65404.getClass(), "next", null);
        setField(term65404, term65404.getClass(), "first", null);
        setField(term65404, term65404.getClass(), "last", null);
        setField(term65404, term65404.getClass(), "propListHead", null);
        setIntField(term65404, term65404.getClass(), "sourcePosition", 0);
        setField(term65405, term65405.getClass(), "call", null);
        setField(term65405, term65405.getClass(), "prototype", null);
        setField(term65405, term65405.getClass(), "kind", null);
        setField(term65405, term65405.getClass(), "typeOfThis", null);
        setField(term65405, term65405.getClass(), "source", null);
        setField(term65405, term65405.getClass(), "implementedInterfaces", null);
        setField(term65405, term65405.getClass(), "subTypes", null);
        setField(term65405, term65405.getClass(), "templateTypeName", null);
        setField(term65405, term65405.getClass(), "className", null);
        setField(term65405, term65405.getClass(), "properties", null);
        setBooleanField(term65405, term65405.getClass(), "nativeType", false);
        setField(term65405, term65405.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term65405, term65405.getClass(), "prettyPrint", false);
        setBooleanField(term65405, term65405.getClass(), "visited", false);
        setField(term65405, term65405.getClass(), "docInfo", null);
        setBooleanField(term65405, term65405.getClass(), "unknown", false);
        setBooleanField(term65405, term65405.getClass(), "resolved", false);
        setField(term65405, term65405.getClass(), "resolveResult", null);
        setField(term65405, term65405.getClass(), "registry", null);
        setField(term65404, term65404.getClass(), "jsType", term65405);
        setField(term65404, term65404.getClass(), "parent", null);
        term65367 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term65367, term65367.getClass(), "call", null);
        setField(term65367, term65367.getClass(), "prototype", null);
        setField(term65367, term65367.getClass(), "kind", null);
        setField(term65367, term65367.getClass(), "typeOfThis", null);
        setField(term65367, term65367.getClass(), "source", null);
        setField(term65367, term65367.getClass(), "implementedInterfaces", null);
        setField(term65367, term65367.getClass(), "subTypes", null);
        setField(term65367, term65367.getClass(), "templateTypeName", null);
        setField(term65367, term65367.getClass(), "className", null);
        setField(term65367, term65367.getClass(), "properties", null);
        setBooleanField(term65367, term65367.getClass(), "nativeType", false);
        setField(term65367, term65367.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term65367, term65367.getClass(), "prettyPrint", false);
        setBooleanField(term65367, term65367.getClass(), "visited", false);
        setField(term65367, term65367.getClass(), "docInfo", null);
        setBooleanField(term65367, term65367.getClass(), "unknown", false);
        setBooleanField(term65367, term65367.getClass(), "resolved", false);
        setField(term65367, term65367.getClass(), "resolveResult", null);
        setField(term65367, term65367.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term65257;
        Object retValue = callMethod(klass, "getFunctionType", argTypes, term65187, args);
        assertTrue(recursiveEquals(term65187, term65403));
        assertTrue(recursiveEquals(term65257, term65404));
        assertTrue(recursiveEquals(retValue, term65367));
    }

};



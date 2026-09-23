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

public class TypeCheck_getJSType_1628208716128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29466;
     Object term29536;
     Object term30078;
     Object term30079;
     Object term30063;

    public TypeCheck_getJSType_1628208716128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29466 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term29536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29650 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term29536, term29536.getClass(), "jsType", term29650);
        term30078 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term30078, term30078.getClass(), "compiler", null);
        setField(term30078, term30078.getClass(), "validator", null);
        setField(term30078, term30078.getClass(), "reverseInterpreter", null);
        setField(term30078, term30078.getClass(), "typeRegistry", null);
        setField(term30078, term30078.getClass(), "topScope", null);
        setField(term30078, term30078.getClass(), "scopeCreator", null);
        setField(term30078, term30078.getClass(), "reportMissingOverride", null);
        setField(term30078, term30078.getClass(), "reportUnknownTypes", null);
        setBooleanField(term30078, term30078.getClass(), "reportMissingProperties", false);
        setField(term30078, term30078.getClass(), "inferJSDocInfo", null);
        setIntField(term30078, term30078.getClass(), "typedCount", 0);
        setIntField(term30078, term30078.getClass(), "nullCount", 0);
        setIntField(term30078, term30078.getClass(), "unknownCount", 0);
        setBooleanField(term30078, term30078.getClass(), "inExterns", false);
        setIntField(term30078, term30078.getClass(), "noTypeCheckSection", 0);
        term30079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30080 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setIntField(term30079, term30079.getClass(), "type", 0);
        setField(term30079, term30079.getClass(), "next", null);
        setField(term30079, term30079.getClass(), "first", null);
        setField(term30079, term30079.getClass(), "last", null);
        setField(term30079, term30079.getClass(), "propListHead", null);
        setIntField(term30079, term30079.getClass(), "sourcePosition", 0);
        setField(term30080, term30080.getClass(), "className", null);
        setField(term30080, term30080.getClass(), "properties", null);
        setBooleanField(term30080, term30080.getClass(), "nativeType", false);
        setField(term30080, term30080.getClass(), "implicitPrototypeFallback", null);
        setField(term30080, term30080.getClass(), "ownerFunction", null);
        setBooleanField(term30080, term30080.getClass(), "prettyPrint", false);
        setBooleanField(term30080, term30080.getClass(), "visited", false);
        setField(term30080, term30080.getClass(), "docInfo", null);
        setBooleanField(term30080, term30080.getClass(), "unknown", false);
        setBooleanField(term30080, term30080.getClass(), "resolved", false);
        setField(term30080, term30080.getClass(), "resolveResult", null);
        setBooleanField(term30080, term30080.getClass(), "inTemplatedCheckVisit", false);
        setField(term30080, term30080.getClass(), "registry", null);
        setField(term30079, term30079.getClass(), "jsType", term30080);
        setField(term30079, term30079.getClass(), "parent", null);
        term30063 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term30063, term30063.getClass(), "className", null);
        setField(term30063, term30063.getClass(), "properties", null);
        setBooleanField(term30063, term30063.getClass(), "nativeType", false);
        setField(term30063, term30063.getClass(), "implicitPrototypeFallback", null);
        setField(term30063, term30063.getClass(), "ownerFunction", null);
        setBooleanField(term30063, term30063.getClass(), "prettyPrint", false);
        setBooleanField(term30063, term30063.getClass(), "visited", false);
        setField(term30063, term30063.getClass(), "docInfo", null);
        setBooleanField(term30063, term30063.getClass(), "unknown", false);
        setBooleanField(term30063, term30063.getClass(), "resolved", false);
        setField(term30063, term30063.getClass(), "resolveResult", null);
        setBooleanField(term30063, term30063.getClass(), "inTemplatedCheckVisit", false);
        setField(term30063, term30063.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term29536;
        Object retValue = callMethod(klass, "getJSType", argTypes, term29466, args);
        assertTrue(recursiveEquals(term29466, term30078));
        assertTrue(recursiveEquals(term29536, term30079));
        assertTrue(recursiveEquals(retValue, term30063));
    }

};



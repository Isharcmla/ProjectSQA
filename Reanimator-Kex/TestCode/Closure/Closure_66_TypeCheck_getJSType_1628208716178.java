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

public class TypeCheck_getJSType_1628208716178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45840;
     Object term45910;
     Object term46324;
     Object term46325;
     Object term46310;

    public TypeCheck_getJSType_1628208716178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45840 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term45910 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46018 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term45910, term45910.getClass(), "jsType", term46018);
        term46324 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term46324, term46324.getClass(), "compiler", null);
        setField(term46324, term46324.getClass(), "validator", null);
        setField(term46324, term46324.getClass(), "reverseInterpreter", null);
        setField(term46324, term46324.getClass(), "typeRegistry", null);
        setField(term46324, term46324.getClass(), "topScope", null);
        setField(term46324, term46324.getClass(), "scopeCreator", null);
        setField(term46324, term46324.getClass(), "reportMissingOverride", null);
        setField(term46324, term46324.getClass(), "reportUnknownTypes", null);
        setBooleanField(term46324, term46324.getClass(), "reportMissingProperties", false);
        setField(term46324, term46324.getClass(), "inferJSDocInfo", null);
        setIntField(term46324, term46324.getClass(), "typedCount", 0);
        setIntField(term46324, term46324.getClass(), "nullCount", 0);
        setIntField(term46324, term46324.getClass(), "unknownCount", 0);
        setBooleanField(term46324, term46324.getClass(), "inExterns", false);
        setIntField(term46324, term46324.getClass(), "noTypeCheckSection", 0);
        term46325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46326 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setIntField(term46325, term46325.getClass(), "type", 0);
        setField(term46325, term46325.getClass(), "next", null);
        setField(term46325, term46325.getClass(), "first", null);
        setField(term46325, term46325.getClass(), "last", null);
        setField(term46325, term46325.getClass(), "propListHead", null);
        setIntField(term46325, term46325.getClass(), "sourcePosition", 0);
        setField(term46326, term46326.getClass(), "this$0", null);
        setField(term46326, term46326.getClass(), "call", null);
        setField(term46326, term46326.getClass(), "prototype", null);
        setField(term46326, term46326.getClass(), "kind", null);
        setField(term46326, term46326.getClass(), "typeOfThis", null);
        setField(term46326, term46326.getClass(), "source", null);
        setField(term46326, term46326.getClass(), "implementedInterfaces", null);
        setField(term46326, term46326.getClass(), "extendedInterfaces", null);
        setField(term46326, term46326.getClass(), "subTypes", null);
        setField(term46326, term46326.getClass(), "templateTypeName", null);
        setField(term46326, term46326.getClass(), "className", null);
        setField(term46326, term46326.getClass(), "properties", null);
        setBooleanField(term46326, term46326.getClass(), "nativeType", false);
        setField(term46326, term46326.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term46326, term46326.getClass(), "prettyPrint", false);
        setBooleanField(term46326, term46326.getClass(), "visited", false);
        setField(term46326, term46326.getClass(), "docInfo", null);
        setBooleanField(term46326, term46326.getClass(), "unknown", false);
        setBooleanField(term46326, term46326.getClass(), "resolved", false);
        setField(term46326, term46326.getClass(), "resolveResult", null);
        setField(term46326, term46326.getClass(), "registry", null);
        setField(term46325, term46325.getClass(), "jsType", term46326);
        setField(term46325, term46325.getClass(), "parent", null);
        term46310 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term46310, term46310.getClass(), "this$0", null);
        setField(term46310, term46310.getClass(), "call", null);
        setField(term46310, term46310.getClass(), "prototype", null);
        setField(term46310, term46310.getClass(), "kind", null);
        setField(term46310, term46310.getClass(), "typeOfThis", null);
        setField(term46310, term46310.getClass(), "source", null);
        setField(term46310, term46310.getClass(), "implementedInterfaces", null);
        setField(term46310, term46310.getClass(), "extendedInterfaces", null);
        setField(term46310, term46310.getClass(), "subTypes", null);
        setField(term46310, term46310.getClass(), "templateTypeName", null);
        setField(term46310, term46310.getClass(), "className", null);
        setField(term46310, term46310.getClass(), "properties", null);
        setBooleanField(term46310, term46310.getClass(), "nativeType", false);
        setField(term46310, term46310.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term46310, term46310.getClass(), "prettyPrint", false);
        setBooleanField(term46310, term46310.getClass(), "visited", false);
        setField(term46310, term46310.getClass(), "docInfo", null);
        setBooleanField(term46310, term46310.getClass(), "unknown", false);
        setBooleanField(term46310, term46310.getClass(), "resolved", false);
        setField(term46310, term46310.getClass(), "resolveResult", null);
        setField(term46310, term46310.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term45910;
        Object retValue = callMethod(klass, "getJSType", argTypes, term45840, args);
        assertTrue(recursiveEquals(term45840, term46324));
        assertTrue(recursiveEquals(term45910, term46325));
        assertTrue(recursiveEquals(retValue, term46310));
    }

};



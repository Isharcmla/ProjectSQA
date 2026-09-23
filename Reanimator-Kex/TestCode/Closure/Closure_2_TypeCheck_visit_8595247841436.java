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

public class TypeCheck_visit_8595247841436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term454982;
     Object term455052;
     Object term455122;
     Object term455326;
     Object term455327;
     Object term455329;

    public TypeCheck_visit_8595247841436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term454982 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term455052 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term455052, term455052.getClass(), "type", 64);
        setField(term455052, term455052.getClass(), "jsType", null);
        term455122 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term455214 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term455122, term455122.getClass(), "jsType", term455214);
        term455326 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term455326, term455326.getClass(), "compiler", null);
        setField(term455326, term455326.getClass(), "validator", null);
        setField(term455326, term455326.getClass(), "reverseInterpreter", null);
        setField(term455326, term455326.getClass(), "typeRegistry", null);
        setField(term455326, term455326.getClass(), "topScope", null);
        setField(term455326, term455326.getClass(), "scopeCreator", null);
        setField(term455326, term455326.getClass(), "reportMissingOverride", null);
        setField(term455326, term455326.getClass(), "reportUnknownTypes", null);
        setBooleanField(term455326, term455326.getClass(), "reportMissingProperties", false);
        setField(term455326, term455326.getClass(), "inferJSDocInfo", null);
        setIntField(term455326, term455326.getClass(), "typedCount", 1);
        setIntField(term455326, term455326.getClass(), "nullCount", 0);
        setIntField(term455326, term455326.getClass(), "unknownCount", 0);
        setBooleanField(term455326, term455326.getClass(), "inExterns", false);
        setIntField(term455326, term455326.getClass(), "noTypeCheckSection", 0);
        term455327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term455328 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setIntField(term455327, term455327.getClass(), "type", 64);
        setField(term455327, term455327.getClass(), "next", null);
        setField(term455327, term455327.getClass(), "first", null);
        setField(term455327, term455327.getClass(), "last", null);
        setField(term455327, term455327.getClass(), "propListHead", null);
        setIntField(term455327, term455327.getClass(), "sourcePosition", 0);
        setField(term455328, term455328.getClass(), "source", null);
        setField(term455328, term455328.getClass(), "elementsType", null);
        setField(term455328, term455328.getClass(), "elements", null);
        setField(term455328, term455328.getClass(), "className", null);
        setField(term455328, term455328.getClass(), "properties", null);
        setBooleanField(term455328, term455328.getClass(), "nativeType", false);
        setField(term455328, term455328.getClass(), "implicitPrototypeFallback", null);
        setField(term455328, term455328.getClass(), "ownerFunction", null);
        setBooleanField(term455328, term455328.getClass(), "prettyPrint", false);
        setBooleanField(term455328, term455328.getClass(), "visited", false);
        setField(term455328, term455328.getClass(), "docInfo", null);
        setBooleanField(term455328, term455328.getClass(), "unknown", false);
        setBooleanField(term455328, term455328.getClass(), "resolved", false);
        setField(term455328, term455328.getClass(), "resolveResult", null);
        setField(term455328, term455328.getClass(), "templateKeys", null);
        setField(term455328, term455328.getClass(), "templatizedTypes", null);
        setBooleanField(term455328, term455328.getClass(), "inTemplatedCheckVisit", false);
        setField(term455328, term455328.getClass(), "registry", null);
        setField(term455327, term455327.getClass(), "jsType", term455328);
        setField(term455327, term455327.getClass(), "parent", null);
        term455329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term455330 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setIntField(term455329, term455329.getClass(), "type", 0);
        setField(term455329, term455329.getClass(), "next", null);
        setField(term455329, term455329.getClass(), "first", null);
        setField(term455329, term455329.getClass(), "last", null);
        setField(term455329, term455329.getClass(), "propListHead", null);
        setIntField(term455329, term455329.getClass(), "sourcePosition", 0);
        setField(term455330, term455330.getClass(), "source", null);
        setField(term455330, term455330.getClass(), "elementsType", null);
        setField(term455330, term455330.getClass(), "elements", null);
        setField(term455330, term455330.getClass(), "className", null);
        setField(term455330, term455330.getClass(), "properties", null);
        setBooleanField(term455330, term455330.getClass(), "nativeType", false);
        setField(term455330, term455330.getClass(), "implicitPrototypeFallback", null);
        setField(term455330, term455330.getClass(), "ownerFunction", null);
        setBooleanField(term455330, term455330.getClass(), "prettyPrint", false);
        setBooleanField(term455330, term455330.getClass(), "visited", false);
        setField(term455330, term455330.getClass(), "docInfo", null);
        setBooleanField(term455330, term455330.getClass(), "unknown", false);
        setBooleanField(term455330, term455330.getClass(), "resolved", false);
        setField(term455330, term455330.getClass(), "resolveResult", null);
        setField(term455330, term455330.getClass(), "templateKeys", null);
        setField(term455330, term455330.getClass(), "templatizedTypes", null);
        setBooleanField(term455330, term455330.getClass(), "inTemplatedCheckVisit", false);
        setField(term455330, term455330.getClass(), "registry", null);
        setField(term455329, term455329.getClass(), "jsType", term455330);
        setField(term455329, term455329.getClass(), "parent", null);
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
        args[1] = term455052;
        args[2] = term455122;
        callMethod(klass, "visit", argTypes, term454982, args);
        assertTrue(recursiveEquals(term454982, term455326));
        assertTrue(recursiveEquals(term455052, term455329));
        assertTrue(recursiveEquals(term455122, null));
    }

};



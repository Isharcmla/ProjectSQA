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
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class CodeGenerator_unrollBinaryOperator_37391921142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7417;
     Object term7452;
     Object term7479;
     Object enum81;
     Object enum82;
     Object term7532;
     Object term7534;

    public CodeGenerator_unrollBinaryOperator_37391921142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7418 = new HashMap();
        Class<? extends Object> term29505 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term29504 = ((Class) term29505).getDeclaredField((String) "ECMASCRIPT5_STRICT");
        ((Field) term29504).setAccessible(true);
        Object enum80 = ((Field) term29504).get((Object) null);
        term7417 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term7417, term7417.getClass(), "escapedJsStrings", term7418);
        setField(term7417, term7417.getClass(), "cc", null);
        setField(term7417, term7417.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term7417, term7417.getClass(), "preferSingleQuotes", false);
        setBooleanField(term7417, term7417.getClass(), "trustedStrings", false);
        setField(term7417, term7417.getClass(), "languageMode", enum80);
        term7452 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7456 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7460 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7452, term7452.getClass(), "type", -655067527);
        setIntField(term7454, term7454.getClass(), "type", -6029667);
        setIntField(term7456, term7456.getClass(), "type", -2068769794);
        setIntField(term7458, term7458.getClass(), "type", -117576464);
        setIntField(term7460, term7460.getClass(), "type", -1007160944);
        setField(term7460, term7460.getClass(), "next", null);
        setField(term7460, term7460.getClass(), "first", null);
        setField(term7460, term7460.getClass(), "last", null);
        setField(term7460, term7460.getClass(), "propListHead", null);
        setIntField(term7460, term7460.getClass(), "sourcePosition", 0);
        setField(term7460, term7460.getClass(), "jsType", null);
        setField(term7460, term7460.getClass(), "parent", null);
        setField(term7458, term7458.getClass(), "next", term7460);
        setIntField(term7463, term7463.getClass(), "type", 1135664017);
        setField(term7463, term7463.getClass(), "next", null);
        setField(term7463, term7463.getClass(), "first", null);
        setField(term7463, term7463.getClass(), "last", term7460);
        setField(term7463, term7463.getClass(), "propListHead", null);
        setIntField(term7463, term7463.getClass(), "sourcePosition", 0);
        setField(term7463, term7463.getClass(), "jsType", null);
        setField(term7463, term7463.getClass(), "parent", null);
        setField(term7458, term7458.getClass(), "first", term7463);
        setField(term7458, term7458.getClass(), "last", term7456);
        setField(term7458, term7458.getClass(), "propListHead", null);
        setIntField(term7458, term7458.getClass(), "sourcePosition", 0);
        setField(term7458, term7458.getClass(), "jsType", null);
        setField(term7458, term7458.getClass(), "parent", null);
        setField(term7456, term7456.getClass(), "next", term7458);
        setField(term7456, term7456.getClass(), "first", term7460);
        setIntField(term7467, term7467.getClass(), "type", 865208305);
        setIntField(term7469, term7469.getClass(), "type", -1275173084);
        setField(term7469, term7469.getClass(), "next", null);
        setField(term7469, term7469.getClass(), "first", term7463);
        setField(term7469, term7469.getClass(), "last", term7458);
        setField(term7469, term7469.getClass(), "propListHead", null);
        setIntField(term7469, term7469.getClass(), "sourcePosition", 0);
        setField(term7469, term7469.getClass(), "jsType", null);
        setField(term7469, term7469.getClass(), "parent", null);
        setField(term7467, term7467.getClass(), "next", term7469);
        setField(term7467, term7467.getClass(), "first", term7454);
        setField(term7467, term7467.getClass(), "last", term7454);
        setField(term7467, term7467.getClass(), "propListHead", null);
        setIntField(term7467, term7467.getClass(), "sourcePosition", 0);
        setField(term7467, term7467.getClass(), "jsType", null);
        setField(term7467, term7467.getClass(), "parent", null);
        setField(term7456, term7456.getClass(), "last", term7467);
        setField(term7456, term7456.getClass(), "propListHead", null);
        setIntField(term7456, term7456.getClass(), "sourcePosition", 0);
        setField(term7456, term7456.getClass(), "jsType", null);
        setField(term7456, term7456.getClass(), "parent", null);
        setField(term7454, term7454.getClass(), "next", term7456);
        setIntField(term7474, term7474.getClass(), "type", -244121226);
        setField(term7474, term7474.getClass(), "next", term7467);
        setField(term7474, term7474.getClass(), "first", term7469);
        setField(term7474, term7474.getClass(), "last", term7452);
        setField(term7474, term7474.getClass(), "propListHead", null);
        setIntField(term7474, term7474.getClass(), "sourcePosition", 0);
        setField(term7474, term7474.getClass(), "jsType", null);
        setField(term7474, term7474.getClass(), "parent", null);
        setField(term7454, term7454.getClass(), "first", term7474);
        setField(term7454, term7454.getClass(), "last", term7474);
        setField(term7454, term7454.getClass(), "propListHead", null);
        setIntField(term7454, term7454.getClass(), "sourcePosition", 0);
        setField(term7454, term7454.getClass(), "jsType", null);
        setField(term7454, term7454.getClass(), "parent", null);
        setField(term7452, term7452.getClass(), "next", term7454);
        setField(term7452, term7452.getClass(), "first", term7458);
        setField(term7452, term7452.getClass(), "last", term7460);
        setField(term7452, term7452.getClass(), "propListHead", null);
        setIntField(term7452, term7452.getClass(), "sourcePosition", 0);
        setField(term7452, term7452.getClass(), "jsType", null);
        setField(term7452, term7452.getClass(), "parent", null);
        term7479 = new Integer(-203030934);
        Class<? extends Object> term29861 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term29860 = ((Class) term29861).getDeclaredField((String) "START_OF_EXPR");
        ((Field) term29860).setAccessible(true);
        enum81 = ((Field) term29860).get((Object) null);
        Class<? extends Object> term30157 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term30156 = ((Class) term30157).getDeclaredField((String) "IN_FOR_INIT_CLAUSE");
        ((Field) term30156).setAccessible(true);
        enum82 = ((Field) term30156).get((Object) null);
        term7532 = new Integer(-1179120542);
        term7534 = new Integer(-73683645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        argTypes[4] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        Object[] args = new Object[7];
        args[0] = term7452;
        args[1] = term7479;
        args[2] = "dWRymuLBtr";
        args[3] = enum81;
        args[4] = enum82;
        args[5] = term7532;
        args[6] = term7534;
        try {
            callMethod(klass, "unrollBinaryOperator", argTypes, term7417, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



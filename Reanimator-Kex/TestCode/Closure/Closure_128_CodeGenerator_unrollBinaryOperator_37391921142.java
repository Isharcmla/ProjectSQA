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
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;

public class CodeGenerator_unrollBinaryOperator_37391921142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5210;
     Object term5223;
     Object term5250;
     Object enum48;
     Object enum49;
     Object term5303;
     Object term5305;

    public CodeGenerator_unrollBinaryOperator_37391921142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5211 = new HashMap();
        term5210 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term5210, term5210.getClass(), "ESCAPED_JS_STRINGS", term5211);
        setField(term5210, term5210.getClass(), "cc", null);
        setField(term5210, term5210.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term5210, term5210.getClass(), "preferSingleQuotes", true);
        setBooleanField(term5210, term5210.getClass(), "trustedStrings", true);
        term5223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5223, term5223.getClass(), "type", -655067527);
        setIntField(term5225, term5225.getClass(), "type", -6029667);
        setIntField(term5227, term5227.getClass(), "type", -2068769794);
        setIntField(term5229, term5229.getClass(), "type", -117576464);
        setIntField(term5231, term5231.getClass(), "type", -1007160944);
        setField(term5231, term5231.getClass(), "next", null);
        setField(term5231, term5231.getClass(), "first", null);
        setField(term5231, term5231.getClass(), "last", null);
        setField(term5231, term5231.getClass(), "propListHead", null);
        setIntField(term5231, term5231.getClass(), "sourcePosition", 0);
        setField(term5231, term5231.getClass(), "jsType", null);
        setField(term5231, term5231.getClass(), "parent", null);
        setField(term5229, term5229.getClass(), "next", term5231);
        setIntField(term5234, term5234.getClass(), "type", 1135664017);
        setField(term5234, term5234.getClass(), "next", null);
        setField(term5234, term5234.getClass(), "first", null);
        setField(term5234, term5234.getClass(), "last", term5231);
        setField(term5234, term5234.getClass(), "propListHead", null);
        setIntField(term5234, term5234.getClass(), "sourcePosition", 0);
        setField(term5234, term5234.getClass(), "jsType", null);
        setField(term5234, term5234.getClass(), "parent", null);
        setField(term5229, term5229.getClass(), "first", term5234);
        setField(term5229, term5229.getClass(), "last", term5227);
        setField(term5229, term5229.getClass(), "propListHead", null);
        setIntField(term5229, term5229.getClass(), "sourcePosition", 0);
        setField(term5229, term5229.getClass(), "jsType", null);
        setField(term5229, term5229.getClass(), "parent", null);
        setField(term5227, term5227.getClass(), "next", term5229);
        setField(term5227, term5227.getClass(), "first", term5231);
        setIntField(term5238, term5238.getClass(), "type", 865208305);
        setIntField(term5240, term5240.getClass(), "type", -1275173084);
        setField(term5240, term5240.getClass(), "next", null);
        setField(term5240, term5240.getClass(), "first", term5234);
        setField(term5240, term5240.getClass(), "last", term5229);
        setField(term5240, term5240.getClass(), "propListHead", null);
        setIntField(term5240, term5240.getClass(), "sourcePosition", 0);
        setField(term5240, term5240.getClass(), "jsType", null);
        setField(term5240, term5240.getClass(), "parent", null);
        setField(term5238, term5238.getClass(), "next", term5240);
        setField(term5238, term5238.getClass(), "first", term5225);
        setField(term5238, term5238.getClass(), "last", term5225);
        setField(term5238, term5238.getClass(), "propListHead", null);
        setIntField(term5238, term5238.getClass(), "sourcePosition", 0);
        setField(term5238, term5238.getClass(), "jsType", null);
        setField(term5238, term5238.getClass(), "parent", null);
        setField(term5227, term5227.getClass(), "last", term5238);
        setField(term5227, term5227.getClass(), "propListHead", null);
        setIntField(term5227, term5227.getClass(), "sourcePosition", 0);
        setField(term5227, term5227.getClass(), "jsType", null);
        setField(term5227, term5227.getClass(), "parent", null);
        setField(term5225, term5225.getClass(), "next", term5227);
        setIntField(term5245, term5245.getClass(), "type", -244121226);
        setField(term5245, term5245.getClass(), "next", term5238);
        setField(term5245, term5245.getClass(), "first", term5240);
        setField(term5245, term5245.getClass(), "last", term5223);
        setField(term5245, term5245.getClass(), "propListHead", null);
        setIntField(term5245, term5245.getClass(), "sourcePosition", 0);
        setField(term5245, term5245.getClass(), "jsType", null);
        setField(term5245, term5245.getClass(), "parent", null);
        setField(term5225, term5225.getClass(), "first", term5245);
        setField(term5225, term5225.getClass(), "last", term5245);
        setField(term5225, term5225.getClass(), "propListHead", null);
        setIntField(term5225, term5225.getClass(), "sourcePosition", 0);
        setField(term5225, term5225.getClass(), "jsType", null);
        setField(term5225, term5225.getClass(), "parent", null);
        setField(term5223, term5223.getClass(), "next", term5225);
        setField(term5223, term5223.getClass(), "first", term5229);
        setField(term5223, term5223.getClass(), "last", term5231);
        setField(term5223, term5223.getClass(), "propListHead", null);
        setIntField(term5223, term5223.getClass(), "sourcePosition", 0);
        setField(term5223, term5223.getClass(), "jsType", null);
        setField(term5223, term5223.getClass(), "parent", null);
        term5250 = new Integer(-203030934);
        Class<? extends Object> term18283 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term18282 = ((Class) term18283).getDeclaredField((String) "START_OF_EXPR");
        ((Field) term18282).setAccessible(true);
        enum48 = ((Field) term18282).get((Object) null);
        Class<? extends Object> term18579 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term18578 = ((Class) term18579).getDeclaredField((String) "IN_FOR_INIT_CLAUSE");
        ((Field) term18578).setAccessible(true);
        enum49 = ((Field) term18578).get((Object) null);
        term5303 = new Integer(-1179120542);
        term5305 = new Integer(-73683645);
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
        args[0] = term5223;
        args[1] = term5250;
        args[2] = "dWRymuLBtr";
        args[3] = enum48;
        args[4] = enum49;
        args[5] = term5303;
        args[6] = term5305;
        try {
            callMethod(klass, "unrollBinaryOperator", argTypes, term5210, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



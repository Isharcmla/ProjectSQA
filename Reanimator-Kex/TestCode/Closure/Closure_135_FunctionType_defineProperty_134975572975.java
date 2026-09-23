package com.google.javascript.rhino.jstype;

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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class FunctionType_defineProperty_134975572975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10244;
     Object term10307;
     Object term10309;

    public FunctionType_defineProperty_134975572975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37668 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term37667 = ((Class) term37668).getDeclaredField((String) "ORDINARY");
        ((Field) term37667).setAccessible(true);
        Object enum94 = ((Field) term37667).get((Object) null);
        term10244 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term10245 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term10246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10259 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10269 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10274 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term10246, term10246.getClass(), "type", 1215150180);
        setIntField(term10248, term10248.getClass(), "type", -220791533);
        setIntField(term10250, term10250.getClass(), "type", 0);
        setField(term10250, term10250.getClass(), "next", null);
        setField(term10250, term10250.getClass(), "first", null);
        setField(term10250, term10250.getClass(), "last", null);
        setField(term10250, term10250.getClass(), "propListHead", null);
        setIntField(term10250, term10250.getClass(), "sourcePosition", 0);
        setField(term10250, term10250.getClass(), "jsType", null);
        setField(term10250, term10250.getClass(), "parent", null);
        setField(term10248, term10248.getClass(), "next", term10250);
        setIntField(term10253, term10253.getClass(), "type", 0);
        setField(term10253, term10253.getClass(), "next", null);
        setField(term10253, term10253.getClass(), "first", null);
        setField(term10253, term10253.getClass(), "last", null);
        setField(term10253, term10253.getClass(), "propListHead", null);
        setIntField(term10253, term10253.getClass(), "sourcePosition", 0);
        setField(term10253, term10253.getClass(), "jsType", null);
        setField(term10253, term10253.getClass(), "parent", null);
        setField(term10248, term10248.getClass(), "first", term10253);
        setIntField(term10256, term10256.getClass(), "type", 0);
        setField(term10256, term10256.getClass(), "next", null);
        setField(term10256, term10256.getClass(), "first", null);
        setField(term10256, term10256.getClass(), "last", null);
        setField(term10256, term10256.getClass(), "propListHead", null);
        setIntField(term10256, term10256.getClass(), "sourcePosition", 0);
        setField(term10256, term10256.getClass(), "jsType", null);
        setField(term10256, term10256.getClass(), "parent", null);
        setField(term10248, term10248.getClass(), "last", term10256);
        setField(term10259, term10259.getClass(), "next", null);
        setIntField(term10259, term10259.getClass(), "type", 0);
        setIntField(term10259, term10259.getClass(), "intValue", 0);
        setField(term10259, term10259.getClass(), "objectValue", null);
        setField(term10248, term10248.getClass(), "propListHead", term10259);
        setIntField(term10248, term10248.getClass(), "sourcePosition", 1741500243);
        setField(term10248, term10248.getClass(), "jsType", null);
        setField(term10248, term10248.getClass(), "parent", null);
        setField(term10246, term10246.getClass(), "next", term10248);
        setIntField(term10263, term10263.getClass(), "type", 0);
        setField(term10263, term10263.getClass(), "next", null);
        setField(term10263, term10263.getClass(), "first", null);
        setField(term10263, term10263.getClass(), "last", null);
        setField(term10263, term10263.getClass(), "propListHead", null);
        setIntField(term10263, term10263.getClass(), "sourcePosition", 0);
        setField(term10263, term10263.getClass(), "jsType", null);
        setField(term10263, term10263.getClass(), "parent", null);
        setField(term10246, term10246.getClass(), "first", term10263);
        setIntField(term10266, term10266.getClass(), "type", 0);
        setField(term10266, term10266.getClass(), "next", null);
        setField(term10266, term10266.getClass(), "first", null);
        setField(term10266, term10266.getClass(), "last", null);
        setField(term10266, term10266.getClass(), "propListHead", null);
        setIntField(term10266, term10266.getClass(), "sourcePosition", 0);
        setField(term10266, term10266.getClass(), "jsType", null);
        setField(term10266, term10266.getClass(), "parent", null);
        setField(term10246, term10246.getClass(), "last", term10266);
        setField(term10269, term10269.getClass(), "next", null);
        setIntField(term10269, term10269.getClass(), "type", 0);
        setIntField(term10269, term10269.getClass(), "intValue", 0);
        setField(term10269, term10269.getClass(), "objectValue", null);
        setField(term10246, term10246.getClass(), "propListHead", term10269);
        setIntField(term10246, term10246.getClass(), "sourcePosition", -2070466617);
        setField(term10246, term10246.getClass(), "jsType", null);
        setField(term10246, term10246.getClass(), "parent", null);
        setField(term10245, term10245.getClass(), "parameters", term10246);
        setField(term10245, term10245.getClass(), "returnType", null);
        setBooleanField(term10245, term10245.getClass(), "resolved", false);
        setField(term10245, term10245.getClass(), "resolveResult", null);
        setField(term10245, term10245.getClass(), "registry", null);
        setField(term10244, term10244.getClass(), "call", term10245);
        setField(term10274, term10274.getClass(), "ownerFunction", null);
        setField(term10274, term10274.getClass(), "className", null);
        setField(term10274, term10274.getClass(), "properties", null);
        setField(term10274, term10274.getClass(), "implicitPrototype", null);
        setBooleanField(term10274, term10274.getClass(), "nativeType", false);
        setBooleanField(term10274, term10274.getClass(), "visited", false);
        setField(term10274, term10274.getClass(), "docInfo", null);
        setBooleanField(term10274, term10274.getClass(), "unknown", false);
        setBooleanField(term10274, term10274.getClass(), "resolved", false);
        setField(term10274, term10274.getClass(), "resolveResult", null);
        setField(term10274, term10274.getClass(), "registry", null);
        setField(term10244, term10244.getClass(), "prototype", term10274);
        setField(term10244, term10244.getClass(), "kind", enum94);
        setField(term10244, term10244.getClass(), "typeOfThis", null);
        setField(term10244, term10244.getClass(), "source", null);
        setField(term10244, term10244.getClass(), "implementedInterfaces", null);
        setField(term10244, term10244.getClass(), "subTypes", null);
        setField(term10244, term10244.getClass(), "templateTypeName", null);
        setField(term10244, term10244.getClass(), "className", null);
        setField(term10244, term10244.getClass(), "properties", null);
        setField(term10244, term10244.getClass(), "implicitPrototype", null);
        setBooleanField(term10244, term10244.getClass(), "nativeType", false);
        setBooleanField(term10244, term10244.getClass(), "visited", false);
        setField(term10244, term10244.getClass(), "docInfo", null);
        setBooleanField(term10244, term10244.getClass(), "unknown", false);
        setBooleanField(term10244, term10244.getClass(), "resolved", false);
        setField(term10244, term10244.getClass(), "resolveResult", null);
        setField(term10244, term10244.getClass(), "registry", null);
        term10307 = new Boolean(false);
        term10309 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = "qYzsiuXOgS";
        args[1] = null;
        args[2] = term10307;
        args[3] = term10309;
        try {
            callMethod(klass, "defineProperty", argTypes, term10244, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



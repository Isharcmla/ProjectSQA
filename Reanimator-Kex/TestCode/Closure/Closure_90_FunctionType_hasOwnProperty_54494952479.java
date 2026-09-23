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

public class FunctionType_hasOwnProperty_54494952479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10208;

    public FunctionType_hasOwnProperty_54494952479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39390 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term39389 = ((Class) term39390).getDeclaredField((String) "ORDINARY");
        ((Field) term39389).setAccessible(true);
        Object enum103 = ((Field) term39389).get((Object) null);
        term10208 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term10209 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term10210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10220 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10223 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10233 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10239 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term10210, term10210.getClass(), "type", 1745276158);
        setIntField(term10212, term10212.getClass(), "type", 1050765721);
        setIntField(term10214, term10214.getClass(), "type", 0);
        setField(term10214, term10214.getClass(), "next", null);
        setField(term10214, term10214.getClass(), "first", null);
        setField(term10214, term10214.getClass(), "last", null);
        setField(term10214, term10214.getClass(), "propListHead", null);
        setIntField(term10214, term10214.getClass(), "sourcePosition", 0);
        setField(term10214, term10214.getClass(), "jsType", null);
        setField(term10214, term10214.getClass(), "parent", null);
        setField(term10212, term10212.getClass(), "next", term10214);
        setIntField(term10217, term10217.getClass(), "type", 0);
        setField(term10217, term10217.getClass(), "next", null);
        setField(term10217, term10217.getClass(), "first", null);
        setField(term10217, term10217.getClass(), "last", null);
        setField(term10217, term10217.getClass(), "propListHead", null);
        setIntField(term10217, term10217.getClass(), "sourcePosition", 0);
        setField(term10217, term10217.getClass(), "jsType", null);
        setField(term10217, term10217.getClass(), "parent", null);
        setField(term10212, term10212.getClass(), "first", term10217);
        setIntField(term10220, term10220.getClass(), "type", 0);
        setField(term10220, term10220.getClass(), "next", null);
        setField(term10220, term10220.getClass(), "first", null);
        setField(term10220, term10220.getClass(), "last", null);
        setField(term10220, term10220.getClass(), "propListHead", null);
        setIntField(term10220, term10220.getClass(), "sourcePosition", 0);
        setField(term10220, term10220.getClass(), "jsType", null);
        setField(term10220, term10220.getClass(), "parent", null);
        setField(term10212, term10212.getClass(), "last", term10220);
        setField(term10223, term10223.getClass(), "next", null);
        setIntField(term10223, term10223.getClass(), "type", 0);
        setIntField(term10223, term10223.getClass(), "intValue", 0);
        setField(term10223, term10223.getClass(), "objectValue", null);
        setField(term10212, term10212.getClass(), "propListHead", term10223);
        setIntField(term10212, term10212.getClass(), "sourcePosition", 474518942);
        setField(term10212, term10212.getClass(), "jsType", null);
        setField(term10212, term10212.getClass(), "parent", null);
        setField(term10210, term10210.getClass(), "next", term10212);
        setIntField(term10227, term10227.getClass(), "type", 0);
        setField(term10227, term10227.getClass(), "next", null);
        setField(term10227, term10227.getClass(), "first", null);
        setField(term10227, term10227.getClass(), "last", null);
        setField(term10227, term10227.getClass(), "propListHead", null);
        setIntField(term10227, term10227.getClass(), "sourcePosition", 0);
        setField(term10227, term10227.getClass(), "jsType", null);
        setField(term10227, term10227.getClass(), "parent", null);
        setField(term10210, term10210.getClass(), "first", term10227);
        setIntField(term10230, term10230.getClass(), "type", 0);
        setField(term10230, term10230.getClass(), "next", null);
        setField(term10230, term10230.getClass(), "first", null);
        setField(term10230, term10230.getClass(), "last", null);
        setField(term10230, term10230.getClass(), "propListHead", null);
        setIntField(term10230, term10230.getClass(), "sourcePosition", 0);
        setField(term10230, term10230.getClass(), "jsType", null);
        setField(term10230, term10230.getClass(), "parent", null);
        setField(term10210, term10210.getClass(), "last", term10230);
        setField(term10233, term10233.getClass(), "next", null);
        setIntField(term10233, term10233.getClass(), "type", 0);
        setIntField(term10233, term10233.getClass(), "intValue", 0);
        setField(term10233, term10233.getClass(), "objectValue", null);
        setField(term10210, term10210.getClass(), "propListHead", term10233);
        setIntField(term10210, term10210.getClass(), "sourcePosition", -1656687479);
        setField(term10210, term10210.getClass(), "jsType", null);
        setField(term10210, term10210.getClass(), "parent", null);
        setField(term10209, term10209.getClass(), "parameters", term10210);
        setField(term10209, term10209.getClass(), "returnType", null);
        setBooleanField(term10209, term10209.getClass(), "returnTypeInferred", false);
        setBooleanField(term10209, term10209.getClass(), "resolved", false);
        setField(term10209, term10209.getClass(), "resolveResult", null);
        setField(term10209, term10209.getClass(), "registry", null);
        setField(term10208, term10208.getClass(), "call", term10209);
        setField(term10239, term10239.getClass(), "ownerFunction", null);
        setField(term10239, term10239.getClass(), "className", null);
        setField(term10239, term10239.getClass(), "properties", null);
        setBooleanField(term10239, term10239.getClass(), "nativeType", false);
        setField(term10239, term10239.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term10239, term10239.getClass(), "prettyPrint", false);
        setBooleanField(term10239, term10239.getClass(), "visited", false);
        setField(term10239, term10239.getClass(), "docInfo", null);
        setBooleanField(term10239, term10239.getClass(), "unknown", false);
        setBooleanField(term10239, term10239.getClass(), "resolved", false);
        setField(term10239, term10239.getClass(), "resolveResult", null);
        setField(term10239, term10239.getClass(), "registry", null);
        setField(term10208, term10208.getClass(), "prototype", term10239);
        setField(term10208, term10208.getClass(), "kind", enum103);
        setField(term10208, term10208.getClass(), "typeOfThis", null);
        setField(term10208, term10208.getClass(), "source", null);
        setField(term10208, term10208.getClass(), "implementedInterfaces", null);
        setField(term10208, term10208.getClass(), "subTypes", null);
        setField(term10208, term10208.getClass(), "templateTypeName", null);
        setField(term10208, term10208.getClass(), "className", null);
        setField(term10208, term10208.getClass(), "properties", null);
        setBooleanField(term10208, term10208.getClass(), "nativeType", false);
        setField(term10208, term10208.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term10208, term10208.getClass(), "prettyPrint", false);
        setBooleanField(term10208, term10208.getClass(), "visited", false);
        setField(term10208, term10208.getClass(), "docInfo", null);
        setBooleanField(term10208, term10208.getClass(), "unknown", false);
        setBooleanField(term10208, term10208.getClass(), "resolved", false);
        setField(term10208, term10208.getClass(), "resolveResult", null);
        setField(term10208, term10208.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eVpkWxjuki";
        try {
            callMethod(klass, "hasOwnProperty", argTypes, term10208, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class FunctionType_getTopMostDefiningType_166749951981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12368;

    public FunctionType_getTopMostDefiningType_166749951981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term42492 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term42491 = ((Class) term42492).getDeclaredField((String) "ORDINARY");
        ((Field) term42491).setAccessible(true);
        Object enum104 = ((Field) term42491).get((Object) null);
        term12368 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term12369 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term12370 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12377 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12383 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12393 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12398 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term12370, term12370.getClass(), "type", -1702055571);
        setIntField(term12372, term12372.getClass(), "type", 2143282300);
        setIntField(term12374, term12374.getClass(), "type", 0);
        setField(term12374, term12374.getClass(), "next", null);
        setField(term12374, term12374.getClass(), "first", null);
        setField(term12374, term12374.getClass(), "last", null);
        setField(term12374, term12374.getClass(), "propListHead", null);
        setIntField(term12374, term12374.getClass(), "sourcePosition", 0);
        setField(term12374, term12374.getClass(), "jsType", null);
        setField(term12374, term12374.getClass(), "parent", null);
        setField(term12372, term12372.getClass(), "next", term12374);
        setIntField(term12377, term12377.getClass(), "type", 0);
        setField(term12377, term12377.getClass(), "next", null);
        setField(term12377, term12377.getClass(), "first", null);
        setField(term12377, term12377.getClass(), "last", null);
        setField(term12377, term12377.getClass(), "propListHead", null);
        setIntField(term12377, term12377.getClass(), "sourcePosition", 0);
        setField(term12377, term12377.getClass(), "jsType", null);
        setField(term12377, term12377.getClass(), "parent", null);
        setField(term12372, term12372.getClass(), "first", term12377);
        setIntField(term12380, term12380.getClass(), "type", 0);
        setField(term12380, term12380.getClass(), "next", null);
        setField(term12380, term12380.getClass(), "first", null);
        setField(term12380, term12380.getClass(), "last", null);
        setField(term12380, term12380.getClass(), "propListHead", null);
        setIntField(term12380, term12380.getClass(), "sourcePosition", 0);
        setField(term12380, term12380.getClass(), "jsType", null);
        setField(term12380, term12380.getClass(), "parent", null);
        setField(term12372, term12372.getClass(), "last", term12380);
        setField(term12383, term12383.getClass(), "next", null);
        setIntField(term12383, term12383.getClass(), "type", 0);
        setIntField(term12383, term12383.getClass(), "intValue", 0);
        setField(term12383, term12383.getClass(), "objectValue", null);
        setField(term12372, term12372.getClass(), "propListHead", term12383);
        setIntField(term12372, term12372.getClass(), "sourcePosition", 1137624258);
        setField(term12372, term12372.getClass(), "jsType", null);
        setField(term12372, term12372.getClass(), "parent", null);
        setField(term12370, term12370.getClass(), "next", term12372);
        setIntField(term12387, term12387.getClass(), "type", 0);
        setField(term12387, term12387.getClass(), "next", null);
        setField(term12387, term12387.getClass(), "first", null);
        setField(term12387, term12387.getClass(), "last", null);
        setField(term12387, term12387.getClass(), "propListHead", null);
        setIntField(term12387, term12387.getClass(), "sourcePosition", 0);
        setField(term12387, term12387.getClass(), "jsType", null);
        setField(term12387, term12387.getClass(), "parent", null);
        setField(term12370, term12370.getClass(), "first", term12387);
        setIntField(term12390, term12390.getClass(), "type", 0);
        setField(term12390, term12390.getClass(), "next", null);
        setField(term12390, term12390.getClass(), "first", null);
        setField(term12390, term12390.getClass(), "last", null);
        setField(term12390, term12390.getClass(), "propListHead", null);
        setIntField(term12390, term12390.getClass(), "sourcePosition", 0);
        setField(term12390, term12390.getClass(), "jsType", null);
        setField(term12390, term12390.getClass(), "parent", null);
        setField(term12370, term12370.getClass(), "last", term12390);
        setField(term12393, term12393.getClass(), "next", null);
        setIntField(term12393, term12393.getClass(), "type", 0);
        setIntField(term12393, term12393.getClass(), "intValue", 0);
        setField(term12393, term12393.getClass(), "objectValue", null);
        setField(term12370, term12370.getClass(), "propListHead", term12393);
        setIntField(term12370, term12370.getClass(), "sourcePosition", 977862393);
        setField(term12370, term12370.getClass(), "jsType", null);
        setField(term12370, term12370.getClass(), "parent", null);
        setField(term12369, term12369.getClass(), "parameters", term12370);
        setField(term12369, term12369.getClass(), "returnType", null);
        setBooleanField(term12369, term12369.getClass(), "resolved", false);
        setField(term12369, term12369.getClass(), "resolveResult", null);
        setField(term12369, term12369.getClass(), "registry", null);
        setField(term12368, term12368.getClass(), "call", term12369);
        setField(term12398, term12398.getClass(), "ownerFunction", null);
        setField(term12398, term12398.getClass(), "className", null);
        setField(term12398, term12398.getClass(), "properties", null);
        setField(term12398, term12398.getClass(), "implicitPrototype", null);
        setBooleanField(term12398, term12398.getClass(), "nativeType", false);
        setBooleanField(term12398, term12398.getClass(), "visited", false);
        setField(term12398, term12398.getClass(), "docInfo", null);
        setBooleanField(term12398, term12398.getClass(), "unknown", false);
        setBooleanField(term12398, term12398.getClass(), "resolved", false);
        setField(term12398, term12398.getClass(), "resolveResult", null);
        setField(term12398, term12398.getClass(), "registry", null);
        setField(term12368, term12368.getClass(), "prototype", term12398);
        setField(term12368, term12368.getClass(), "kind", enum104);
        setField(term12368, term12368.getClass(), "typeOfThis", null);
        setField(term12368, term12368.getClass(), "source", null);
        setField(term12368, term12368.getClass(), "implementedInterfaces", null);
        setField(term12368, term12368.getClass(), "subTypes", null);
        setField(term12368, term12368.getClass(), "templateTypeName", null);
        setField(term12368, term12368.getClass(), "className", null);
        setField(term12368, term12368.getClass(), "properties", null);
        setField(term12368, term12368.getClass(), "implicitPrototype", null);
        setBooleanField(term12368, term12368.getClass(), "nativeType", false);
        setBooleanField(term12368, term12368.getClass(), "visited", false);
        setField(term12368, term12368.getClass(), "docInfo", null);
        setBooleanField(term12368, term12368.getClass(), "unknown", false);
        setBooleanField(term12368, term12368.getClass(), "resolved", false);
        setField(term12368, term12368.getClass(), "resolveResult", null);
        setField(term12368, term12368.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CKWpJaaaxX";
        try {
            callMethod(klass, "getTopMostDefiningType", argTypes, term12368, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



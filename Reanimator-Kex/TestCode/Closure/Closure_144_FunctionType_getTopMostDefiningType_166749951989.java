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

public class FunctionType_getTopMostDefiningType_166749951989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13863;

    public FunctionType_getTopMostDefiningType_166749951989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46709 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term46708 = ((Class) term46709).getDeclaredField((String) "ORDINARY");
        ((Field) term46708).setAccessible(true);
        Object enum119 = ((Field) term46708).get((Object) null);
        term13863 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term13864 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term13865 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13878 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term13882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13888 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term13894 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term13865, term13865.getClass(), "type", 1559605714);
        setIntField(term13867, term13867.getClass(), "type", -100825168);
        setIntField(term13869, term13869.getClass(), "type", 0);
        setField(term13869, term13869.getClass(), "next", null);
        setField(term13869, term13869.getClass(), "first", null);
        setField(term13869, term13869.getClass(), "last", null);
        setField(term13869, term13869.getClass(), "propListHead", null);
        setIntField(term13869, term13869.getClass(), "sourcePosition", 0);
        setField(term13869, term13869.getClass(), "jsType", null);
        setField(term13869, term13869.getClass(), "parent", null);
        setField(term13867, term13867.getClass(), "next", term13869);
        setIntField(term13872, term13872.getClass(), "type", 0);
        setField(term13872, term13872.getClass(), "next", null);
        setField(term13872, term13872.getClass(), "first", null);
        setField(term13872, term13872.getClass(), "last", null);
        setField(term13872, term13872.getClass(), "propListHead", null);
        setIntField(term13872, term13872.getClass(), "sourcePosition", 0);
        setField(term13872, term13872.getClass(), "jsType", null);
        setField(term13872, term13872.getClass(), "parent", null);
        setField(term13867, term13867.getClass(), "first", term13872);
        setIntField(term13875, term13875.getClass(), "type", 0);
        setField(term13875, term13875.getClass(), "next", null);
        setField(term13875, term13875.getClass(), "first", null);
        setField(term13875, term13875.getClass(), "last", null);
        setField(term13875, term13875.getClass(), "propListHead", null);
        setIntField(term13875, term13875.getClass(), "sourcePosition", 0);
        setField(term13875, term13875.getClass(), "jsType", null);
        setField(term13875, term13875.getClass(), "parent", null);
        setField(term13867, term13867.getClass(), "last", term13875);
        setField(term13878, term13878.getClass(), "next", null);
        setIntField(term13878, term13878.getClass(), "type", 0);
        setIntField(term13878, term13878.getClass(), "intValue", 0);
        setField(term13878, term13878.getClass(), "objectValue", null);
        setField(term13867, term13867.getClass(), "propListHead", term13878);
        setIntField(term13867, term13867.getClass(), "sourcePosition", 768407648);
        setField(term13867, term13867.getClass(), "jsType", null);
        setField(term13867, term13867.getClass(), "parent", null);
        setField(term13865, term13865.getClass(), "next", term13867);
        setIntField(term13882, term13882.getClass(), "type", 0);
        setField(term13882, term13882.getClass(), "next", null);
        setField(term13882, term13882.getClass(), "first", null);
        setField(term13882, term13882.getClass(), "last", null);
        setField(term13882, term13882.getClass(), "propListHead", null);
        setIntField(term13882, term13882.getClass(), "sourcePosition", 0);
        setField(term13882, term13882.getClass(), "jsType", null);
        setField(term13882, term13882.getClass(), "parent", null);
        setField(term13865, term13865.getClass(), "first", term13882);
        setIntField(term13885, term13885.getClass(), "type", 0);
        setField(term13885, term13885.getClass(), "next", null);
        setField(term13885, term13885.getClass(), "first", null);
        setField(term13885, term13885.getClass(), "last", null);
        setField(term13885, term13885.getClass(), "propListHead", null);
        setIntField(term13885, term13885.getClass(), "sourcePosition", 0);
        setField(term13885, term13885.getClass(), "jsType", null);
        setField(term13885, term13885.getClass(), "parent", null);
        setField(term13865, term13865.getClass(), "last", term13885);
        setField(term13888, term13888.getClass(), "next", null);
        setIntField(term13888, term13888.getClass(), "type", 0);
        setIntField(term13888, term13888.getClass(), "intValue", 0);
        setField(term13888, term13888.getClass(), "objectValue", null);
        setField(term13865, term13865.getClass(), "propListHead", term13888);
        setIntField(term13865, term13865.getClass(), "sourcePosition", -350454594);
        setField(term13865, term13865.getClass(), "jsType", null);
        setField(term13865, term13865.getClass(), "parent", null);
        setField(term13864, term13864.getClass(), "parameters", term13865);
        setField(term13864, term13864.getClass(), "returnType", null);
        setBooleanField(term13864, term13864.getClass(), "returnTypeInferred", false);
        setBooleanField(term13864, term13864.getClass(), "resolved", false);
        setField(term13864, term13864.getClass(), "resolveResult", null);
        setField(term13864, term13864.getClass(), "registry", null);
        setField(term13863, term13863.getClass(), "call", term13864);
        setField(term13894, term13894.getClass(), "ownerFunction", null);
        setField(term13894, term13894.getClass(), "className", null);
        setField(term13894, term13894.getClass(), "properties", null);
        setField(term13894, term13894.getClass(), "implicitPrototype", null);
        setBooleanField(term13894, term13894.getClass(), "nativeType", false);
        setBooleanField(term13894, term13894.getClass(), "prettyPrint", false);
        setBooleanField(term13894, term13894.getClass(), "visited", false);
        setField(term13894, term13894.getClass(), "docInfo", null);
        setBooleanField(term13894, term13894.getClass(), "unknown", false);
        setBooleanField(term13894, term13894.getClass(), "resolved", false);
        setField(term13894, term13894.getClass(), "resolveResult", null);
        setField(term13894, term13894.getClass(), "registry", null);
        setField(term13863, term13863.getClass(), "prototype", term13894);
        setField(term13863, term13863.getClass(), "kind", enum119);
        setField(term13863, term13863.getClass(), "typeOfThis", null);
        setField(term13863, term13863.getClass(), "source", null);
        setField(term13863, term13863.getClass(), "implementedInterfaces", null);
        setField(term13863, term13863.getClass(), "subTypes", null);
        setField(term13863, term13863.getClass(), "templateTypeName", null);
        setField(term13863, term13863.getClass(), "className", null);
        setField(term13863, term13863.getClass(), "properties", null);
        setField(term13863, term13863.getClass(), "implicitPrototype", null);
        setBooleanField(term13863, term13863.getClass(), "nativeType", false);
        setBooleanField(term13863, term13863.getClass(), "prettyPrint", false);
        setBooleanField(term13863, term13863.getClass(), "visited", false);
        setField(term13863, term13863.getClass(), "docInfo", null);
        setBooleanField(term13863, term13863.getClass(), "unknown", false);
        setBooleanField(term13863, term13863.getClass(), "resolved", false);
        setField(term13863, term13863.getClass(), "resolveResult", null);
        setField(term13863, term13863.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MwwjNtdOFT";
        try {
            callMethod(klass, "getTopMostDefiningType", argTypes, term13863, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



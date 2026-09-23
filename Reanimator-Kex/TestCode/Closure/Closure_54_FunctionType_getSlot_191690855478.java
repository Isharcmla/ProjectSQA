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

public class FunctionType_getSlot_191690855478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5322;

    public FunctionType_getSlot_191690855478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32251 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term32250 = ((Class) term32251).getDeclaredField((String) "INTERFACE");
        ((Field) term32250).setAccessible(true);
        Object enum86 = ((Field) term32250).get((Object) null);
        term5322 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term5323 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term5324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5347 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term5353 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSlot"));
        setIntField(term5324, term5324.getClass(), "type", 229204365);
        setIntField(term5326, term5326.getClass(), "type", -1002370457);
        setIntField(term5328, term5328.getClass(), "type", 0);
        setField(term5328, term5328.getClass(), "next", null);
        setField(term5328, term5328.getClass(), "first", null);
        setField(term5328, term5328.getClass(), "last", null);
        setField(term5328, term5328.getClass(), "propListHead", null);
        setIntField(term5328, term5328.getClass(), "sourcePosition", 0);
        setField(term5328, term5328.getClass(), "jsType", null);
        setField(term5328, term5328.getClass(), "parent", null);
        setField(term5326, term5326.getClass(), "next", term5328);
        setIntField(term5331, term5331.getClass(), "type", 0);
        setField(term5331, term5331.getClass(), "next", null);
        setField(term5331, term5331.getClass(), "first", null);
        setField(term5331, term5331.getClass(), "last", null);
        setField(term5331, term5331.getClass(), "propListHead", null);
        setIntField(term5331, term5331.getClass(), "sourcePosition", 0);
        setField(term5331, term5331.getClass(), "jsType", null);
        setField(term5331, term5331.getClass(), "parent", null);
        setField(term5326, term5326.getClass(), "first", term5331);
        setIntField(term5334, term5334.getClass(), "type", 0);
        setField(term5334, term5334.getClass(), "next", null);
        setField(term5334, term5334.getClass(), "first", null);
        setField(term5334, term5334.getClass(), "last", null);
        setField(term5334, term5334.getClass(), "propListHead", null);
        setIntField(term5334, term5334.getClass(), "sourcePosition", 0);
        setField(term5334, term5334.getClass(), "jsType", null);
        setField(term5334, term5334.getClass(), "parent", null);
        setField(term5326, term5326.getClass(), "last", term5334);
        setField(term5326, term5326.getClass(), "propListHead", null);
        setIntField(term5326, term5326.getClass(), "sourcePosition", 0);
        setField(term5326, term5326.getClass(), "jsType", null);
        setField(term5326, term5326.getClass(), "parent", null);
        setField(term5324, term5324.getClass(), "next", term5326);
        setIntField(term5338, term5338.getClass(), "type", 0);
        setField(term5338, term5338.getClass(), "next", null);
        setField(term5338, term5338.getClass(), "first", null);
        setField(term5338, term5338.getClass(), "last", null);
        setField(term5338, term5338.getClass(), "propListHead", null);
        setIntField(term5338, term5338.getClass(), "sourcePosition", 0);
        setField(term5338, term5338.getClass(), "jsType", null);
        setField(term5338, term5338.getClass(), "parent", null);
        setField(term5324, term5324.getClass(), "first", term5338);
        setIntField(term5341, term5341.getClass(), "type", 0);
        setField(term5341, term5341.getClass(), "next", null);
        setField(term5341, term5341.getClass(), "first", null);
        setField(term5341, term5341.getClass(), "last", null);
        setField(term5341, term5341.getClass(), "propListHead", null);
        setIntField(term5341, term5341.getClass(), "sourcePosition", 0);
        setField(term5341, term5341.getClass(), "jsType", null);
        setField(term5341, term5341.getClass(), "parent", null);
        setField(term5324, term5324.getClass(), "last", term5341);
        setField(term5324, term5324.getClass(), "propListHead", null);
        setIntField(term5324, term5324.getClass(), "sourcePosition", 0);
        setField(term5324, term5324.getClass(), "jsType", null);
        setField(term5324, term5324.getClass(), "parent", null);
        setField(term5323, term5323.getClass(), "parameters", term5324);
        setField(term5323, term5323.getClass(), "returnType", null);
        setBooleanField(term5323, term5323.getClass(), "returnTypeInferred", false);
        setBooleanField(term5323, term5323.getClass(), "resolved", false);
        setField(term5323, term5323.getClass(), "resolveResult", null);
        setField(term5323, term5323.getClass(), "registry", null);
        setField(term5322, term5322.getClass(), "call", term5323);
        setField(term5347, term5347.getClass(), "className", null);
        setField(term5347, term5347.getClass(), "properties", null);
        setBooleanField(term5347, term5347.getClass(), "nativeType", false);
        setField(term5347, term5347.getClass(), "implicitPrototypeFallback", null);
        setField(term5347, term5347.getClass(), "ownerFunction", null);
        setBooleanField(term5347, term5347.getClass(), "prettyPrint", false);
        setBooleanField(term5347, term5347.getClass(), "visited", false);
        setField(term5347, term5347.getClass(), "docInfo", null);
        setBooleanField(term5347, term5347.getClass(), "unknown", false);
        setBooleanField(term5347, term5347.getClass(), "resolved", false);
        setField(term5347, term5347.getClass(), "resolveResult", null);
        setField(term5347, term5347.getClass(), "registry", null);
        setField(term5322, term5322.getClass(), "prototype", term5347);
        setField(term5353, term5353.getClass(), "name", null);
        setField(term5353, term5353.getClass(), "type", null);
        setBooleanField(term5353, term5353.getClass(), "inferred", false);
        setField(term5322, term5322.getClass(), "prototypeSlot", term5353);
        setField(term5322, term5322.getClass(), "kind", enum86);
        setField(term5322, term5322.getClass(), "typeOfThis", null);
        setField(term5322, term5322.getClass(), "source", null);
        setField(term5322, term5322.getClass(), "implementedInterfaces", null);
        setField(term5322, term5322.getClass(), "extendedInterfaces", null);
        setField(term5322, term5322.getClass(), "subTypes", null);
        setField(term5322, term5322.getClass(), "templateTypeName", null);
        setField(term5322, term5322.getClass(), "className", null);
        setField(term5322, term5322.getClass(), "properties", null);
        setBooleanField(term5322, term5322.getClass(), "nativeType", false);
        setField(term5322, term5322.getClass(), "implicitPrototypeFallback", null);
        setField(term5322, term5322.getClass(), "ownerFunction", null);
        setBooleanField(term5322, term5322.getClass(), "prettyPrint", false);
        setBooleanField(term5322, term5322.getClass(), "visited", false);
        setField(term5322, term5322.getClass(), "docInfo", null);
        setBooleanField(term5322, term5322.getClass(), "unknown", false);
        setBooleanField(term5322, term5322.getClass(), "resolved", false);
        setField(term5322, term5322.getClass(), "resolveResult", null);
        setField(term5322, term5322.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZfdXfCCFDf";
        try {
            callMethod(klass, "getSlot", argTypes, term5322, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class FunctionType_resolveInternal_5807426119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20495;

    public FunctionType_resolveInternal_5807426119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term61179 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term61178 = ((Class) term61179).getDeclaredField((String) "ORDINARY");
        ((Field) term61178).setAccessible(true);
        Object enum156 = ((Field) term61178).get((Object) null);
        term20495 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term20496 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term20497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20514 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20520 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term20526 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSlot"));
        setIntField(term20497, term20497.getClass(), "type", -1539747985);
        setIntField(term20499, term20499.getClass(), "type", -1945635750);
        setIntField(term20501, term20501.getClass(), "type", 0);
        setField(term20501, term20501.getClass(), "next", null);
        setField(term20501, term20501.getClass(), "first", null);
        setField(term20501, term20501.getClass(), "last", null);
        setField(term20501, term20501.getClass(), "propListHead", null);
        setIntField(term20501, term20501.getClass(), "sourcePosition", 0);
        setField(term20501, term20501.getClass(), "jsType", null);
        setField(term20501, term20501.getClass(), "parent", null);
        setField(term20499, term20499.getClass(), "next", term20501);
        setIntField(term20504, term20504.getClass(), "type", 0);
        setField(term20504, term20504.getClass(), "next", null);
        setField(term20504, term20504.getClass(), "first", null);
        setField(term20504, term20504.getClass(), "last", null);
        setField(term20504, term20504.getClass(), "propListHead", null);
        setIntField(term20504, term20504.getClass(), "sourcePosition", 0);
        setField(term20504, term20504.getClass(), "jsType", null);
        setField(term20504, term20504.getClass(), "parent", null);
        setField(term20499, term20499.getClass(), "first", term20504);
        setIntField(term20507, term20507.getClass(), "type", 0);
        setField(term20507, term20507.getClass(), "next", null);
        setField(term20507, term20507.getClass(), "first", null);
        setField(term20507, term20507.getClass(), "last", null);
        setField(term20507, term20507.getClass(), "propListHead", null);
        setIntField(term20507, term20507.getClass(), "sourcePosition", 0);
        setField(term20507, term20507.getClass(), "jsType", null);
        setField(term20507, term20507.getClass(), "parent", null);
        setField(term20499, term20499.getClass(), "last", term20507);
        setField(term20499, term20499.getClass(), "propListHead", null);
        setIntField(term20499, term20499.getClass(), "sourcePosition", 0);
        setField(term20499, term20499.getClass(), "jsType", null);
        setField(term20499, term20499.getClass(), "parent", null);
        setField(term20497, term20497.getClass(), "next", term20499);
        setIntField(term20511, term20511.getClass(), "type", 0);
        setField(term20511, term20511.getClass(), "next", null);
        setField(term20511, term20511.getClass(), "first", null);
        setField(term20511, term20511.getClass(), "last", null);
        setField(term20511, term20511.getClass(), "propListHead", null);
        setIntField(term20511, term20511.getClass(), "sourcePosition", 0);
        setField(term20511, term20511.getClass(), "jsType", null);
        setField(term20511, term20511.getClass(), "parent", null);
        setField(term20497, term20497.getClass(), "first", term20511);
        setIntField(term20514, term20514.getClass(), "type", 0);
        setField(term20514, term20514.getClass(), "next", null);
        setField(term20514, term20514.getClass(), "first", null);
        setField(term20514, term20514.getClass(), "last", null);
        setField(term20514, term20514.getClass(), "propListHead", null);
        setIntField(term20514, term20514.getClass(), "sourcePosition", 0);
        setField(term20514, term20514.getClass(), "jsType", null);
        setField(term20514, term20514.getClass(), "parent", null);
        setField(term20497, term20497.getClass(), "last", term20514);
        setField(term20497, term20497.getClass(), "propListHead", null);
        setIntField(term20497, term20497.getClass(), "sourcePosition", 0);
        setField(term20497, term20497.getClass(), "jsType", null);
        setField(term20497, term20497.getClass(), "parent", null);
        setField(term20496, term20496.getClass(), "parameters", term20497);
        setField(term20496, term20496.getClass(), "returnType", null);
        setBooleanField(term20496, term20496.getClass(), "returnTypeInferred", false);
        setBooleanField(term20496, term20496.getClass(), "resolved", false);
        setField(term20496, term20496.getClass(), "resolveResult", null);
        setField(term20496, term20496.getClass(), "registry", null);
        setField(term20495, term20495.getClass(), "call", term20496);
        setField(term20520, term20520.getClass(), "className", null);
        setField(term20520, term20520.getClass(), "properties", null);
        setBooleanField(term20520, term20520.getClass(), "nativeType", false);
        setField(term20520, term20520.getClass(), "implicitPrototypeFallback", null);
        setField(term20520, term20520.getClass(), "ownerFunction", null);
        setBooleanField(term20520, term20520.getClass(), "prettyPrint", false);
        setBooleanField(term20520, term20520.getClass(), "visited", false);
        setField(term20520, term20520.getClass(), "docInfo", null);
        setBooleanField(term20520, term20520.getClass(), "unknown", false);
        setBooleanField(term20520, term20520.getClass(), "resolved", false);
        setField(term20520, term20520.getClass(), "resolveResult", null);
        setField(term20520, term20520.getClass(), "registry", null);
        setField(term20495, term20495.getClass(), "prototype", term20520);
        setField(term20526, term20526.getClass(), "name", null);
        setField(term20526, term20526.getClass(), "type", null);
        setBooleanField(term20526, term20526.getClass(), "inferred", false);
        setField(term20495, term20495.getClass(), "prototypeSlot", term20526);
        setField(term20495, term20495.getClass(), "kind", enum156);
        setField(term20495, term20495.getClass(), "typeOfThis", null);
        setField(term20495, term20495.getClass(), "source", null);
        setField(term20495, term20495.getClass(), "implementedInterfaces", null);
        setField(term20495, term20495.getClass(), "extendedInterfaces", null);
        setField(term20495, term20495.getClass(), "subTypes", null);
        setField(term20495, term20495.getClass(), "templateTypeName", null);
        setField(term20495, term20495.getClass(), "className", null);
        setField(term20495, term20495.getClass(), "properties", null);
        setBooleanField(term20495, term20495.getClass(), "nativeType", false);
        setField(term20495, term20495.getClass(), "implicitPrototypeFallback", null);
        setField(term20495, term20495.getClass(), "ownerFunction", null);
        setBooleanField(term20495, term20495.getClass(), "prettyPrint", false);
        setBooleanField(term20495, term20495.getClass(), "visited", false);
        setField(term20495, term20495.getClass(), "docInfo", null);
        setBooleanField(term20495, term20495.getClass(), "unknown", false);
        setBooleanField(term20495, term20495.getClass(), "resolved", false);
        setField(term20495, term20495.getClass(), "resolveResult", null);
        setField(term20495, term20495.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "resolveInternal", argTypes, term20495, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class FunctionType_getCallOrBindSignature_1753224773151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25057;
     Object term25113;

    public FunctionType_getCallOrBindSignature_1753224773151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term172552 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term172551 = ((Class) term172552).getDeclaredField((String) "ORDINARY");
        ((Field) term172551).setAccessible(true);
        Object enum287 = ((Field) term172551).get((Object) null);
        Class<? extends Object> term172843 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term172842 = ((Class) term172843).getDeclaredField((String) "ANY");
        ((Field) term172842).setAccessible(true);
        Object enum288 = ((Field) term172842).get((Object) null);
        term25057 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term25058 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term25059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25066 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25073 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25086 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term25059, term25059.getClass(), "type", 1390820006);
        setIntField(term25061, term25061.getClass(), "type", -828982065);
        setIntField(term25063, term25063.getClass(), "type", 1221443226);
        setField(term25063, term25063.getClass(), "next", null);
        setField(term25063, term25063.getClass(), "first", null);
        setField(term25063, term25063.getClass(), "last", null);
        setField(term25063, term25063.getClass(), "propListHead", null);
        setIntField(term25063, term25063.getClass(), "sourcePosition", 0);
        setField(term25063, term25063.getClass(), "jsType", null);
        setField(term25063, term25063.getClass(), "parent", null);
        setField(term25061, term25061.getClass(), "next", term25063);
        setIntField(term25066, term25066.getClass(), "type", 0);
        setField(term25066, term25066.getClass(), "next", null);
        setField(term25066, term25066.getClass(), "first", null);
        setField(term25066, term25066.getClass(), "last", null);
        setField(term25066, term25066.getClass(), "propListHead", null);
        setIntField(term25066, term25066.getClass(), "sourcePosition", 0);
        setField(term25066, term25066.getClass(), "jsType", null);
        setField(term25066, term25066.getClass(), "parent", null);
        setField(term25061, term25061.getClass(), "first", term25066);
        setIntField(term25069, term25069.getClass(), "type", -944542900);
        setField(term25069, term25069.getClass(), "next", null);
        setField(term25069, term25069.getClass(), "first", term25066);
        setField(term25069, term25069.getClass(), "last", term25069);
        setField(term25069, term25069.getClass(), "propListHead", null);
        setIntField(term25069, term25069.getClass(), "sourcePosition", 0);
        setField(term25069, term25069.getClass(), "jsType", null);
        setField(term25069, term25069.getClass(), "parent", null);
        setField(term25061, term25061.getClass(), "last", term25069);
        setField(term25061, term25061.getClass(), "propListHead", null);
        setIntField(term25061, term25061.getClass(), "sourcePosition", 0);
        setField(term25061, term25061.getClass(), "jsType", null);
        setField(term25061, term25061.getClass(), "parent", null);
        setField(term25059, term25059.getClass(), "next", term25061);
        setIntField(term25073, term25073.getClass(), "type", 1084849225);
        setIntField(term25075, term25075.getClass(), "type", -1702055571);
        setField(term25075, term25075.getClass(), "next", term25069);
        setField(term25075, term25075.getClass(), "first", null);
        setField(term25075, term25075.getClass(), "last", term25059);
        setField(term25075, term25075.getClass(), "propListHead", null);
        setIntField(term25075, term25075.getClass(), "sourcePosition", 0);
        setField(term25075, term25075.getClass(), "jsType", null);
        setField(term25075, term25075.getClass(), "parent", null);
        setField(term25073, term25073.getClass(), "next", term25075);
        setField(term25073, term25073.getClass(), "first", term25073);
        setIntField(term25078, term25078.getClass(), "type", 908108726);
        setField(term25078, term25078.getClass(), "next", null);
        setField(term25078, term25078.getClass(), "first", term25066);
        setField(term25078, term25078.getClass(), "last", term25069);
        setField(term25078, term25078.getClass(), "propListHead", null);
        setIntField(term25078, term25078.getClass(), "sourcePosition", 0);
        setField(term25078, term25078.getClass(), "jsType", null);
        setField(term25078, term25078.getClass(), "parent", null);
        setField(term25073, term25073.getClass(), "last", term25078);
        setField(term25073, term25073.getClass(), "propListHead", null);
        setIntField(term25073, term25073.getClass(), "sourcePosition", 0);
        setField(term25073, term25073.getClass(), "jsType", null);
        setField(term25073, term25073.getClass(), "parent", null);
        setField(term25059, term25059.getClass(), "first", term25073);
        setField(term25059, term25059.getClass(), "last", term25063);
        setField(term25059, term25059.getClass(), "propListHead", null);
        setIntField(term25059, term25059.getClass(), "sourcePosition", 0);
        setField(term25059, term25059.getClass(), "jsType", null);
        setField(term25059, term25059.getClass(), "parent", null);
        setField(term25058, term25058.getClass(), "parameters", term25059);
        setField(term25058, term25058.getClass(), "returnType", null);
        setBooleanField(term25058, term25058.getClass(), "returnTypeInferred", false);
        setBooleanField(term25058, term25058.getClass(), "resolved", false);
        setField(term25058, term25058.getClass(), "resolveResult", null);
        setBooleanField(term25058, term25058.getClass(), "inTemplatedCheckVisit", false);
        setField(term25058, term25058.getClass(), "registry", null);
        setField(term25057, term25057.getClass(), "call", term25058);
        setField(term25086, term25086.getClass(), "name", null);
        setField(term25086, term25086.getClass(), "type", null);
        setBooleanField(term25086, term25086.getClass(), "inferred", false);
        setField(term25086, term25086.getClass(), "propertyNode", null);
        setField(term25086, term25086.getClass(), "docInfo", null);
        setField(term25057, term25057.getClass(), "prototypeSlot", term25086);
        setField(term25057, term25057.getClass(), "kind", enum287);
        setField(term25057, term25057.getClass(), "propAccess", enum288);
        setField(term25057, term25057.getClass(), "typeOfThis", null);
        setField(term25057, term25057.getClass(), "source", null);
        setField(term25057, term25057.getClass(), "implementedInterfaces", null);
        setField(term25057, term25057.getClass(), "extendedInterfaces", null);
        setField(term25057, term25057.getClass(), "subTypes", null);
        setField(term25057, term25057.getClass(), "templateTypeNames", null);
        setField(term25057, term25057.getClass(), "className", null);
        setField(term25057, term25057.getClass(), "properties", null);
        setBooleanField(term25057, term25057.getClass(), "nativeType", false);
        setField(term25057, term25057.getClass(), "implicitPrototypeFallback", null);
        setField(term25057, term25057.getClass(), "ownerFunction", null);
        setBooleanField(term25057, term25057.getClass(), "prettyPrint", false);
        setBooleanField(term25057, term25057.getClass(), "visited", false);
        setField(term25057, term25057.getClass(), "docInfo", null);
        setBooleanField(term25057, term25057.getClass(), "unknown", false);
        setBooleanField(term25057, term25057.getClass(), "resolved", false);
        setField(term25057, term25057.getClass(), "resolveResult", null);
        setBooleanField(term25057, term25057.getClass(), "inTemplatedCheckVisit", false);
        setField(term25057, term25057.getClass(), "registry", null);
        term25113 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term25113;
        try {
            callMethod(klass, "getCallOrBindSignature", argTypes, term25057, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class FunctionType_isSubtype_210100215895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16042;

    public FunctionType_isSubtype_210100215895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term50750 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term50749 = ((Class) term50750).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term50749).setAccessible(true);
        Object enum127 = ((Field) term50749).get((Object) null);
        term16042 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term16043 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term16044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16046 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16057 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term16061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16067 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term16073 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term16044, term16044.getClass(), "type", -645429025);
        setIntField(term16046, term16046.getClass(), "type", 1003743923);
        setIntField(term16048, term16048.getClass(), "type", 0);
        setField(term16048, term16048.getClass(), "next", null);
        setField(term16048, term16048.getClass(), "first", null);
        setField(term16048, term16048.getClass(), "last", null);
        setField(term16048, term16048.getClass(), "propListHead", null);
        setIntField(term16048, term16048.getClass(), "sourcePosition", 0);
        setField(term16048, term16048.getClass(), "jsType", null);
        setField(term16048, term16048.getClass(), "parent", null);
        setField(term16046, term16046.getClass(), "next", term16048);
        setIntField(term16051, term16051.getClass(), "type", 0);
        setField(term16051, term16051.getClass(), "next", null);
        setField(term16051, term16051.getClass(), "first", null);
        setField(term16051, term16051.getClass(), "last", null);
        setField(term16051, term16051.getClass(), "propListHead", null);
        setIntField(term16051, term16051.getClass(), "sourcePosition", 0);
        setField(term16051, term16051.getClass(), "jsType", null);
        setField(term16051, term16051.getClass(), "parent", null);
        setField(term16046, term16046.getClass(), "first", term16051);
        setIntField(term16054, term16054.getClass(), "type", 0);
        setField(term16054, term16054.getClass(), "next", null);
        setField(term16054, term16054.getClass(), "first", null);
        setField(term16054, term16054.getClass(), "last", null);
        setField(term16054, term16054.getClass(), "propListHead", null);
        setIntField(term16054, term16054.getClass(), "sourcePosition", 0);
        setField(term16054, term16054.getClass(), "jsType", null);
        setField(term16054, term16054.getClass(), "parent", null);
        setField(term16046, term16046.getClass(), "last", term16054);
        setField(term16057, term16057.getClass(), "next", null);
        setIntField(term16057, term16057.getClass(), "type", 0);
        setIntField(term16057, term16057.getClass(), "intValue", 0);
        setField(term16057, term16057.getClass(), "objectValue", null);
        setField(term16046, term16046.getClass(), "propListHead", term16057);
        setIntField(term16046, term16046.getClass(), "sourcePosition", 1887772522);
        setField(term16046, term16046.getClass(), "jsType", null);
        setField(term16046, term16046.getClass(), "parent", null);
        setField(term16044, term16044.getClass(), "next", term16046);
        setIntField(term16061, term16061.getClass(), "type", 0);
        setField(term16061, term16061.getClass(), "next", null);
        setField(term16061, term16061.getClass(), "first", null);
        setField(term16061, term16061.getClass(), "last", null);
        setField(term16061, term16061.getClass(), "propListHead", null);
        setIntField(term16061, term16061.getClass(), "sourcePosition", 0);
        setField(term16061, term16061.getClass(), "jsType", null);
        setField(term16061, term16061.getClass(), "parent", null);
        setField(term16044, term16044.getClass(), "first", term16061);
        setIntField(term16064, term16064.getClass(), "type", 0);
        setField(term16064, term16064.getClass(), "next", null);
        setField(term16064, term16064.getClass(), "first", null);
        setField(term16064, term16064.getClass(), "last", null);
        setField(term16064, term16064.getClass(), "propListHead", null);
        setIntField(term16064, term16064.getClass(), "sourcePosition", 0);
        setField(term16064, term16064.getClass(), "jsType", null);
        setField(term16064, term16064.getClass(), "parent", null);
        setField(term16044, term16044.getClass(), "last", term16064);
        setField(term16067, term16067.getClass(), "next", null);
        setIntField(term16067, term16067.getClass(), "type", 0);
        setIntField(term16067, term16067.getClass(), "intValue", 0);
        setField(term16067, term16067.getClass(), "objectValue", null);
        setField(term16044, term16044.getClass(), "propListHead", term16067);
        setIntField(term16044, term16044.getClass(), "sourcePosition", 354196060);
        setField(term16044, term16044.getClass(), "jsType", null);
        setField(term16044, term16044.getClass(), "parent", null);
        setField(term16043, term16043.getClass(), "parameters", term16044);
        setField(term16043, term16043.getClass(), "returnType", null);
        setBooleanField(term16043, term16043.getClass(), "returnTypeInferred", false);
        setBooleanField(term16043, term16043.getClass(), "resolved", false);
        setField(term16043, term16043.getClass(), "resolveResult", null);
        setField(term16043, term16043.getClass(), "registry", null);
        setField(term16042, term16042.getClass(), "call", term16043);
        setField(term16073, term16073.getClass(), "ownerFunction", null);
        setField(term16073, term16073.getClass(), "className", null);
        setField(term16073, term16073.getClass(), "properties", null);
        setBooleanField(term16073, term16073.getClass(), "nativeType", false);
        setField(term16073, term16073.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term16073, term16073.getClass(), "prettyPrint", false);
        setBooleanField(term16073, term16073.getClass(), "visited", false);
        setField(term16073, term16073.getClass(), "docInfo", null);
        setBooleanField(term16073, term16073.getClass(), "unknown", false);
        setBooleanField(term16073, term16073.getClass(), "resolved", false);
        setField(term16073, term16073.getClass(), "resolveResult", null);
        setField(term16073, term16073.getClass(), "registry", null);
        setField(term16042, term16042.getClass(), "prototype", term16073);
        setField(term16042, term16042.getClass(), "kind", enum127);
        setField(term16042, term16042.getClass(), "typeOfThis", null);
        setField(term16042, term16042.getClass(), "source", null);
        setField(term16042, term16042.getClass(), "implementedInterfaces", null);
        setField(term16042, term16042.getClass(), "subTypes", null);
        setField(term16042, term16042.getClass(), "templateTypeName", null);
        setField(term16042, term16042.getClass(), "className", null);
        setField(term16042, term16042.getClass(), "properties", null);
        setBooleanField(term16042, term16042.getClass(), "nativeType", false);
        setField(term16042, term16042.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term16042, term16042.getClass(), "prettyPrint", false);
        setBooleanField(term16042, term16042.getClass(), "visited", false);
        setField(term16042, term16042.getClass(), "docInfo", null);
        setBooleanField(term16042, term16042.getClass(), "unknown", false);
        setBooleanField(term16042, term16042.getClass(), "resolved", false);
        setField(term16042, term16042.getClass(), "resolveResult", null);
        setField(term16042, term16042.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "isSubtype", argTypes, term16042, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class FunctionType_getAllImplementedInterfaces_57268353383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7125;

    public FunctionType_getAllImplementedInterfaces_57268353383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term35690 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term35689 = ((Class) term35690).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term35689).setAccessible(true);
        Object enum93 = ((Field) term35689).get((Object) null);
        term7125 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term7126 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term7127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7141 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7150 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term7156 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSlot"));
        setIntField(term7127, term7127.getClass(), "type", -1347358701);
        setIntField(term7129, term7129.getClass(), "type", 1694224101);
        setIntField(term7131, term7131.getClass(), "type", 0);
        setField(term7131, term7131.getClass(), "next", null);
        setField(term7131, term7131.getClass(), "first", null);
        setField(term7131, term7131.getClass(), "last", null);
        setField(term7131, term7131.getClass(), "propListHead", null);
        setIntField(term7131, term7131.getClass(), "sourcePosition", 0);
        setField(term7131, term7131.getClass(), "jsType", null);
        setField(term7131, term7131.getClass(), "parent", null);
        setField(term7129, term7129.getClass(), "next", term7131);
        setIntField(term7134, term7134.getClass(), "type", 0);
        setField(term7134, term7134.getClass(), "next", null);
        setField(term7134, term7134.getClass(), "first", null);
        setField(term7134, term7134.getClass(), "last", null);
        setField(term7134, term7134.getClass(), "propListHead", null);
        setIntField(term7134, term7134.getClass(), "sourcePosition", 0);
        setField(term7134, term7134.getClass(), "jsType", null);
        setField(term7134, term7134.getClass(), "parent", null);
        setField(term7129, term7129.getClass(), "first", term7134);
        setIntField(term7137, term7137.getClass(), "type", 0);
        setField(term7137, term7137.getClass(), "next", null);
        setField(term7137, term7137.getClass(), "first", null);
        setField(term7137, term7137.getClass(), "last", null);
        setField(term7137, term7137.getClass(), "propListHead", null);
        setIntField(term7137, term7137.getClass(), "sourcePosition", 0);
        setField(term7137, term7137.getClass(), "jsType", null);
        setField(term7137, term7137.getClass(), "parent", null);
        setField(term7129, term7129.getClass(), "last", term7137);
        setField(term7129, term7129.getClass(), "propListHead", null);
        setIntField(term7129, term7129.getClass(), "sourcePosition", 0);
        setField(term7129, term7129.getClass(), "jsType", null);
        setField(term7129, term7129.getClass(), "parent", null);
        setField(term7127, term7127.getClass(), "next", term7129);
        setIntField(term7141, term7141.getClass(), "type", 0);
        setField(term7141, term7141.getClass(), "next", null);
        setField(term7141, term7141.getClass(), "first", null);
        setField(term7141, term7141.getClass(), "last", null);
        setField(term7141, term7141.getClass(), "propListHead", null);
        setIntField(term7141, term7141.getClass(), "sourcePosition", 0);
        setField(term7141, term7141.getClass(), "jsType", null);
        setField(term7141, term7141.getClass(), "parent", null);
        setField(term7127, term7127.getClass(), "first", term7141);
        setIntField(term7144, term7144.getClass(), "type", 0);
        setField(term7144, term7144.getClass(), "next", null);
        setField(term7144, term7144.getClass(), "first", null);
        setField(term7144, term7144.getClass(), "last", null);
        setField(term7144, term7144.getClass(), "propListHead", null);
        setIntField(term7144, term7144.getClass(), "sourcePosition", 0);
        setField(term7144, term7144.getClass(), "jsType", null);
        setField(term7144, term7144.getClass(), "parent", null);
        setField(term7127, term7127.getClass(), "last", term7144);
        setField(term7127, term7127.getClass(), "propListHead", null);
        setIntField(term7127, term7127.getClass(), "sourcePosition", 0);
        setField(term7127, term7127.getClass(), "jsType", null);
        setField(term7127, term7127.getClass(), "parent", null);
        setField(term7126, term7126.getClass(), "parameters", term7127);
        setField(term7126, term7126.getClass(), "returnType", null);
        setBooleanField(term7126, term7126.getClass(), "returnTypeInferred", false);
        setBooleanField(term7126, term7126.getClass(), "resolved", false);
        setField(term7126, term7126.getClass(), "resolveResult", null);
        setField(term7126, term7126.getClass(), "registry", null);
        setField(term7125, term7125.getClass(), "call", term7126);
        setField(term7150, term7150.getClass(), "className", null);
        setField(term7150, term7150.getClass(), "properties", null);
        setBooleanField(term7150, term7150.getClass(), "nativeType", false);
        setField(term7150, term7150.getClass(), "implicitPrototypeFallback", null);
        setField(term7150, term7150.getClass(), "ownerFunction", null);
        setBooleanField(term7150, term7150.getClass(), "prettyPrint", false);
        setBooleanField(term7150, term7150.getClass(), "visited", false);
        setField(term7150, term7150.getClass(), "docInfo", null);
        setBooleanField(term7150, term7150.getClass(), "unknown", false);
        setBooleanField(term7150, term7150.getClass(), "resolved", false);
        setField(term7150, term7150.getClass(), "resolveResult", null);
        setField(term7150, term7150.getClass(), "registry", null);
        setField(term7125, term7125.getClass(), "prototype", term7150);
        setField(term7156, term7156.getClass(), "name", null);
        setField(term7156, term7156.getClass(), "type", null);
        setBooleanField(term7156, term7156.getClass(), "inferred", false);
        setField(term7125, term7125.getClass(), "prototypeSlot", term7156);
        setField(term7125, term7125.getClass(), "kind", enum93);
        setField(term7125, term7125.getClass(), "typeOfThis", null);
        setField(term7125, term7125.getClass(), "source", null);
        setField(term7125, term7125.getClass(), "implementedInterfaces", null);
        setField(term7125, term7125.getClass(), "extendedInterfaces", null);
        setField(term7125, term7125.getClass(), "subTypes", null);
        setField(term7125, term7125.getClass(), "templateTypeName", null);
        setField(term7125, term7125.getClass(), "className", null);
        setField(term7125, term7125.getClass(), "properties", null);
        setBooleanField(term7125, term7125.getClass(), "nativeType", false);
        setField(term7125, term7125.getClass(), "implicitPrototypeFallback", null);
        setField(term7125, term7125.getClass(), "ownerFunction", null);
        setBooleanField(term7125, term7125.getClass(), "prettyPrint", false);
        setBooleanField(term7125, term7125.getClass(), "visited", false);
        setField(term7125, term7125.getClass(), "docInfo", null);
        setBooleanField(term7125, term7125.getClass(), "unknown", false);
        setBooleanField(term7125, term7125.getClass(), "resolved", false);
        setField(term7125, term7125.getClass(), "resolveResult", null);
        setField(term7125, term7125.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllImplementedInterfaces", argTypes, term7125, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



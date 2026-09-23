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

public class FunctionType_getGreatestSubtype_67959170984 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12102;

    public FunctionType_getGreatestSubtype_67959170984() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term42899 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term42898 = ((Class) term42899).getDeclaredField((String) "ORDINARY");
        ((Field) term42898).setAccessible(true);
        Object enum110 = ((Field) term42898).get((Object) null);
        term12102 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term12103 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term12104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12117 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12127 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12133 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term12104, term12104.getClass(), "type", 993388358);
        setIntField(term12106, term12106.getClass(), "type", -1891015523);
        setIntField(term12108, term12108.getClass(), "type", 0);
        setField(term12108, term12108.getClass(), "next", null);
        setField(term12108, term12108.getClass(), "first", null);
        setField(term12108, term12108.getClass(), "last", null);
        setField(term12108, term12108.getClass(), "propListHead", null);
        setIntField(term12108, term12108.getClass(), "sourcePosition", 0);
        setField(term12108, term12108.getClass(), "jsType", null);
        setField(term12108, term12108.getClass(), "parent", null);
        setField(term12106, term12106.getClass(), "next", term12108);
        setIntField(term12111, term12111.getClass(), "type", 0);
        setField(term12111, term12111.getClass(), "next", null);
        setField(term12111, term12111.getClass(), "first", null);
        setField(term12111, term12111.getClass(), "last", null);
        setField(term12111, term12111.getClass(), "propListHead", null);
        setIntField(term12111, term12111.getClass(), "sourcePosition", 0);
        setField(term12111, term12111.getClass(), "jsType", null);
        setField(term12111, term12111.getClass(), "parent", null);
        setField(term12106, term12106.getClass(), "first", term12111);
        setIntField(term12114, term12114.getClass(), "type", 0);
        setField(term12114, term12114.getClass(), "next", null);
        setField(term12114, term12114.getClass(), "first", null);
        setField(term12114, term12114.getClass(), "last", null);
        setField(term12114, term12114.getClass(), "propListHead", null);
        setIntField(term12114, term12114.getClass(), "sourcePosition", 0);
        setField(term12114, term12114.getClass(), "jsType", null);
        setField(term12114, term12114.getClass(), "parent", null);
        setField(term12106, term12106.getClass(), "last", term12114);
        setField(term12117, term12117.getClass(), "next", null);
        setIntField(term12117, term12117.getClass(), "type", 0);
        setIntField(term12117, term12117.getClass(), "intValue", 0);
        setField(term12117, term12117.getClass(), "objectValue", null);
        setField(term12106, term12106.getClass(), "propListHead", term12117);
        setIntField(term12106, term12106.getClass(), "sourcePosition", -1560631747);
        setField(term12106, term12106.getClass(), "jsType", null);
        setField(term12106, term12106.getClass(), "parent", null);
        setField(term12104, term12104.getClass(), "next", term12106);
        setIntField(term12121, term12121.getClass(), "type", 0);
        setField(term12121, term12121.getClass(), "next", null);
        setField(term12121, term12121.getClass(), "first", null);
        setField(term12121, term12121.getClass(), "last", null);
        setField(term12121, term12121.getClass(), "propListHead", null);
        setIntField(term12121, term12121.getClass(), "sourcePosition", 0);
        setField(term12121, term12121.getClass(), "jsType", null);
        setField(term12121, term12121.getClass(), "parent", null);
        setField(term12104, term12104.getClass(), "first", term12121);
        setIntField(term12124, term12124.getClass(), "type", 0);
        setField(term12124, term12124.getClass(), "next", null);
        setField(term12124, term12124.getClass(), "first", null);
        setField(term12124, term12124.getClass(), "last", null);
        setField(term12124, term12124.getClass(), "propListHead", null);
        setIntField(term12124, term12124.getClass(), "sourcePosition", 0);
        setField(term12124, term12124.getClass(), "jsType", null);
        setField(term12124, term12124.getClass(), "parent", null);
        setField(term12104, term12104.getClass(), "last", term12124);
        setField(term12127, term12127.getClass(), "next", null);
        setIntField(term12127, term12127.getClass(), "type", 0);
        setIntField(term12127, term12127.getClass(), "intValue", 0);
        setField(term12127, term12127.getClass(), "objectValue", null);
        setField(term12104, term12104.getClass(), "propListHead", term12127);
        setIntField(term12104, term12104.getClass(), "sourcePosition", 1215150180);
        setField(term12104, term12104.getClass(), "jsType", null);
        setField(term12104, term12104.getClass(), "parent", null);
        setField(term12103, term12103.getClass(), "parameters", term12104);
        setField(term12103, term12103.getClass(), "returnType", null);
        setBooleanField(term12103, term12103.getClass(), "returnTypeInferred", false);
        setBooleanField(term12103, term12103.getClass(), "resolved", false);
        setField(term12103, term12103.getClass(), "resolveResult", null);
        setField(term12103, term12103.getClass(), "registry", null);
        setField(term12102, term12102.getClass(), "call", term12103);
        setField(term12133, term12133.getClass(), "ownerFunction", null);
        setField(term12133, term12133.getClass(), "className", null);
        setField(term12133, term12133.getClass(), "properties", null);
        setField(term12133, term12133.getClass(), "implicitPrototype", null);
        setBooleanField(term12133, term12133.getClass(), "nativeType", false);
        setBooleanField(term12133, term12133.getClass(), "prettyPrint", false);
        setBooleanField(term12133, term12133.getClass(), "visited", false);
        setField(term12133, term12133.getClass(), "docInfo", null);
        setBooleanField(term12133, term12133.getClass(), "unknown", false);
        setBooleanField(term12133, term12133.getClass(), "resolved", false);
        setField(term12133, term12133.getClass(), "resolveResult", null);
        setField(term12133, term12133.getClass(), "registry", null);
        setField(term12102, term12102.getClass(), "prototype", term12133);
        setField(term12102, term12102.getClass(), "kind", enum110);
        setField(term12102, term12102.getClass(), "typeOfThis", null);
        setField(term12102, term12102.getClass(), "source", null);
        setField(term12102, term12102.getClass(), "implementedInterfaces", null);
        setField(term12102, term12102.getClass(), "subTypes", null);
        setField(term12102, term12102.getClass(), "templateTypeName", null);
        setField(term12102, term12102.getClass(), "className", null);
        setField(term12102, term12102.getClass(), "properties", null);
        setField(term12102, term12102.getClass(), "implicitPrototype", null);
        setBooleanField(term12102, term12102.getClass(), "nativeType", false);
        setBooleanField(term12102, term12102.getClass(), "prettyPrint", false);
        setBooleanField(term12102, term12102.getClass(), "visited", false);
        setField(term12102, term12102.getClass(), "docInfo", null);
        setBooleanField(term12102, term12102.getClass(), "unknown", false);
        setBooleanField(term12102, term12102.getClass(), "resolved", false);
        setField(term12102, term12102.getClass(), "resolveResult", null);
        setField(term12102, term12102.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term12102, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



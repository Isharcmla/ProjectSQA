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
     Object term12049;

    public FunctionType_getGreatestSubtype_67959170984() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term42585 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term42584 = ((Class) term42585).getDeclaredField((String) "ORDINARY");
        ((Field) term42584).setAccessible(true);
        Object enum109 = ((Field) term42584).get((Object) null);
        term12049 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term12050 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term12051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12053 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12055 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12064 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12071 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12074 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12080 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term12051, term12051.getClass(), "type", 993388358);
        setIntField(term12053, term12053.getClass(), "type", -1891015523);
        setIntField(term12055, term12055.getClass(), "type", 0);
        setField(term12055, term12055.getClass(), "next", null);
        setField(term12055, term12055.getClass(), "first", null);
        setField(term12055, term12055.getClass(), "last", null);
        setField(term12055, term12055.getClass(), "propListHead", null);
        setIntField(term12055, term12055.getClass(), "sourcePosition", 0);
        setField(term12055, term12055.getClass(), "jsType", null);
        setField(term12055, term12055.getClass(), "parent", null);
        setField(term12053, term12053.getClass(), "next", term12055);
        setIntField(term12058, term12058.getClass(), "type", 0);
        setField(term12058, term12058.getClass(), "next", null);
        setField(term12058, term12058.getClass(), "first", null);
        setField(term12058, term12058.getClass(), "last", null);
        setField(term12058, term12058.getClass(), "propListHead", null);
        setIntField(term12058, term12058.getClass(), "sourcePosition", 0);
        setField(term12058, term12058.getClass(), "jsType", null);
        setField(term12058, term12058.getClass(), "parent", null);
        setField(term12053, term12053.getClass(), "first", term12058);
        setIntField(term12061, term12061.getClass(), "type", 0);
        setField(term12061, term12061.getClass(), "next", null);
        setField(term12061, term12061.getClass(), "first", null);
        setField(term12061, term12061.getClass(), "last", null);
        setField(term12061, term12061.getClass(), "propListHead", null);
        setIntField(term12061, term12061.getClass(), "sourcePosition", 0);
        setField(term12061, term12061.getClass(), "jsType", null);
        setField(term12061, term12061.getClass(), "parent", null);
        setField(term12053, term12053.getClass(), "last", term12061);
        setField(term12064, term12064.getClass(), "next", null);
        setIntField(term12064, term12064.getClass(), "type", 0);
        setIntField(term12064, term12064.getClass(), "intValue", 0);
        setField(term12064, term12064.getClass(), "objectValue", null);
        setField(term12053, term12053.getClass(), "propListHead", term12064);
        setIntField(term12053, term12053.getClass(), "sourcePosition", -1560631747);
        setField(term12053, term12053.getClass(), "jsType", null);
        setField(term12053, term12053.getClass(), "parent", null);
        setField(term12051, term12051.getClass(), "next", term12053);
        setIntField(term12068, term12068.getClass(), "type", 0);
        setField(term12068, term12068.getClass(), "next", null);
        setField(term12068, term12068.getClass(), "first", null);
        setField(term12068, term12068.getClass(), "last", null);
        setField(term12068, term12068.getClass(), "propListHead", null);
        setIntField(term12068, term12068.getClass(), "sourcePosition", 0);
        setField(term12068, term12068.getClass(), "jsType", null);
        setField(term12068, term12068.getClass(), "parent", null);
        setField(term12051, term12051.getClass(), "first", term12068);
        setIntField(term12071, term12071.getClass(), "type", 0);
        setField(term12071, term12071.getClass(), "next", null);
        setField(term12071, term12071.getClass(), "first", null);
        setField(term12071, term12071.getClass(), "last", null);
        setField(term12071, term12071.getClass(), "propListHead", null);
        setIntField(term12071, term12071.getClass(), "sourcePosition", 0);
        setField(term12071, term12071.getClass(), "jsType", null);
        setField(term12071, term12071.getClass(), "parent", null);
        setField(term12051, term12051.getClass(), "last", term12071);
        setField(term12074, term12074.getClass(), "next", null);
        setIntField(term12074, term12074.getClass(), "type", 0);
        setIntField(term12074, term12074.getClass(), "intValue", 0);
        setField(term12074, term12074.getClass(), "objectValue", null);
        setField(term12051, term12051.getClass(), "propListHead", term12074);
        setIntField(term12051, term12051.getClass(), "sourcePosition", 1215150180);
        setField(term12051, term12051.getClass(), "jsType", null);
        setField(term12051, term12051.getClass(), "parent", null);
        setField(term12050, term12050.getClass(), "parameters", term12051);
        setField(term12050, term12050.getClass(), "returnType", null);
        setBooleanField(term12050, term12050.getClass(), "returnTypeInferred", false);
        setBooleanField(term12050, term12050.getClass(), "resolved", false);
        setField(term12050, term12050.getClass(), "resolveResult", null);
        setField(term12050, term12050.getClass(), "registry", null);
        setField(term12049, term12049.getClass(), "call", term12050);
        setField(term12080, term12080.getClass(), "ownerFunction", null);
        setField(term12080, term12080.getClass(), "className", null);
        setField(term12080, term12080.getClass(), "properties", null);
        setBooleanField(term12080, term12080.getClass(), "nativeType", false);
        setField(term12080, term12080.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term12080, term12080.getClass(), "prettyPrint", false);
        setBooleanField(term12080, term12080.getClass(), "visited", false);
        setField(term12080, term12080.getClass(), "docInfo", null);
        setBooleanField(term12080, term12080.getClass(), "unknown", false);
        setBooleanField(term12080, term12080.getClass(), "resolved", false);
        setField(term12080, term12080.getClass(), "resolveResult", null);
        setField(term12080, term12080.getClass(), "registry", null);
        setField(term12049, term12049.getClass(), "prototype", term12080);
        setField(term12049, term12049.getClass(), "kind", enum109);
        setField(term12049, term12049.getClass(), "typeOfThis", null);
        setField(term12049, term12049.getClass(), "source", null);
        setField(term12049, term12049.getClass(), "implementedInterfaces", null);
        setField(term12049, term12049.getClass(), "subTypes", null);
        setField(term12049, term12049.getClass(), "templateTypeName", null);
        setField(term12049, term12049.getClass(), "className", null);
        setField(term12049, term12049.getClass(), "properties", null);
        setBooleanField(term12049, term12049.getClass(), "nativeType", false);
        setField(term12049, term12049.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term12049, term12049.getClass(), "prettyPrint", false);
        setBooleanField(term12049, term12049.getClass(), "visited", false);
        setField(term12049, term12049.getClass(), "docInfo", null);
        setBooleanField(term12049, term12049.getClass(), "unknown", false);
        setBooleanField(term12049, term12049.getClass(), "resolved", false);
        setField(term12049, term12049.getClass(), "resolveResult", null);
        setField(term12049, term12049.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term12049, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class FunctionType_setPrototypeBasedOn_101266613072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7702;

    public FunctionType_setPrototypeBasedOn_101266613072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34710 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term34709 = ((Class) term34710).getDeclaredField((String) "INTERFACE");
        ((Field) term34709).setAccessible(true);
        Object enum93 = ((Field) term34709).get((Object) null);
        term7702 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term7703 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term7704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7717 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7727 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7733 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term7704, term7704.getClass(), "type", 389427431);
        setIntField(term7706, term7706.getClass(), "type", -1214628358);
        setIntField(term7708, term7708.getClass(), "type", 0);
        setField(term7708, term7708.getClass(), "next", null);
        setField(term7708, term7708.getClass(), "first", null);
        setField(term7708, term7708.getClass(), "last", null);
        setField(term7708, term7708.getClass(), "propListHead", null);
        setIntField(term7708, term7708.getClass(), "sourcePosition", 0);
        setField(term7708, term7708.getClass(), "jsType", null);
        setField(term7708, term7708.getClass(), "parent", null);
        setField(term7706, term7706.getClass(), "next", term7708);
        setIntField(term7711, term7711.getClass(), "type", 0);
        setField(term7711, term7711.getClass(), "next", null);
        setField(term7711, term7711.getClass(), "first", null);
        setField(term7711, term7711.getClass(), "last", null);
        setField(term7711, term7711.getClass(), "propListHead", null);
        setIntField(term7711, term7711.getClass(), "sourcePosition", 0);
        setField(term7711, term7711.getClass(), "jsType", null);
        setField(term7711, term7711.getClass(), "parent", null);
        setField(term7706, term7706.getClass(), "first", term7711);
        setIntField(term7714, term7714.getClass(), "type", 0);
        setField(term7714, term7714.getClass(), "next", null);
        setField(term7714, term7714.getClass(), "first", null);
        setField(term7714, term7714.getClass(), "last", null);
        setField(term7714, term7714.getClass(), "propListHead", null);
        setIntField(term7714, term7714.getClass(), "sourcePosition", 0);
        setField(term7714, term7714.getClass(), "jsType", null);
        setField(term7714, term7714.getClass(), "parent", null);
        setField(term7706, term7706.getClass(), "last", term7714);
        setField(term7717, term7717.getClass(), "next", null);
        setIntField(term7717, term7717.getClass(), "type", 0);
        setIntField(term7717, term7717.getClass(), "intValue", 0);
        setField(term7717, term7717.getClass(), "objectValue", null);
        setField(term7706, term7706.getClass(), "propListHead", term7717);
        setIntField(term7706, term7706.getClass(), "sourcePosition", 1102721075);
        setField(term7706, term7706.getClass(), "jsType", null);
        setField(term7706, term7706.getClass(), "parent", null);
        setField(term7704, term7704.getClass(), "next", term7706);
        setIntField(term7721, term7721.getClass(), "type", 0);
        setField(term7721, term7721.getClass(), "next", null);
        setField(term7721, term7721.getClass(), "first", null);
        setField(term7721, term7721.getClass(), "last", null);
        setField(term7721, term7721.getClass(), "propListHead", null);
        setIntField(term7721, term7721.getClass(), "sourcePosition", 0);
        setField(term7721, term7721.getClass(), "jsType", null);
        setField(term7721, term7721.getClass(), "parent", null);
        setField(term7704, term7704.getClass(), "first", term7721);
        setIntField(term7724, term7724.getClass(), "type", 0);
        setField(term7724, term7724.getClass(), "next", null);
        setField(term7724, term7724.getClass(), "first", null);
        setField(term7724, term7724.getClass(), "last", null);
        setField(term7724, term7724.getClass(), "propListHead", null);
        setIntField(term7724, term7724.getClass(), "sourcePosition", 0);
        setField(term7724, term7724.getClass(), "jsType", null);
        setField(term7724, term7724.getClass(), "parent", null);
        setField(term7704, term7704.getClass(), "last", term7724);
        setField(term7727, term7727.getClass(), "next", null);
        setIntField(term7727, term7727.getClass(), "type", 0);
        setIntField(term7727, term7727.getClass(), "intValue", 0);
        setField(term7727, term7727.getClass(), "objectValue", null);
        setField(term7704, term7704.getClass(), "propListHead", term7727);
        setIntField(term7704, term7704.getClass(), "sourcePosition", -426764678);
        setField(term7704, term7704.getClass(), "jsType", null);
        setField(term7704, term7704.getClass(), "parent", null);
        setField(term7703, term7703.getClass(), "parameters", term7704);
        setField(term7703, term7703.getClass(), "returnType", null);
        setBooleanField(term7703, term7703.getClass(), "returnTypeInferred", false);
        setBooleanField(term7703, term7703.getClass(), "resolved", false);
        setField(term7703, term7703.getClass(), "resolveResult", null);
        setField(term7703, term7703.getClass(), "registry", null);
        setField(term7702, term7702.getClass(), "call", term7703);
        setField(term7733, term7733.getClass(), "ownerFunction", null);
        setField(term7733, term7733.getClass(), "className", null);
        setField(term7733, term7733.getClass(), "properties", null);
        setField(term7733, term7733.getClass(), "implicitPrototype", null);
        setBooleanField(term7733, term7733.getClass(), "nativeType", false);
        setBooleanField(term7733, term7733.getClass(), "prettyPrint", false);
        setBooleanField(term7733, term7733.getClass(), "visited", false);
        setField(term7733, term7733.getClass(), "docInfo", null);
        setBooleanField(term7733, term7733.getClass(), "unknown", false);
        setBooleanField(term7733, term7733.getClass(), "resolved", false);
        setField(term7733, term7733.getClass(), "resolveResult", null);
        setField(term7733, term7733.getClass(), "registry", null);
        setField(term7702, term7702.getClass(), "prototype", term7733);
        setField(term7702, term7702.getClass(), "kind", enum93);
        setField(term7702, term7702.getClass(), "typeOfThis", null);
        setField(term7702, term7702.getClass(), "source", null);
        setField(term7702, term7702.getClass(), "implementedInterfaces", null);
        setField(term7702, term7702.getClass(), "subTypes", null);
        setField(term7702, term7702.getClass(), "templateTypeName", null);
        setField(term7702, term7702.getClass(), "className", null);
        setField(term7702, term7702.getClass(), "properties", null);
        setField(term7702, term7702.getClass(), "implicitPrototype", null);
        setBooleanField(term7702, term7702.getClass(), "nativeType", false);
        setBooleanField(term7702, term7702.getClass(), "prettyPrint", false);
        setBooleanField(term7702, term7702.getClass(), "visited", false);
        setField(term7702, term7702.getClass(), "docInfo", null);
        setBooleanField(term7702, term7702.getClass(), "unknown", false);
        setBooleanField(term7702, term7702.getClass(), "resolved", false);
        setField(term7702, term7702.getClass(), "resolveResult", null);
        setField(term7702, term7702.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "setPrototypeBasedOn", argTypes, term7702, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};



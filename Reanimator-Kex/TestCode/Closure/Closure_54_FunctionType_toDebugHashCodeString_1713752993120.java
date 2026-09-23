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

public class FunctionType_toDebugHashCodeString_1713752993120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20836;

    public FunctionType_toDebugHashCodeString_1713752993120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term62009 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term62008 = ((Class) term62009).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term62008).setAccessible(true);
        Object enum158 = ((Field) term62008).get((Object) null);
        term20836 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term20837 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term20838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20852 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20855 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20861 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term20867 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSlot"));
        setIntField(term20838, term20838.getClass(), "type", 895255351);
        setIntField(term20840, term20840.getClass(), "type", 1136208236);
        setIntField(term20842, term20842.getClass(), "type", 0);
        setField(term20842, term20842.getClass(), "next", null);
        setField(term20842, term20842.getClass(), "first", null);
        setField(term20842, term20842.getClass(), "last", null);
        setField(term20842, term20842.getClass(), "propListHead", null);
        setIntField(term20842, term20842.getClass(), "sourcePosition", 0);
        setField(term20842, term20842.getClass(), "jsType", null);
        setField(term20842, term20842.getClass(), "parent", null);
        setField(term20840, term20840.getClass(), "next", term20842);
        setIntField(term20845, term20845.getClass(), "type", 0);
        setField(term20845, term20845.getClass(), "next", null);
        setField(term20845, term20845.getClass(), "first", null);
        setField(term20845, term20845.getClass(), "last", null);
        setField(term20845, term20845.getClass(), "propListHead", null);
        setIntField(term20845, term20845.getClass(), "sourcePosition", 0);
        setField(term20845, term20845.getClass(), "jsType", null);
        setField(term20845, term20845.getClass(), "parent", null);
        setField(term20840, term20840.getClass(), "first", term20845);
        setIntField(term20848, term20848.getClass(), "type", 0);
        setField(term20848, term20848.getClass(), "next", null);
        setField(term20848, term20848.getClass(), "first", null);
        setField(term20848, term20848.getClass(), "last", null);
        setField(term20848, term20848.getClass(), "propListHead", null);
        setIntField(term20848, term20848.getClass(), "sourcePosition", 0);
        setField(term20848, term20848.getClass(), "jsType", null);
        setField(term20848, term20848.getClass(), "parent", null);
        setField(term20840, term20840.getClass(), "last", term20848);
        setField(term20840, term20840.getClass(), "propListHead", null);
        setIntField(term20840, term20840.getClass(), "sourcePosition", 0);
        setField(term20840, term20840.getClass(), "jsType", null);
        setField(term20840, term20840.getClass(), "parent", null);
        setField(term20838, term20838.getClass(), "next", term20840);
        setIntField(term20852, term20852.getClass(), "type", 0);
        setField(term20852, term20852.getClass(), "next", null);
        setField(term20852, term20852.getClass(), "first", null);
        setField(term20852, term20852.getClass(), "last", null);
        setField(term20852, term20852.getClass(), "propListHead", null);
        setIntField(term20852, term20852.getClass(), "sourcePosition", 0);
        setField(term20852, term20852.getClass(), "jsType", null);
        setField(term20852, term20852.getClass(), "parent", null);
        setField(term20838, term20838.getClass(), "first", term20852);
        setIntField(term20855, term20855.getClass(), "type", 0);
        setField(term20855, term20855.getClass(), "next", null);
        setField(term20855, term20855.getClass(), "first", null);
        setField(term20855, term20855.getClass(), "last", null);
        setField(term20855, term20855.getClass(), "propListHead", null);
        setIntField(term20855, term20855.getClass(), "sourcePosition", 0);
        setField(term20855, term20855.getClass(), "jsType", null);
        setField(term20855, term20855.getClass(), "parent", null);
        setField(term20838, term20838.getClass(), "last", term20855);
        setField(term20838, term20838.getClass(), "propListHead", null);
        setIntField(term20838, term20838.getClass(), "sourcePosition", 0);
        setField(term20838, term20838.getClass(), "jsType", null);
        setField(term20838, term20838.getClass(), "parent", null);
        setField(term20837, term20837.getClass(), "parameters", term20838);
        setField(term20837, term20837.getClass(), "returnType", null);
        setBooleanField(term20837, term20837.getClass(), "returnTypeInferred", false);
        setBooleanField(term20837, term20837.getClass(), "resolved", false);
        setField(term20837, term20837.getClass(), "resolveResult", null);
        setField(term20837, term20837.getClass(), "registry", null);
        setField(term20836, term20836.getClass(), "call", term20837);
        setField(term20861, term20861.getClass(), "className", null);
        setField(term20861, term20861.getClass(), "properties", null);
        setBooleanField(term20861, term20861.getClass(), "nativeType", false);
        setField(term20861, term20861.getClass(), "implicitPrototypeFallback", null);
        setField(term20861, term20861.getClass(), "ownerFunction", null);
        setBooleanField(term20861, term20861.getClass(), "prettyPrint", false);
        setBooleanField(term20861, term20861.getClass(), "visited", false);
        setField(term20861, term20861.getClass(), "docInfo", null);
        setBooleanField(term20861, term20861.getClass(), "unknown", false);
        setBooleanField(term20861, term20861.getClass(), "resolved", false);
        setField(term20861, term20861.getClass(), "resolveResult", null);
        setField(term20861, term20861.getClass(), "registry", null);
        setField(term20836, term20836.getClass(), "prototype", term20861);
        setField(term20867, term20867.getClass(), "name", null);
        setField(term20867, term20867.getClass(), "type", null);
        setBooleanField(term20867, term20867.getClass(), "inferred", false);
        setField(term20836, term20836.getClass(), "prototypeSlot", term20867);
        setField(term20836, term20836.getClass(), "kind", enum158);
        setField(term20836, term20836.getClass(), "typeOfThis", null);
        setField(term20836, term20836.getClass(), "source", null);
        setField(term20836, term20836.getClass(), "implementedInterfaces", null);
        setField(term20836, term20836.getClass(), "extendedInterfaces", null);
        setField(term20836, term20836.getClass(), "subTypes", null);
        setField(term20836, term20836.getClass(), "templateTypeName", null);
        setField(term20836, term20836.getClass(), "className", null);
        setField(term20836, term20836.getClass(), "properties", null);
        setBooleanField(term20836, term20836.getClass(), "nativeType", false);
        setField(term20836, term20836.getClass(), "implicitPrototypeFallback", null);
        setField(term20836, term20836.getClass(), "ownerFunction", null);
        setBooleanField(term20836, term20836.getClass(), "prettyPrint", false);
        setBooleanField(term20836, term20836.getClass(), "visited", false);
        setField(term20836, term20836.getClass(), "docInfo", null);
        setBooleanField(term20836, term20836.getClass(), "unknown", false);
        setBooleanField(term20836, term20836.getClass(), "resolved", false);
        setField(term20836, term20836.getClass(), "resolveResult", null);
        setField(term20836, term20836.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toDebugHashCodeString", argTypes, term20836, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



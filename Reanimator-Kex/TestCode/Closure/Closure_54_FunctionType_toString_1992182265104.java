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

public class FunctionType_toString_1992182265104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14878;

    public FunctionType_toString_1992182265104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term50781 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term50780 = ((Class) term50781).getDeclaredField((String) "INTERFACE");
        ((Field) term50780).setAccessible(true);
        Object enum128 = ((Field) term50780).get((Object) null);
        term14878 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term14879 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term14880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14884 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14890 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14903 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term14909 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSlot"));
        setIntField(term14880, term14880.getClass(), "type", 977862393);
        setIntField(term14882, term14882.getClass(), "type", -544382127);
        setIntField(term14884, term14884.getClass(), "type", 0);
        setField(term14884, term14884.getClass(), "next", null);
        setField(term14884, term14884.getClass(), "first", null);
        setField(term14884, term14884.getClass(), "last", null);
        setField(term14884, term14884.getClass(), "propListHead", null);
        setIntField(term14884, term14884.getClass(), "sourcePosition", 0);
        setField(term14884, term14884.getClass(), "jsType", null);
        setField(term14884, term14884.getClass(), "parent", null);
        setField(term14882, term14882.getClass(), "next", term14884);
        setIntField(term14887, term14887.getClass(), "type", 0);
        setField(term14887, term14887.getClass(), "next", null);
        setField(term14887, term14887.getClass(), "first", null);
        setField(term14887, term14887.getClass(), "last", null);
        setField(term14887, term14887.getClass(), "propListHead", null);
        setIntField(term14887, term14887.getClass(), "sourcePosition", 0);
        setField(term14887, term14887.getClass(), "jsType", null);
        setField(term14887, term14887.getClass(), "parent", null);
        setField(term14882, term14882.getClass(), "first", term14887);
        setIntField(term14890, term14890.getClass(), "type", 0);
        setField(term14890, term14890.getClass(), "next", null);
        setField(term14890, term14890.getClass(), "first", null);
        setField(term14890, term14890.getClass(), "last", null);
        setField(term14890, term14890.getClass(), "propListHead", null);
        setIntField(term14890, term14890.getClass(), "sourcePosition", 0);
        setField(term14890, term14890.getClass(), "jsType", null);
        setField(term14890, term14890.getClass(), "parent", null);
        setField(term14882, term14882.getClass(), "last", term14890);
        setField(term14882, term14882.getClass(), "propListHead", null);
        setIntField(term14882, term14882.getClass(), "sourcePosition", 0);
        setField(term14882, term14882.getClass(), "jsType", null);
        setField(term14882, term14882.getClass(), "parent", null);
        setField(term14880, term14880.getClass(), "next", term14882);
        setIntField(term14894, term14894.getClass(), "type", 0);
        setField(term14894, term14894.getClass(), "next", null);
        setField(term14894, term14894.getClass(), "first", null);
        setField(term14894, term14894.getClass(), "last", null);
        setField(term14894, term14894.getClass(), "propListHead", null);
        setIntField(term14894, term14894.getClass(), "sourcePosition", 0);
        setField(term14894, term14894.getClass(), "jsType", null);
        setField(term14894, term14894.getClass(), "parent", null);
        setField(term14880, term14880.getClass(), "first", term14894);
        setIntField(term14897, term14897.getClass(), "type", 0);
        setField(term14897, term14897.getClass(), "next", null);
        setField(term14897, term14897.getClass(), "first", null);
        setField(term14897, term14897.getClass(), "last", null);
        setField(term14897, term14897.getClass(), "propListHead", null);
        setIntField(term14897, term14897.getClass(), "sourcePosition", 0);
        setField(term14897, term14897.getClass(), "jsType", null);
        setField(term14897, term14897.getClass(), "parent", null);
        setField(term14880, term14880.getClass(), "last", term14897);
        setField(term14880, term14880.getClass(), "propListHead", null);
        setIntField(term14880, term14880.getClass(), "sourcePosition", 0);
        setField(term14880, term14880.getClass(), "jsType", null);
        setField(term14880, term14880.getClass(), "parent", null);
        setField(term14879, term14879.getClass(), "parameters", term14880);
        setField(term14879, term14879.getClass(), "returnType", null);
        setBooleanField(term14879, term14879.getClass(), "returnTypeInferred", false);
        setBooleanField(term14879, term14879.getClass(), "resolved", false);
        setField(term14879, term14879.getClass(), "resolveResult", null);
        setField(term14879, term14879.getClass(), "registry", null);
        setField(term14878, term14878.getClass(), "call", term14879);
        setField(term14903, term14903.getClass(), "className", null);
        setField(term14903, term14903.getClass(), "properties", null);
        setBooleanField(term14903, term14903.getClass(), "nativeType", false);
        setField(term14903, term14903.getClass(), "implicitPrototypeFallback", null);
        setField(term14903, term14903.getClass(), "ownerFunction", null);
        setBooleanField(term14903, term14903.getClass(), "prettyPrint", false);
        setBooleanField(term14903, term14903.getClass(), "visited", false);
        setField(term14903, term14903.getClass(), "docInfo", null);
        setBooleanField(term14903, term14903.getClass(), "unknown", false);
        setBooleanField(term14903, term14903.getClass(), "resolved", false);
        setField(term14903, term14903.getClass(), "resolveResult", null);
        setField(term14903, term14903.getClass(), "registry", null);
        setField(term14878, term14878.getClass(), "prototype", term14903);
        setField(term14909, term14909.getClass(), "name", null);
        setField(term14909, term14909.getClass(), "type", null);
        setBooleanField(term14909, term14909.getClass(), "inferred", false);
        setField(term14878, term14878.getClass(), "prototypeSlot", term14909);
        setField(term14878, term14878.getClass(), "kind", enum128);
        setField(term14878, term14878.getClass(), "typeOfThis", null);
        setField(term14878, term14878.getClass(), "source", null);
        setField(term14878, term14878.getClass(), "implementedInterfaces", null);
        setField(term14878, term14878.getClass(), "extendedInterfaces", null);
        setField(term14878, term14878.getClass(), "subTypes", null);
        setField(term14878, term14878.getClass(), "templateTypeName", null);
        setField(term14878, term14878.getClass(), "className", null);
        setField(term14878, term14878.getClass(), "properties", null);
        setBooleanField(term14878, term14878.getClass(), "nativeType", false);
        setField(term14878, term14878.getClass(), "implicitPrototypeFallback", null);
        setField(term14878, term14878.getClass(), "ownerFunction", null);
        setBooleanField(term14878, term14878.getClass(), "prettyPrint", false);
        setBooleanField(term14878, term14878.getClass(), "visited", false);
        setField(term14878, term14878.getClass(), "docInfo", null);
        setBooleanField(term14878, term14878.getClass(), "unknown", false);
        setBooleanField(term14878, term14878.getClass(), "resolved", false);
        setField(term14878, term14878.getClass(), "resolveResult", null);
        setField(term14878, term14878.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term14878, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



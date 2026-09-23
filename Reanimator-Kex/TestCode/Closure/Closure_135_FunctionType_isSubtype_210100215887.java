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

public class FunctionType_isSubtype_210100215887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14865;

    public FunctionType_isSubtype_210100215887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term47307 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term47306 = ((Class) term47307).getDeclaredField((String) "ORDINARY");
        ((Field) term47306).setAccessible(true);
        Object enum116 = ((Field) term47306).get((Object) null);
        term14865 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term14866 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term14867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14871 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14874 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14880 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term14884 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14890 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term14895 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term14867, term14867.getClass(), "type", 354196060);
        setIntField(term14869, term14869.getClass(), "type", 934477462);
        setIntField(term14871, term14871.getClass(), "type", 0);
        setField(term14871, term14871.getClass(), "next", null);
        setField(term14871, term14871.getClass(), "first", null);
        setField(term14871, term14871.getClass(), "last", null);
        setField(term14871, term14871.getClass(), "propListHead", null);
        setIntField(term14871, term14871.getClass(), "sourcePosition", 0);
        setField(term14871, term14871.getClass(), "jsType", null);
        setField(term14871, term14871.getClass(), "parent", null);
        setField(term14869, term14869.getClass(), "next", term14871);
        setIntField(term14874, term14874.getClass(), "type", 0);
        setField(term14874, term14874.getClass(), "next", null);
        setField(term14874, term14874.getClass(), "first", null);
        setField(term14874, term14874.getClass(), "last", null);
        setField(term14874, term14874.getClass(), "propListHead", null);
        setIntField(term14874, term14874.getClass(), "sourcePosition", 0);
        setField(term14874, term14874.getClass(), "jsType", null);
        setField(term14874, term14874.getClass(), "parent", null);
        setField(term14869, term14869.getClass(), "first", term14874);
        setIntField(term14877, term14877.getClass(), "type", 0);
        setField(term14877, term14877.getClass(), "next", null);
        setField(term14877, term14877.getClass(), "first", null);
        setField(term14877, term14877.getClass(), "last", null);
        setField(term14877, term14877.getClass(), "propListHead", null);
        setIntField(term14877, term14877.getClass(), "sourcePosition", 0);
        setField(term14877, term14877.getClass(), "jsType", null);
        setField(term14877, term14877.getClass(), "parent", null);
        setField(term14869, term14869.getClass(), "last", term14877);
        setField(term14880, term14880.getClass(), "next", null);
        setIntField(term14880, term14880.getClass(), "type", 0);
        setIntField(term14880, term14880.getClass(), "intValue", 0);
        setField(term14880, term14880.getClass(), "objectValue", null);
        setField(term14869, term14869.getClass(), "propListHead", term14880);
        setIntField(term14869, term14869.getClass(), "sourcePosition", 4900410);
        setField(term14869, term14869.getClass(), "jsType", null);
        setField(term14869, term14869.getClass(), "parent", null);
        setField(term14867, term14867.getClass(), "next", term14869);
        setIntField(term14884, term14884.getClass(), "type", 0);
        setField(term14884, term14884.getClass(), "next", null);
        setField(term14884, term14884.getClass(), "first", null);
        setField(term14884, term14884.getClass(), "last", null);
        setField(term14884, term14884.getClass(), "propListHead", null);
        setIntField(term14884, term14884.getClass(), "sourcePosition", 0);
        setField(term14884, term14884.getClass(), "jsType", null);
        setField(term14884, term14884.getClass(), "parent", null);
        setField(term14867, term14867.getClass(), "first", term14884);
        setIntField(term14887, term14887.getClass(), "type", 0);
        setField(term14887, term14887.getClass(), "next", null);
        setField(term14887, term14887.getClass(), "first", null);
        setField(term14887, term14887.getClass(), "last", null);
        setField(term14887, term14887.getClass(), "propListHead", null);
        setIntField(term14887, term14887.getClass(), "sourcePosition", 0);
        setField(term14887, term14887.getClass(), "jsType", null);
        setField(term14887, term14887.getClass(), "parent", null);
        setField(term14867, term14867.getClass(), "last", term14887);
        setField(term14890, term14890.getClass(), "next", null);
        setIntField(term14890, term14890.getClass(), "type", 0);
        setIntField(term14890, term14890.getClass(), "intValue", 0);
        setField(term14890, term14890.getClass(), "objectValue", null);
        setField(term14867, term14867.getClass(), "propListHead", term14890);
        setIntField(term14867, term14867.getClass(), "sourcePosition", -1252345779);
        setField(term14867, term14867.getClass(), "jsType", null);
        setField(term14867, term14867.getClass(), "parent", null);
        setField(term14866, term14866.getClass(), "parameters", term14867);
        setField(term14866, term14866.getClass(), "returnType", null);
        setBooleanField(term14866, term14866.getClass(), "resolved", false);
        setField(term14866, term14866.getClass(), "resolveResult", null);
        setField(term14866, term14866.getClass(), "registry", null);
        setField(term14865, term14865.getClass(), "call", term14866);
        setField(term14895, term14895.getClass(), "ownerFunction", null);
        setField(term14895, term14895.getClass(), "className", null);
        setField(term14895, term14895.getClass(), "properties", null);
        setField(term14895, term14895.getClass(), "implicitPrototype", null);
        setBooleanField(term14895, term14895.getClass(), "nativeType", false);
        setBooleanField(term14895, term14895.getClass(), "visited", false);
        setField(term14895, term14895.getClass(), "docInfo", null);
        setBooleanField(term14895, term14895.getClass(), "unknown", false);
        setBooleanField(term14895, term14895.getClass(), "resolved", false);
        setField(term14895, term14895.getClass(), "resolveResult", null);
        setField(term14895, term14895.getClass(), "registry", null);
        setField(term14865, term14865.getClass(), "prototype", term14895);
        setField(term14865, term14865.getClass(), "kind", enum116);
        setField(term14865, term14865.getClass(), "typeOfThis", null);
        setField(term14865, term14865.getClass(), "source", null);
        setField(term14865, term14865.getClass(), "implementedInterfaces", null);
        setField(term14865, term14865.getClass(), "subTypes", null);
        setField(term14865, term14865.getClass(), "templateTypeName", null);
        setField(term14865, term14865.getClass(), "className", null);
        setField(term14865, term14865.getClass(), "properties", null);
        setField(term14865, term14865.getClass(), "implicitPrototype", null);
        setBooleanField(term14865, term14865.getClass(), "nativeType", false);
        setBooleanField(term14865, term14865.getClass(), "visited", false);
        setField(term14865, term14865.getClass(), "docInfo", null);
        setBooleanField(term14865, term14865.getClass(), "unknown", false);
        setBooleanField(term14865, term14865.getClass(), "resolved", false);
        setField(term14865, term14865.getClass(), "resolveResult", null);
        setField(term14865, term14865.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "isSubtype", argTypes, term14865, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



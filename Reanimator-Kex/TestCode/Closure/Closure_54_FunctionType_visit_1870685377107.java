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

public class FunctionType_visit_1870685377107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15965;

    public FunctionType_visit_1870685377107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term52437 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term52436 = ((Class) term52437).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term52436).setAccessible(true);
        Object enum131 = ((Field) term52436).get((Object) null);
        term15965 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term15966 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term15967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15990 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term15996 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSlot"));
        setIntField(term15967, term15967.getClass(), "type", -1748391876);
        setIntField(term15969, term15969.getClass(), "type", 1824538861);
        setIntField(term15971, term15971.getClass(), "type", 0);
        setField(term15971, term15971.getClass(), "next", null);
        setField(term15971, term15971.getClass(), "first", null);
        setField(term15971, term15971.getClass(), "last", null);
        setField(term15971, term15971.getClass(), "propListHead", null);
        setIntField(term15971, term15971.getClass(), "sourcePosition", 0);
        setField(term15971, term15971.getClass(), "jsType", null);
        setField(term15971, term15971.getClass(), "parent", null);
        setField(term15969, term15969.getClass(), "next", term15971);
        setIntField(term15974, term15974.getClass(), "type", 0);
        setField(term15974, term15974.getClass(), "next", null);
        setField(term15974, term15974.getClass(), "first", null);
        setField(term15974, term15974.getClass(), "last", null);
        setField(term15974, term15974.getClass(), "propListHead", null);
        setIntField(term15974, term15974.getClass(), "sourcePosition", 0);
        setField(term15974, term15974.getClass(), "jsType", null);
        setField(term15974, term15974.getClass(), "parent", null);
        setField(term15969, term15969.getClass(), "first", term15974);
        setIntField(term15977, term15977.getClass(), "type", 0);
        setField(term15977, term15977.getClass(), "next", null);
        setField(term15977, term15977.getClass(), "first", null);
        setField(term15977, term15977.getClass(), "last", null);
        setField(term15977, term15977.getClass(), "propListHead", null);
        setIntField(term15977, term15977.getClass(), "sourcePosition", 0);
        setField(term15977, term15977.getClass(), "jsType", null);
        setField(term15977, term15977.getClass(), "parent", null);
        setField(term15969, term15969.getClass(), "last", term15977);
        setField(term15969, term15969.getClass(), "propListHead", null);
        setIntField(term15969, term15969.getClass(), "sourcePosition", 0);
        setField(term15969, term15969.getClass(), "jsType", null);
        setField(term15969, term15969.getClass(), "parent", null);
        setField(term15967, term15967.getClass(), "next", term15969);
        setIntField(term15981, term15981.getClass(), "type", 0);
        setField(term15981, term15981.getClass(), "next", null);
        setField(term15981, term15981.getClass(), "first", null);
        setField(term15981, term15981.getClass(), "last", null);
        setField(term15981, term15981.getClass(), "propListHead", null);
        setIntField(term15981, term15981.getClass(), "sourcePosition", 0);
        setField(term15981, term15981.getClass(), "jsType", null);
        setField(term15981, term15981.getClass(), "parent", null);
        setField(term15967, term15967.getClass(), "first", term15981);
        setIntField(term15984, term15984.getClass(), "type", 0);
        setField(term15984, term15984.getClass(), "next", null);
        setField(term15984, term15984.getClass(), "first", null);
        setField(term15984, term15984.getClass(), "last", null);
        setField(term15984, term15984.getClass(), "propListHead", null);
        setIntField(term15984, term15984.getClass(), "sourcePosition", 0);
        setField(term15984, term15984.getClass(), "jsType", null);
        setField(term15984, term15984.getClass(), "parent", null);
        setField(term15967, term15967.getClass(), "last", term15984);
        setField(term15967, term15967.getClass(), "propListHead", null);
        setIntField(term15967, term15967.getClass(), "sourcePosition", 0);
        setField(term15967, term15967.getClass(), "jsType", null);
        setField(term15967, term15967.getClass(), "parent", null);
        setField(term15966, term15966.getClass(), "parameters", term15967);
        setField(term15966, term15966.getClass(), "returnType", null);
        setBooleanField(term15966, term15966.getClass(), "returnTypeInferred", false);
        setBooleanField(term15966, term15966.getClass(), "resolved", false);
        setField(term15966, term15966.getClass(), "resolveResult", null);
        setField(term15966, term15966.getClass(), "registry", null);
        setField(term15965, term15965.getClass(), "call", term15966);
        setField(term15990, term15990.getClass(), "className", null);
        setField(term15990, term15990.getClass(), "properties", null);
        setBooleanField(term15990, term15990.getClass(), "nativeType", false);
        setField(term15990, term15990.getClass(), "implicitPrototypeFallback", null);
        setField(term15990, term15990.getClass(), "ownerFunction", null);
        setBooleanField(term15990, term15990.getClass(), "prettyPrint", false);
        setBooleanField(term15990, term15990.getClass(), "visited", false);
        setField(term15990, term15990.getClass(), "docInfo", null);
        setBooleanField(term15990, term15990.getClass(), "unknown", false);
        setBooleanField(term15990, term15990.getClass(), "resolved", false);
        setField(term15990, term15990.getClass(), "resolveResult", null);
        setField(term15990, term15990.getClass(), "registry", null);
        setField(term15965, term15965.getClass(), "prototype", term15990);
        setField(term15996, term15996.getClass(), "name", null);
        setField(term15996, term15996.getClass(), "type", null);
        setBooleanField(term15996, term15996.getClass(), "inferred", false);
        setField(term15965, term15965.getClass(), "prototypeSlot", term15996);
        setField(term15965, term15965.getClass(), "kind", enum131);
        setField(term15965, term15965.getClass(), "typeOfThis", null);
        setField(term15965, term15965.getClass(), "source", null);
        setField(term15965, term15965.getClass(), "implementedInterfaces", null);
        setField(term15965, term15965.getClass(), "extendedInterfaces", null);
        setField(term15965, term15965.getClass(), "subTypes", null);
        setField(term15965, term15965.getClass(), "templateTypeName", null);
        setField(term15965, term15965.getClass(), "className", null);
        setField(term15965, term15965.getClass(), "properties", null);
        setBooleanField(term15965, term15965.getClass(), "nativeType", false);
        setField(term15965, term15965.getClass(), "implicitPrototypeFallback", null);
        setField(term15965, term15965.getClass(), "ownerFunction", null);
        setBooleanField(term15965, term15965.getClass(), "prettyPrint", false);
        setBooleanField(term15965, term15965.getClass(), "visited", false);
        setField(term15965, term15965.getClass(), "docInfo", null);
        setBooleanField(term15965, term15965.getClass(), "unknown", false);
        setBooleanField(term15965, term15965.getClass(), "resolved", false);
        setField(term15965, term15965.getClass(), "resolveResult", null);
        setField(term15965, term15965.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "visit", argTypes, term15965, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



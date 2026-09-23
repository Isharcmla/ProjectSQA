package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class FunctionTypeBuilder_maybeSetBaseType_954025947214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83842;
     Object term84058;
     Object term84626;
     Object term84628;

    public FunctionTypeBuilder_maybeSetBaseType_954025947214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83842 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term83950 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term83842, term83842.getClass(), "baseType", term83950);
        term84058 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        term84626 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term84627 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term84626, term84626.getClass(), "fnName", null);
        setField(term84626, term84626.getClass(), "compiler", null);
        setField(term84626, term84626.getClass(), "codingConvention", null);
        setField(term84626, term84626.getClass(), "typeRegistry", null);
        setField(term84626, term84626.getClass(), "errorRoot", null);
        setField(term84626, term84626.getClass(), "sourceName", null);
        setField(term84626, term84626.getClass(), "scope", null);
        setField(term84626, term84626.getClass(), "returnType", null);
        setBooleanField(term84626, term84626.getClass(), "returnTypeInferred", false);
        setField(term84626, term84626.getClass(), "implementedInterfaces", null);
        setField(term84627, term84627.getClass(), "this$0", null);
        setField(term84627, term84627.getClass(), "call", null);
        setField(term84627, term84627.getClass(), "prototype", null);
        setField(term84627, term84627.getClass(), "kind", null);
        setField(term84627, term84627.getClass(), "typeOfThis", null);
        setField(term84627, term84627.getClass(), "source", null);
        setField(term84627, term84627.getClass(), "implementedInterfaces", null);
        setField(term84627, term84627.getClass(), "subTypes", null);
        setField(term84627, term84627.getClass(), "templateTypeName", null);
        setField(term84627, term84627.getClass(), "className", null);
        setField(term84627, term84627.getClass(), "properties", null);
        setBooleanField(term84627, term84627.getClass(), "nativeType", false);
        setField(term84627, term84627.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term84627, term84627.getClass(), "prettyPrint", false);
        setBooleanField(term84627, term84627.getClass(), "visited", false);
        setField(term84627, term84627.getClass(), "docInfo", null);
        setBooleanField(term84627, term84627.getClass(), "unknown", false);
        setBooleanField(term84627, term84627.getClass(), "resolved", false);
        setField(term84627, term84627.getClass(), "resolveResult", null);
        setField(term84627, term84627.getClass(), "registry", null);
        setField(term84626, term84626.getClass(), "baseType", term84627);
        setField(term84626, term84626.getClass(), "thisType", null);
        setBooleanField(term84626, term84626.getClass(), "isConstructor", false);
        setBooleanField(term84626, term84626.getClass(), "isInterface", false);
        setField(term84626, term84626.getClass(), "parametersNode", null);
        setField(term84626, term84626.getClass(), "sourceNode", null);
        setField(term84626, term84626.getClass(), "templateTypeName", null);
        term84628 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term84629 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term84630 = newInstance(Class.forName("java.util.TreeMap"));
        Object term84631 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term84628, term84628.getClass(), "this$0", null);
        setField(term84628, term84628.getClass(), "call", null);
        setField(term84629, term84629.getClass(), "ownerFunction", term84628);
        setField(term84629, term84629.getClass(), "className", null);
        setField(term84630, term84630.getClass(), "comparator", null);
        setField(term84630, term84630.getClass(), "root", null);
        setIntField(term84630, term84630.getClass(), "size", 0);
        setIntField(term84630, term84630.getClass(), "modCount", 0);
        setField(term84630, term84630.getClass(), "entrySet", null);
        setField(term84630, term84630.getClass(), "navigableKeySet", null);
        setField(term84630, term84630.getClass(), "descendingMap", null);
        setField(term84630, term84630.getClass(), "keySet", null);
        setField(term84630, term84630.getClass(), "values", null);
        setField(term84629, term84629.getClass(), "properties", term84630);
        setBooleanField(term84629, term84629.getClass(), "nativeType", false);
        setField(term84631, term84631.getClass(), "this$0", null);
        setField(term84631, term84631.getClass(), "call", null);
        setField(term84631, term84631.getClass(), "prototype", null);
        setField(term84631, term84631.getClass(), "kind", null);
        setField(term84631, term84631.getClass(), "typeOfThis", null);
        setField(term84631, term84631.getClass(), "source", null);
        setField(term84631, term84631.getClass(), "implementedInterfaces", null);
        setField(term84631, term84631.getClass(), "subTypes", null);
        setField(term84631, term84631.getClass(), "templateTypeName", null);
        setField(term84631, term84631.getClass(), "className", null);
        setField(term84631, term84631.getClass(), "properties", null);
        setBooleanField(term84631, term84631.getClass(), "nativeType", false);
        setField(term84631, term84631.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term84631, term84631.getClass(), "prettyPrint", false);
        setBooleanField(term84631, term84631.getClass(), "visited", false);
        setField(term84631, term84631.getClass(), "docInfo", null);
        setBooleanField(term84631, term84631.getClass(), "unknown", false);
        setBooleanField(term84631, term84631.getClass(), "resolved", false);
        setField(term84631, term84631.getClass(), "resolveResult", null);
        setField(term84631, term84631.getClass(), "registry", null);
        setField(term84629, term84629.getClass(), "implicitPrototypeFallback", term84631);
        setBooleanField(term84629, term84629.getClass(), "prettyPrint", false);
        setBooleanField(term84629, term84629.getClass(), "visited", false);
        setField(term84629, term84629.getClass(), "docInfo", null);
        setBooleanField(term84629, term84629.getClass(), "unknown", true);
        setBooleanField(term84629, term84629.getClass(), "resolved", false);
        setField(term84629, term84629.getClass(), "resolveResult", null);
        setField(term84629, term84629.getClass(), "registry", null);
        setField(term84628, term84628.getClass(), "prototype", term84629);
        setField(term84628, term84628.getClass(), "kind", null);
        setField(term84628, term84628.getClass(), "typeOfThis", null);
        setField(term84628, term84628.getClass(), "source", null);
        setField(term84628, term84628.getClass(), "implementedInterfaces", null);
        setField(term84628, term84628.getClass(), "subTypes", null);
        setField(term84628, term84628.getClass(), "templateTypeName", null);
        setField(term84628, term84628.getClass(), "className", null);
        setField(term84628, term84628.getClass(), "properties", null);
        setBooleanField(term84628, term84628.getClass(), "nativeType", false);
        setField(term84628, term84628.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term84628, term84628.getClass(), "prettyPrint", false);
        setBooleanField(term84628, term84628.getClass(), "visited", false);
        setField(term84628, term84628.getClass(), "docInfo", null);
        setBooleanField(term84628, term84628.getClass(), "unknown", false);
        setBooleanField(term84628, term84628.getClass(), "resolved", false);
        setField(term84628, term84628.getClass(), "resolveResult", null);
        setField(term84628, term84628.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term84058;
        callMethod(klass, "maybeSetBaseType", argTypes, term83842, args);
        assertTrue(recursiveEquals(term83842, term84626));
        assertTrue(recursiveEquals(term84058, term84628));
    }

};



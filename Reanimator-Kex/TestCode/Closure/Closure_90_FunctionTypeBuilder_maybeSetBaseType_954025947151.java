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

public class FunctionTypeBuilder_maybeSetBaseType_954025947151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63180;
     Object term63380;
     Object term63940;
     Object term63942;

    public FunctionTypeBuilder_maybeSetBaseType_954025947151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63180 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term63280 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term63180, term63180.getClass(), "baseType", term63280);
        term63380 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term63940 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term63941 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term63940, term63940.getClass(), "fnName", null);
        setField(term63940, term63940.getClass(), "compiler", null);
        setField(term63940, term63940.getClass(), "codingConvention", null);
        setField(term63940, term63940.getClass(), "typeRegistry", null);
        setField(term63940, term63940.getClass(), "errorRoot", null);
        setField(term63940, term63940.getClass(), "sourceName", null);
        setField(term63940, term63940.getClass(), "scope", null);
        setField(term63940, term63940.getClass(), "returnType", null);
        setBooleanField(term63940, term63940.getClass(), "returnTypeInferred", false);
        setField(term63940, term63940.getClass(), "implementedInterfaces", null);
        setField(term63941, term63941.getClass(), "call", null);
        setField(term63941, term63941.getClass(), "prototype", null);
        setField(term63941, term63941.getClass(), "kind", null);
        setField(term63941, term63941.getClass(), "typeOfThis", null);
        setField(term63941, term63941.getClass(), "source", null);
        setField(term63941, term63941.getClass(), "implementedInterfaces", null);
        setField(term63941, term63941.getClass(), "subTypes", null);
        setField(term63941, term63941.getClass(), "templateTypeName", null);
        setField(term63941, term63941.getClass(), "className", null);
        setField(term63941, term63941.getClass(), "properties", null);
        setBooleanField(term63941, term63941.getClass(), "nativeType", false);
        setField(term63941, term63941.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term63941, term63941.getClass(), "prettyPrint", false);
        setBooleanField(term63941, term63941.getClass(), "visited", false);
        setField(term63941, term63941.getClass(), "docInfo", null);
        setBooleanField(term63941, term63941.getClass(), "unknown", false);
        setBooleanField(term63941, term63941.getClass(), "resolved", false);
        setField(term63941, term63941.getClass(), "resolveResult", null);
        setField(term63941, term63941.getClass(), "registry", null);
        setField(term63940, term63940.getClass(), "baseType", term63941);
        setField(term63940, term63940.getClass(), "thisType", null);
        setBooleanField(term63940, term63940.getClass(), "isConstructor", false);
        setBooleanField(term63940, term63940.getClass(), "isInterface", false);
        setField(term63940, term63940.getClass(), "parametersNode", null);
        setField(term63940, term63940.getClass(), "sourceNode", null);
        setField(term63940, term63940.getClass(), "templateTypeName", null);
        term63942 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term63943 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term63944 = newInstance(Class.forName("java.util.TreeMap"));
        Object term63945 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term63942, term63942.getClass(), "call", null);
        setField(term63943, term63943.getClass(), "ownerFunction", term63942);
        setField(term63943, term63943.getClass(), "className", null);
        setField(term63944, term63944.getClass(), "comparator", null);
        setField(term63944, term63944.getClass(), "root", null);
        setIntField(term63944, term63944.getClass(), "size", 0);
        setIntField(term63944, term63944.getClass(), "modCount", 0);
        setField(term63944, term63944.getClass(), "entrySet", null);
        setField(term63944, term63944.getClass(), "navigableKeySet", null);
        setField(term63944, term63944.getClass(), "descendingMap", null);
        setField(term63944, term63944.getClass(), "keySet", null);
        setField(term63944, term63944.getClass(), "values", null);
        setField(term63943, term63943.getClass(), "properties", term63944);
        setBooleanField(term63943, term63943.getClass(), "nativeType", false);
        setField(term63945, term63945.getClass(), "call", null);
        setField(term63945, term63945.getClass(), "prototype", null);
        setField(term63945, term63945.getClass(), "kind", null);
        setField(term63945, term63945.getClass(), "typeOfThis", null);
        setField(term63945, term63945.getClass(), "source", null);
        setField(term63945, term63945.getClass(), "implementedInterfaces", null);
        setField(term63945, term63945.getClass(), "subTypes", null);
        setField(term63945, term63945.getClass(), "templateTypeName", null);
        setField(term63945, term63945.getClass(), "className", null);
        setField(term63945, term63945.getClass(), "properties", null);
        setBooleanField(term63945, term63945.getClass(), "nativeType", false);
        setField(term63945, term63945.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term63945, term63945.getClass(), "prettyPrint", false);
        setBooleanField(term63945, term63945.getClass(), "visited", false);
        setField(term63945, term63945.getClass(), "docInfo", null);
        setBooleanField(term63945, term63945.getClass(), "unknown", false);
        setBooleanField(term63945, term63945.getClass(), "resolved", false);
        setField(term63945, term63945.getClass(), "resolveResult", null);
        setField(term63945, term63945.getClass(), "registry", null);
        setField(term63943, term63943.getClass(), "implicitPrototypeFallback", term63945);
        setBooleanField(term63943, term63943.getClass(), "prettyPrint", false);
        setBooleanField(term63943, term63943.getClass(), "visited", false);
        setField(term63943, term63943.getClass(), "docInfo", null);
        setBooleanField(term63943, term63943.getClass(), "unknown", true);
        setBooleanField(term63943, term63943.getClass(), "resolved", false);
        setField(term63943, term63943.getClass(), "resolveResult", null);
        setField(term63943, term63943.getClass(), "registry", null);
        setField(term63942, term63942.getClass(), "prototype", term63943);
        setField(term63942, term63942.getClass(), "kind", null);
        setField(term63942, term63942.getClass(), "typeOfThis", null);
        setField(term63942, term63942.getClass(), "source", null);
        setField(term63942, term63942.getClass(), "implementedInterfaces", null);
        setField(term63942, term63942.getClass(), "subTypes", null);
        setField(term63942, term63942.getClass(), "templateTypeName", null);
        setField(term63942, term63942.getClass(), "className", null);
        setField(term63942, term63942.getClass(), "properties", null);
        setBooleanField(term63942, term63942.getClass(), "nativeType", false);
        setField(term63942, term63942.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term63942, term63942.getClass(), "prettyPrint", false);
        setBooleanField(term63942, term63942.getClass(), "visited", false);
        setField(term63942, term63942.getClass(), "docInfo", null);
        setBooleanField(term63942, term63942.getClass(), "unknown", false);
        setBooleanField(term63942, term63942.getClass(), "resolved", false);
        setField(term63942, term63942.getClass(), "resolveResult", null);
        setField(term63942, term63942.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term63380;
        callMethod(klass, "maybeSetBaseType", argTypes, term63180, args);
        assertTrue(recursiveEquals(term63180, term63940));
        assertTrue(recursiveEquals(term63380, term63942));
    }

};



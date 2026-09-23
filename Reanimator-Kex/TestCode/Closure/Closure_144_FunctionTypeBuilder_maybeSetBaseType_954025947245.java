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
import java.lang.String;
import java.util.HashMap;

public class FunctionTypeBuilder_maybeSetBaseType_954025947245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110051;
     Object term110279;
     Object term110936;
     Object term110938;

    public FunctionTypeBuilder_maybeSetBaseType_954025947245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110051 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term110169 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term110051, term110051.getClass(), "baseType", term110169);
        Class<? extends Object> term110946 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term110945 = ((Class) term110946).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term110945).setAccessible(true);
        Object enum85 = ((Field) term110945).get((Object) null);
        term110279 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term110279, term110279.getClass(), "prototype", null);
        setField(term110279, term110279.getClass(), "registry", null);
        setBooleanField(term110279, term110279.getClass(), "nativeType", false);
        setField(term110279, term110279.getClass(), "kind", enum85);
        term110936 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term110937 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term110936, term110936.getClass(), "fnName", null);
        setField(term110936, term110936.getClass(), "compiler", null);
        setField(term110936, term110936.getClass(), "codingConvention", null);
        setField(term110936, term110936.getClass(), "typeRegistry", null);
        setField(term110936, term110936.getClass(), "errorRoot", null);
        setField(term110936, term110936.getClass(), "sourceName", null);
        setField(term110936, term110936.getClass(), "scope", null);
        setField(term110936, term110936.getClass(), "returnType", null);
        setField(term110936, term110936.getClass(), "implementedInterfaces", null);
        setField(term110937, term110937.getClass(), "ownerFunction", null);
        setField(term110937, term110937.getClass(), "className", null);
        setField(term110937, term110937.getClass(), "properties", null);
        setField(term110937, term110937.getClass(), "implicitPrototype", null);
        setBooleanField(term110937, term110937.getClass(), "nativeType", false);
        setBooleanField(term110937, term110937.getClass(), "prettyPrint", false);
        setBooleanField(term110937, term110937.getClass(), "visited", false);
        setField(term110937, term110937.getClass(), "docInfo", null);
        setBooleanField(term110937, term110937.getClass(), "unknown", false);
        setBooleanField(term110937, term110937.getClass(), "resolved", false);
        setField(term110937, term110937.getClass(), "resolveResult", null);
        setField(term110937, term110937.getClass(), "registry", null);
        setField(term110936, term110936.getClass(), "baseType", term110937);
        setField(term110936, term110936.getClass(), "thisType", null);
        setBooleanField(term110936, term110936.getClass(), "isConstructor", false);
        setBooleanField(term110936, term110936.getClass(), "isInterface", false);
        setField(term110936, term110936.getClass(), "parametersNode", null);
        setField(term110936, term110936.getClass(), "sourceNode", null);
        setField(term110936, term110936.getClass(), "templateTypeName", null);
        HashMap term110940 = new HashMap();
        Class<? extends Object> term111246 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term111245 = ((Class) term111246).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term111245).setAccessible(true);
        Object enum86 = ((Field) term111245).get((Object) null);
        term110938 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term110939 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term110941 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term110938, term110938.getClass(), "call", null);
        setField(term110939, term110939.getClass(), "ownerFunction", term110938);
        setField(term110939, term110939.getClass(), "className", null);
        setField(term110939, term110939.getClass(), "properties", term110940);
        setField(term110941, term110941.getClass(), "ownerFunction", null);
        setField(term110941, term110941.getClass(), "className", null);
        setField(term110941, term110941.getClass(), "properties", null);
        setField(term110941, term110941.getClass(), "implicitPrototype", null);
        setBooleanField(term110941, term110941.getClass(), "nativeType", false);
        setBooleanField(term110941, term110941.getClass(), "prettyPrint", false);
        setBooleanField(term110941, term110941.getClass(), "visited", false);
        setField(term110941, term110941.getClass(), "docInfo", null);
        setBooleanField(term110941, term110941.getClass(), "unknown", false);
        setBooleanField(term110941, term110941.getClass(), "resolved", false);
        setField(term110941, term110941.getClass(), "resolveResult", null);
        setField(term110941, term110941.getClass(), "registry", null);
        setField(term110939, term110939.getClass(), "implicitPrototype", term110941);
        setBooleanField(term110939, term110939.getClass(), "nativeType", false);
        setBooleanField(term110939, term110939.getClass(), "prettyPrint", false);
        setBooleanField(term110939, term110939.getClass(), "visited", false);
        setField(term110939, term110939.getClass(), "docInfo", null);
        setBooleanField(term110939, term110939.getClass(), "unknown", true);
        setBooleanField(term110939, term110939.getClass(), "resolved", false);
        setField(term110939, term110939.getClass(), "resolveResult", null);
        setField(term110939, term110939.getClass(), "registry", null);
        setField(term110938, term110938.getClass(), "prototype", term110939);
        setField(term110938, term110938.getClass(), "kind", enum86);
        setField(term110938, term110938.getClass(), "typeOfThis", null);
        setField(term110938, term110938.getClass(), "source", null);
        setField(term110938, term110938.getClass(), "implementedInterfaces", null);
        setField(term110938, term110938.getClass(), "subTypes", null);
        setField(term110938, term110938.getClass(), "templateTypeName", null);
        setField(term110938, term110938.getClass(), "className", null);
        setField(term110938, term110938.getClass(), "properties", null);
        setField(term110938, term110938.getClass(), "implicitPrototype", null);
        setBooleanField(term110938, term110938.getClass(), "nativeType", false);
        setBooleanField(term110938, term110938.getClass(), "prettyPrint", false);
        setBooleanField(term110938, term110938.getClass(), "visited", false);
        setField(term110938, term110938.getClass(), "docInfo", null);
        setBooleanField(term110938, term110938.getClass(), "unknown", false);
        setBooleanField(term110938, term110938.getClass(), "resolved", false);
        setField(term110938, term110938.getClass(), "resolveResult", null);
        setField(term110938, term110938.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term110279;
        callMethod(klass, "maybeSetBaseType", argTypes, term110051, args);
        assertTrue(recursiveEquals(term110051, term110936));
        assertTrue(recursiveEquals(term110279, term110938));
    }

};



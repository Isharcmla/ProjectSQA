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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TypeCheck_hasUnknownOrEmptySupertype_5965798284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5932;

    public TypeCheck_hasUnknownOrEmptySupertype_5965798284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19086 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term19085 = ((Class) term19086).getDeclaredField((String) "INTERFACE");
        ((Field) term19085).setAccessible(true);
        Object enum21 = ((Field) term19085).get((Object) null);
        Class<? extends Object> term19380 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term19379 = ((Class) term19380).getDeclaredField((String) "DICT");
        ((Field) term19379).setAccessible(true);
        Object enum22 = ((Field) term19379).get((Object) null);
        term5932 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term5933 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term5934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5944 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5950 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5961 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term5934, term5934.getClass(), "type", 794568325);
        setIntField(term5936, term5936.getClass(), "type", -434468428);
        setIntField(term5938, term5938.getClass(), "type", 1559605714);
        setField(term5938, term5938.getClass(), "next", null);
        setField(term5938, term5938.getClass(), "first", null);
        setField(term5938, term5938.getClass(), "last", null);
        setField(term5938, term5938.getClass(), "propListHead", null);
        setIntField(term5938, term5938.getClass(), "sourcePosition", 0);
        setField(term5938, term5938.getClass(), "jsType", null);
        setField(term5938, term5938.getClass(), "parent", null);
        setField(term5936, term5936.getClass(), "next", term5938);
        setIntField(term5941, term5941.getClass(), "type", 0);
        setField(term5941, term5941.getClass(), "next", null);
        setField(term5941, term5941.getClass(), "first", null);
        setField(term5941, term5941.getClass(), "last", null);
        setField(term5941, term5941.getClass(), "propListHead", null);
        setIntField(term5941, term5941.getClass(), "sourcePosition", 0);
        setField(term5941, term5941.getClass(), "jsType", null);
        setField(term5941, term5941.getClass(), "parent", null);
        setField(term5936, term5936.getClass(), "first", term5941);
        setIntField(term5944, term5944.getClass(), "type", 768407648);
        setField(term5944, term5944.getClass(), "next", null);
        setField(term5944, term5944.getClass(), "first", term5941);
        setField(term5944, term5944.getClass(), "last", term5944);
        setField(term5944, term5944.getClass(), "propListHead", null);
        setIntField(term5944, term5944.getClass(), "sourcePosition", 0);
        setField(term5944, term5944.getClass(), "jsType", null);
        setField(term5944, term5944.getClass(), "parent", null);
        setField(term5936, term5936.getClass(), "last", term5944);
        setField(term5936, term5936.getClass(), "propListHead", null);
        setIntField(term5936, term5936.getClass(), "sourcePosition", 0);
        setField(term5936, term5936.getClass(), "jsType", null);
        setField(term5936, term5936.getClass(), "parent", null);
        setField(term5934, term5934.getClass(), "next", term5936);
        setIntField(term5948, term5948.getClass(), "type", -1629418973);
        setIntField(term5950, term5950.getClass(), "type", -100825168);
        setField(term5950, term5950.getClass(), "next", term5944);
        setField(term5950, term5950.getClass(), "first", null);
        setField(term5950, term5950.getClass(), "last", term5934);
        setField(term5950, term5950.getClass(), "propListHead", null);
        setIntField(term5950, term5950.getClass(), "sourcePosition", 0);
        setField(term5950, term5950.getClass(), "jsType", null);
        setField(term5950, term5950.getClass(), "parent", null);
        setField(term5948, term5948.getClass(), "next", term5950);
        setField(term5948, term5948.getClass(), "first", term5948);
        setIntField(term5953, term5953.getClass(), "type", 1146601902);
        setField(term5953, term5953.getClass(), "next", null);
        setField(term5953, term5953.getClass(), "first", term5941);
        setField(term5953, term5953.getClass(), "last", term5944);
        setField(term5953, term5953.getClass(), "propListHead", null);
        setIntField(term5953, term5953.getClass(), "sourcePosition", 0);
        setField(term5953, term5953.getClass(), "jsType", null);
        setField(term5953, term5953.getClass(), "parent", null);
        setField(term5948, term5948.getClass(), "last", term5953);
        setField(term5948, term5948.getClass(), "propListHead", null);
        setIntField(term5948, term5948.getClass(), "sourcePosition", 0);
        setField(term5948, term5948.getClass(), "jsType", null);
        setField(term5948, term5948.getClass(), "parent", null);
        setField(term5934, term5934.getClass(), "first", term5948);
        setField(term5934, term5934.getClass(), "last", term5938);
        setField(term5934, term5934.getClass(), "propListHead", null);
        setIntField(term5934, term5934.getClass(), "sourcePosition", 0);
        setField(term5934, term5934.getClass(), "jsType", null);
        setField(term5934, term5934.getClass(), "parent", null);
        setField(term5933, term5933.getClass(), "parameters", term5934);
        setField(term5933, term5933.getClass(), "returnType", null);
        setBooleanField(term5933, term5933.getClass(), "returnTypeInferred", false);
        setBooleanField(term5933, term5933.getClass(), "resolved", false);
        setField(term5933, term5933.getClass(), "resolveResult", null);
        setBooleanField(term5933, term5933.getClass(), "inTemplatedCheckVisit", false);
        setField(term5933, term5933.getClass(), "registry", null);
        setField(term5932, term5932.getClass(), "call", term5933);
        setField(term5961, term5961.getClass(), "name", null);
        setField(term5961, term5961.getClass(), "type", null);
        setBooleanField(term5961, term5961.getClass(), "inferred", false);
        setField(term5961, term5961.getClass(), "propertyNode", null);
        setField(term5961, term5961.getClass(), "docInfo", null);
        setField(term5932, term5932.getClass(), "prototypeSlot", term5961);
        setField(term5932, term5932.getClass(), "kind", enum21);
        setField(term5932, term5932.getClass(), "propAccess", enum22);
        setField(term5932, term5932.getClass(), "typeOfThis", null);
        setField(term5932, term5932.getClass(), "source", null);
        setField(term5932, term5932.getClass(), "implementedInterfaces", null);
        setField(term5932, term5932.getClass(), "extendedInterfaces", null);
        setField(term5932, term5932.getClass(), "subTypes", null);
        setField(term5932, term5932.getClass(), "templateTypeNames", null);
        setField(term5932, term5932.getClass(), "className", null);
        setField(term5932, term5932.getClass(), "properties", null);
        setBooleanField(term5932, term5932.getClass(), "nativeType", false);
        setField(term5932, term5932.getClass(), "implicitPrototypeFallback", null);
        setField(term5932, term5932.getClass(), "ownerFunction", null);
        setBooleanField(term5932, term5932.getClass(), "prettyPrint", false);
        setBooleanField(term5932, term5932.getClass(), "visited", false);
        setField(term5932, term5932.getClass(), "docInfo", null);
        setBooleanField(term5932, term5932.getClass(), "unknown", false);
        setBooleanField(term5932, term5932.getClass(), "resolved", false);
        setField(term5932, term5932.getClass(), "resolveResult", null);
        setBooleanField(term5932, term5932.getClass(), "inTemplatedCheckVisit", false);
        setField(term5932, term5932.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term5932;
        try {
            callMethod(klass, "hasUnknownOrEmptySupertype", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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

public class FunctionTypeBuilder_inferFromOverriddenFunction_716294571101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57172;
     Object term57272;
     Object term57506;
     Object term57962;
     Object term57967;
     Object term57970;
     Object term57951;

    public FunctionTypeBuilder_inferFromOverriddenFunction_716294571101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57172 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term57172, term57172.getClass(), "returnType", null);
        setField(term57172, term57172.getClass(), "typeRegistry", null);
        term57272 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term57366 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term57541 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term57366, term57366.getClass(), "returnType", null);
        setField(term57541, term57541.getClass(), "first", term57541);
        setField(term57366, term57366.getClass(), "parameters", term57541);
        setField(term57272, term57272.getClass(), "call", term57366);
        term57506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term57506, term57506.getClass(), "first", term57541);
        term57962 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term57963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57964 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term57962, term57962.getClass(), "fnName", null);
        setField(term57962, term57962.getClass(), "compiler", null);
        setField(term57962, term57962.getClass(), "codingConvention", null);
        setField(term57962, term57962.getClass(), "typeRegistry", null);
        setField(term57962, term57962.getClass(), "errorRoot", null);
        setField(term57962, term57962.getClass(), "sourceName", null);
        setField(term57962, term57962.getClass(), "scope", null);
        setField(term57962, term57962.getClass(), "returnType", null);
        setField(term57962, term57962.getClass(), "implementedInterfaces", null);
        setField(term57962, term57962.getClass(), "baseType", null);
        setField(term57962, term57962.getClass(), "thisType", null);
        setBooleanField(term57962, term57962.getClass(), "isConstructor", false);
        setBooleanField(term57962, term57962.getClass(), "isInterface", false);
        setIntField(term57963, term57963.getClass(), "type", 83);
        setField(term57963, term57963.getClass(), "next", null);
        setField(term57964, term57964.getClass(), "str", "");
        setIntField(term57964, term57964.getClass(), "type", 38);
        setField(term57964, term57964.getClass(), "next", null);
        setField(term57964, term57964.getClass(), "first", null);
        setField(term57964, term57964.getClass(), "last", null);
        setField(term57964, term57964.getClass(), "propListHead", null);
        setIntField(term57964, term57964.getClass(), "sourcePosition", -1);
        setField(term57964, term57964.getClass(), "jsType", null);
        setField(term57964, term57964.getClass(), "parent", term57963);
        setField(term57963, term57963.getClass(), "first", term57964);
        setField(term57963, term57963.getClass(), "last", term57964);
        setField(term57963, term57963.getClass(), "propListHead", null);
        setIntField(term57963, term57963.getClass(), "sourcePosition", -1);
        setField(term57963, term57963.getClass(), "jsType", null);
        setField(term57963, term57963.getClass(), "parent", null);
        setField(term57962, term57962.getClass(), "parametersNode", term57963);
        setField(term57962, term57962.getClass(), "sourceNode", null);
        setField(term57962, term57962.getClass(), "templateTypeName", null);
        term57967 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term57968 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term57969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57969, term57969.getClass(), "type", 0);
        setField(term57969, term57969.getClass(), "next", null);
        setField(term57969, term57969.getClass(), "first", term57969);
        setField(term57969, term57969.getClass(), "last", null);
        setField(term57969, term57969.getClass(), "propListHead", null);
        setIntField(term57969, term57969.getClass(), "sourcePosition", 0);
        setField(term57969, term57969.getClass(), "jsType", null);
        setField(term57969, term57969.getClass(), "parent", null);
        setField(term57968, term57968.getClass(), "parameters", term57969);
        setField(term57968, term57968.getClass(), "returnType", null);
        setBooleanField(term57968, term57968.getClass(), "returnTypeInferred", false);
        setBooleanField(term57968, term57968.getClass(), "resolved", false);
        setField(term57968, term57968.getClass(), "resolveResult", null);
        setField(term57968, term57968.getClass(), "registry", null);
        setField(term57967, term57967.getClass(), "call", term57968);
        setField(term57967, term57967.getClass(), "prototype", null);
        setField(term57967, term57967.getClass(), "kind", null);
        setField(term57967, term57967.getClass(), "typeOfThis", null);
        setField(term57967, term57967.getClass(), "source", null);
        setField(term57967, term57967.getClass(), "implementedInterfaces", null);
        setField(term57967, term57967.getClass(), "subTypes", null);
        setField(term57967, term57967.getClass(), "templateTypeName", null);
        setField(term57967, term57967.getClass(), "className", null);
        setField(term57967, term57967.getClass(), "properties", null);
        setField(term57967, term57967.getClass(), "implicitPrototype", null);
        setBooleanField(term57967, term57967.getClass(), "nativeType", false);
        setBooleanField(term57967, term57967.getClass(), "prettyPrint", false);
        setBooleanField(term57967, term57967.getClass(), "visited", false);
        setField(term57967, term57967.getClass(), "docInfo", null);
        setBooleanField(term57967, term57967.getClass(), "unknown", false);
        setBooleanField(term57967, term57967.getClass(), "resolved", false);
        setField(term57967, term57967.getClass(), "resolveResult", null);
        setField(term57967, term57967.getClass(), "registry", null);
        term57970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57970, term57970.getClass(), "type", 0);
        setField(term57970, term57970.getClass(), "next", null);
        setIntField(term57971, term57971.getClass(), "type", 0);
        setField(term57971, term57971.getClass(), "next", null);
        setField(term57971, term57971.getClass(), "first", term57971);
        setField(term57971, term57971.getClass(), "last", null);
        setField(term57971, term57971.getClass(), "propListHead", null);
        setIntField(term57971, term57971.getClass(), "sourcePosition", 0);
        setField(term57971, term57971.getClass(), "jsType", null);
        setField(term57971, term57971.getClass(), "parent", null);
        setField(term57970, term57970.getClass(), "first", term57971);
        setField(term57970, term57970.getClass(), "last", null);
        setField(term57970, term57970.getClass(), "propListHead", null);
        setIntField(term57970, term57970.getClass(), "sourcePosition", 0);
        setField(term57970, term57970.getClass(), "jsType", null);
        setField(term57970, term57970.getClass(), "parent", null);
        term57951 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term57954 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57956 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term57951, term57951.getClass(), "fnName", null);
        setField(term57951, term57951.getClass(), "compiler", null);
        setField(term57951, term57951.getClass(), "codingConvention", null);
        setField(term57951, term57951.getClass(), "typeRegistry", null);
        setField(term57951, term57951.getClass(), "errorRoot", null);
        setField(term57951, term57951.getClass(), "sourceName", null);
        setField(term57951, term57951.getClass(), "scope", null);
        setField(term57951, term57951.getClass(), "returnType", null);
        setField(term57951, term57951.getClass(), "implementedInterfaces", null);
        setField(term57951, term57951.getClass(), "baseType", null);
        setField(term57951, term57951.getClass(), "thisType", null);
        setBooleanField(term57951, term57951.getClass(), "isConstructor", false);
        setBooleanField(term57951, term57951.getClass(), "isInterface", false);
        setIntField(term57954, term57954.getClass(), "type", 83);
        setField(term57954, term57954.getClass(), "next", null);
        setField(term57956, term57956.getClass(), "str", "");
        setIntField(term57956, term57956.getClass(), "type", 38);
        setField(term57956, term57956.getClass(), "next", null);
        setField(term57956, term57956.getClass(), "first", null);
        setField(term57956, term57956.getClass(), "last", null);
        setField(term57956, term57956.getClass(), "propListHead", null);
        setIntField(term57956, term57956.getClass(), "sourcePosition", -1);
        setField(term57956, term57956.getClass(), "jsType", null);
        setField(term57956, term57956.getClass(), "parent", term57954);
        setField(term57954, term57954.getClass(), "first", term57956);
        setField(term57954, term57954.getClass(), "last", term57956);
        setField(term57954, term57954.getClass(), "propListHead", null);
        setIntField(term57954, term57954.getClass(), "sourcePosition", -1);
        setField(term57954, term57954.getClass(), "jsType", null);
        setField(term57954, term57954.getClass(), "parent", null);
        setField(term57951, term57951.getClass(), "parametersNode", term57954);
        setField(term57951, term57951.getClass(), "sourceNode", null);
        setField(term57951, term57951.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term57272;
        args[1] = term57506;
        Object retValue = callMethod(klass, "inferFromOverriddenFunction", argTypes, term57172, args);
        assertTrue(recursiveEquals(term57172, term57962));
        assertTrue(recursiveEquals(term57272, term57967));
        assertTrue(recursiveEquals(term57506, term57970));
        assertTrue(recursiveEquals(retValue, term57951));
    }

};



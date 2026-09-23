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

public class TypeValidator_getReadableJSTypeName_850599436198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53309;
     Object term53379;
     Object term53834;
     Object term53835;

    public TypeValidator_getReadableJSTypeName_850599436198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53309 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term53379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53491 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        Object term53591 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setIntField(term53379, term53379.getClass(), "type", 0);
        setField(term53491, term53491.getClass(), "ownerFunction", null);
        setField(term53491, term53491.getClass(), "constructor", term53591);
        setField(term53379, term53379.getClass(), "jsType", term53491);
        term53834 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term53834, term53834.getClass(), "compiler", null);
        setField(term53834, term53834.getClass(), "typeRegistry", null);
        setField(term53834, term53834.getClass(), "allValueTypes", null);
        setBooleanField(term53834, term53834.getClass(), "shouldReport", false);
        setField(term53834, term53834.getClass(), "nullOrUndefined", null);
        setField(term53834, term53834.getClass(), "mismatches", null);
        term53835 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53836 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        Object term53837 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setIntField(term53835, term53835.getClass(), "type", 0);
        setField(term53835, term53835.getClass(), "next", null);
        setField(term53835, term53835.getClass(), "first", null);
        setField(term53835, term53835.getClass(), "last", null);
        setField(term53835, term53835.getClass(), "propListHead", null);
        setIntField(term53835, term53835.getClass(), "sourcePosition", 0);
        setField(term53837, term53837.getClass(), "call", null);
        setField(term53837, term53837.getClass(), "prototypeSlot", null);
        setField(term53837, term53837.getClass(), "kind", null);
        setField(term53837, term53837.getClass(), "propAccess", null);
        setField(term53837, term53837.getClass(), "typeOfThis", null);
        setField(term53837, term53837.getClass(), "source", null);
        setField(term53837, term53837.getClass(), "implementedInterfaces", null);
        setField(term53837, term53837.getClass(), "extendedInterfaces", null);
        setField(term53837, term53837.getClass(), "subTypes", null);
        setField(term53837, term53837.getClass(), "className", null);
        setField(term53837, term53837.getClass(), "properties", null);
        setBooleanField(term53837, term53837.getClass(), "nativeType", false);
        setField(term53837, term53837.getClass(), "implicitPrototypeFallback", null);
        setField(term53837, term53837.getClass(), "ownerFunction", null);
        setBooleanField(term53837, term53837.getClass(), "prettyPrint", false);
        setBooleanField(term53837, term53837.getClass(), "visited", false);
        setField(term53837, term53837.getClass(), "docInfo", null);
        setBooleanField(term53837, term53837.getClass(), "unknown", false);
        setBooleanField(term53837, term53837.getClass(), "resolved", false);
        setField(term53837, term53837.getClass(), "resolveResult", null);
        setField(term53837, term53837.getClass(), "templateKeys", null);
        setField(term53837, term53837.getClass(), "templatizedTypes", null);
        setBooleanField(term53837, term53837.getClass(), "inTemplatedCheckVisit", false);
        setField(term53837, term53837.getClass(), "registry", null);
        setField(term53836, term53836.getClass(), "constructor", term53837);
        setField(term53836, term53836.getClass(), "className", null);
        setField(term53836, term53836.getClass(), "properties", null);
        setBooleanField(term53836, term53836.getClass(), "nativeType", false);
        setField(term53836, term53836.getClass(), "implicitPrototypeFallback", null);
        setField(term53836, term53836.getClass(), "ownerFunction", null);
        setBooleanField(term53836, term53836.getClass(), "prettyPrint", false);
        setBooleanField(term53836, term53836.getClass(), "visited", false);
        setField(term53836, term53836.getClass(), "docInfo", null);
        setBooleanField(term53836, term53836.getClass(), "unknown", false);
        setBooleanField(term53836, term53836.getClass(), "resolved", false);
        setField(term53836, term53836.getClass(), "resolveResult", null);
        setField(term53836, term53836.getClass(), "templateKeys", null);
        setField(term53836, term53836.getClass(), "templatizedTypes", null);
        setBooleanField(term53836, term53836.getClass(), "inTemplatedCheckVisit", false);
        setField(term53836, term53836.getClass(), "registry", null);
        setField(term53835, term53835.getClass(), "jsType", term53836);
        setField(term53835, term53835.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term53379;
        args[1] = true;
        Object retValue = callMethod(klass, "getReadableJSTypeName", argTypes, term53309, args);
        assertTrue(recursiveEquals(term53309, term53834));
        assertTrue(recursiveEquals(term53379, term53835));
        assertTrue(recursiveEquals(retValue, "{...}"));
    }

};



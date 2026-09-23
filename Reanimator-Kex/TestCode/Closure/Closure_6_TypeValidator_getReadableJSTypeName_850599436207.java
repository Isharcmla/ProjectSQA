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

public class TypeValidator_getReadableJSTypeName_850599436207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57542;
     Object term57612;
     Object term58223;
     Object term58224;

    public TypeValidator_getReadableJSTypeName_850599436207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57542 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term57612 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57716 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setIntField(term57612, term57612.getClass(), "type", -34);
        setField(term57612, term57612.getClass(), "jsType", term57716);
        term58223 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term58223, term58223.getClass(), "compiler", null);
        setField(term58223, term58223.getClass(), "typeRegistry", null);
        setField(term58223, term58223.getClass(), "allValueTypes", null);
        setBooleanField(term58223, term58223.getClass(), "shouldReport", false);
        setField(term58223, term58223.getClass(), "nullOrUndefined", null);
        setField(term58223, term58223.getClass(), "mismatches", null);
        term58224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58225 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setIntField(term58224, term58224.getClass(), "type", -34);
        setField(term58224, term58224.getClass(), "next", null);
        setField(term58224, term58224.getClass(), "first", null);
        setField(term58224, term58224.getClass(), "last", null);
        setField(term58224, term58224.getClass(), "propListHead", null);
        setIntField(term58224, term58224.getClass(), "sourcePosition", 0);
        setField(term58225, term58225.getClass(), "call", null);
        setField(term58225, term58225.getClass(), "prototypeSlot", null);
        setField(term58225, term58225.getClass(), "kind", null);
        setField(term58225, term58225.getClass(), "propAccess", null);
        setField(term58225, term58225.getClass(), "typeOfThis", null);
        setField(term58225, term58225.getClass(), "source", null);
        setField(term58225, term58225.getClass(), "implementedInterfaces", null);
        setField(term58225, term58225.getClass(), "extendedInterfaces", null);
        setField(term58225, term58225.getClass(), "subTypes", null);
        setField(term58225, term58225.getClass(), "className", null);
        setField(term58225, term58225.getClass(), "properties", null);
        setBooleanField(term58225, term58225.getClass(), "nativeType", false);
        setField(term58225, term58225.getClass(), "implicitPrototypeFallback", null);
        setField(term58225, term58225.getClass(), "ownerFunction", null);
        setBooleanField(term58225, term58225.getClass(), "prettyPrint", false);
        setBooleanField(term58225, term58225.getClass(), "visited", false);
        setField(term58225, term58225.getClass(), "docInfo", null);
        setBooleanField(term58225, term58225.getClass(), "unknown", false);
        setBooleanField(term58225, term58225.getClass(), "resolved", false);
        setField(term58225, term58225.getClass(), "resolveResult", null);
        setField(term58225, term58225.getClass(), "templateKeys", null);
        setField(term58225, term58225.getClass(), "templatizedTypes", null);
        setBooleanField(term58225, term58225.getClass(), "inTemplatedCheckVisit", false);
        setField(term58225, term58225.getClass(), "registry", null);
        setField(term58224, term58224.getClass(), "jsType", term58225);
        setField(term58224, term58224.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term57612;
        args[1] = true;
        Object retValue = callMethod(klass, "getReadableJSTypeName", argTypes, term57542, args);
        assertTrue(recursiveEquals(term57542, term58223));
        assertTrue(recursiveEquals(term57612, term58224));
        assertTrue(recursiveEquals(retValue, "NoResolvedType"));
    }

};



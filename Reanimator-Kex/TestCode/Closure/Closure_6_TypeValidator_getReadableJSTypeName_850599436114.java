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

public class TypeValidator_getReadableJSTypeName_850599436114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27070;
     Object term27140;
     Object term27980;
     Object term27981;

    public TypeValidator_getReadableJSTypeName_850599436114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27070 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term27140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27244 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setIntField(term27140, term27140.getClass(), "type", -34);
        setField(term27140, term27140.getClass(), "jsType", term27244);
        term27980 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term27980, term27980.getClass(), "compiler", null);
        setField(term27980, term27980.getClass(), "typeRegistry", null);
        setField(term27980, term27980.getClass(), "allValueTypes", null);
        setBooleanField(term27980, term27980.getClass(), "shouldReport", false);
        setField(term27980, term27980.getClass(), "nullOrUndefined", null);
        setField(term27980, term27980.getClass(), "mismatches", null);
        term27981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27982 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setIntField(term27981, term27981.getClass(), "type", -34);
        setField(term27981, term27981.getClass(), "next", null);
        setField(term27981, term27981.getClass(), "first", null);
        setField(term27981, term27981.getClass(), "last", null);
        setField(term27981, term27981.getClass(), "propListHead", null);
        setIntField(term27981, term27981.getClass(), "sourcePosition", 0);
        setField(term27982, term27982.getClass(), "call", null);
        setField(term27982, term27982.getClass(), "prototypeSlot", null);
        setField(term27982, term27982.getClass(), "kind", null);
        setField(term27982, term27982.getClass(), "propAccess", null);
        setField(term27982, term27982.getClass(), "typeOfThis", null);
        setField(term27982, term27982.getClass(), "source", null);
        setField(term27982, term27982.getClass(), "implementedInterfaces", null);
        setField(term27982, term27982.getClass(), "extendedInterfaces", null);
        setField(term27982, term27982.getClass(), "subTypes", null);
        setField(term27982, term27982.getClass(), "className", null);
        setField(term27982, term27982.getClass(), "properties", null);
        setBooleanField(term27982, term27982.getClass(), "nativeType", false);
        setField(term27982, term27982.getClass(), "implicitPrototypeFallback", null);
        setField(term27982, term27982.getClass(), "ownerFunction", null);
        setBooleanField(term27982, term27982.getClass(), "prettyPrint", false);
        setBooleanField(term27982, term27982.getClass(), "visited", false);
        setField(term27982, term27982.getClass(), "docInfo", null);
        setBooleanField(term27982, term27982.getClass(), "unknown", false);
        setBooleanField(term27982, term27982.getClass(), "resolved", false);
        setField(term27982, term27982.getClass(), "resolveResult", null);
        setField(term27982, term27982.getClass(), "templateKeys", null);
        setField(term27982, term27982.getClass(), "templatizedTypes", null);
        setBooleanField(term27982, term27982.getClass(), "inTemplatedCheckVisit", false);
        setField(term27982, term27982.getClass(), "registry", null);
        setField(term27981, term27981.getClass(), "jsType", term27982);
        setField(term27981, term27981.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term27140;
        args[1] = false;
        Object retValue = callMethod(klass, "getReadableJSTypeName", argTypes, term27070, args);
        assertTrue(recursiveEquals(term27070, term27980));
        assertTrue(recursiveEquals(term27140, term27981));
        assertTrue(recursiveEquals(retValue, "NoResolvedType"));
    }

};



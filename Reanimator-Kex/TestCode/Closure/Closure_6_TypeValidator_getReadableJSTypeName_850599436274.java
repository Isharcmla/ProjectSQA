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

public class TypeValidator_getReadableJSTypeName_850599436274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78792;
     Object term78884;
     Object term79317;
     Object term79318;

    public TypeValidator_getReadableJSTypeName_850599436274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78792 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term78884 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term78998 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term79098 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setIntField(term78884, term78884.getClass(), "type", 0);
        setField(term78998, term78998.getClass(), "ownerFunction", term79098);
        setField(term78884, term78884.getClass(), "jsType", term78998);
        term79317 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term79317, term79317.getClass(), "compiler", null);
        setField(term79317, term79317.getClass(), "typeRegistry", null);
        setField(term79317, term79317.getClass(), "allValueTypes", null);
        setBooleanField(term79317, term79317.getClass(), "shouldReport", false);
        setField(term79317, term79317.getClass(), "nullOrUndefined", null);
        setField(term79317, term79317.getClass(), "mismatches", null);
        term79318 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term79319 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term79320 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term79318, term79318.getClass(), "str", null);
        setIntField(term79318, term79318.getClass(), "type", 0);
        setField(term79318, term79318.getClass(), "next", null);
        setField(term79318, term79318.getClass(), "first", null);
        setField(term79318, term79318.getClass(), "last", null);
        setField(term79318, term79318.getClass(), "propListHead", null);
        setIntField(term79318, term79318.getClass(), "sourcePosition", 0);
        setField(term79319, term79319.getClass(), "className", null);
        setField(term79319, term79319.getClass(), "properties", null);
        setBooleanField(term79319, term79319.getClass(), "nativeType", false);
        setField(term79319, term79319.getClass(), "implicitPrototypeFallback", null);
        setField(term79320, term79320.getClass(), "call", null);
        setField(term79320, term79320.getClass(), "prototypeSlot", null);
        setField(term79320, term79320.getClass(), "kind", null);
        setField(term79320, term79320.getClass(), "propAccess", null);
        setField(term79320, term79320.getClass(), "typeOfThis", null);
        setField(term79320, term79320.getClass(), "source", null);
        setField(term79320, term79320.getClass(), "implementedInterfaces", null);
        setField(term79320, term79320.getClass(), "extendedInterfaces", null);
        setField(term79320, term79320.getClass(), "subTypes", null);
        setField(term79320, term79320.getClass(), "className", null);
        setField(term79320, term79320.getClass(), "properties", null);
        setBooleanField(term79320, term79320.getClass(), "nativeType", false);
        setField(term79320, term79320.getClass(), "implicitPrototypeFallback", null);
        setField(term79320, term79320.getClass(), "ownerFunction", null);
        setBooleanField(term79320, term79320.getClass(), "prettyPrint", false);
        setBooleanField(term79320, term79320.getClass(), "visited", false);
        setField(term79320, term79320.getClass(), "docInfo", null);
        setBooleanField(term79320, term79320.getClass(), "unknown", false);
        setBooleanField(term79320, term79320.getClass(), "resolved", false);
        setField(term79320, term79320.getClass(), "resolveResult", null);
        setField(term79320, term79320.getClass(), "templateKeys", null);
        setField(term79320, term79320.getClass(), "templatizedTypes", null);
        setBooleanField(term79320, term79320.getClass(), "inTemplatedCheckVisit", false);
        setField(term79320, term79320.getClass(), "registry", null);
        setField(term79319, term79319.getClass(), "ownerFunction", term79320);
        setBooleanField(term79319, term79319.getClass(), "prettyPrint", false);
        setBooleanField(term79319, term79319.getClass(), "visited", false);
        setField(term79319, term79319.getClass(), "docInfo", null);
        setBooleanField(term79319, term79319.getClass(), "unknown", false);
        setBooleanField(term79319, term79319.getClass(), "resolved", false);
        setField(term79319, term79319.getClass(), "resolveResult", null);
        setField(term79319, term79319.getClass(), "templateKeys", null);
        setField(term79319, term79319.getClass(), "templatizedTypes", null);
        setBooleanField(term79319, term79319.getClass(), "inTemplatedCheckVisit", false);
        setField(term79319, term79319.getClass(), "registry", null);
        setField(term79318, term79318.getClass(), "jsType", term79319);
        setField(term79318, term79318.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term78884;
        args[1] = true;
        Object retValue = callMethod(klass, "getReadableJSTypeName", argTypes, term78792, args);
        assertTrue(recursiveEquals(term78792, term79317));
        assertTrue(recursiveEquals(term78884, term79318));
        assertTrue(recursiveEquals(retValue, "null.prototype"));
    }

};



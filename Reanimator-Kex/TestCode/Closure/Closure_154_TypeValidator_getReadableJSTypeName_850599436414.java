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

public class TypeValidator_getReadableJSTypeName_850599436414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192004;
     Object term192096;
     Object term192266;
     Object term192267;

    public TypeValidator_getReadableJSTypeName_850599436414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192004 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term192096 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term192196 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setIntField(term192096, term192096.getClass(), "type", 42);
        setField(term192096, term192096.getClass(), "jsType", term192196);
        term192266 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term192266, term192266.getClass(), "compiler", null);
        setField(term192266, term192266.getClass(), "typeRegistry", null);
        setField(term192266, term192266.getClass(), "allValueTypes", null);
        setBooleanField(term192266, term192266.getClass(), "shouldReport", false);
        setField(term192266, term192266.getClass(), "nullOrUndefined", null);
        setField(term192266, term192266.getClass(), "mismatches", null);
        term192267 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term192268 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setDoubleField(term192267, term192267.getClass(), "number", 0.0);
        setIntField(term192267, term192267.getClass(), "type", 42);
        setField(term192267, term192267.getClass(), "next", null);
        setField(term192267, term192267.getClass(), "first", null);
        setField(term192267, term192267.getClass(), "last", null);
        setField(term192267, term192267.getClass(), "propListHead", null);
        setIntField(term192267, term192267.getClass(), "sourcePosition", 0);
        setField(term192268, term192268.getClass(), "call", null);
        setField(term192268, term192268.getClass(), "prototype", null);
        setField(term192268, term192268.getClass(), "kind", null);
        setField(term192268, term192268.getClass(), "typeOfThis", null);
        setField(term192268, term192268.getClass(), "source", null);
        setField(term192268, term192268.getClass(), "implementedInterfaces", null);
        setField(term192268, term192268.getClass(), "subTypes", null);
        setField(term192268, term192268.getClass(), "templateTypeName", null);
        setField(term192268, term192268.getClass(), "className", null);
        setField(term192268, term192268.getClass(), "properties", null);
        setBooleanField(term192268, term192268.getClass(), "nativeType", false);
        setField(term192268, term192268.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term192268, term192268.getClass(), "prettyPrint", false);
        setBooleanField(term192268, term192268.getClass(), "visited", false);
        setField(term192268, term192268.getClass(), "docInfo", null);
        setBooleanField(term192268, term192268.getClass(), "unknown", false);
        setBooleanField(term192268, term192268.getClass(), "resolved", false);
        setField(term192268, term192268.getClass(), "resolveResult", null);
        setField(term192268, term192268.getClass(), "registry", null);
        setField(term192267, term192267.getClass(), "jsType", term192268);
        setField(term192267, term192267.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term192096;
        args[1] = false;
        Object retValue = callMethod(klass, "getReadableJSTypeName", argTypes, term192004, args);
        assertTrue(recursiveEquals(term192004, term192266));
        assertTrue(recursiveEquals(term192096, term192267));
        assertTrue(recursiveEquals(retValue, "this"));
    }

};



package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;

public class PrototypeObjectType_defineProperty_34311628992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12302;
     Object term12311;

    public PrototypeObjectType_defineProperty_34311628992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12302 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term12311 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term12311, term12311.getClass(), "call", null);
        setField(term12311, term12311.getClass(), "prototypeSlot", null);
        setField(term12311, term12311.getClass(), "kind", null);
        setField(term12311, term12311.getClass(), "typeOfThis", null);
        setField(term12311, term12311.getClass(), "source", null);
        setField(term12311, term12311.getClass(), "implementedInterfaces", null);
        setField(term12311, term12311.getClass(), "extendedInterfaces", null);
        setField(term12311, term12311.getClass(), "subTypes", null);
        setField(term12311, term12311.getClass(), "templateTypeName", null);
        setField(term12311, term12311.getClass(), "className", null);
        setField(term12311, term12311.getClass(), "properties", null);
        setBooleanField(term12311, term12311.getClass(), "nativeType", false);
        setField(term12311, term12311.getClass(), "implicitPrototypeFallback", null);
        setField(term12311, term12311.getClass(), "ownerFunction", null);
        setBooleanField(term12311, term12311.getClass(), "prettyPrint", false);
        setBooleanField(term12311, term12311.getClass(), "visited", false);
        setField(term12311, term12311.getClass(), "docInfo", null);
        setBooleanField(term12311, term12311.getClass(), "unknown", false);
        setBooleanField(term12311, term12311.getClass(), "resolved", false);
        setField(term12311, term12311.getClass(), "resolveResult", null);
        setField(term12311, term12311.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = false;
        args[3] = null;
        callMethod(klass, "defineProperty", argTypes, term12302, args);
        assertTrue(recursiveEquals(term12302, term12311));
    }

};



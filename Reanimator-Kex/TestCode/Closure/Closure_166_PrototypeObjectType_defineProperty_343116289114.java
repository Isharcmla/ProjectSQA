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

public class PrototypeObjectType_defineProperty_343116289114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17047;
     Object term17057;

    public PrototypeObjectType_defineProperty_343116289114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17047 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        term17057 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term17057, term17057.getClass(), "call", null);
        setField(term17057, term17057.getClass(), "prototypeSlot", null);
        setField(term17057, term17057.getClass(), "kind", null);
        setField(term17057, term17057.getClass(), "typeOfThis", null);
        setField(term17057, term17057.getClass(), "source", null);
        setField(term17057, term17057.getClass(), "implementedInterfaces", null);
        setField(term17057, term17057.getClass(), "extendedInterfaces", null);
        setField(term17057, term17057.getClass(), "subTypes", null);
        setField(term17057, term17057.getClass(), "templateTypeNames", null);
        setField(term17057, term17057.getClass(), "className", null);
        setField(term17057, term17057.getClass(), "properties", null);
        setBooleanField(term17057, term17057.getClass(), "nativeType", false);
        setField(term17057, term17057.getClass(), "implicitPrototypeFallback", null);
        setField(term17057, term17057.getClass(), "ownerFunction", null);
        setBooleanField(term17057, term17057.getClass(), "prettyPrint", false);
        setBooleanField(term17057, term17057.getClass(), "visited", false);
        setField(term17057, term17057.getClass(), "docInfo", null);
        setBooleanField(term17057, term17057.getClass(), "unknown", false);
        setBooleanField(term17057, term17057.getClass(), "resolved", false);
        setField(term17057, term17057.getClass(), "resolveResult", null);
        setBooleanField(term17057, term17057.getClass(), "inTemplatedCheckVisit", false);
        setField(term17057, term17057.getClass(), "registry", null);
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
        callMethod(klass, "defineProperty", argTypes, term17047, args);
        assertTrue(recursiveEquals(term17047, term17057));
    }

};



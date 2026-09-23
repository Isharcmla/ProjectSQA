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

public class PrototypeObjectType_defineProperty_343116289136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24027;
     Object term24037;

    public PrototypeObjectType_defineProperty_343116289136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24027 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term24037 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term24037, term24037.getClass(), "call", null);
        setField(term24037, term24037.getClass(), "prototypeSlot", null);
        setField(term24037, term24037.getClass(), "kind", null);
        setField(term24037, term24037.getClass(), "typeOfThis", null);
        setField(term24037, term24037.getClass(), "source", null);
        setField(term24037, term24037.getClass(), "implementedInterfaces", null);
        setField(term24037, term24037.getClass(), "extendedInterfaces", null);
        setField(term24037, term24037.getClass(), "subTypes", null);
        setField(term24037, term24037.getClass(), "templateTypeNames", null);
        setField(term24037, term24037.getClass(), "className", null);
        setField(term24037, term24037.getClass(), "properties", null);
        setBooleanField(term24037, term24037.getClass(), "nativeType", false);
        setField(term24037, term24037.getClass(), "implicitPrototypeFallback", null);
        setField(term24037, term24037.getClass(), "ownerFunction", null);
        setBooleanField(term24037, term24037.getClass(), "prettyPrint", false);
        setBooleanField(term24037, term24037.getClass(), "visited", false);
        setField(term24037, term24037.getClass(), "docInfo", null);
        setBooleanField(term24037, term24037.getClass(), "unknown", false);
        setBooleanField(term24037, term24037.getClass(), "resolved", false);
        setField(term24037, term24037.getClass(), "resolveResult", null);
        setBooleanField(term24037, term24037.getClass(), "inTemplatedCheckVisit", false);
        setField(term24037, term24037.getClass(), "registry", null);
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
        callMethod(klass, "defineProperty", argTypes, term24027, args);
        assertTrue(recursiveEquals(term24027, term24037));
    }

};



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

public class PrototypeObjectType_defineProperty_343116289116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13918;
     Object term39604;

    public PrototypeObjectType_defineProperty_343116289116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13918 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        term39604 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term39604, term39604.getClass(), "call", null);
        setField(term39604, term39604.getClass(), "prototypeSlot", null);
        setField(term39604, term39604.getClass(), "kind", null);
        setField(term39604, term39604.getClass(), "typeOfThis", null);
        setField(term39604, term39604.getClass(), "source", null);
        setField(term39604, term39604.getClass(), "implementedInterfaces", null);
        setField(term39604, term39604.getClass(), "extendedInterfaces", null);
        setField(term39604, term39604.getClass(), "subTypes", null);
        setField(term39604, term39604.getClass(), "templateTypeName", null);
        setField(term39604, term39604.getClass(), "className", null);
        setField(term39604, term39604.getClass(), "properties", null);
        setBooleanField(term39604, term39604.getClass(), "nativeType", false);
        setField(term39604, term39604.getClass(), "implicitPrototypeFallback", null);
        setField(term39604, term39604.getClass(), "ownerFunction", null);
        setBooleanField(term39604, term39604.getClass(), "prettyPrint", false);
        setBooleanField(term39604, term39604.getClass(), "visited", false);
        setField(term39604, term39604.getClass(), "docInfo", null);
        setBooleanField(term39604, term39604.getClass(), "unknown", false);
        setBooleanField(term39604, term39604.getClass(), "resolved", false);
        setField(term39604, term39604.getClass(), "resolveResult", null);
        setField(term39604, term39604.getClass(), "registry", null);
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
        callMethod(klass, "defineProperty", argTypes, term13918, args);
        assertTrue(recursiveEquals(term13918, term39604));
    }

};



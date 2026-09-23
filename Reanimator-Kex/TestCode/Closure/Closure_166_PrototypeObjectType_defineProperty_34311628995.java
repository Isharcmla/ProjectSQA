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

public class PrototypeObjectType_defineProperty_34311628995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12473;
     Object term12981;

    public PrototypeObjectType_defineProperty_34311628995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12473 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term12981 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term12981, term12981.getClass(), "call", null);
        setField(term12981, term12981.getClass(), "prototypeSlot", null);
        setField(term12981, term12981.getClass(), "kind", null);
        setField(term12981, term12981.getClass(), "typeOfThis", null);
        setField(term12981, term12981.getClass(), "source", null);
        setField(term12981, term12981.getClass(), "implementedInterfaces", null);
        setField(term12981, term12981.getClass(), "extendedInterfaces", null);
        setField(term12981, term12981.getClass(), "subTypes", null);
        setField(term12981, term12981.getClass(), "templateTypeNames", null);
        setField(term12981, term12981.getClass(), "className", null);
        setField(term12981, term12981.getClass(), "properties", null);
        setBooleanField(term12981, term12981.getClass(), "nativeType", false);
        setField(term12981, term12981.getClass(), "implicitPrototypeFallback", null);
        setField(term12981, term12981.getClass(), "ownerFunction", null);
        setBooleanField(term12981, term12981.getClass(), "prettyPrint", false);
        setBooleanField(term12981, term12981.getClass(), "visited", false);
        setField(term12981, term12981.getClass(), "docInfo", null);
        setBooleanField(term12981, term12981.getClass(), "unknown", false);
        setBooleanField(term12981, term12981.getClass(), "resolved", false);
        setField(term12981, term12981.getClass(), "resolveResult", null);
        setBooleanField(term12981, term12981.getClass(), "inTemplatedCheckVisit", false);
        setField(term12981, term12981.getClass(), "registry", null);
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
        callMethod(klass, "defineProperty", argTypes, term12473, args);
        assertTrue(recursiveEquals(term12473, term12981));
    }

};



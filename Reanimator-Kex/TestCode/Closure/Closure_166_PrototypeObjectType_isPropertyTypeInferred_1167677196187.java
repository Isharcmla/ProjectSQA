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
import java.util.HashMap;
import java.lang.Object;
import java.util.ArrayList;

public class PrototypeObjectType_isPropertyTypeInferred_1167677196187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32260;
     Object term61983;

    public PrototypeObjectType_isPropertyTypeInferred_1167677196187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term32398 = newInstance(Class.forName("java.lang.Object"));
        HashMap term32308 = new HashMap();
        ((HashMap) term32308).put(term32398, term32398);
        ArrayList term32602 = new ArrayList();
        term32260 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term32550 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term32260, term32260.getClass(), "properties", term32308);
        setField(term32260, term32260.getClass(), "implicitPrototypeFallback", null);
        setField(term32550, term32550.getClass(), "extendedInterfaces", term32602);
        setField(term32260, term32260.getClass(), "ownerFunction", term32550);
        HashMap term61984 = new HashMap();
        ArrayList term61989 = new ArrayList();
        term61983 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term61988 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term61983, term61983.getClass(), "className", null);
        setField(term61983, term61983.getClass(), "properties", term61984);
        setBooleanField(term61983, term61983.getClass(), "nativeType", false);
        setField(term61983, term61983.getClass(), "implicitPrototypeFallback", null);
        setField(term61988, term61988.getClass(), "call", null);
        setField(term61988, term61988.getClass(), "prototypeSlot", null);
        setField(term61988, term61988.getClass(), "kind", null);
        setField(term61988, term61988.getClass(), "typeOfThis", null);
        setField(term61988, term61988.getClass(), "source", null);
        setField(term61988, term61988.getClass(), "implementedInterfaces", null);
        setField(term61988, term61988.getClass(), "extendedInterfaces", term61989);
        setField(term61988, term61988.getClass(), "subTypes", null);
        setField(term61988, term61988.getClass(), "templateTypeNames", null);
        setField(term61988, term61988.getClass(), "className", null);
        setField(term61988, term61988.getClass(), "properties", null);
        setBooleanField(term61988, term61988.getClass(), "nativeType", false);
        setField(term61988, term61988.getClass(), "implicitPrototypeFallback", null);
        setField(term61988, term61988.getClass(), "ownerFunction", null);
        setBooleanField(term61988, term61988.getClass(), "prettyPrint", false);
        setBooleanField(term61988, term61988.getClass(), "visited", false);
        setField(term61988, term61988.getClass(), "docInfo", null);
        setBooleanField(term61988, term61988.getClass(), "unknown", false);
        setBooleanField(term61988, term61988.getClass(), "resolved", false);
        setField(term61988, term61988.getClass(), "resolveResult", null);
        setBooleanField(term61988, term61988.getClass(), "inTemplatedCheckVisit", false);
        setField(term61988, term61988.getClass(), "registry", null);
        setField(term61983, term61983.getClass(), "ownerFunction", term61988);
        setBooleanField(term61983, term61983.getClass(), "prettyPrint", false);
        setBooleanField(term61983, term61983.getClass(), "visited", false);
        setField(term61983, term61983.getClass(), "docInfo", null);
        setBooleanField(term61983, term61983.getClass(), "unknown", false);
        setBooleanField(term61983, term61983.getClass(), "resolved", false);
        setField(term61983, term61983.getClass(), "resolveResult", null);
        setBooleanField(term61983, term61983.getClass(), "inTemplatedCheckVisit", false);
        setField(term61983, term61983.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "isPropertyTypeInferred", argTypes, term32260, args);
        assertTrue(recursiveEquals(term32260, term61983));
        assertTrue(recursiveEquals(retValue, false));
    }

};



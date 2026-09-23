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

public class PrototypeObjectType_isPropertyTypeDeclared_600489493113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15083;
     Object term40847;

    public PrototypeObjectType_isPropertyTypeDeclared_600489493113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term15221 = newInstance(Class.forName("java.lang.Object"));
        HashMap term15131 = new HashMap();
        ((HashMap) term15131).put(term15221, term15221);
        ArrayList term15425 = new ArrayList();
        term15083 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term15373 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term15083, term15083.getClass(), "properties", term15131);
        setField(term15083, term15083.getClass(), "implicitPrototypeFallback", null);
        setField(term15373, term15373.getClass(), "extendedInterfaces", term15425);
        setField(term15083, term15083.getClass(), "ownerFunction", term15373);
        HashMap term40848 = new HashMap();
        ArrayList term40853 = new ArrayList();
        term40847 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term40852 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term40847, term40847.getClass(), "className", null);
        setField(term40847, term40847.getClass(), "properties", term40848);
        setBooleanField(term40847, term40847.getClass(), "nativeType", false);
        setField(term40847, term40847.getClass(), "implicitPrototypeFallback", null);
        setField(term40852, term40852.getClass(), "call", null);
        setField(term40852, term40852.getClass(), "prototypeSlot", null);
        setField(term40852, term40852.getClass(), "kind", null);
        setField(term40852, term40852.getClass(), "typeOfThis", null);
        setField(term40852, term40852.getClass(), "source", null);
        setField(term40852, term40852.getClass(), "implementedInterfaces", null);
        setField(term40852, term40852.getClass(), "extendedInterfaces", term40853);
        setField(term40852, term40852.getClass(), "subTypes", null);
        setField(term40852, term40852.getClass(), "templateTypeName", null);
        setField(term40852, term40852.getClass(), "className", null);
        setField(term40852, term40852.getClass(), "properties", null);
        setBooleanField(term40852, term40852.getClass(), "nativeType", false);
        setField(term40852, term40852.getClass(), "implicitPrototypeFallback", null);
        setField(term40852, term40852.getClass(), "ownerFunction", null);
        setBooleanField(term40852, term40852.getClass(), "prettyPrint", false);
        setBooleanField(term40852, term40852.getClass(), "visited", false);
        setField(term40852, term40852.getClass(), "docInfo", null);
        setBooleanField(term40852, term40852.getClass(), "unknown", false);
        setBooleanField(term40852, term40852.getClass(), "resolved", false);
        setField(term40852, term40852.getClass(), "resolveResult", null);
        setField(term40852, term40852.getClass(), "registry", null);
        setField(term40847, term40847.getClass(), "ownerFunction", term40852);
        setBooleanField(term40847, term40847.getClass(), "prettyPrint", false);
        setBooleanField(term40847, term40847.getClass(), "visited", false);
        setField(term40847, term40847.getClass(), "docInfo", null);
        setBooleanField(term40847, term40847.getClass(), "unknown", false);
        setBooleanField(term40847, term40847.getClass(), "resolved", false);
        setField(term40847, term40847.getClass(), "resolveResult", null);
        setField(term40847, term40847.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "isPropertyTypeDeclared", argTypes, term15083, args);
        assertTrue(recursiveEquals(term15083, term40847));
        assertTrue(recursiveEquals(retValue, false));
    }

};



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

public class PrototypeObjectType_isPropertyTypeDeclared_600489493134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22869;
     Object term23897;

    public PrototypeObjectType_isPropertyTypeDeclared_600489493134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term23007 = newInstance(Class.forName("java.lang.Object"));
        HashMap term22917 = new HashMap();
        ((HashMap) term22917).put(term23007, term23007);
        ArrayList term23211 = new ArrayList();
        term22869 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term23159 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term22869, term22869.getClass(), "properties", term22917);
        setField(term22869, term22869.getClass(), "implicitPrototypeFallback", null);
        setField(term23159, term23159.getClass(), "extendedInterfaces", term23211);
        setField(term22869, term22869.getClass(), "ownerFunction", term23159);
        HashMap term23898 = new HashMap();
        ArrayList term23903 = new ArrayList();
        term23897 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term23902 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term23897, term23897.getClass(), "className", null);
        setField(term23897, term23897.getClass(), "properties", term23898);
        setBooleanField(term23897, term23897.getClass(), "nativeType", false);
        setField(term23897, term23897.getClass(), "implicitPrototypeFallback", null);
        setField(term23902, term23902.getClass(), "call", null);
        setField(term23902, term23902.getClass(), "prototypeSlot", null);
        setField(term23902, term23902.getClass(), "kind", null);
        setField(term23902, term23902.getClass(), "typeOfThis", null);
        setField(term23902, term23902.getClass(), "source", null);
        setField(term23902, term23902.getClass(), "implementedInterfaces", null);
        setField(term23902, term23902.getClass(), "extendedInterfaces", term23903);
        setField(term23902, term23902.getClass(), "subTypes", null);
        setField(term23902, term23902.getClass(), "templateTypeNames", null);
        setField(term23902, term23902.getClass(), "className", null);
        setField(term23902, term23902.getClass(), "properties", null);
        setBooleanField(term23902, term23902.getClass(), "nativeType", false);
        setField(term23902, term23902.getClass(), "implicitPrototypeFallback", null);
        setField(term23902, term23902.getClass(), "ownerFunction", null);
        setBooleanField(term23902, term23902.getClass(), "prettyPrint", false);
        setBooleanField(term23902, term23902.getClass(), "visited", false);
        setField(term23902, term23902.getClass(), "docInfo", null);
        setBooleanField(term23902, term23902.getClass(), "unknown", false);
        setBooleanField(term23902, term23902.getClass(), "resolved", false);
        setField(term23902, term23902.getClass(), "resolveResult", null);
        setBooleanField(term23902, term23902.getClass(), "inTemplatedCheckVisit", false);
        setField(term23902, term23902.getClass(), "registry", null);
        setField(term23897, term23897.getClass(), "ownerFunction", term23902);
        setBooleanField(term23897, term23897.getClass(), "prettyPrint", false);
        setBooleanField(term23897, term23897.getClass(), "visited", false);
        setField(term23897, term23897.getClass(), "docInfo", null);
        setBooleanField(term23897, term23897.getClass(), "unknown", false);
        setBooleanField(term23897, term23897.getClass(), "resolved", false);
        setField(term23897, term23897.getClass(), "resolveResult", null);
        setBooleanField(term23897, term23897.getClass(), "inTemplatedCheckVisit", false);
        setField(term23897, term23897.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "isPropertyTypeDeclared", argTypes, term22869, args);
        assertTrue(recursiveEquals(term22869, term23897));
        assertTrue(recursiveEquals(retValue, false));
    }

};



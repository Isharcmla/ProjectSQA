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
import java.lang.String;
import java.lang.Object;

public class FunctionType_defineProperty_180950138582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term558934;
     Object term559345;
     Object term559351;

    public FunctionType_defineProperty_180950138582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term559356 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term559355 = ((Class) term559356).getDeclaredField((String) "INTERFACE");
        ((Field) term559355).setAccessible(true);
        Object enum913 = ((Field) term559355).get((Object) null);
        term558934 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term558934, term558934.getClass(), "prototypeSlot", null);
        setField(term558934, term558934.getClass(), "className", null);
        setField(term558934, term558934.getClass(), "ownerFunction", null);
        setBooleanField(term558934, term558934.getClass(), "nativeType", false);
        setField(term558934, term558934.getClass(), "kind", enum913);
        setField(term558934, term558934.getClass(), "source", null);
        Class<? extends Object> term559659 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term559658 = ((Class) term559659).getDeclaredField((String) "INTERFACE");
        ((Field) term559658).setAccessible(true);
        Object enum914 = ((Field) term559658).get((Object) null);
        term559345 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term559345, term559345.getClass(), "call", null);
        setField(term559345, term559345.getClass(), "prototypeSlot", null);
        setField(term559345, term559345.getClass(), "kind", enum914);
        setField(term559345, term559345.getClass(), "propAccess", null);
        setField(term559345, term559345.getClass(), "typeOfThis", null);
        setField(term559345, term559345.getClass(), "source", null);
        setField(term559345, term559345.getClass(), "implementedInterfaces", null);
        setField(term559345, term559345.getClass(), "extendedInterfaces", null);
        setField(term559345, term559345.getClass(), "subTypes", null);
        setField(term559345, term559345.getClass(), "templateTypeNames", null);
        setField(term559345, term559345.getClass(), "className", null);
        setField(term559345, term559345.getClass(), "properties", null);
        setBooleanField(term559345, term559345.getClass(), "nativeType", false);
        setField(term559345, term559345.getClass(), "implicitPrototypeFallback", null);
        setField(term559345, term559345.getClass(), "ownerFunction", null);
        setBooleanField(term559345, term559345.getClass(), "prettyPrint", false);
        setBooleanField(term559345, term559345.getClass(), "visited", false);
        setField(term559345, term559345.getClass(), "docInfo", null);
        setBooleanField(term559345, term559345.getClass(), "unknown", false);
        setBooleanField(term559345, term559345.getClass(), "resolved", false);
        setField(term559345, term559345.getClass(), "resolveResult", null);
        setBooleanField(term559345, term559345.getClass(), "inTemplatedCheckVisit", false);
        setField(term559345, term559345.getClass(), "registry", null);
        Class<? extends Object> term559962 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term559961 = ((Class) term559962).getDeclaredField((String) "INTERFACE");
        ((Field) term559961).setAccessible(true);
        Object enum915 = ((Field) term559961).get((Object) null);
        term559351 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term559351, term559351.getClass(), "call", null);
        setField(term559351, term559351.getClass(), "prototypeSlot", null);
        setField(term559351, term559351.getClass(), "kind", enum915);
        setField(term559351, term559351.getClass(), "propAccess", null);
        setField(term559351, term559351.getClass(), "typeOfThis", null);
        setField(term559351, term559351.getClass(), "source", null);
        setField(term559351, term559351.getClass(), "implementedInterfaces", null);
        setField(term559351, term559351.getClass(), "extendedInterfaces", null);
        setField(term559351, term559351.getClass(), "subTypes", null);
        setField(term559351, term559351.getClass(), "templateTypeNames", null);
        setField(term559351, term559351.getClass(), "className", null);
        setField(term559351, term559351.getClass(), "properties", null);
        setBooleanField(term559351, term559351.getClass(), "nativeType", false);
        setField(term559351, term559351.getClass(), "implicitPrototypeFallback", null);
        setField(term559351, term559351.getClass(), "ownerFunction", null);
        setBooleanField(term559351, term559351.getClass(), "prettyPrint", false);
        setBooleanField(term559351, term559351.getClass(), "visited", false);
        setField(term559351, term559351.getClass(), "docInfo", null);
        setBooleanField(term559351, term559351.getClass(), "unknown", false);
        setBooleanField(term559351, term559351.getClass(), "resolved", false);
        setField(term559351, term559351.getClass(), "resolveResult", null);
        setBooleanField(term559351, term559351.getClass(), "inTemplatedCheckVisit", false);
        setField(term559351, term559351.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[4];
        args[0] = "prototype";
        args[1] = term558934;
        args[2] = false;
        args[3] = null;
        callMethod(klass, "defineProperty", argTypes, term558934, args);
        assertTrue(recursiveEquals(term558934, term559345));
        assertTrue(recursiveEquals(term558934, term559351));
    }

};



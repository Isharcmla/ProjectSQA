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

public class FunctionType_getSuperClassConstructor_1927670470207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97186;
     Object term97795;

    public FunctionType_getSuperClassConstructor_1927670470207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term97801 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term97800 = ((Class) term97801).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term97800).setAccessible(true);
        Object enum201 = ((Field) term97800).get((Object) null);
        term97186 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term97452 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term97186, term97186.getClass(), "kind", enum201);
        setField(term97186, term97186.getClass(), "prototype", term97452);
        Class<? extends Object> term98101 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term98100 = ((Class) term98101).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term98100).setAccessible(true);
        Object enum202 = ((Field) term98100).get((Object) null);
        term97795 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term97796 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term97795, term97795.getClass(), "call", null);
        setField(term97796, term97796.getClass(), "ownerFunction", null);
        setField(term97796, term97796.getClass(), "className", null);
        setField(term97796, term97796.getClass(), "properties", null);
        setField(term97796, term97796.getClass(), "implicitPrototype", null);
        setBooleanField(term97796, term97796.getClass(), "nativeType", false);
        setBooleanField(term97796, term97796.getClass(), "visited", false);
        setField(term97796, term97796.getClass(), "docInfo", null);
        setBooleanField(term97796, term97796.getClass(), "unknown", false);
        setBooleanField(term97796, term97796.getClass(), "resolved", false);
        setField(term97796, term97796.getClass(), "resolveResult", null);
        setField(term97796, term97796.getClass(), "registry", null);
        setField(term97795, term97795.getClass(), "prototype", term97796);
        setField(term97795, term97795.getClass(), "kind", enum202);
        setField(term97795, term97795.getClass(), "typeOfThis", null);
        setField(term97795, term97795.getClass(), "source", null);
        setField(term97795, term97795.getClass(), "implementedInterfaces", null);
        setField(term97795, term97795.getClass(), "subTypes", null);
        setField(term97795, term97795.getClass(), "templateTypeName", null);
        setField(term97795, term97795.getClass(), "className", null);
        setField(term97795, term97795.getClass(), "properties", null);
        setField(term97795, term97795.getClass(), "implicitPrototype", null);
        setBooleanField(term97795, term97795.getClass(), "nativeType", false);
        setBooleanField(term97795, term97795.getClass(), "visited", false);
        setField(term97795, term97795.getClass(), "docInfo", null);
        setBooleanField(term97795, term97795.getClass(), "unknown", false);
        setBooleanField(term97795, term97795.getClass(), "resolved", false);
        setField(term97795, term97795.getClass(), "resolveResult", null);
        setField(term97795, term97795.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSuperClassConstructor", argTypes, term97186, args);
        assertTrue(recursiveEquals(term97186, term97795));
        assertTrue(recursiveEquals(retValue, null));
    }

};



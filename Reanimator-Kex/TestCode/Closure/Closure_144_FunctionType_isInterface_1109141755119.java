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

public class FunctionType_isInterface_1109141755119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63686;
     Object term64784;

    public FunctionType_isInterface_1109141755119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term64790 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term64789 = ((Class) term64790).getDeclaredField((String) "INTERFACE");
        ((Field) term64789).setAccessible(true);
        Object enum162 = ((Field) term64789).get((Object) null);
        term63686 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term63686, term63686.getClass(), "kind", enum162);
        Class<? extends Object> term65084 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term65083 = ((Class) term65084).getDeclaredField((String) "INTERFACE");
        ((Field) term65083).setAccessible(true);
        Object enum163 = ((Field) term65083).get((Object) null);
        term64784 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term64784, term64784.getClass(), "call", null);
        setField(term64784, term64784.getClass(), "prototype", null);
        setField(term64784, term64784.getClass(), "kind", enum163);
        setField(term64784, term64784.getClass(), "typeOfThis", null);
        setField(term64784, term64784.getClass(), "source", null);
        setField(term64784, term64784.getClass(), "implementedInterfaces", null);
        setField(term64784, term64784.getClass(), "subTypes", null);
        setField(term64784, term64784.getClass(), "templateTypeName", null);
        setField(term64784, term64784.getClass(), "className", null);
        setField(term64784, term64784.getClass(), "properties", null);
        setField(term64784, term64784.getClass(), "implicitPrototype", null);
        setBooleanField(term64784, term64784.getClass(), "nativeType", false);
        setBooleanField(term64784, term64784.getClass(), "prettyPrint", false);
        setBooleanField(term64784, term64784.getClass(), "visited", false);
        setField(term64784, term64784.getClass(), "docInfo", null);
        setBooleanField(term64784, term64784.getClass(), "unknown", false);
        setBooleanField(term64784, term64784.getClass(), "resolved", false);
        setField(term64784, term64784.getClass(), "resolveResult", null);
        setField(term64784, term64784.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isInterface", argTypes, term63686, args);
        assertTrue(recursiveEquals(term63686, term64784));
        assertTrue(recursiveEquals(retValue, true));
    }

};



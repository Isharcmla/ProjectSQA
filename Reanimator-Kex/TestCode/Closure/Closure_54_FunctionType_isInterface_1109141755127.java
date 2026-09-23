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

public class FunctionType_isInterface_1109141755127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64993;
     Object term65457;

    public FunctionType_isInterface_1109141755127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term65463 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term65462 = ((Class) term65463).getDeclaredField((String) "INTERFACE");
        ((Field) term65462).setAccessible(true);
        Object enum164 = ((Field) term65462).get((Object) null);
        term64993 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term64993, term64993.getClass(), "kind", enum164);
        Class<? extends Object> term65757 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term65756 = ((Class) term65757).getDeclaredField((String) "INTERFACE");
        ((Field) term65756).setAccessible(true);
        Object enum165 = ((Field) term65756).get((Object) null);
        term65457 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term65457, term65457.getClass(), "call", null);
        setField(term65457, term65457.getClass(), "prototype", null);
        setField(term65457, term65457.getClass(), "prototypeSlot", null);
        setField(term65457, term65457.getClass(), "kind", enum165);
        setField(term65457, term65457.getClass(), "typeOfThis", null);
        setField(term65457, term65457.getClass(), "source", null);
        setField(term65457, term65457.getClass(), "implementedInterfaces", null);
        setField(term65457, term65457.getClass(), "extendedInterfaces", null);
        setField(term65457, term65457.getClass(), "subTypes", null);
        setField(term65457, term65457.getClass(), "templateTypeName", null);
        setField(term65457, term65457.getClass(), "className", null);
        setField(term65457, term65457.getClass(), "properties", null);
        setBooleanField(term65457, term65457.getClass(), "nativeType", false);
        setField(term65457, term65457.getClass(), "implicitPrototypeFallback", null);
        setField(term65457, term65457.getClass(), "ownerFunction", null);
        setBooleanField(term65457, term65457.getClass(), "prettyPrint", false);
        setBooleanField(term65457, term65457.getClass(), "visited", false);
        setField(term65457, term65457.getClass(), "docInfo", null);
        setBooleanField(term65457, term65457.getClass(), "unknown", false);
        setBooleanField(term65457, term65457.getClass(), "resolved", false);
        setField(term65457, term65457.getClass(), "resolveResult", null);
        setField(term65457, term65457.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isInterface", argTypes, term64993, args);
        assertTrue(recursiveEquals(term64993, term65457));
        assertTrue(recursiveEquals(retValue, true));
    }

};



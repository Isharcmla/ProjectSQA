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

public class FunctionType_isEquivalentTo_230708275255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148314;
     Object term148572;
     Object term148916;
     Object term148920;

    public FunctionType_isEquivalentTo_230708275255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term148923 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term148922 = ((Class) term148923).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term148922).setAccessible(true);
        Object enum281 = ((Field) term148922).get((Object) null);
        term148314 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term148314, term148314.getClass(), "kind", enum281);
        term148572 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Class<? extends Object> term149223 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term149222 = ((Class) term149223).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term149222).setAccessible(true);
        Object enum282 = ((Field) term149222).get((Object) null);
        term148916 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term148916, term148916.getClass(), "call", null);
        setField(term148916, term148916.getClass(), "prototype", null);
        setField(term148916, term148916.getClass(), "kind", enum282);
        setField(term148916, term148916.getClass(), "typeOfThis", null);
        setField(term148916, term148916.getClass(), "source", null);
        setField(term148916, term148916.getClass(), "implementedInterfaces", null);
        setField(term148916, term148916.getClass(), "subTypes", null);
        setField(term148916, term148916.getClass(), "templateTypeName", null);
        setField(term148916, term148916.getClass(), "className", null);
        setField(term148916, term148916.getClass(), "properties", null);
        setBooleanField(term148916, term148916.getClass(), "nativeType", false);
        setField(term148916, term148916.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term148916, term148916.getClass(), "prettyPrint", false);
        setBooleanField(term148916, term148916.getClass(), "visited", false);
        setField(term148916, term148916.getClass(), "docInfo", null);
        setBooleanField(term148916, term148916.getClass(), "unknown", false);
        setBooleanField(term148916, term148916.getClass(), "resolved", false);
        setField(term148916, term148916.getClass(), "resolveResult", null);
        setField(term148916, term148916.getClass(), "registry", null);
        term148920 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term148920, term148920.getClass(), "call", null);
        setField(term148920, term148920.getClass(), "prototype", null);
        setField(term148920, term148920.getClass(), "kind", null);
        setField(term148920, term148920.getClass(), "typeOfThis", null);
        setField(term148920, term148920.getClass(), "source", null);
        setField(term148920, term148920.getClass(), "implementedInterfaces", null);
        setField(term148920, term148920.getClass(), "subTypes", null);
        setField(term148920, term148920.getClass(), "templateTypeName", null);
        setField(term148920, term148920.getClass(), "className", null);
        setField(term148920, term148920.getClass(), "properties", null);
        setBooleanField(term148920, term148920.getClass(), "nativeType", false);
        setField(term148920, term148920.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term148920, term148920.getClass(), "prettyPrint", false);
        setBooleanField(term148920, term148920.getClass(), "visited", false);
        setField(term148920, term148920.getClass(), "docInfo", null);
        setBooleanField(term148920, term148920.getClass(), "unknown", false);
        setBooleanField(term148920, term148920.getClass(), "resolved", false);
        setField(term148920, term148920.getClass(), "resolveResult", null);
        setField(term148920, term148920.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term148572;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term148314, args);
        assertTrue(recursiveEquals(term148314, term148916));
        assertTrue(recursiveEquals(term148572, term148920));
        assertTrue(recursiveEquals(retValue, false));
    }

};



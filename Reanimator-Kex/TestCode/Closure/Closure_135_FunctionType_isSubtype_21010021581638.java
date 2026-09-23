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

public class FunctionType_isSubtype_21010021581638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2207036;
     Object term2207292;
     Object term2207753;
     Object term2207757;

    public FunctionType_isSubtype_21010021581638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2207763 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2207762 = ((Class) term2207763).getDeclaredField((String) "INTERFACE");
        ((Field) term2207762).setAccessible(true);
        Object enum4114 = ((Field) term2207762).get((Object) null);
        term2207036 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2207036, term2207036.getClass(), "kind", enum4114);
        term2207292 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term2207292, term2207292.getClass(), "kind", enum4114);
        Class<? extends Object> term2208057 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2208056 = ((Class) term2208057).getDeclaredField((String) "INTERFACE");
        ((Field) term2208056).setAccessible(true);
        Object enum4115 = ((Field) term2208056).get((Object) null);
        term2207753 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2207753, term2207753.getClass(), "call", null);
        setField(term2207753, term2207753.getClass(), "prototype", null);
        setField(term2207753, term2207753.getClass(), "kind", enum4115);
        setField(term2207753, term2207753.getClass(), "typeOfThis", null);
        setField(term2207753, term2207753.getClass(), "source", null);
        setField(term2207753, term2207753.getClass(), "implementedInterfaces", null);
        setField(term2207753, term2207753.getClass(), "subTypes", null);
        setField(term2207753, term2207753.getClass(), "templateTypeName", null);
        setField(term2207753, term2207753.getClass(), "className", null);
        setField(term2207753, term2207753.getClass(), "properties", null);
        setField(term2207753, term2207753.getClass(), "implicitPrototype", null);
        setBooleanField(term2207753, term2207753.getClass(), "nativeType", false);
        setBooleanField(term2207753, term2207753.getClass(), "visited", false);
        setField(term2207753, term2207753.getClass(), "docInfo", null);
        setBooleanField(term2207753, term2207753.getClass(), "unknown", false);
        setBooleanField(term2207753, term2207753.getClass(), "resolved", false);
        setField(term2207753, term2207753.getClass(), "resolveResult", null);
        setField(term2207753, term2207753.getClass(), "registry", null);
        Class<? extends Object> term2208351 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2208350 = ((Class) term2208351).getDeclaredField((String) "INTERFACE");
        ((Field) term2208350).setAccessible(true);
        Object enum4116 = ((Field) term2208350).get((Object) null);
        term2207757 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term2207757, term2207757.getClass(), "this$0", null);
        setField(term2207757, term2207757.getClass(), "call", null);
        setField(term2207757, term2207757.getClass(), "prototype", null);
        setField(term2207757, term2207757.getClass(), "kind", enum4116);
        setField(term2207757, term2207757.getClass(), "typeOfThis", null);
        setField(term2207757, term2207757.getClass(), "source", null);
        setField(term2207757, term2207757.getClass(), "implementedInterfaces", null);
        setField(term2207757, term2207757.getClass(), "subTypes", null);
        setField(term2207757, term2207757.getClass(), "templateTypeName", null);
        setField(term2207757, term2207757.getClass(), "className", null);
        setField(term2207757, term2207757.getClass(), "properties", null);
        setField(term2207757, term2207757.getClass(), "implicitPrototype", null);
        setBooleanField(term2207757, term2207757.getClass(), "nativeType", false);
        setBooleanField(term2207757, term2207757.getClass(), "visited", false);
        setField(term2207757, term2207757.getClass(), "docInfo", null);
        setBooleanField(term2207757, term2207757.getClass(), "unknown", false);
        setBooleanField(term2207757, term2207757.getClass(), "resolved", false);
        setField(term2207757, term2207757.getClass(), "resolveResult", null);
        setField(term2207757, term2207757.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2207292;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2207036, args);
        assertTrue(recursiveEquals(term2207036, term2207753));
        assertTrue(recursiveEquals(term2207292, term2207757));
        assertTrue(recursiveEquals(retValue, true));
    }

};



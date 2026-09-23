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

public class FunctionType_isSubtype_21010021581640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2209041;
     Object term2209475;
     Object term2209479;

    public FunctionType_isSubtype_21010021581640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2209485 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2209484 = ((Class) term2209485).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2209484).setAccessible(true);
        Object enum4118 = ((Field) term2209484).get((Object) null);
        term2209041 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2209041, term2209041.getClass(), "kind", enum4118);
        Class<? extends Object> term2209785 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2209784 = ((Class) term2209785).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2209784).setAccessible(true);
        Object enum4119 = ((Field) term2209784).get((Object) null);
        term2209475 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2209475, term2209475.getClass(), "this$0", null);
        setField(term2209475, term2209475.getClass(), "call", null);
        setField(term2209475, term2209475.getClass(), "prototype", null);
        setField(term2209475, term2209475.getClass(), "kind", enum4119);
        setField(term2209475, term2209475.getClass(), "typeOfThis", null);
        setField(term2209475, term2209475.getClass(), "source", null);
        setField(term2209475, term2209475.getClass(), "implementedInterfaces", null);
        setField(term2209475, term2209475.getClass(), "subTypes", null);
        setField(term2209475, term2209475.getClass(), "templateTypeName", null);
        setField(term2209475, term2209475.getClass(), "className", null);
        setField(term2209475, term2209475.getClass(), "properties", null);
        setField(term2209475, term2209475.getClass(), "implicitPrototype", null);
        setBooleanField(term2209475, term2209475.getClass(), "nativeType", false);
        setBooleanField(term2209475, term2209475.getClass(), "visited", false);
        setField(term2209475, term2209475.getClass(), "docInfo", null);
        setBooleanField(term2209475, term2209475.getClass(), "unknown", false);
        setBooleanField(term2209475, term2209475.getClass(), "resolved", false);
        setField(term2209475, term2209475.getClass(), "resolveResult", null);
        setField(term2209475, term2209475.getClass(), "registry", null);
        Class<? extends Object> term2210085 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2210084 = ((Class) term2210085).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2210084).setAccessible(true);
        Object enum4120 = ((Field) term2210084).get((Object) null);
        term2209479 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2209479, term2209479.getClass(), "this$0", null);
        setField(term2209479, term2209479.getClass(), "call", null);
        setField(term2209479, term2209479.getClass(), "prototype", null);
        setField(term2209479, term2209479.getClass(), "kind", enum4120);
        setField(term2209479, term2209479.getClass(), "typeOfThis", null);
        setField(term2209479, term2209479.getClass(), "source", null);
        setField(term2209479, term2209479.getClass(), "implementedInterfaces", null);
        setField(term2209479, term2209479.getClass(), "subTypes", null);
        setField(term2209479, term2209479.getClass(), "templateTypeName", null);
        setField(term2209479, term2209479.getClass(), "className", null);
        setField(term2209479, term2209479.getClass(), "properties", null);
        setField(term2209479, term2209479.getClass(), "implicitPrototype", null);
        setBooleanField(term2209479, term2209479.getClass(), "nativeType", false);
        setBooleanField(term2209479, term2209479.getClass(), "visited", false);
        setField(term2209479, term2209479.getClass(), "docInfo", null);
        setBooleanField(term2209479, term2209479.getClass(), "unknown", false);
        setBooleanField(term2209479, term2209479.getClass(), "resolved", false);
        setField(term2209479, term2209479.getClass(), "resolveResult", null);
        setField(term2209479, term2209479.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2209041;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2209041, args);
        assertTrue(recursiveEquals(term2209041, term2209475));
        assertTrue(recursiveEquals(term2209041, term2209479));
        assertTrue(recursiveEquals(retValue, true));
    }

};



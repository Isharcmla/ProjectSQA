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

public class FunctionType_supAndInfHelper_1603977104319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206829;
     Object term207261;
     Object term207265;
     Object term207205;

    public FunctionType_supAndInfHelper_1603977104319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term207270 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term207269 = ((Class) term207270).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term207269).setAccessible(true);
        Object enum392 = ((Field) term207269).get((Object) null);
        term206829 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term206829, term206829.getClass(), "kind", enum392);
        Class<? extends Object> term207570 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term207569 = ((Class) term207570).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term207569).setAccessible(true);
        Object enum393 = ((Field) term207569).get((Object) null);
        term207261 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term207261, term207261.getClass(), "call", null);
        setField(term207261, term207261.getClass(), "prototype", null);
        setField(term207261, term207261.getClass(), "kind", enum393);
        setField(term207261, term207261.getClass(), "typeOfThis", null);
        setField(term207261, term207261.getClass(), "source", null);
        setField(term207261, term207261.getClass(), "implementedInterfaces", null);
        setField(term207261, term207261.getClass(), "subTypes", null);
        setField(term207261, term207261.getClass(), "templateTypeName", null);
        setField(term207261, term207261.getClass(), "className", null);
        setField(term207261, term207261.getClass(), "properties", null);
        setField(term207261, term207261.getClass(), "implicitPrototype", null);
        setBooleanField(term207261, term207261.getClass(), "nativeType", false);
        setBooleanField(term207261, term207261.getClass(), "prettyPrint", false);
        setBooleanField(term207261, term207261.getClass(), "visited", false);
        setField(term207261, term207261.getClass(), "docInfo", null);
        setBooleanField(term207261, term207261.getClass(), "unknown", false);
        setBooleanField(term207261, term207261.getClass(), "resolved", false);
        setField(term207261, term207261.getClass(), "resolveResult", null);
        setField(term207261, term207261.getClass(), "registry", null);
        Class<? extends Object> term207870 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term207869 = ((Class) term207870).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term207869).setAccessible(true);
        Object enum394 = ((Field) term207869).get((Object) null);
        term207265 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term207265, term207265.getClass(), "call", null);
        setField(term207265, term207265.getClass(), "prototype", null);
        setField(term207265, term207265.getClass(), "kind", enum394);
        setField(term207265, term207265.getClass(), "typeOfThis", null);
        setField(term207265, term207265.getClass(), "source", null);
        setField(term207265, term207265.getClass(), "implementedInterfaces", null);
        setField(term207265, term207265.getClass(), "subTypes", null);
        setField(term207265, term207265.getClass(), "templateTypeName", null);
        setField(term207265, term207265.getClass(), "className", null);
        setField(term207265, term207265.getClass(), "properties", null);
        setField(term207265, term207265.getClass(), "implicitPrototype", null);
        setBooleanField(term207265, term207265.getClass(), "nativeType", false);
        setBooleanField(term207265, term207265.getClass(), "prettyPrint", false);
        setBooleanField(term207265, term207265.getClass(), "visited", false);
        setField(term207265, term207265.getClass(), "docInfo", null);
        setBooleanField(term207265, term207265.getClass(), "unknown", false);
        setBooleanField(term207265, term207265.getClass(), "resolved", false);
        setField(term207265, term207265.getClass(), "resolveResult", null);
        setField(term207265, term207265.getClass(), "registry", null);
        Class<? extends Object> term208170 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term208169 = ((Class) term208170).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term208169).setAccessible(true);
        Object enum395 = ((Field) term208169).get((Object) null);
        term207205 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term207205, term207205.getClass(), "call", null);
        setField(term207205, term207205.getClass(), "prototype", null);
        setField(term207205, term207205.getClass(), "kind", enum395);
        setField(term207205, term207205.getClass(), "typeOfThis", null);
        setField(term207205, term207205.getClass(), "source", null);
        setField(term207205, term207205.getClass(), "implementedInterfaces", null);
        setField(term207205, term207205.getClass(), "subTypes", null);
        setField(term207205, term207205.getClass(), "templateTypeName", null);
        setField(term207205, term207205.getClass(), "className", null);
        setField(term207205, term207205.getClass(), "properties", null);
        setField(term207205, term207205.getClass(), "implicitPrototype", null);
        setBooleanField(term207205, term207205.getClass(), "nativeType", false);
        setBooleanField(term207205, term207205.getClass(), "prettyPrint", false);
        setBooleanField(term207205, term207205.getClass(), "visited", false);
        setField(term207205, term207205.getClass(), "docInfo", null);
        setBooleanField(term207205, term207205.getClass(), "unknown", false);
        setBooleanField(term207205, term207205.getClass(), "resolved", false);
        setField(term207205, term207205.getClass(), "resolveResult", null);
        setField(term207205, term207205.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term206829;
        args[1] = false;
        Object retValue = callMethod(klass, "supAndInfHelper", argTypes, term206829, args);
        assertTrue(recursiveEquals(term206829, term207261));
        assertTrue(recursiveEquals(term206829, term207265));
        assertTrue(recursiveEquals(retValue, term207205));
    }

};



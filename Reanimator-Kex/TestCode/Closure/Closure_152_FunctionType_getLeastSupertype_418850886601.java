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

public class FunctionType_getLeastSupertype_418850886601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term589490;
     Object term589942;
     Object term589946;
     Object term589866;

    public FunctionType_getLeastSupertype_418850886601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term589951 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term589950 = ((Class) term589951).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term589950).setAccessible(true);
        Object enum912 = ((Field) term589950).get((Object) null);
        term589490 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term589490, term589490.getClass(), "kind", enum912);
        Class<? extends Object> term590251 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term590250 = ((Class) term590251).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term590250).setAccessible(true);
        Object enum913 = ((Field) term590250).get((Object) null);
        term589942 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term589942, term589942.getClass(), "call", null);
        setField(term589942, term589942.getClass(), "prototype", null);
        setField(term589942, term589942.getClass(), "kind", enum913);
        setField(term589942, term589942.getClass(), "typeOfThis", null);
        setField(term589942, term589942.getClass(), "source", null);
        setField(term589942, term589942.getClass(), "implementedInterfaces", null);
        setField(term589942, term589942.getClass(), "subTypes", null);
        setField(term589942, term589942.getClass(), "templateTypeName", null);
        setField(term589942, term589942.getClass(), "className", null);
        setField(term589942, term589942.getClass(), "properties", null);
        setBooleanField(term589942, term589942.getClass(), "nativeType", false);
        setField(term589942, term589942.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term589942, term589942.getClass(), "prettyPrint", false);
        setBooleanField(term589942, term589942.getClass(), "visited", false);
        setField(term589942, term589942.getClass(), "docInfo", null);
        setBooleanField(term589942, term589942.getClass(), "unknown", false);
        setBooleanField(term589942, term589942.getClass(), "resolved", false);
        setField(term589942, term589942.getClass(), "resolveResult", null);
        setField(term589942, term589942.getClass(), "registry", null);
        Class<? extends Object> term590551 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term590550 = ((Class) term590551).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term590550).setAccessible(true);
        Object enum914 = ((Field) term590550).get((Object) null);
        term589946 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term589946, term589946.getClass(), "call", null);
        setField(term589946, term589946.getClass(), "prototype", null);
        setField(term589946, term589946.getClass(), "kind", enum914);
        setField(term589946, term589946.getClass(), "typeOfThis", null);
        setField(term589946, term589946.getClass(), "source", null);
        setField(term589946, term589946.getClass(), "implementedInterfaces", null);
        setField(term589946, term589946.getClass(), "subTypes", null);
        setField(term589946, term589946.getClass(), "templateTypeName", null);
        setField(term589946, term589946.getClass(), "className", null);
        setField(term589946, term589946.getClass(), "properties", null);
        setBooleanField(term589946, term589946.getClass(), "nativeType", false);
        setField(term589946, term589946.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term589946, term589946.getClass(), "prettyPrint", false);
        setBooleanField(term589946, term589946.getClass(), "visited", false);
        setField(term589946, term589946.getClass(), "docInfo", null);
        setBooleanField(term589946, term589946.getClass(), "unknown", false);
        setBooleanField(term589946, term589946.getClass(), "resolved", false);
        setField(term589946, term589946.getClass(), "resolveResult", null);
        setField(term589946, term589946.getClass(), "registry", null);
        Class<? extends Object> term590851 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term590850 = ((Class) term590851).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term590850).setAccessible(true);
        Object enum915 = ((Field) term590850).get((Object) null);
        term589866 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term589866, term589866.getClass(), "call", null);
        setField(term589866, term589866.getClass(), "prototype", null);
        setField(term589866, term589866.getClass(), "kind", enum915);
        setField(term589866, term589866.getClass(), "typeOfThis", null);
        setField(term589866, term589866.getClass(), "source", null);
        setField(term589866, term589866.getClass(), "implementedInterfaces", null);
        setField(term589866, term589866.getClass(), "subTypes", null);
        setField(term589866, term589866.getClass(), "templateTypeName", null);
        setField(term589866, term589866.getClass(), "className", null);
        setField(term589866, term589866.getClass(), "properties", null);
        setBooleanField(term589866, term589866.getClass(), "nativeType", false);
        setField(term589866, term589866.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term589866, term589866.getClass(), "prettyPrint", false);
        setBooleanField(term589866, term589866.getClass(), "visited", false);
        setField(term589866, term589866.getClass(), "docInfo", null);
        setBooleanField(term589866, term589866.getClass(), "unknown", false);
        setBooleanField(term589866, term589866.getClass(), "resolved", false);
        setField(term589866, term589866.getClass(), "resolveResult", null);
        setField(term589866, term589866.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term589490;
        Object retValue = callMethod(klass, "getLeastSupertype", argTypes, term589490, args);
        assertTrue(recursiveEquals(term589490, term589942));
        assertTrue(recursiveEquals(term589490, term589946));
        assertTrue(recursiveEquals(retValue, term589866));
    }

};



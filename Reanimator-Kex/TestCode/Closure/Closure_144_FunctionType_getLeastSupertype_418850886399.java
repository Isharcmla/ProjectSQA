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

public class FunctionType_getLeastSupertype_418850886399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term301211;
     Object term301663;
     Object term301667;
     Object term301587;

    public FunctionType_getLeastSupertype_418850886399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term301672 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term301671 = ((Class) term301672).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term301671).setAccessible(true);
        Object enum553 = ((Field) term301671).get((Object) null);
        term301211 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term301211, term301211.getClass(), "kind", enum553);
        Class<? extends Object> term301972 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term301971 = ((Class) term301972).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term301971).setAccessible(true);
        Object enum554 = ((Field) term301971).get((Object) null);
        term301663 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term301663, term301663.getClass(), "call", null);
        setField(term301663, term301663.getClass(), "prototype", null);
        setField(term301663, term301663.getClass(), "kind", enum554);
        setField(term301663, term301663.getClass(), "typeOfThis", null);
        setField(term301663, term301663.getClass(), "source", null);
        setField(term301663, term301663.getClass(), "implementedInterfaces", null);
        setField(term301663, term301663.getClass(), "subTypes", null);
        setField(term301663, term301663.getClass(), "templateTypeName", null);
        setField(term301663, term301663.getClass(), "className", null);
        setField(term301663, term301663.getClass(), "properties", null);
        setField(term301663, term301663.getClass(), "implicitPrototype", null);
        setBooleanField(term301663, term301663.getClass(), "nativeType", false);
        setBooleanField(term301663, term301663.getClass(), "prettyPrint", false);
        setBooleanField(term301663, term301663.getClass(), "visited", false);
        setField(term301663, term301663.getClass(), "docInfo", null);
        setBooleanField(term301663, term301663.getClass(), "unknown", false);
        setBooleanField(term301663, term301663.getClass(), "resolved", false);
        setField(term301663, term301663.getClass(), "resolveResult", null);
        setField(term301663, term301663.getClass(), "registry", null);
        Class<? extends Object> term302272 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term302271 = ((Class) term302272).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term302271).setAccessible(true);
        Object enum555 = ((Field) term302271).get((Object) null);
        term301667 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term301667, term301667.getClass(), "call", null);
        setField(term301667, term301667.getClass(), "prototype", null);
        setField(term301667, term301667.getClass(), "kind", enum555);
        setField(term301667, term301667.getClass(), "typeOfThis", null);
        setField(term301667, term301667.getClass(), "source", null);
        setField(term301667, term301667.getClass(), "implementedInterfaces", null);
        setField(term301667, term301667.getClass(), "subTypes", null);
        setField(term301667, term301667.getClass(), "templateTypeName", null);
        setField(term301667, term301667.getClass(), "className", null);
        setField(term301667, term301667.getClass(), "properties", null);
        setField(term301667, term301667.getClass(), "implicitPrototype", null);
        setBooleanField(term301667, term301667.getClass(), "nativeType", false);
        setBooleanField(term301667, term301667.getClass(), "prettyPrint", false);
        setBooleanField(term301667, term301667.getClass(), "visited", false);
        setField(term301667, term301667.getClass(), "docInfo", null);
        setBooleanField(term301667, term301667.getClass(), "unknown", false);
        setBooleanField(term301667, term301667.getClass(), "resolved", false);
        setField(term301667, term301667.getClass(), "resolveResult", null);
        setField(term301667, term301667.getClass(), "registry", null);
        Class<? extends Object> term302572 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term302571 = ((Class) term302572).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term302571).setAccessible(true);
        Object enum556 = ((Field) term302571).get((Object) null);
        term301587 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term301587, term301587.getClass(), "call", null);
        setField(term301587, term301587.getClass(), "prototype", null);
        setField(term301587, term301587.getClass(), "kind", enum556);
        setField(term301587, term301587.getClass(), "typeOfThis", null);
        setField(term301587, term301587.getClass(), "source", null);
        setField(term301587, term301587.getClass(), "implementedInterfaces", null);
        setField(term301587, term301587.getClass(), "subTypes", null);
        setField(term301587, term301587.getClass(), "templateTypeName", null);
        setField(term301587, term301587.getClass(), "className", null);
        setField(term301587, term301587.getClass(), "properties", null);
        setField(term301587, term301587.getClass(), "implicitPrototype", null);
        setBooleanField(term301587, term301587.getClass(), "nativeType", false);
        setBooleanField(term301587, term301587.getClass(), "prettyPrint", false);
        setBooleanField(term301587, term301587.getClass(), "visited", false);
        setField(term301587, term301587.getClass(), "docInfo", null);
        setBooleanField(term301587, term301587.getClass(), "unknown", false);
        setBooleanField(term301587, term301587.getClass(), "resolved", false);
        setField(term301587, term301587.getClass(), "resolveResult", null);
        setField(term301587, term301587.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term301211;
        Object retValue = callMethod(klass, "getLeastSupertype", argTypes, term301211, args);
        assertTrue(recursiveEquals(term301211, term301663));
        assertTrue(recursiveEquals(term301211, term301667));
        assertTrue(recursiveEquals(retValue, term301587));
    }

};



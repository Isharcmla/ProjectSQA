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

public class FunctionType_isSubtype_21010021581572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2090621;
     Object term2090879;
     Object term2093383;
     Object term2093387;

    public FunctionType_isSubtype_21010021581572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2093393 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2093392 = ((Class) term2093393).getDeclaredField((String) "INTERFACE");
        ((Field) term2093392).setAccessible(true);
        Object enum3895 = ((Field) term2093392).get((Object) null);
        term2090621 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2090621, term2090621.getClass(), "kind", enum3895);
        term2090879 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2090879, term2090879.getClass(), "kind", enum3895);
        Class<? extends Object> term2093687 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2093686 = ((Class) term2093687).getDeclaredField((String) "INTERFACE");
        ((Field) term2093686).setAccessible(true);
        Object enum3896 = ((Field) term2093686).get((Object) null);
        term2093383 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2093383, term2093383.getClass(), "this$0", null);
        setField(term2093383, term2093383.getClass(), "call", null);
        setField(term2093383, term2093383.getClass(), "prototype", null);
        setField(term2093383, term2093383.getClass(), "kind", enum3896);
        setField(term2093383, term2093383.getClass(), "typeOfThis", null);
        setField(term2093383, term2093383.getClass(), "source", null);
        setField(term2093383, term2093383.getClass(), "implementedInterfaces", null);
        setField(term2093383, term2093383.getClass(), "subTypes", null);
        setField(term2093383, term2093383.getClass(), "templateTypeName", null);
        setField(term2093383, term2093383.getClass(), "className", null);
        setField(term2093383, term2093383.getClass(), "properties", null);
        setField(term2093383, term2093383.getClass(), "implicitPrototype", null);
        setBooleanField(term2093383, term2093383.getClass(), "nativeType", false);
        setBooleanField(term2093383, term2093383.getClass(), "visited", false);
        setField(term2093383, term2093383.getClass(), "docInfo", null);
        setBooleanField(term2093383, term2093383.getClass(), "unknown", false);
        setBooleanField(term2093383, term2093383.getClass(), "resolved", false);
        setField(term2093383, term2093383.getClass(), "resolveResult", null);
        setField(term2093383, term2093383.getClass(), "registry", null);
        Class<? extends Object> term2093981 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2093980 = ((Class) term2093981).getDeclaredField((String) "INTERFACE");
        ((Field) term2093980).setAccessible(true);
        Object enum3897 = ((Field) term2093980).get((Object) null);
        term2093387 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2093387, term2093387.getClass(), "call", null);
        setField(term2093387, term2093387.getClass(), "prototype", null);
        setField(term2093387, term2093387.getClass(), "kind", enum3897);
        setField(term2093387, term2093387.getClass(), "typeOfThis", null);
        setField(term2093387, term2093387.getClass(), "source", null);
        setField(term2093387, term2093387.getClass(), "implementedInterfaces", null);
        setField(term2093387, term2093387.getClass(), "subTypes", null);
        setField(term2093387, term2093387.getClass(), "templateTypeName", null);
        setField(term2093387, term2093387.getClass(), "className", null);
        setField(term2093387, term2093387.getClass(), "properties", null);
        setField(term2093387, term2093387.getClass(), "implicitPrototype", null);
        setBooleanField(term2093387, term2093387.getClass(), "nativeType", false);
        setBooleanField(term2093387, term2093387.getClass(), "visited", false);
        setField(term2093387, term2093387.getClass(), "docInfo", null);
        setBooleanField(term2093387, term2093387.getClass(), "unknown", false);
        setBooleanField(term2093387, term2093387.getClass(), "resolved", false);
        setField(term2093387, term2093387.getClass(), "resolveResult", null);
        setField(term2093387, term2093387.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2090879;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2090621, args);
        assertTrue(recursiveEquals(term2090621, term2093383));
        assertTrue(recursiveEquals(term2090879, term2093387));
        assertTrue(recursiveEquals(retValue, true));
    }

};



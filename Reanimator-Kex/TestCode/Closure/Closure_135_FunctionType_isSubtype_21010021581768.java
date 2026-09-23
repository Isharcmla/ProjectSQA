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

public class FunctionType_isSubtype_21010021581768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2420658;
     Object term2421312;
     Object term2422609;
     Object term2422614;

    public FunctionType_isSubtype_21010021581768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2422624 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2422623 = ((Class) term2422624).getDeclaredField((String) "ORDINARY");
        ((Field) term2422623).setAccessible(true);
        Object enum4523 = ((Field) term2422623).get((Object) null);
        term2420658 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2421202 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2420658, term2420658.getClass(), "kind", enum4523);
        setField(term2421202, term2421202.getClass(), "kind", enum4523);
        setField(term2420658, term2420658.getClass(), "typeOfThis", term2421202);
        Class<? extends Object> term2422915 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2422914 = ((Class) term2422915).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2422914).setAccessible(true);
        Object enum4524 = ((Field) term2422914).get((Object) null);
        Class<? extends Object> term2423215 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2423214 = ((Class) term2423215).getDeclaredField((String) "INTERFACE");
        ((Field) term2423214).setAccessible(true);
        Object enum4525 = ((Field) term2423214).get((Object) null);
        term2421312 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2421494 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2421312, term2421312.getClass(), "kind", enum4524);
        setField(term2421494, term2421494.getClass(), "kind", enum4525);
        setField(term2421312, term2421312.getClass(), "typeOfThis", term2421494);
        Class<? extends Object> term2423509 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2423508 = ((Class) term2423509).getDeclaredField((String) "INTERFACE");
        ((Field) term2423508).setAccessible(true);
        Object enum4526 = ((Field) term2423508).get((Object) null);
        term2422609 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2422613 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2422609, term2422609.getClass(), "this$0", null);
        setField(term2422609, term2422609.getClass(), "call", null);
        setField(term2422609, term2422609.getClass(), "prototype", null);
        setField(term2422609, term2422609.getClass(), "kind", enum4526);
        setField(term2422613, term2422613.getClass(), "call", null);
        setField(term2422613, term2422613.getClass(), "prototype", null);
        setField(term2422613, term2422613.getClass(), "kind", enum4526);
        setField(term2422613, term2422613.getClass(), "typeOfThis", null);
        setField(term2422613, term2422613.getClass(), "source", null);
        setField(term2422613, term2422613.getClass(), "implementedInterfaces", null);
        setField(term2422613, term2422613.getClass(), "subTypes", null);
        setField(term2422613, term2422613.getClass(), "templateTypeName", null);
        setField(term2422613, term2422613.getClass(), "className", null);
        setField(term2422613, term2422613.getClass(), "properties", null);
        setField(term2422613, term2422613.getClass(), "implicitPrototype", null);
        setBooleanField(term2422613, term2422613.getClass(), "nativeType", false);
        setBooleanField(term2422613, term2422613.getClass(), "visited", false);
        setField(term2422613, term2422613.getClass(), "docInfo", null);
        setBooleanField(term2422613, term2422613.getClass(), "unknown", false);
        setBooleanField(term2422613, term2422613.getClass(), "resolved", false);
        setField(term2422613, term2422613.getClass(), "resolveResult", null);
        setField(term2422613, term2422613.getClass(), "registry", null);
        setField(term2422609, term2422609.getClass(), "typeOfThis", term2422613);
        setField(term2422609, term2422609.getClass(), "source", null);
        setField(term2422609, term2422609.getClass(), "implementedInterfaces", null);
        setField(term2422609, term2422609.getClass(), "subTypes", null);
        setField(term2422609, term2422609.getClass(), "templateTypeName", null);
        setField(term2422609, term2422609.getClass(), "className", null);
        setField(term2422609, term2422609.getClass(), "properties", null);
        setField(term2422609, term2422609.getClass(), "implicitPrototype", null);
        setBooleanField(term2422609, term2422609.getClass(), "nativeType", false);
        setBooleanField(term2422609, term2422609.getClass(), "visited", false);
        setField(term2422609, term2422609.getClass(), "docInfo", null);
        setBooleanField(term2422609, term2422609.getClass(), "unknown", false);
        setBooleanField(term2422609, term2422609.getClass(), "resolved", false);
        setField(term2422609, term2422609.getClass(), "resolveResult", null);
        setField(term2422609, term2422609.getClass(), "registry", null);
        Class<? extends Object> term2423803 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2423802 = ((Class) term2423803).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2423802).setAccessible(true);
        Object enum4527 = ((Field) term2423802).get((Object) null);
        Class<? extends Object> term2424103 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2424102 = ((Class) term2424103).getDeclaredField((String) "INTERFACE");
        ((Field) term2424102).setAccessible(true);
        Object enum4528 = ((Field) term2424102).get((Object) null);
        term2422614 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2422618 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2422614, term2422614.getClass(), "call", null);
        setField(term2422614, term2422614.getClass(), "prototype", null);
        setField(term2422614, term2422614.getClass(), "kind", enum4527);
        setField(term2422618, term2422618.getClass(), "this$0", null);
        setField(term2422618, term2422618.getClass(), "call", null);
        setField(term2422618, term2422618.getClass(), "prototype", null);
        setField(term2422618, term2422618.getClass(), "kind", enum4528);
        setField(term2422618, term2422618.getClass(), "typeOfThis", null);
        setField(term2422618, term2422618.getClass(), "source", null);
        setField(term2422618, term2422618.getClass(), "implementedInterfaces", null);
        setField(term2422618, term2422618.getClass(), "subTypes", null);
        setField(term2422618, term2422618.getClass(), "templateTypeName", null);
        setField(term2422618, term2422618.getClass(), "className", null);
        setField(term2422618, term2422618.getClass(), "properties", null);
        setField(term2422618, term2422618.getClass(), "implicitPrototype", null);
        setBooleanField(term2422618, term2422618.getClass(), "nativeType", false);
        setBooleanField(term2422618, term2422618.getClass(), "visited", false);
        setField(term2422618, term2422618.getClass(), "docInfo", null);
        setBooleanField(term2422618, term2422618.getClass(), "unknown", false);
        setBooleanField(term2422618, term2422618.getClass(), "resolved", false);
        setField(term2422618, term2422618.getClass(), "resolveResult", null);
        setField(term2422618, term2422618.getClass(), "registry", null);
        setField(term2422614, term2422614.getClass(), "typeOfThis", term2422618);
        setField(term2422614, term2422614.getClass(), "source", null);
        setField(term2422614, term2422614.getClass(), "implementedInterfaces", null);
        setField(term2422614, term2422614.getClass(), "subTypes", null);
        setField(term2422614, term2422614.getClass(), "templateTypeName", null);
        setField(term2422614, term2422614.getClass(), "className", null);
        setField(term2422614, term2422614.getClass(), "properties", null);
        setField(term2422614, term2422614.getClass(), "implicitPrototype", null);
        setBooleanField(term2422614, term2422614.getClass(), "nativeType", false);
        setBooleanField(term2422614, term2422614.getClass(), "visited", false);
        setField(term2422614, term2422614.getClass(), "docInfo", null);
        setBooleanField(term2422614, term2422614.getClass(), "unknown", false);
        setBooleanField(term2422614, term2422614.getClass(), "resolved", false);
        setField(term2422614, term2422614.getClass(), "resolveResult", null);
        setField(term2422614, term2422614.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2421312;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2420658, args);
        assertTrue(recursiveEquals(term2420658, term2422609));
        assertTrue(recursiveEquals(term2421312, term2422614));
        assertTrue(recursiveEquals(retValue, false));
    }

};



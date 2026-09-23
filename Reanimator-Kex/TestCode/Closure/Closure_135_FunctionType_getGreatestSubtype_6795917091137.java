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

public class FunctionType_getGreatestSubtype_6795917091137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1346298;
     Object term1346727;
     Object term1346731;
     Object term1346674;

    public FunctionType_getGreatestSubtype_6795917091137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1346736 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1346735 = ((Class) term1346736).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1346735).setAccessible(true);
        Object enum2517 = ((Field) term1346735).get((Object) null);
        term1346298 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1346298, term1346298.getClass(), "kind", enum2517);
        Class<? extends Object> term1347036 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1347035 = ((Class) term1347036).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1347035).setAccessible(true);
        Object enum2518 = ((Field) term1347035).get((Object) null);
        term1346727 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1346727, term1346727.getClass(), "this$0", null);
        setField(term1346727, term1346727.getClass(), "call", null);
        setField(term1346727, term1346727.getClass(), "prototype", null);
        setField(term1346727, term1346727.getClass(), "kind", enum2518);
        setField(term1346727, term1346727.getClass(), "typeOfThis", null);
        setField(term1346727, term1346727.getClass(), "source", null);
        setField(term1346727, term1346727.getClass(), "implementedInterfaces", null);
        setField(term1346727, term1346727.getClass(), "subTypes", null);
        setField(term1346727, term1346727.getClass(), "templateTypeName", null);
        setField(term1346727, term1346727.getClass(), "className", null);
        setField(term1346727, term1346727.getClass(), "properties", null);
        setField(term1346727, term1346727.getClass(), "implicitPrototype", null);
        setBooleanField(term1346727, term1346727.getClass(), "nativeType", false);
        setBooleanField(term1346727, term1346727.getClass(), "visited", false);
        setField(term1346727, term1346727.getClass(), "docInfo", null);
        setBooleanField(term1346727, term1346727.getClass(), "unknown", false);
        setBooleanField(term1346727, term1346727.getClass(), "resolved", false);
        setField(term1346727, term1346727.getClass(), "resolveResult", null);
        setField(term1346727, term1346727.getClass(), "registry", null);
        Class<? extends Object> term1347336 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1347335 = ((Class) term1347336).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1347335).setAccessible(true);
        Object enum2519 = ((Field) term1347335).get((Object) null);
        term1346731 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1346731, term1346731.getClass(), "this$0", null);
        setField(term1346731, term1346731.getClass(), "call", null);
        setField(term1346731, term1346731.getClass(), "prototype", null);
        setField(term1346731, term1346731.getClass(), "kind", enum2519);
        setField(term1346731, term1346731.getClass(), "typeOfThis", null);
        setField(term1346731, term1346731.getClass(), "source", null);
        setField(term1346731, term1346731.getClass(), "implementedInterfaces", null);
        setField(term1346731, term1346731.getClass(), "subTypes", null);
        setField(term1346731, term1346731.getClass(), "templateTypeName", null);
        setField(term1346731, term1346731.getClass(), "className", null);
        setField(term1346731, term1346731.getClass(), "properties", null);
        setField(term1346731, term1346731.getClass(), "implicitPrototype", null);
        setBooleanField(term1346731, term1346731.getClass(), "nativeType", false);
        setBooleanField(term1346731, term1346731.getClass(), "visited", false);
        setField(term1346731, term1346731.getClass(), "docInfo", null);
        setBooleanField(term1346731, term1346731.getClass(), "unknown", false);
        setBooleanField(term1346731, term1346731.getClass(), "resolved", false);
        setField(term1346731, term1346731.getClass(), "resolveResult", null);
        setField(term1346731, term1346731.getClass(), "registry", null);
        Class<? extends Object> term1347636 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1347635 = ((Class) term1347636).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1347635).setAccessible(true);
        Object enum2520 = ((Field) term1347635).get((Object) null);
        term1346674 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1346674, term1346674.getClass(), "this$0", null);
        setField(term1346674, term1346674.getClass(), "call", null);
        setField(term1346674, term1346674.getClass(), "prototype", null);
        setField(term1346674, term1346674.getClass(), "kind", enum2520);
        setField(term1346674, term1346674.getClass(), "typeOfThis", null);
        setField(term1346674, term1346674.getClass(), "source", null);
        setField(term1346674, term1346674.getClass(), "implementedInterfaces", null);
        setField(term1346674, term1346674.getClass(), "subTypes", null);
        setField(term1346674, term1346674.getClass(), "templateTypeName", null);
        setField(term1346674, term1346674.getClass(), "className", null);
        setField(term1346674, term1346674.getClass(), "properties", null);
        setField(term1346674, term1346674.getClass(), "implicitPrototype", null);
        setBooleanField(term1346674, term1346674.getClass(), "nativeType", false);
        setBooleanField(term1346674, term1346674.getClass(), "visited", false);
        setField(term1346674, term1346674.getClass(), "docInfo", null);
        setBooleanField(term1346674, term1346674.getClass(), "unknown", false);
        setBooleanField(term1346674, term1346674.getClass(), "resolved", false);
        setField(term1346674, term1346674.getClass(), "resolveResult", null);
        setField(term1346674, term1346674.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1346298;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, term1346298, args);
        assertTrue(recursiveEquals(term1346298, term1346727));
        assertTrue(recursiveEquals(term1346298, term1346731));
        assertTrue(recursiveEquals(retValue, term1346674));
    }

};



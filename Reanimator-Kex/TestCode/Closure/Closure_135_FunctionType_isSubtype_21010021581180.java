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

public class FunctionType_isSubtype_21010021581180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1423653;
     Object term1424261;
     Object term1427944;
     Object term1427953;

    public FunctionType_isSubtype_21010021581180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1427963 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1427962 = ((Class) term1427963).getDeclaredField((String) "ORDINARY");
        ((Field) term1427962).setAccessible(true);
        Object enum2662 = ((Field) term1427962).get((Object) null);
        Class<? extends Object> term1428254 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1428253 = ((Class) term1428254).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1428253).setAccessible(true);
        Object enum2663 = ((Field) term1428253).get((Object) null);
        term1423653 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1423911 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1424153 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1423653, term1423653.getClass(), "kind", enum2662);
        setField(term1423911, term1423911.getClass(), "kind", enum2663);
        setField(term1423653, term1423653.getClass(), "typeOfThis", term1423911);
        setField(term1423653, term1423653.getClass(), "call", term1424153);
        Class<? extends Object> term1428554 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1428553 = ((Class) term1428554).getDeclaredField((String) "INTERFACE");
        ((Field) term1428553).setAccessible(true);
        Object enum2664 = ((Field) term1428553).get((Object) null);
        term1424261 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1424443 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1424261, term1424261.getClass(), "kind", enum2662);
        setField(term1424443, term1424443.getClass(), "kind", enum2664);
        setField(term1424261, term1424261.getClass(), "typeOfThis", term1424443);
        setField(term1424261, term1424261.getClass(), "call", null);
        Class<? extends Object> term1428848 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1428847 = ((Class) term1428848).getDeclaredField((String) "ORDINARY");
        ((Field) term1428847).setAccessible(true);
        Object enum2665 = ((Field) term1428847).get((Object) null);
        Class<? extends Object> term1429139 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1429138 = ((Class) term1429139).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1429138).setAccessible(true);
        Object enum2666 = ((Field) term1429138).get((Object) null);
        term1427944 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1427945 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1427949 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1427944, term1427944.getClass(), "this$0", null);
        setField(term1427945, term1427945.getClass(), "parameters", null);
        setField(term1427945, term1427945.getClass(), "returnType", null);
        setBooleanField(term1427945, term1427945.getClass(), "resolved", false);
        setField(term1427945, term1427945.getClass(), "resolveResult", null);
        setField(term1427945, term1427945.getClass(), "registry", null);
        setField(term1427944, term1427944.getClass(), "call", term1427945);
        setField(term1427944, term1427944.getClass(), "prototype", null);
        setField(term1427944, term1427944.getClass(), "kind", enum2665);
        setField(term1427949, term1427949.getClass(), "call", null);
        setField(term1427949, term1427949.getClass(), "prototype", null);
        setField(term1427949, term1427949.getClass(), "kind", enum2666);
        setField(term1427949, term1427949.getClass(), "typeOfThis", null);
        setField(term1427949, term1427949.getClass(), "source", null);
        setField(term1427949, term1427949.getClass(), "implementedInterfaces", null);
        setField(term1427949, term1427949.getClass(), "subTypes", null);
        setField(term1427949, term1427949.getClass(), "templateTypeName", null);
        setField(term1427949, term1427949.getClass(), "className", null);
        setField(term1427949, term1427949.getClass(), "properties", null);
        setField(term1427949, term1427949.getClass(), "implicitPrototype", null);
        setBooleanField(term1427949, term1427949.getClass(), "nativeType", false);
        setBooleanField(term1427949, term1427949.getClass(), "visited", false);
        setField(term1427949, term1427949.getClass(), "docInfo", null);
        setBooleanField(term1427949, term1427949.getClass(), "unknown", false);
        setBooleanField(term1427949, term1427949.getClass(), "resolved", false);
        setField(term1427949, term1427949.getClass(), "resolveResult", null);
        setField(term1427949, term1427949.getClass(), "registry", null);
        setField(term1427944, term1427944.getClass(), "typeOfThis", term1427949);
        setField(term1427944, term1427944.getClass(), "source", null);
        setField(term1427944, term1427944.getClass(), "implementedInterfaces", null);
        setField(term1427944, term1427944.getClass(), "subTypes", null);
        setField(term1427944, term1427944.getClass(), "templateTypeName", null);
        setField(term1427944, term1427944.getClass(), "className", null);
        setField(term1427944, term1427944.getClass(), "properties", null);
        setField(term1427944, term1427944.getClass(), "implicitPrototype", null);
        setBooleanField(term1427944, term1427944.getClass(), "nativeType", false);
        setBooleanField(term1427944, term1427944.getClass(), "visited", false);
        setField(term1427944, term1427944.getClass(), "docInfo", null);
        setBooleanField(term1427944, term1427944.getClass(), "unknown", false);
        setBooleanField(term1427944, term1427944.getClass(), "resolved", false);
        setField(term1427944, term1427944.getClass(), "resolveResult", null);
        setField(term1427944, term1427944.getClass(), "registry", null);
        Class<? extends Object> term1429439 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1429438 = ((Class) term1429439).getDeclaredField((String) "ORDINARY");
        ((Field) term1429438).setAccessible(true);
        Object enum2667 = ((Field) term1429438).get((Object) null);
        Class<? extends Object> term1429730 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1429729 = ((Class) term1429730).getDeclaredField((String) "INTERFACE");
        ((Field) term1429729).setAccessible(true);
        Object enum2668 = ((Field) term1429729).get((Object) null);
        term1427953 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1427957 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1427953, term1427953.getClass(), "this$0", null);
        setField(term1427953, term1427953.getClass(), "call", null);
        setField(term1427953, term1427953.getClass(), "prototype", null);
        setField(term1427953, term1427953.getClass(), "kind", enum2667);
        setField(term1427957, term1427957.getClass(), "this$0", null);
        setField(term1427957, term1427957.getClass(), "call", null);
        setField(term1427957, term1427957.getClass(), "prototype", null);
        setField(term1427957, term1427957.getClass(), "kind", enum2668);
        setField(term1427957, term1427957.getClass(), "typeOfThis", null);
        setField(term1427957, term1427957.getClass(), "source", null);
        setField(term1427957, term1427957.getClass(), "implementedInterfaces", null);
        setField(term1427957, term1427957.getClass(), "subTypes", null);
        setField(term1427957, term1427957.getClass(), "templateTypeName", null);
        setField(term1427957, term1427957.getClass(), "className", null);
        setField(term1427957, term1427957.getClass(), "properties", null);
        setField(term1427957, term1427957.getClass(), "implicitPrototype", null);
        setBooleanField(term1427957, term1427957.getClass(), "nativeType", false);
        setBooleanField(term1427957, term1427957.getClass(), "visited", false);
        setField(term1427957, term1427957.getClass(), "docInfo", null);
        setBooleanField(term1427957, term1427957.getClass(), "unknown", false);
        setBooleanField(term1427957, term1427957.getClass(), "resolved", false);
        setField(term1427957, term1427957.getClass(), "resolveResult", null);
        setField(term1427957, term1427957.getClass(), "registry", null);
        setField(term1427953, term1427953.getClass(), "typeOfThis", term1427957);
        setField(term1427953, term1427953.getClass(), "source", null);
        setField(term1427953, term1427953.getClass(), "implementedInterfaces", null);
        setField(term1427953, term1427953.getClass(), "subTypes", null);
        setField(term1427953, term1427953.getClass(), "templateTypeName", null);
        setField(term1427953, term1427953.getClass(), "className", null);
        setField(term1427953, term1427953.getClass(), "properties", null);
        setField(term1427953, term1427953.getClass(), "implicitPrototype", null);
        setBooleanField(term1427953, term1427953.getClass(), "nativeType", false);
        setBooleanField(term1427953, term1427953.getClass(), "visited", false);
        setField(term1427953, term1427953.getClass(), "docInfo", null);
        setBooleanField(term1427953, term1427953.getClass(), "unknown", false);
        setBooleanField(term1427953, term1427953.getClass(), "resolved", false);
        setField(term1427953, term1427953.getClass(), "resolveResult", null);
        setField(term1427953, term1427953.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1424261;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1423653, args);
        assertTrue(recursiveEquals(term1423653, term1427944));
        assertTrue(recursiveEquals(term1424261, term1427953));
        assertTrue(recursiveEquals(retValue, false));
    }

};



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

public class FunctionType_isSubtype_21010021581351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1719164;
     Object term1719770;
     Object term1720945;
     Object term1720954;

    public FunctionType_isSubtype_21010021581351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1720962 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1720961 = ((Class) term1720962).getDeclaredField((String) "ORDINARY");
        ((Field) term1720961).setAccessible(true);
        Object enum3210 = ((Field) term1720961).get((Object) null);
        Class<? extends Object> term1721253 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1721252 = ((Class) term1721253).getDeclaredField((String) "INTERFACE");
        ((Field) term1721252).setAccessible(true);
        Object enum3211 = ((Field) term1721252).get((Object) null);
        term1719164 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1719420 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1719662 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1719164, term1719164.getClass(), "kind", enum3210);
        setField(term1719420, term1719420.getClass(), "kind", enum3211);
        setField(term1719164, term1719164.getClass(), "typeOfThis", term1719420);
        setField(term1719164, term1719164.getClass(), "call", term1719662);
        term1719770 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1719952 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1720046 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1719770, term1719770.getClass(), "kind", enum3210);
        setField(term1719952, term1719952.getClass(), "kind", enum3210);
        setField(term1719770, term1719770.getClass(), "typeOfThis", term1719952);
        setField(term1719770, term1719770.getClass(), "call", term1720046);
        Class<? extends Object> term1721547 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1721546 = ((Class) term1721547).getDeclaredField((String) "ORDINARY");
        ((Field) term1721546).setAccessible(true);
        Object enum3212 = ((Field) term1721546).get((Object) null);
        Class<? extends Object> term1721838 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1721837 = ((Class) term1721838).getDeclaredField((String) "INTERFACE");
        ((Field) term1721837).setAccessible(true);
        Object enum3213 = ((Field) term1721837).get((Object) null);
        term1720945 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1720946 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1720950 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1720945, term1720945.getClass(), "this$0", null);
        setField(term1720946, term1720946.getClass(), "parameters", null);
        setField(term1720946, term1720946.getClass(), "returnType", null);
        setBooleanField(term1720946, term1720946.getClass(), "resolved", false);
        setField(term1720946, term1720946.getClass(), "resolveResult", null);
        setField(term1720946, term1720946.getClass(), "registry", null);
        setField(term1720945, term1720945.getClass(), "call", term1720946);
        setField(term1720945, term1720945.getClass(), "prototype", null);
        setField(term1720945, term1720945.getClass(), "kind", enum3212);
        setField(term1720950, term1720950.getClass(), "this$0", null);
        setField(term1720950, term1720950.getClass(), "call", null);
        setField(term1720950, term1720950.getClass(), "prototype", null);
        setField(term1720950, term1720950.getClass(), "kind", enum3213);
        setField(term1720950, term1720950.getClass(), "typeOfThis", null);
        setField(term1720950, term1720950.getClass(), "source", null);
        setField(term1720950, term1720950.getClass(), "implementedInterfaces", null);
        setField(term1720950, term1720950.getClass(), "subTypes", null);
        setField(term1720950, term1720950.getClass(), "templateTypeName", null);
        setField(term1720950, term1720950.getClass(), "className", null);
        setField(term1720950, term1720950.getClass(), "properties", null);
        setField(term1720950, term1720950.getClass(), "implicitPrototype", null);
        setBooleanField(term1720950, term1720950.getClass(), "nativeType", false);
        setBooleanField(term1720950, term1720950.getClass(), "visited", false);
        setField(term1720950, term1720950.getClass(), "docInfo", null);
        setBooleanField(term1720950, term1720950.getClass(), "unknown", false);
        setBooleanField(term1720950, term1720950.getClass(), "resolved", false);
        setField(term1720950, term1720950.getClass(), "resolveResult", null);
        setField(term1720950, term1720950.getClass(), "registry", null);
        setField(term1720945, term1720945.getClass(), "typeOfThis", term1720950);
        setField(term1720945, term1720945.getClass(), "source", null);
        setField(term1720945, term1720945.getClass(), "implementedInterfaces", null);
        setField(term1720945, term1720945.getClass(), "subTypes", null);
        setField(term1720945, term1720945.getClass(), "templateTypeName", null);
        setField(term1720945, term1720945.getClass(), "className", null);
        setField(term1720945, term1720945.getClass(), "properties", null);
        setField(term1720945, term1720945.getClass(), "implicitPrototype", null);
        setBooleanField(term1720945, term1720945.getClass(), "nativeType", false);
        setBooleanField(term1720945, term1720945.getClass(), "visited", false);
        setField(term1720945, term1720945.getClass(), "docInfo", null);
        setBooleanField(term1720945, term1720945.getClass(), "unknown", false);
        setBooleanField(term1720945, term1720945.getClass(), "resolved", false);
        setField(term1720945, term1720945.getClass(), "resolveResult", null);
        setField(term1720945, term1720945.getClass(), "registry", null);
        Class<? extends Object> term1722132 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1722131 = ((Class) term1722132).getDeclaredField((String) "ORDINARY");
        ((Field) term1722131).setAccessible(true);
        Object enum3214 = ((Field) term1722131).get((Object) null);
        term1720954 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1720955 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1720959 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1720954, term1720954.getClass(), "this$0", null);
        setField(term1720955, term1720955.getClass(), "parameters", null);
        setField(term1720955, term1720955.getClass(), "returnType", null);
        setBooleanField(term1720955, term1720955.getClass(), "resolved", false);
        setField(term1720955, term1720955.getClass(), "resolveResult", null);
        setField(term1720955, term1720955.getClass(), "registry", null);
        setField(term1720954, term1720954.getClass(), "call", term1720955);
        setField(term1720954, term1720954.getClass(), "prototype", null);
        setField(term1720954, term1720954.getClass(), "kind", enum3214);
        setField(term1720959, term1720959.getClass(), "this$0", null);
        setField(term1720959, term1720959.getClass(), "call", null);
        setField(term1720959, term1720959.getClass(), "prototype", null);
        setField(term1720959, term1720959.getClass(), "kind", enum3214);
        setField(term1720959, term1720959.getClass(), "typeOfThis", null);
        setField(term1720959, term1720959.getClass(), "source", null);
        setField(term1720959, term1720959.getClass(), "implementedInterfaces", null);
        setField(term1720959, term1720959.getClass(), "subTypes", null);
        setField(term1720959, term1720959.getClass(), "templateTypeName", null);
        setField(term1720959, term1720959.getClass(), "className", null);
        setField(term1720959, term1720959.getClass(), "properties", null);
        setField(term1720959, term1720959.getClass(), "implicitPrototype", null);
        setBooleanField(term1720959, term1720959.getClass(), "nativeType", false);
        setBooleanField(term1720959, term1720959.getClass(), "visited", false);
        setField(term1720959, term1720959.getClass(), "docInfo", null);
        setBooleanField(term1720959, term1720959.getClass(), "unknown", false);
        setBooleanField(term1720959, term1720959.getClass(), "resolved", false);
        setField(term1720959, term1720959.getClass(), "resolveResult", null);
        setField(term1720959, term1720959.getClass(), "registry", null);
        setField(term1720954, term1720954.getClass(), "typeOfThis", term1720959);
        setField(term1720954, term1720954.getClass(), "source", null);
        setField(term1720954, term1720954.getClass(), "implementedInterfaces", null);
        setField(term1720954, term1720954.getClass(), "subTypes", null);
        setField(term1720954, term1720954.getClass(), "templateTypeName", null);
        setField(term1720954, term1720954.getClass(), "className", null);
        setField(term1720954, term1720954.getClass(), "properties", null);
        setField(term1720954, term1720954.getClass(), "implicitPrototype", null);
        setBooleanField(term1720954, term1720954.getClass(), "nativeType", false);
        setBooleanField(term1720954, term1720954.getClass(), "visited", false);
        setField(term1720954, term1720954.getClass(), "docInfo", null);
        setBooleanField(term1720954, term1720954.getClass(), "unknown", false);
        setBooleanField(term1720954, term1720954.getClass(), "resolved", false);
        setField(term1720954, term1720954.getClass(), "resolveResult", null);
        setField(term1720954, term1720954.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1719770;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1719164, args);
        assertTrue(recursiveEquals(term1719164, term1720945));
        assertTrue(recursiveEquals(term1719770, term1720954));
        assertTrue(recursiveEquals(retValue, true));
    }

};


